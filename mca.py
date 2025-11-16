import array
import math
import random # 洞窟生成器(kk)の内部乱数で使用

# ==============================================================================
# 0. 依存クラスと定数の定義 (Javaの ly, cn, bk, mu の代替)
# ==============================================================================

# Java: eo.b(double) に相当 (floor + cast to int)
def eo_b(x):
    """ Javaの eo.b(double) -> (int)floor(double) """
    return int(math.floor(x))

class Block:
    """ ブロックID (ly.X.bc) と透過性 (ly.r) の定義 """
    AIR = 0
    STONE = 1   # u
    GRASS = 2   # v
    DIRT = 3    # w
    BEDROCK = 7 # A
    
    FLOWING_WATER = 8 # B (ly.B.bc)
    WATER = 9   # C (ly.C.bc)
    FLOWING_LAVA = 10
    LAVA = 11   # D (ly.D.bc)
    
    SAND = 12   # F
    GRAVEL = 13 # G
    GOLD_ORE = 14   # H
    IRON_ORE = 15   # I
    COAL_ORE = 16   # J
    ICE = 79    # aU
    SNOW_LAYER = 78 # aT (雪の層)
    
    # ブロックの不透明度 (ga.b() での ly.r[] に相当)
    # 0 = 透過, 15 = 不透明
    OPACITY = {
        AIR: 0, STONE: 15, GRASS: 15, DIRT: 15,
        FLOWING_WATER: 0, WATER: 0, # 水は透過
        FLOWING_LAVA: 0, LAVA: 15, # 溶岩源は不透明
        BEDROCK: 15, SAND: 15, GRAVEL: 15, GOLD_ORE: 15,
        IRON_ORE: 15, COAL_ORE: 15, ICE: 3, SNOW_LAYER: 0,
    }
    
    @staticmethod
    def get_opacity(block_id):
        return Block.OPACITY.get(block_id, 15) # 不明なIDは不透明として扱う

class World:
    """ ワールド設定のコンテナ (cn の簡易版) """
    def __init__(self, seed, snow_flag=True):
        self.u = seed  # ワールドシード (long)
        self.d = snow_flag # 雪/氷の有効フラグ
        
        # ワールドメソッドのダミー (cn.f(...) など)
    def mark_block_range_for_update(self, *args):
        pass # ライト更新の呼び出しをシミュレート
        
    def get_highest_block_y(self, x, z):
        # 簡易的なダミー。実際はチャンクデータを検索する必要がある
        return 64


class JavaRandom:
    """ java.util.Random の LCG アルゴリズムを忠実に再現 """
    def __init__(self, seed=0):
        self.seed = 0
        self.set_seed(seed)

    def set_seed(self, seed):
        # (seed ^ 0x5DEECE66DL) & ((1L << 48) - 1)
        self.seed = (seed ^ 0x5DEECE66D) & 0xFFFFFFFFFFFF

    def _next(self, bits):
        # (self.seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1)
        self.seed = (self.seed * 0x5DEECE66D + 0xB) & 0xFFFFFFFFFFFF
        # (int)(self.seed >>> (48 - bits))
        return int(self.seed >> (48 - bits))

    def nextInt(self, n=None):
        if n is None:
            # nextInt()
            return self._next(32)

        # nextInt(n)
        if n <= 0:
            # Javaはn=0で無限ループになるが、ここではエラーを出す
            if n == 0:
                return 0 
            raise ValueError("n must be positive")

        if (n & -n) == n:  # nが2のべき乗の場合
            return int((n * self._next(31)) >> 31)

        bits = self._next(31)
        val = bits % n
        while bits - val + (n - 1) < 0:
            bits = self._next(31)
            val = bits % n
        return val

    def nextDouble(self):
        # (double)(((long)next(26) << 27) + next(27)) / (double)(1L << 53)
        a = self._next(26)
        b = self._next(27)
        return ((a << 27) + b) / (1 << 53)

    def nextFloat(self):
        """ nextFloat() をシミュレート """
        return self._next(24) / float(1 << 24)

    def nextLong(self):
        """ nextLong() をシミュレート """
        a = self._next(32)
        b = self._next(32)
        return (a << 32) + b


# ==============================================================================
# 1. v (Perlin Noise) の再現
# ==============================================================================

