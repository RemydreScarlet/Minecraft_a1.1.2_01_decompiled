## Minecraft Alpha 1.1.2_01 地形生成調査

### 1\. 概要 (Overview)

地形生成は、チャンク座標 (`ChunkX`, `ChunkZ`) とワールドシード (`Seed`) に基づいて決定論的に行われる。プロセスは以下のステップで構成される。

1.  **密度マップ生成**: `nw` が、複数の `lp`（フラクタルノイズ）インスタンスを呼び出す。`lp` は、複数の `v`（Perlinノイズ）インスタンスを合成する。
2.  **基本地形配置**: `nw` が密度マップを **3D補間**し、`density > 0.0` の場所に**Stone** (`ly.u.bc`) を、それ以外を**Water** (`ly.C.bc`) または**Ice** (`ly.aU.bc`)（海面 `Y=64` 付近）で埋める。
3.  **地表生成**: `nw` が、別の2Dノイズ (`n`, `o`) を使用して、Stoneの最上層を**Grass** (`ly.v.bc`), **Dirt** (`ly.w.bc`), **Sand** (`ly.F.bc`) などに置き換える。
4.  **基岩配置**: `nw` が $Y=0$ から $Y=5$ 付近にランダムに**Bedrock** (`ly.A.bc`) を配置する。
5.  **洞窟掘削 (Cave Carving)**: `kk` (CaveGenerator) が呼び出される。`cy` のマルチチャンク連携ロジックに基づき、`kk` が**サインカーブ**と**ノイズ**でトンネルの中心線を計算し、周囲のブロックを**Air** (`0`) または**Lava** (`ly.D.bc`) に置き換える。
6.  **装飾**: `nw` が、鉱石、木、ダンジョン（`cg`）などを生成する別のクラスを呼び出す。(※これらのクラス定義は一部（`cg`）を除き未提供)

### 2\. データ構造: `ga` (Chunk)

  * **次元**: $16 \times 128 \times 16$ ($X, Y, Z$)
  * **ブロックID配列**: `byte[32768]` (Java `b`)
  * **インデックス計算式**: `index = (x << 11) | (z << 7) | y`

### 3\. コアノイズ: `v` (Perlin Noise)

  * **アルゴリズム**: Ken Perlinによる**クラシック Perlin Noise**。
  * **初期化 (`v(Random var1)`)**:
      * **P-table (`d`)**: `int[512]` の配列。`java.util.Random` を使用してシャッフルされ、2回繰り返される。
      * **オフセット (`a, b, c`)**: `var1.nextDouble() * 256.0` で初期化。
  * **フェード関数 (Fade)**: $f(t) = 6t^5 - 15t^4 + 10t^3$
  * **線形補間 (Lerp)**: `b(t, a, b) = a + t * (b - a)`
  * **勾配ドット積 (Grad)**: `a(int hash, double x, double y, double z)`。`hash & 15` に基づく16種類のベクトル。

### 4\. ノイズ合成: `lp` (Fractal Noise)

  * **アルゴリズム**: フラクタルノイズ（FBM）。
  * **合成ロジック**:
      * `for i = 0 to octaves-1`:
          * `value += v[i].noise(x * scale, ...) * (1.0 / scale)`
          * `scale /= 2.0`
  * **ボリューム最適化**: `v.a(double[], ...)` は、`lp` 側で `1.0 / scale` を `amplitude_scale` として渡し、`v` 側で乗算と配列への加算 (`+=`) を行うことで、多オクターブの計算を最適化している。

### 5\. 生成パイプライン: `nw` (ChunkProviderGenerate)

  * **密度マップ (`q`)**: `5x17x5` グリッドで計算され、$16 \times 128 \times 16$ に補間される。
  * **ノイズスケール (マジックナンバー)**:
      * `ScaleBase = 684.412`
      * `k, l` (Main): `Scale = ScaleBase`
      * `m` (Selector): `ScaleX/Z = ScaleBase / 80.0`, `ScaleY = ScaleBase / 160.0`
  * **地表ノイズ**:
      * `n` (Sand/Gravel): 3Dノイズを呼び出し、Y座標にマジックナンバー `109.0134` を使用する。
      * `o` (Thickness): 2Dノイズ。
      * `r` (Sand/Grass): 2Dノイズ。
      * スケール: `0.03125`
  * **基岩**: `Y <= 0 + this.j.nextInt(6) - 1` の範囲。

### 6\. 洞窟生成: `cy` (Base) と `kk` (Impl)

  * **`cy` (Base Class)**:
      * **役割**: マルチチャンク連携。
      * **範囲 (`a`)**: `8` (±8 チャンクのシードをチェックする)。
      * **シード**: ワールドシード (`var2.u`) と2つの奇数 (`var7`, `var9`) を使い、`seed = (chunkX * var7) + (chunkZ * var9) ^ worldSeed` の式で各チャンクの乱数を初期化する。
  * **`kk` (Implementation Class)**:
      * **エントリ (`_dig_chunk`)**:
          * **頻度**: `1/15` の確率でそのチャンクの洞窟生成をスキップする。
          * **試行回数**: `nextInt(nextInt(nextInt(40)+1)+1)` (最大約40回)。
      * **トンネルパラメータ**:
          * **開始Y (`var11`)**: `nextInt(nextInt(120)+8)` (Y=8～127)。
          * **部屋 (`1/4` 確率)**: 半径 (`var10`) が `1.0 + rand * 6.0`、半径スケール (`var15`) が `0.5`。
          * **通常 (`3/4` 確率)**: 半径 (`var19`) が `rand * 2.0 + rand`、半径スケール (`var15`) が `1.0`。
      * **トンネル進化 (`_generate_tunnel_segment`)**:
          * **半径 (`var27`)**: `1.5 + sin(t/len) * initial_radius` のサインカーブ。
          * **方向**: `(Yaw, Pitch)` を `cos/sin` で更新。角度はノイズでゆっくり変化。
          * **枝分かれ**: `var13 == var25` (中間点) で、`Yaw +/- 90°` (1.57rad) の2つの子トンネルを再帰的に生成する。
      * **掘削ロジック**:
          * **水/溶岩チェック**: `var56`。掘削範囲（バウンディングボックス）内に `ly.B.bc` (Flowing Water) または `ly.C.bc` (Water/Lava) があれば、そのセグメントの**掘削を中止**する。
          * **掘削判定**: `(x_dist/xz_radius)^2 + (y_dist/y_radius)^2 + (z_dist/xz_radius)^2 < 1.0` の楕円体判定。
          * **ブロック置換**:
              * `if (y < 10)`: `ly.D.bc` (Lava) に置換。
              * `else`: `0` (Air) に置換。
              * **地表修正**: 掘削したブロックが `ly.v.bc` (Grass) だった場合、その真下（`var46 - 1`）が `ly.w.bc` (Dirt) なら、それを `ly.v.bc` (Grass) に変更する。

### 7\. 装飾: `cg` (Dungeon)

  * `nw` の装飾ステップ（`a(aw, ...)`）で呼び出される。
  * `cg` はダンジョン（スポナー部屋）を生成する。
  * **部屋**: `ly.x.bc` (Mossy Cobblestone) と `ly.ap.bc` (Cobblestone) で構成。
  * **スポナー**: `ly.at.bc` (Spawner)。`Skeleton`, `Zombie`, `Spider` のいずれか。
  * **チェスト**: `ly.av.bc` (Chest)。パン、鉄、サドルなどの戦利品。
  * *(注: `cg` のロジックは `kk` とは無関係なため、今回のフルコード実装には含めない)*