class PerlinNoise: # v に相当
    def __init__(self, rng: JavaRandom):
        self.d = [0] * 512  # P-table (int[512])
        
        # 座標オフセット (a, b, c)
        self.a = rng.nextDouble() * 256.0
        self.b = rng.nextDouble() * 256.0
        self.c = rng.nextDouble() * 256.0

        # P-tableの初期化
        for i in range(256):
            self.d[i] = i

        # P-tableのシャッフル (Java: var1.nextInt(256 - var2) + var2)
        for i in range(256):
            j = rng.nextInt(256 - i) + i
            tmp = self.d[i]
            self.d[i] = self.d[j]
            self.d[j] = tmp
            self.d[i + 256] = self.d[i] # 512サイズにコピー

    def _lerp(self, t, a, b):
        """ 線形補間 (b(double, double, double)) """
        return a + t * (b - a)

    def _fade(self, t):
        """ フェード関数 6t^5 - 15t^4 + 10t^3 """
        return t * t * t * (t * (t * 6.0 - 15.0) + 10.0)

    def _grad(self, hash_val, x, y, z):
        """ 勾配ドット積 (a(int, double, double, double)) """
        h = hash_val & 15
        u = x if h < 8 else y
        
        if h < 4:
            v = y
        elif h == 12 or h == 14:
            v = x
        else:
            v = z

        return (u if (h & 1) == 0 else -u) + (v if (h & 2) == 0 else -v)

    def noise_3d(self, x, y, z):
        """ 3Dノイズ生成 (a(double, double, double)) """
        
        # オフセット適用 (var7, var9, var11)
        x_off = x + self.a
        y_off = y + self.b
        z_off = z + self.c
        
        # 整数部と小数部 (var13-18)
        xi = math.floor(x_off)
        yi = math.floor(y_off)
        zi = math.floor(z_off)
        
        xf = x_off - xi
        yf = y_off - yi
        zf = z_off - zi
        
        xi_mask = int(xi) & 255
        yi_mask = int(yi) & 255
        zi_mask = int(zi) & 255

        # フェードカーブ適用 (var19, var21, var23)
        u = self._fade(xf)
        v = self._fade(yf)
        w = self._fade(zf)
        
        # P-tableからハッシュ値を取得 (var25-30)
        p = self.d
        A = p[xi_mask] + yi_mask
        AA = p[A] + zi_mask
        AB = p[A + 1] + zi_mask
        B = p[xi_mask + 1] + yi_mask
        BA = p[B] + zi_mask
        BB = p[B + 1] + zi_mask

        # 勾配ドット積と補間
        return self._lerp(w,
            self._lerp(v,
                self._lerp(u,
                    self._grad(p[AA], xf, yf, zf),
                    self._grad(p[BA], xf - 1.0, yf, zf)
                ),
                self._lerp(u,
                    self._grad(p[AB], xf, yf - 1.0, zf),
                    self._grad(p[BB], xf - 1.0, yf - 1.0, zf)
                )
            ),
            self._lerp(v,
                self._lerp(u,
                    self._grad(p[AA + 1], xf, yf, zf - 1.0),
                    self._grad(p[BA + 1], xf - 1.0, yf, zf - 1.0)
                ),
                self._lerp(u,
                    self._grad(p[AB + 1], xf, yf - 1.0, zf - 1.0),
                    self._grad(p[BB + 1], xf - 1.0, yf - 1.0, zf - 1.0)
                )
            )
        )

    def noise_2d(self, x, z):
        """ 2Dノイズ (a(double, double)) """
        return self.noise_3d(x, z, 0.0)

    def populate_volume(self, noise_array, 
                        x_off, y_off, z_off, 
                        size_x, size_y, size_z, 
                        scale_x, scale_y, scale_z, 
                        amplitude_scale):
        """ 3Dノイズボリューム生成 (a(double[], ...)) """
        
        idx = 0
        amp_inv = 1.0 / amplitude_scale # var20
        
        # Javaコードの最適化を忠実に再現
        y_prev_mask = -1
        
        if noise_array is None:
            noise_array = [0.0] * (size_x * size_y * size_z)
        
        for i_x in range(size_x):
            x_world = (x_off + i_x) * scale_x + self.a
            xi = math.floor(x_world)
            xf = x_world - xi
            xi_mask = int(xi) & 255
            u = self._fade(xf)
            
            for i_z in range(size_z):
                z_world = (z_off + i_z) * scale_z + self.c
                zi = math.floor(z_world)
                zf = z_world - zi
                zi_mask = int(zi) & 255
                w = self._fade(zf)
                
                for i_y in range(size_y):
                    y_world = (y_off + i_y) * scale_y + self.b
                    yi = math.floor(y_world)
                    yf = y_world - yi
                    yi_mask = int(yi) & 255
                    v = self._fade(yf)
                    
                    # Y座標が変わった時だけP-tableを再計算 (Java: var22)
                    if i_y == 0 or yi_mask != y_prev_mask:
                        y_prev_mask = yi_mask
                        p = self.d
                        
                        A = p[xi_mask] + yi_mask
                        AA = p[A] + zi_mask
                        AB = p[A + 1] + zi_mask
                        B = p[xi_mask + 1] + yi_mask
                        BA = p[B] + zi_mask
                        BB = p[B + 1] + zi_mask
                        
                        # 補間の中間値 (var29, 31, 33, 35)
                        g1 = self._lerp(u, self._grad(p[AA], xf, yf, zf), self._grad(p[BA], xf - 1.0, yf, zf))
                        g2 = self._lerp(u, self._grad(p[AB], xf, yf - 1.0, zf), self._grad(p[BB], xf - 1.0, yf - 1.0, zf))
                        g3 = self._lerp(u, self._grad(p[AA + 1], xf, yf, zf - 1.0), self._grad(p[BA + 1], xf - 1.0, yf, zf - 1.0))
                        g4 = self._lerp(u, self._grad(p[AB + 1], xf, yf - 1.0, zf - 1.0), self._grad(p[BB + 1], xf - 1.0, yf - 1.0, zf - 1.0))

                    # 最後の補間と配列への加算
                    lerp_y1 = self._lerp(v, g1, g2)
                    lerp_y2 = self._lerp(v, g3, g4)
                    noise_val = self._lerp(w, lerp_y1, lerp_y2)
                    
                    noise_array[idx] += noise_val * amp_inv
                    idx += 1
        
        return noise_array


# ==============================================================================
# 2. lp (Fractal Noise) の再現
# ==============================================================================

class FractalNoise: # lp に相当
    def __init__(self, rng: JavaRandom, octaves: int):
        self.octaves = octaves
        self.generators = [] # v[] a
        for _ in range(octaves):
            self.generators.append(PerlinNoise(rng))

    def generate_noise_3d(self, x, y, z):
        """ 3Dノイズ生成 (a(double, double, double) に対応) """
        noise_sum = 0.0
        scale = 1.0
        
        for i in range(self.octaves):
            # 内部のPerlinNoiseの3Dノイズを呼び出す
            noise_sum += self.generators[i].noise_3d(x * scale, y * scale, z * scale) / scale
            scale /= 2.0
            
        return noise_sum
        
    def generate_noise_2d(self, x, z):
        """ 2Dノイズ (a(double, double)) """
        return self.generate_noise_3d(x, 0.0, z)
        
    def populate_volume(self, noise_array, 
                        x_off, y_off, z_off, 
                        size_x, size_y, size_z, 
                        scale_x, scale_y, scale_z):
        """ 3Dノイズボリューム (a(double[], ...)) """
        if noise_array is None:
            noise_array = [0.0] * (size_x * size_y * size_z)
        else:
            # 配列を0.0でリセット
            noise_array[:] = [0.0] * len(noise_array)
            
        scale = 1.0 # var20
        
        for i in range(self.octaves):
            self.generators[i].populate_volume(
                noise_array,
                x_off, y_off, z_off,
                size_x, size_y, size_z,
                scale_x * scale, scale_y * scale, scale_z * scale,
                scale # Javaの 1.0D / var17
            )
            scale /= 2.0
            
        return noise_array


# ==============================================================================
# 3. ga (Chunk) の再現
# ==============================================================================

class Chunk: # ga に相当
    WIDTH = 16
    HEIGHT = 128
    DEPTH = 16
    SIZE = WIDTH * HEIGHT * DEPTH # 32768
    
    def __init__(self, world: World, x: int, z: int):
        self.world = world
        self.x = x
        self.z = z
        
        # ブロックID配列 (byte[] b)
        self.block_data = array.array('B', [0] * self.SIZE)
        
        # 高さマップ (byte[] h)
        self.height_map = array.array('B', [0] * (self.WIDTH * self.DEPTH))
        
        self.is_modified = False # o
        
        # ダミーのNibble Array (mu e, f, g)
        self.metadata = None
        self.sky_light = None
        self.block_light = None

    def _get_index(self, x, y, z):
        """ ブロックID配列のインデックス計算 (Java: x << 11 | z << 7 | y) """
        return (x << 11) | (z << 7) | y
        
    def get_block_id(self, x, y, z):
        if not (0 <= x < self.WIDTH and 0 <= y < self.HEIGHT and 0 <= z < self.DEPTH):
            return Block.AIR
        try:
            return self.block_data[self._get_index(x, y, z)]
        except IndexError:
            return Block.AIR

    def set_block_id(self, x, y, z, block_id):
        if not (0 <= x < self.WIDTH and 0 <= y < self.HEIGHT and 0 <= z < self.DEPTH):
            return
            
        try:
            index = self._get_index(x, y, z)
        except IndexError:
            return
            
        # ブロック変更 (Java: a(int, int, int, int))
        old_block_id = self.block_data[index]
        if old_block_id == block_id:
            return
            
        self.block_data[index] = block_id
        
        # 高さマップの更新 (Java: g(int, int, int))
        self._update_height_map(x, y, z, block_id)
        
        self.is_modified = True

    def _update_height_map(self, x, y, z, new_block_id):
        """ Java: g(int, int, int) に相当する高さマップ更新 """
        hm_index = (z << 4) | x
        old_height = self.height_map[hm_index]
        new_opacity = Block.get_opacity(new_block_id)

        if new_opacity != 0:
            # 不透明ブロックが置かれた
            if y >= old_height:
                self.height_map[hm_index] = y + 1
                self.world.mark_block_range_for_update(self.x * 16 + x, y, self.z * 16 + z, self.x * 16 + x, y, self.z * 16 + z)
        elif y == old_height - 1:
            # 最高の不透明ブロックが破壊された
            # 再スキャン (Java: var5)
            y_scan = y - 1
            while y_scan > 0 and Block.get_opacity(self.get_block_id(x, y_scan - 1, z)) == 0:
                y_scan -= 1
            self.height_map[hm_index] = y_scan
            self.world.mark_block_range_for_update(self.x * 16 + x, y_scan, self.z * 16 + z, self.x * 16 + x, old_height, self.z * 16 + z)

    def finalize_chunk(self):
        """ Java: c() に相当するライトと高さマップの最終計算 """
        self._calculate_full_height_map()
        # ... ライト計算 (f()) ...
        self.is_modified = True
        
    def _calculate_full_height_map(self):
        """ Java: b() に相当する全高さマップの初回計算 """
        for x in range(self.WIDTH):
            for z in range(self.DEPTH):
                y = self.HEIGHT - 1
                while y > 0 and Block.get_opacity(self.get_block_id(x, y - 1, z)) == 0:
                    y -= 1
                self.height_map[(z << 4) | x] = y


# ==============================================================================
# 5. cy / kk (Cave Generator) の再現
# ==============================================================================

class CaveGenerator: # cy/kk に相当

    # cy.a に相当
    CHUNK_RANGE = 8 
    
    def __init__(self, seed):
        # cy.b に相当: チャンク固有シードとは別に、初期化に使用される Random
        # 注意: kk.a(...) の中で new Random(this.b.nextLong()) されているため、
        # ここでは JavaRandom を使用し、内部で Pythonの random.Random を使う
        self.b = JavaRandom(seed)
        
    def generate(self, chunk_provider, world, chunk_x, chunk_z, chunk_data):
        """ チャンクおよび周辺チャンクのシード設定と掘削処理の呼び出し (cy.a) """
        
        # 洞窟生成のマルチチャンクシード設定
        self.b.set_seed(world.u)
        
        # nextLong() / 2L * 2L + 1L -> 奇数の long
        var7 = (self.b.nextLong() // 2) * 2 + 1 
        var9 = (self.b.nextLong() // 2) * 2 + 1 

        var6 = self.CHUNK_RANGE # 8

        # チャンク周囲 ±8 チャンクをループ
        for var11 in range(chunk_x - var6, chunk_x + var6 + 1):
            for var12 in range(chunk_z - var6, chunk_z + var6 + 1):
                # チャンク固有シードを再設定
                self.b.set_seed((var11 * var7) + (var12 * var9) ^ world.u)
                
                # 掘削ロジックの呼び出し (kk.a(cn, int, int, int, int, byte[]))
                # var3, var4 は中心チャンクの座標 (chunk_x, chunk_z)
                self._dig_chunk(world, var11, var12, chunk_x, chunk_z, chunk_data)

    def _dig_chunk(self, world, current_chunk_x, current_chunk_z, center_chunk_x, center_chunk_z, chunk_data):
        """ チャンクごとのエントリポイント (kk.a(cn, int, int, int, int, byte[])) """
        
        # 洞窟の試行回数 (var7)
        # Java: nextInt(nextInt(nextInt(40) + 1) + 1)
        var7 = self.b.nextInt(self.b.nextInt(self.b.nextInt(40) + 1) + 1)
        
        # 1/15 の確率で試行回数を 0 にする
        if self.b.nextInt(15) != 0:
             var7 = 0

        for _ in range(var7):
            # 洞窟の開始座標 (var9, var11, var13)
            var9 = (current_chunk_x * 16) + self.b.nextInt(16)
            var11 = self.b.nextInt(self.b.nextInt(120) + 8)
            var13 = (current_chunk_z * 16) + self.b.nextInt(16)
            
            var15 = 1
            if self.b.nextInt(4) == 0:
                # 4分の1の確率で大規模な部屋を生成
                self._generate_tunnel_segment(
                    center_chunk_x, center_chunk_z, chunk_data, 
                    var9, var11, var13, 
                    1.0 + self.b.nextFloat() * 6.0, 0.0, 0.0, -1, -1, 0.5
                )
                var15 += self.b.nextInt(4) # 追加のトンネルを生成
                
            for _ in range(var15):
                # トンネルの初期パラメータ
                var17 = self.b.nextFloat() * math.pi * 2.0  # 水平角度 (var17)
                var18 = (self.b.nextFloat() - 0.5) * 2.0 / 8.0 # 垂直角度調整 (var18)
                var19 = self.b.nextFloat() * 2.0 + self.b.nextFloat() # 初期半径/長さ (var19)
                
                # トンネル生成の開始
                self._generate_tunnel_segment(
                    center_chunk_x, center_chunk_z, chunk_data, 
                    var9, var11, var13, 
                    var19, var17, var18, 
                    0, 0, 1.0
                )

    def _generate_tunnel_segment(self, var1, var2, var3, var4, var6, var8, var10, var11, var12, var13, var14, var15):
        """ 単一のトンネルセグメントの掘削処理 (kk.a(int, int, byte[], double, ...)) """
        
        var17 = float(var1 * 16 + 8) # X中心
        var19 = float(var2 * 16 + 8) # Z中心
        var21 = 0.0
        var22 = 0.0
        
        # kk.a(...) 内で新しい Random が生成されるロジックを再現
        # JavaRandomのシードから新しいPythonの乱数生成器を初期化
        var23 = random.Random(self.b.nextLong()) 
        
        # トンネルの長さ (var14) の初期化
        if var14 <= 0:
            var24 = self.CHUNK_RANGE * 16 - 16
            # Pythonのrandintは両端を含むため、/4 の結果をintにする
            var14 = var24 - var23.randint(0, int(var24 / 4))
        
        var52 = False # var52: is_chamber
        if var13 == -1: # Chamber generation flag
            var13 = int(var14 / 2)
            var52 = True
        
        var25 = var23.randint(0, int(var14 / 2)) + int(var14 / 4)

        # トンネルの進行ループ
        for var13 in range(var13, var14):
            # 1. 半径の計算と更新
            var27 = 1.5 + (math.sin(float(var13) * math.pi / float(var14)) * var10 * 1.0) # XZ半径
            var29 = var27 * var15 # Y半径
            
            # 2. 角度と位置の更新
            var31 = math.cos(var12) # cos(Pitch)
            var32 = math.sin(var12) # sin(Pitch)
            
            var4 += math.cos(var11) * var31 # var4 (X) 更新
            var6 += var32 # var6 (Y) 更新
            var8 += math.sin(var11) * var31 # var8 (Z) 更新

            # 3. 角度の減衰とノイズ適用
            if var23.randint(0, 5) == 0: # var26 (bool) に相当
                var12 *= 0.92
            else:
                var12 *= 0.7

            var12 += var22 * 0.1
            var11 += var21 * 0.1
            var22 *= 0.9
            var21 *= 0.75
            
            var22 += (var23.random() - var23.random()) * var23.random() * 2.0
            var21 += (var23.random() - var23.random()) * var23.random() * 4.0

            # 4. 枝分かれの処理 (Chamberではない場合)
            if not var52 and var13 == var25 and var10 > 1.0:
                # 左に枝分かれ
                self._generate_tunnel_segment(var1, var2, var3, var4, var6, var8, var23.random() * 0.5 + 0.5, var11 - (math.pi / 2.0), var12 / 3.0, var13, var14, 1.0)
                # 右に枝分かれ
                self._generate_tunnel_segment(var1, var2, var3, var4, var6, var8, var23.random() * 0.5 + 0.5, var11 + (math.pi / 2.0), var12 / 3.0, var13, var14, 1.0)
                return

            # 5. チャンク境界チェックと掘削開始
            if var52 or var23.randint(0, 3) != 0:
                # チャンクの原点からの距離チェック
                var33 = var4 - var17
                var35 = var8 - var19
                var37 = float(var14 - var13)
                var39 = float(var10 + 2.0 + 16.0)
                
                # 掘削範囲がチャンク外に出たら終了
                if var33 * var33 + var35 * var35 - var37 * var37 > var39 * var39:
                    return

                # チャンクとの衝突判定
                if (var4 >= var17 - 16.0 - var27 * 2.0 and var8 >= var19 - 16.0 - var27 * 2.0 and 
                    var4 <= var17 + 16.0 + var27 * 2.0 and var8 <= var19 + 16.0 + var27 * 2.0):
                    
                    # チャンクローカルな掘削範囲の計算
                    var53 = eo_b(var4 - var27) - var1 * 16 - 1
                    var34 = eo_b(var4 + var27) - var1 * 16 + 1
                    var54 = eo_b(var6 - var29) - 1
                    var36 = eo_b(var6 + var29) + 1
                    var55 = eo_b(var8 - var27) - var2 * 16 - 1
                    var38 = eo_b(var8 + var27) - var2 * 16 + 1
                    
                    # 範囲を 0-16 / 1-120 にクランプ
                    var53 = max(0, var53)
                    var34 = min(16, var34)
                    var54 = max(1, var54)
                    var36 = min(120, var36) # Y=120が上限
                    var55 = max(0, var55)
                    var38 = min(16, var38)
                    
                    # 6. 水/溶岩チェック (var56)
                    var56 = False
                    for var40 in range(var53, var34):
                        for var41 in range(var55, var38):
                            for var42 in range(var36 + 1, var54 - 2, -1): # 降順ループ var36+1 -> var54-1
                                if 0 <= var42 < 128:
                                    var43 = (var40 * 16 + var41) * 128 + var42
                                    # ly.B.bc (FLOWING_WATER) または ly.C.bc (WATER)
                                    if var3[var43] == Block.FLOWING_WATER or var3[var43] == Block.WATER:
                                        var56 = True
                                        break
                            if var56: break
                        if var56: break

                    # 7. 掘削の実行
                    if not var56:
                        for var40 in range(var53, var34):
                            var57 = (float(var40 + var1 * 16) + 0.5 - var4) / var27 # X距離
                            for var43 in range(var55, var38):
                                var44 = (float(var43 + var2 * 16) + 0.5 - var8) / var27 # Z距離
                                
                                var46 = (var40 * 16 + var43) * 128 + var36 # Y=max
                                var47 = False # var47: is_grass
                                
                                for var48 in range(var36 - 1, var54 - 1, -1): # 降順ループ var36-1 -> var54
                                    var49 = (float(var48) + 0.5 - var6) / var29 # Y距離
                                    
                                    # 掘削判定: X^2 + Y^2 + Z^2 < 1.0
                                    if var49 > -0.7 and var57 * var57 + var49 * var49 + var44 * var44 < 1.0:
                                        var51 = var3[var46]
                                        
                                        if var51 == Block.GRASS:
                                            var47 = True

                                        # ly.u.bc (STONE) or ly.w.bc (DIRT) or ly.v.bc (GRASS)
                                        if var51 == Block.STONE or var51 == Block.DIRT or var51 == Block.GRASS:
                                            if var48 < 10:
                                                # Y < 10 は溶岩に (ly.D.bc: Stationary Lava)
                                                var3[var46] = Block.LAVA 
                                            else:
                                                # 掘削 (AIR)
                                                var3[var46] = Block.AIR 
                                                
                                                # 地表の調整 (掘削により露出した場合はDIRTからGRASSへ)
                                                if var47 and var3[var46 - 1] == Block.DIRT:
                                                    var3[var46 - 1] = Block.GRASS
                                    
                                    var46 -= 1 # Y座標をデクリメント
                        
                        if var52: # Chamber の場合、ループを抜ける
                            break

# ==============================================================================
# 4. nw (ChunkProviderGenerate) の再現
# ==============================================================================

class ChunkProviderGenerate: # nw に相当
    
    # 密度マップグリッドのサイズ
    DENSITY_GRID_X = 5  # var6 (4+1)
    DENSITY_GRID_Y = 17 # var7 (16+1)
    DENSITY_GRID_Z = 5  # var8 (4+1)
    
    def __init__(self, world: World, seed: int):
        self.world = world
        self.seed = seed
        self.rng = JavaRandom(seed) # Java: j
        
        # ノイズジェネレーターの初期化 (nw コンストラクタ)
        self.noise_k = FractalNoise(self.rng, 16) # Main 1
        self.noise_l = FractalNoise(self.rng, 16) # Main 2
        self.noise_m = FractalNoise(self.rng, 8)  # Selector
        self.noise_n = FractalNoise(self.rng, 4)  # Surface 1
        self.noise_o = FractalNoise(self.rng, 4)  # Surface 2
        self.noise_a = FractalNoise(self.rng, 10) # Height
        self.noise_b = FractalNoise(self.rng, 16) # Height Scale
        self.noise_c = FractalNoise(self.rng, 8)  # Tree/Decor
        
        # 密度マップ (double[] q)
        self.density_map = [0.0] * (self.DENSITY_GRID_X * self.DENSITY_GRID_Y * self.DENSITY_GRID_Z)
        
        # ノイズ配列 (double[] d, e, f, g, h)
        self.noise_d = self.noise_e = self.noise_f = self.noise_g = self.noise_h = None
        
        # 地表ノイズ配列 (double[] r, s, t)
        self.surface_r = [0.0] * 256
        self.surface_s = [0.0] * 256
        self.surface_t = [0.0] * 256
        
        # 洞窟生成 (cy u = new kk())
        self.cave_generator = CaveGenerator(seed) # u (★ 統合 ★)

    def _get_density_map(self, chunk_x, chunk_z):
        """ 密度マップの生成 (Java: a(double[] var1, ...)) """
        size_x = self.DENSITY_GRID_X
        size_y = self.DENSITY_GRID_Y
        size_z = self.DENSITY_GRID_Z
        
        x_off = chunk_x * 4.0
        z_off = chunk_z * 4.0
        
        # ノイズスケール (マジックナンバー)
        SCALE_BASE = 684.412
        
        # ノイズの生成 (Javaの d, e, f, g, h)
        self.noise_d = self.noise_m.populate_volume(self.noise_d, x_off, 0, z_off, size_x, size_y, size_z, SCALE_BASE / 80.0, SCALE_BASE / 160.0, SCALE_BASE / 80.0)
        self.noise_e = self.noise_k.populate_volume(self.noise_e, x_off, 0, z_off, size_x, size_y, size_z, SCALE_BASE, SCALE_BASE, SCALE_BASE)
        self.noise_f = self.noise_l.populate_volume(self.noise_f, x_off, 0, z_off, size_x, size_y, size_z, SCALE_BASE, SCALE_BASE, SCALE_BASE)
        self.noise_g = self.noise_a.populate_volume(self.noise_g, x_off, 0, z_off, size_x, 1, size_z, 1.0, 0.0, 1.0)
        self.noise_h = self.noise_b.populate_volume(self.noise_h, x_off, 0, z_off, size_x, 1, size_z, 100.0, 0.0, 100.0)
        
        idx_main = 0
        idx_height = 0
        
        for i_x in range(size_x):
            for i_z in range(size_z):
                # 高さ/深度のベースライン計算 (Javaのvar16, var18, var20, var22)
                
                var16 = (self.noise_g[idx_height] + 256.0) / 512.0
                if var16 > 1.0: var16 = 1.0
                
                var20 = self.noise_h[idx_height] / 8000.0
                if var20 < 0.0: var20 = -var20
                var20 = var20 * 3.0 - 3.0

                if var20 < 0.0:
                    var20 /= 2.0
                    if var20 < -1.0: var20 = -1.0
                    var20 /= 1.4
                    var20 /= 2.0
                    var16 = 0.0
                else:
                    if var20 > 1.0: var20 = 1.0
                    var20 /= 6.0
                
                var16 += 0.5
                var20 = var20 * size_y / 16.0
                var22 = (size_y / 2.0) + var20 * 4.0 # Yオフセット
                
                idx_height += 1
                
                for i_y in range(size_y):
                    var25 = 0.0 # 最終的な密度
                    var27 = ((i_y) - var22) * 12.0 / (var16 if var16 != 0 else 1.0) # 高さ減衰
                    if var27 < 0.0: var27 *= 4.0

                    # ノイズの選択と混合 (Javaのvar33)
                    var33 = (self.noise_d[idx_main] / 10.0 + 1.0) / 2.0
                    
                    var29 = self.noise_e[idx_main] / 512.0
                    var31 = self.noise_f[idx_main] / 512.0
                    
                    if var33 < 0.0: var25 = var29
                    elif var33 > 1.0: var25 = var31
                    else: var25 = var29 + (var31 - var29) * var33

                    var25 -= var27 # 高さ減衰を適用
                    
                    # チャンクの上下境界での減衰 (Javaのvar35)
                    if i_y > size_y - 4:
                        var35 = (i_y - (size_y - 4)) / 3.0
                        var25 = var25 * (1.0 - var35) + -10.0 * var35
                    
                    self.density_map[idx_main] = var25
                    idx_main += 1
                    
        return self.density_map

    def _set_blocks_from_noise(self, chunk: Chunk, chunk_x, chunk_z):
        """ 3D補間と石/水/氷の配置 (Java: a(int, int, byte[])) """
        
        SEA_LEVEL = 64 # var5
        
        density_map = self._get_density_map(chunk_x, chunk_z)
        
        for i_grid_x in range(4): # var9
            for i_grid_z in range(4): # var10
                for i_grid_y in range(16): # var11
                    
                    # 3D線形補間のための8つのコーナー値を取得
                    base_idx = (i_grid_x * 5 + i_grid_z) * 17 + i_grid_y
                    base_idx_x1 = ((i_grid_x + 1) * 5 + i_grid_z) * 17 + i_grid_y
                    base_idx_z1 = (i_grid_x * 5 + i_grid_z + 1) * 17 + i_grid_y
                    base_idx_xz1 = ((i_grid_x + 1) * 5 + i_grid_z + 1) * 17 + i_grid_y
                    
                    v000 = density_map[base_idx]
                    v001 = density_map[base_idx + 1]
                    v010 = density_map[base_idx_z1]
                    v011 = density_map[base_idx_z1 + 1]
                    v100 = density_map[base_idx_x1]
                    v101 = density_map[base_idx_x1 + 1]
                    v110 = density_map[base_idx_xz1]
                    v111 = density_map[base_idx_xz1 + 1]
                    
                    # 補間ステップ (var12, var22, 24, 26, 28)
                    y_step_00 = (v001 - v000) * 0.125
                    y_step_10 = (v101 - v100) * 0.125 # 修正: v100 - v100 ではない
                    y_step_01 = (v011 - v010) * 0.125 # 修正
                    y_step_11 = (v111 - v110) * 0.125 # 修正
                    
                    d00 = v000
                    d10 = v100
                    d01 = v010
                    d11 = v110

                    for i_block_y in range(8): # var30
                        x_step_0 = (d10 - d00) * 0.25 # var37
                        x_step_1 = (d11 - d01) * 0.25 # var39
                        
                        d0 = d00
                        d1 = d01
                        
                        for i_block_x in range(4): # var41
                            z_step = (d1 - d0) * 0.25 # var48
                            density = d0
                            
                            for i_block_z in range(4): # var50
                                x = i_grid_x * 4 + i_block_x
                                y = i_grid_y * 8 + i_block_y
                                z = i_grid_z * 4 + i_block_z
                                
                                block_id = Block.AIR
                                
                                if y < SEA_LEVEL:
                                    if self.world.d and y >= SEA_LEVEL - 1:
                                        block_id = Block.ICE
                                    else:
                                        block_id = Block.WATER
                                
                                if density > 0.0:
                                    block_id = Block.STONE
                                
                                chunk.set_block_id(x, y, z, block_id)
                                
                                density += z_step
                            
                            d0 += x_step_0
                            d1 += x_step_1
                        
                        d00 += y_step_00
                        d10 += y_step_10
                        d01 += y_step_01
                        d11 += y_step_11

    def _populate_surfaces(self, chunk: Chunk, chunk_x, chunk_z):
        """ 地表層の生成 (Java: b(int, int, byte[])) """
        SEA_LEVEL = 64
        
        # 地表ノイズの生成 (r, s, t)
        for i in range(256):
            x_local, z_local = (i & 15), (i >> 4)
            # rノイズ (Sand/Grass)
            self.surface_r[i] = self.noise_n.generate_noise_2d(chunk_x * 16.0 + x_local, chunk_z * 16.0 + z_local)
            # sノイズ (Sand/Gravel)
            self.surface_s[i] = self.noise_n.generate_noise_3d(
                chunk_x * 16.0 + x_local,
                109.0134,                   # Y (マジックナンバー)
                chunk_z * 16.0 + z_local
            )
            # tノイズ (Thickness)
            self.surface_t[i] = self.noise_o.generate_noise_2d(chunk_x * 16.0 + x_local, chunk_z * 16.0 + z_local)

        for x in range(16):
            for z in range(16):
                idx = (z << 4) | x # インデックス修正: (x + z * 16)
                
                is_sand = self.surface_r[idx] + self.rng.nextDouble() * 0.2 > 0.0 # var9
                is_gravel = self.surface_s[idx] + self.rng.nextDouble() * 0.2 > 3.0 # var10
                thickness = int(self.surface_t[idx] / 3.0 + 3.0 + self.rng.nextDouble() * 0.25) # var11
                
                depth_counter = -1 # var12
                top_block = Block.GRASS # var13
                filler_block = Block.DIRT # var14

                for y in range(127, -1, -1): # var15
                    # 基岩の配置 (Java: y <= 0 + this.j.nextInt(6) - 1)
                    if y <= self.rng.nextInt(5): # 0-4
                        chunk.set_block_id(x, y, z, Block.BEDROCK)
                    else:
                        block_id = chunk.get_block_id(x, y, z)
                        
                        if block_id == Block.AIR:
                            depth_counter = -1
                        elif block_id == Block.STONE:
                            if depth_counter == -1:
                                if thickness <= 0:
                                    top_block = Block.AIR
                                    filler_block = Block.STONE
                                elif SEA_LEVEL - 4 <= y <= SEA_LEVEL + 1:
                                    top_block = Block.GRASS
                                    filler_block = Block.DIRT
                                    if is_gravel: top_block = Block.AIR; filler_block = Block.GRAVEL
                                    if is_sand: top_block = Block.SAND; filler_block = Block.SAND
                                
                                if y < SEA_LEVEL and top_block == Block.AIR:
                                    top_block = Block.WATER
                                    
                                depth_counter = thickness
                                if y >= SEA_LEVEL - 1:
                                    chunk.set_block_id(x, y, z, top_block)
                                else:
                                    chunk.set_block_id(x, y, z, filler_block)
                                    
                            elif depth_counter > 0:
                                depth_counter -= 1
                                chunk.set_block_id(x, y, z, filler_block)

    def generate_chunk(self, chunk_x, chunk_z):
        """ チャンク生成のメインパイプライン (Java: b(int, int)) """
        
        # チャンク固有のシード設定 (Java: j.setSeed(...))
        seed_x = chunk_x * 341873128712
        seed_z = chunk_z * 132897987541
        self.rng.set_seed(seed_x + seed_z)
        
        # 1. チャンクオブジェクトの作成
        chunk = Chunk(self.world, chunk_x, chunk_z)
        
        # 2. 基本地形の配置 (石、水、氷)
        self._set_blocks_from_noise(chunk, chunk_x, chunk_z)
        
        # 3. 地表の配置 (草、土、砂、基岩)
        self._populate_surfaces(chunk, chunk_x, chunk_z)
        
        # 4. 洞窟生成 (Java: u.a(this, aw, int, int, byte[])) (★ 統合 ★)
        self.cave_generator.generate(
            self, self.world, chunk_x, chunk_z, chunk.block_data
        )
        
        # 5. 高さマップとライトの計算
        chunk.finalize_chunk()
        
        return chunk

    def decorate_chunk(self, chunk_x, chunk_z):
        """ 装飾 (Java: a(aw, int, int)) (アルゴリズムはまだ調査中) """
        
        # 乱数シードの再現 (Java: (long)var2 * var6 + (long)var3 * var8 ^ this.p.u)
        rng_decorator = JavaRandom(self.seed)
        var6 = (rng_decorator.nextInt() // 2) * 2 + 1 # 奇数にする
        var8 = (rng_decorator.nextInt() // 2) * 2 + 1 # 奇数にする
        
        decor_seed = chunk_x * var6 + chunk_z * var8 ^ self.world.u
        self.rng.set_seed(decor_seed)
        
        x_world = chunk_x * 16
        z_world = chunk_z * 16
        
        # (このセクションは適当なダミー)
        # 20回石炭を試行 (Java: cu(ly.J.bc, 16))
        for _ in range(20):
            x = x_world + self.rng.nextInt(16)
            y = self.rng.nextInt(128)
            z = z_world + self.rng.nextInt(16)
            # WorldGenMinable(Block.COAL_ORE, 16).generate(self.world, self.rng, x, y, z)
            
        # 1回ダイヤモンドを試行 (Java: cu(ly.ax.bc, 7))
        for _ in range(1):
            x = x_world + self.rng.nextInt(16)
            y = self.rng.nextInt(16) # Y < 16
            z = z_world + self.rng.nextInt(16)
            # WorldGenMinable(Block.DIAMOND_ORE, 7).generate(self.world, self.rng, x, y, z)

        # ... 他のすべての装飾 ...


# ==============================================================================
# 6. 実行デモ
# ==============================================================================

if __name__ == "__main__":
    WORLD_SEED = 810114514
    CHUNK_X, CHUNK_Z = 0, 0
    
    print(f"PythonによるMinecraft地形生成シミュレーター (洞窟生成 ON)")
    print(f"ワールドシード: {WORLD_SEED}")
    print("=" * 40)
    
    # 1. ワールドとジェネレーターの初期化
    world = World(WORLD_SEED)
    generator = ChunkProviderGenerate(world, WORLD_SEED)
    
    # 2. チャンク (0, 0) の生成
    print(f"チャンク ({CHUNK_X}, {CHUNK_Z}) を生成中...")
    chunk = generator.generate_chunk(CHUNK_X, CHUNK_Z)
    
    # 3. 装飾の実行 (ダミー)
    # print("チャンクを装飾中...")
    # generator.decorate_chunk(CHUNK_X, CHUNK_Z)
    
    print("生成完了。")
    print("=" * 40)
    
    # 4. 結果のサンプリング
    print("生成された地形データのサンプリング (X=8, Z=8 の垂直スキャン):")
    
    sample_x = 8
    sample_z = 8
    
    block_names = {v: k for k, v in Block.__dict__.items() 
               if isinstance(v, int) and not k.startswith('_')}
    
    # 洞窟が見えやすいように表示範囲を変更
    for y in range(128, 0, -1):
        block_id = chunk.get_block_id(sample_x, y, sample_z)
        block_name = block_names.get(block_id, f"ID_{block_id}")
        print(f"  Y={y:3d} : {block_name:<10}")

    print("=" * 40)
    print(f"チャンク ({CHUNK_X}, {CHUNK_Z}) の高さマップ (X=8, Z=8): {chunk.height_map[(sample_z << 4) | sample_x]} (Y)")