import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class cn implements nm {

   private List z;
   public List a;
   private List A;
   private TreeSet B;
   private Set C;
   public List b;
   public long c;
   public boolean d;
   private long D;
   private long E;
   private long F;
   public int e;
   protected int f;
   protected int g;
   public boolean h;
   public static float[] i = new float[16];
   private final long G;
   protected int j;
   public List k;
   public int l;
   public Object m;
   public Random n;
   public int o;
   public int p;
   public int q;
   public boolean r;
   protected List s;
   private aw H;
   public File t;
   public long u;
   private hm I;
   public long v;
   public final String w;
   public boolean x;
   private ArrayList J;
   private Set K;
   private int L;
   private List M;
   public boolean y;


   public static hm a(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if(!var3.exists()) {
         return null;
      } else {
         File var4 = new File(var3, "level.dat");
         if(var4.exists()) {
            try {
               hm var5 = x.a((InputStream)(new FileInputStream(var4)));
               hm var6 = var5.k("Data");
               return var6;
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         return null;
      }
   }

   public static void b(File var0, String var1) {
      File var2 = new File(var0, "saves");
      File var3 = new File(var2, var1);
      if(var3.exists()) {
         a(var3.listFiles());
         var3.delete();
      }
   }

   private static void a(File[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if(var0[var1].isDirectory()) {
            a(var0[var1].listFiles());
         }

         var0[var1].delete();
      }

   }

   public cn(File var1, String var2) {
      this(var1, var2, (new Random()).nextLong());
   }

   public cn(String var1) {
      this.z = new ArrayList();
      this.a = new ArrayList();
      this.A = new ArrayList();
      this.B = new TreeSet();
      this.C = new HashSet();
      this.b = new ArrayList();
      this.c = 0L;
      this.d = false;
      this.D = 8961023L;
      this.E = 12638463L;
      this.F = 16777215L;
      this.e = 0;
      this.f = (new Random()).nextInt();
      this.g = 1013904223;
      this.h = false;
      this.G = System.currentTimeMillis();
      this.j = 40;
      this.k = new ArrayList();
      this.n = new Random();
      this.r = false;
      this.s = new ArrayList();
      this.u = 0L;
      this.v = 0L;
      this.J = new ArrayList();
      this.K = new HashSet();
      this.L = this.n.nextInt(12000);
      this.M = new ArrayList();
      this.y = false;
      this.w = var1;
      this.H = this.a(this.t);
      this.f();
   }

   public cn(File var1, String var2, long var3) {
      this.z = new ArrayList();
      this.a = new ArrayList();
      this.A = new ArrayList();
      this.B = new TreeSet();
      this.C = new HashSet();
      this.b = new ArrayList();
      this.c = 0L;
      this.d = false;
      this.D = 8961023L;
      this.E = 12638463L;
      this.F = 16777215L;
      this.e = 0;
      this.f = (new Random()).nextInt();
      this.g = 1013904223;
      this.h = false;
      this.G = System.currentTimeMillis();
      this.j = 40;
      this.k = new ArrayList();
      this.n = new Random();
      this.r = false;
      this.s = new ArrayList();
      this.u = 0L;
      this.v = 0L;
      this.J = new ArrayList();
      this.K = new HashSet();
      this.L = this.n.nextInt(12000);
      this.M = new ArrayList();
      this.y = false;
      this.w = var2;
      var1.mkdirs();
      this.t = new File(var1, var2);
      this.t.mkdirs();

      File var5;
      try {
         var5 = new File(this.t, "session.lock");
         DataOutputStream var6 = new DataOutputStream(new FileOutputStream(var5));

         try {
            var6.writeLong(this.G);
         } finally {
            var6.close();
         }
      } catch (IOException var13) {
         throw new RuntimeException("Failed to check session lock, aborting");
      }

      var5 = new File(this.t, "level.dat");
      this.r = !var5.exists();
      if(var5.exists()) {
         try {
            hm var14 = x.a((InputStream)(new FileInputStream(var5)));
            hm var7 = var14.k("Data");
            this.u = var7.f("RandomSeed");
            this.o = var7.e("SpawnX");
            this.p = var7.e("SpawnY");
            this.q = var7.e("SpawnZ");
            this.c = var7.f("Time");
            this.v = var7.f("SizeOnDisk");
            this.d = var7.m("SnowCovered");
            if(var7.b("Player")) {
               this.I = var7.k("Player");
            }
         } catch (Exception var11) {
            var11.printStackTrace();
         }
      } else {
         this.d = this.n.nextInt(4) == 0;
      }

      boolean var15 = false;
      if(this.u == 0L) {
         this.u = var3;
         var15 = true;
      }

      this.H = this.a(this.t);
      if(var15) {
         this.x = true;
         this.o = 0;
         this.p = 64;

         for(this.q = 0; !this.f(this.o, this.q); this.q += this.n.nextInt(64) - this.n.nextInt(64)) {
            this.o += this.n.nextInt(64) - this.n.nextInt(64);
         }

         this.x = false;
      }

      this.f();
   }

   protected aw a(File var1) {
      return new ft(this, new le(var1, true), new nw(this, this.u));
   }

   public void a() {
      if(this.p <= 0) {
         this.p = 64;
      }

      while(this.g(this.o, this.q) == 0) {
         this.o += this.n.nextInt(8) - this.n.nextInt(8);
         this.q += this.n.nextInt(8) - this.n.nextInt(8);
      }

   }

   private boolean f(int var1, int var2) {
      int var3 = this.g(var1, var2);
      return var3 == ly.F.bc;
   }

   private int g(int var1, int var2) {
      int var3;
      for(var3 = 63; this.a(var1, var3 + 1, var2) != 0; ++var3) {
         ;
      }

      return this.a(var1, var3, var2);
   }

   public void a(dm var1) {
      try {
         if(this.I != null) {
            var1.e(this.I);
            this.I = null;
         }

         this.a((kh)var1);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void a(boolean var1, nu var2) {
      if(this.H.b()) {
         if(var2 != null) {
            var2.b("Saving level");
         }

         this.m();
         if(var2 != null) {
            var2.d("Saving chunks");
         }

         this.H.a(var1, var2);
      }
   }

   private void m() {
      this.l();
      hm var1 = new hm();
      var1.a("RandomSeed", this.u);
      var1.a("SpawnX", this.o);
      var1.a("SpawnY", this.p);
      var1.a("SpawnZ", this.q);
      var1.a("Time", this.c);
      var1.a("SizeOnDisk", this.v);
      var1.a("SnowCovered", this.d);
      var1.a("LastPlayed", System.currentTimeMillis());
      dm var2 = null;
      if(this.k.size() > 0) {
         var2 = (dm)this.k.get(0);
      }

      hm var3;
      if(var2 != null) {
         var3 = new hm();
         var2.d(var3);
         var1.a("Player", var3);
      }

      var3 = new hm();
      var3.a("Data", (el)var1);

      try {
         File var4 = new File(this.t, "level.dat_new");
         File var5 = new File(this.t, "level.dat_old");
         File var6 = new File(this.t, "level.dat");
         x.a(var3, (OutputStream)(new FileOutputStream(var4)));
         if(var5.exists()) {
            var5.delete();
         }

         var6.renameTo(var5);
         if(var6.exists()) {
            var6.delete();
         }

         var4.renameTo(var6);
         if(var4.exists()) {
            var4.delete();
         }
      } catch (Exception var7) {
         var7.printStackTrace();
      }

   }

   public boolean a(int var1) {
      if(!this.H.b()) {
         return true;
      } else {
         if(var1 == 0) {
            this.m();
         }

         return this.H.a(false, (nu)null);
      }
   }

   public int a(int var1, int var2, int var3) {
      return var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000?(var2 < 0?0:(var2 >= 128?0:this.b(var1 >> 4, var3 >> 4).a(var1 & 15, var2, var3 & 15))):0;
   }

   public boolean d(int var1, int var2, int var3) {
      return var2 >= 0 && var2 < 128?this.h(var1 >> 4, var3 >> 4):false;
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var5 >= 0 && var2 < 128) {
         var1 >>= 4;
         var2 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var5 >>= 4;
         var6 >>= 4;

         for(int var7 = var1; var7 <= var4; ++var7) {
            for(int var8 = var3; var8 <= var6; ++var8) {
               if(!this.h(var7, var8)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean h(int var1, int var2) {
      return this.H.a(var1, var2);
   }

   public ga a(int var1, int var2) {
      return this.b(var1 >> 4, var2 >> 4);
   }

   public ga b(int var1, int var2) {
      return this.H.b(var1, var2);
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            ga var6 = this.b(var1 >> 4, var3 >> 4);
            return var6.a(var1 & 15, var2, var3 & 15, var4, var5);
         }
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            ga var5 = this.b(var1 >> 4, var3 >> 4);
            return var5.a(var1 & 15, var2, var3 & 15, var4);
         }
      } else {
         return false;
      }
   }

   public gb f(int var1, int var2, int var3) {
      int var4 = this.a(var1, var2, var3);
      return var4 == 0?gb.a:ly.n[var4].bn;
   }

   public int e(int var1, int var2, int var3) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return 0;
         } else if(var2 >= 128) {
            return 0;
         } else {
            ga var4 = this.b(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.b(var1, var2, var3);
         }
      } else {
         return 0;
      }
   }

   public void b(int var1, int var2, int var3, int var4) {
      this.c(var1, var2, var3, var4);
   }

   public boolean c(int var1, int var2, int var3, int var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return false;
         } else {
            ga var5 = this.b(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            var5.b(var1, var2, var3, var4);
            return true;
         }
      } else {
         return false;
      }
   }

   public boolean d(int var1, int var2, int var3, int var4) {
      if(this.a(var1, var2, var3, var4)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public boolean b(int var1, int var2, int var3, int var4, int var5) {
      if(this.a(var1, var2, var3, var4, var5)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void h(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.s.size(); ++var4) {
         ((im)this.s.get(var4)).a(var1, var2, var3);
      }

   }

   protected void e(int var1, int var2, int var3, int var4) {
      this.h(var1, var2, var3);
      this.g(var1, var2, var3, var4);
   }

   public void f(int var1, int var2, int var3, int var4) {
      if(var3 > var4) {
         int var5 = var4;
         var4 = var3;
         var3 = var5;
      }

      this.b(var1, var3, var2, var1, var4, var2);
   }

   public void b(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.s.size(); ++var7) {
         ((im)this.s.get(var7)).b(var1, var2, var3, var4, var5, var6);
      }

   }

   public void g(int var1, int var2, int var3, int var4) {
      this.l(var1 - 1, var2, var3, var4);
      this.l(var1 + 1, var2, var3, var4);
      this.l(var1, var2 - 1, var3, var4);
      this.l(var1, var2 + 1, var3, var4);
      this.l(var1, var2, var3 - 1, var4);
      this.l(var1, var2, var3 + 1, var4);
   }

   private void l(int var1, int var2, int var3, int var4) {
      if(!this.h && !this.y) {
         ly var5 = ly.n[this.a(var1, var2, var3)];
         if(var5 != null) {
            var5.a(this, var1, var2, var3, var4);
         }

      }
   }

   public boolean i(int var1, int var2, int var3) {
      return this.b(var1 >> 4, var3 >> 4).c(var1 & 15, var2, var3 & 15);
   }

   public int j(int var1, int var2, int var3) {
      return this.a(var1, var2, var3, true);
   }

   public int a(int var1, int var2, int var3, boolean var4) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         int var5;
         if(var4) {
            var5 = this.a(var1, var2, var3);
            if(var5 == ly.al.bc || var5 == ly.aB.bc) {
               int var6 = this.a(var1, var2 + 1, var3, false);
               int var7 = this.a(var1 + 1, var2, var3, false);
               int var8 = this.a(var1 - 1, var2, var3, false);
               int var9 = this.a(var1, var2, var3 + 1, false);
               int var10 = this.a(var1, var2, var3 - 1, false);
               if(var7 > var6) {
                  var6 = var7;
               }

               if(var8 > var6) {
                  var6 = var8;
               }

               if(var9 > var6) {
                  var6 = var9;
               }

               if(var10 > var6) {
                  var6 = var10;
               }

               return var6;
            }
         }

         if(var2 < 0) {
            return 0;
         } else if(var2 >= 128) {
            var5 = 15 - this.e;
            if(var5 < 0) {
               var5 = 0;
            }

            return var5;
         } else {
            ga var11 = this.b(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var11.c(var1, var2, var3, this.e);
         }
      } else {
         return 15;
      }
   }

   public boolean k(int var1, int var2, int var3) {
      if(var1 >= -32000000 && var3 >= -32000000 && var1 < 32000000 && var3 <= 32000000) {
         if(var2 < 0) {
            return false;
         } else if(var2 >= 128) {
            return true;
         } else if(!this.h(var1 >> 4, var3 >> 4)) {
            return false;
         } else {
            ga var4 = this.b(var1 >> 4, var3 >> 4);
            var1 &= 15;
            var3 &= 15;
            return var4.c(var1, var2, var3);
         }
      } else {
         return false;
      }
   }

   public int c(int var1, int var2) {
      if(var1 >= -32000000 && var2 >= -32000000 && var1 < 32000000 && var2 <= 32000000) {
         if(!this.h(var1 >> 4, var2 >> 4)) {
            return 0;
         } else {
            ga var3 = this.b(var1 >> 4, var2 >> 4);
            return var3.b(var1 & 15, var2 & 15);
         }
      } else {
         return 0;
      }
   }

   public void a(by var1, int var2, int var3, int var4, int var5) {
      if(this.d(var2, var3, var4)) {
         if(var1 == by.a) {
            if(this.k(var2, var3, var4)) {
               var5 = 15;
            }
         } else if(var1 == by.b) {
            int var6 = this.a(var2, var3, var4);
            if(ly.t[var6] > var5) {
               var5 = ly.t[var6];
            }
         }

         if(this.a(var1, var2, var3, var4) != var5) {
            this.a(var1, var2, var3, var4, var2, var3, var4);
         }

      }
   }

   public int a(by var1, int var2, int var3, int var4) {
      if(var3 >= 0 && var3 < 128 && var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         int var5 = var2 >> 4;
         int var6 = var4 >> 4;
         if(!this.h(var5, var6)) {
            return 0;
         } else {
            ga var7 = this.b(var5, var6);
            return var7.a(var1, var2 & 15, var3, var4 & 15);
         }
      } else {
         return var1.c;
      }
   }

   public void b(by var1, int var2, int var3, int var4, int var5) {
      if(var2 >= -32000000 && var4 >= -32000000 && var2 < 32000000 && var4 <= 32000000) {
         if(var3 >= 0) {
            if(var3 < 128) {
               if(this.h(var2 >> 4, var4 >> 4)) {
                  ga var6 = this.b(var2 >> 4, var4 >> 4);
                  var6.a(var1, var2 & 15, var3, var4 & 15, var5);

                  for(int var7 = 0; var7 < this.s.size(); ++var7) {
                     ((im)this.s.get(var7)).a(var2, var3, var4);
                  }

               }
            }
         }
      }
   }

   public float c(int var1, int var2, int var3) {
      return i[this.j(var1, var2, var3)];
   }

   public boolean b() {
      return this.e < 4;
   }

   public mf a(aj var1, aj var2) {
      return this.a(var1, var2, false);
   }

   public mf a(aj var1, aj var2, boolean var3) {
      if(!Double.isNaN(var1.a) && !Double.isNaN(var1.b) && !Double.isNaN(var1.c)) {
         if(!Double.isNaN(var2.a) && !Double.isNaN(var2.b) && !Double.isNaN(var2.c)) {
            int var4 = eo.b(var2.a);
            int var5 = eo.b(var2.b);
            int var6 = eo.b(var2.c);
            int var7 = eo.b(var1.a);
            int var8 = eo.b(var1.b);
            int var9 = eo.b(var1.c);
            int var10 = 20;

            while(var10-- >= 0) {
               if(Double.isNaN(var1.a) || Double.isNaN(var1.b) || Double.isNaN(var1.c)) {
                  return null;
               }

               if(var7 == var4 && var8 == var5 && var9 == var6) {
                  return null;
               }

               double var11 = 999.0D;
               double var13 = 999.0D;
               double var15 = 999.0D;
               if(var4 > var7) {
                  var11 = (double)var7 + 1.0D;
               }

               if(var4 < var7) {
                  var11 = (double)var7 + 0.0D;
               }

               if(var5 > var8) {
                  var13 = (double)var8 + 1.0D;
               }

               if(var5 < var8) {
                  var13 = (double)var8 + 0.0D;
               }

               if(var6 > var9) {
                  var15 = (double)var9 + 1.0D;
               }

               if(var6 < var9) {
                  var15 = (double)var9 + 0.0D;
               }

               double var17 = 999.0D;
               double var19 = 999.0D;
               double var21 = 999.0D;
               double var23 = var2.a - var1.a;
               double var25 = var2.b - var1.b;
               double var27 = var2.c - var1.c;
               if(var11 != 999.0D) {
                  var17 = (var11 - var1.a) / var23;
               }

               if(var13 != 999.0D) {
                  var19 = (var13 - var1.b) / var25;
               }

               if(var15 != 999.0D) {
                  var21 = (var15 - var1.c) / var27;
               }

               boolean var29 = false;
               byte var35;
               if(var17 < var19 && var17 < var21) {
                  if(var4 > var7) {
                     var35 = 4;
                  } else {
                     var35 = 5;
                  }

                  var1.a = var11;
                  var1.b += var25 * var17;
                  var1.c += var27 * var17;
               } else if(var19 < var21) {
                  if(var5 > var8) {
                     var35 = 0;
                  } else {
                     var35 = 1;
                  }

                  var1.a += var23 * var19;
                  var1.b = var13;
                  var1.c += var27 * var19;
               } else {
                  if(var6 > var9) {
                     var35 = 2;
                  } else {
                     var35 = 3;
                  }

                  var1.a += var23 * var21;
                  var1.b += var25 * var21;
                  var1.c = var15;
               }

               aj var30 = aj.b(var1.a, var1.b, var1.c);
               var7 = (int)(var30.a = (double)eo.b(var1.a));
               if(var35 == 5) {
                  --var7;
                  ++var30.a;
               }

               var8 = (int)(var30.b = (double)eo.b(var1.b));
               if(var35 == 1) {
                  --var8;
                  ++var30.b;
               }

               var9 = (int)(var30.c = (double)eo.b(var1.c));
               if(var35 == 3) {
                  --var9;
                  ++var30.c;
               }

               int var31 = this.a(var7, var8, var9);
               int var32 = this.e(var7, var8, var9);
               ly var33 = ly.n[var31];
               if(var31 > 0 && var33.a(var32, var3)) {
                  mf var34 = var33.a(this, var7, var8, var9, var1, var2);
                  if(var34 != null) {
                     return var34;
                  }
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void a(kh var1, String var2, float var3, float var4) {
      for(int var5 = 0; var5 < this.s.size(); ++var5) {
         ((im)this.s.get(var5)).a(var2, var1.ak, var1.al - (double)var1.aB, var1.am, var3, var4);
      }

   }

   public void a(double var1, double var3, double var5, String var7, float var8, float var9) {
      for(int var10 = 0; var10 < this.s.size(); ++var10) {
         ((im)this.s.get(var10)).a(var7, var1, var3, var5, var8, var9);
      }

   }

   public void a(String var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.s.size(); ++var5) {
         ((im)this.s.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public void a(String var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      for(int var14 = 0; var14 < this.s.size(); ++var14) {
         ((im)this.s.get(var14)).a(var1, var2, var4, var6, var8, var10, var12);
      }

   }

   public boolean a(kh var1) {
      int var2 = eo.b(var1.ak / 16.0D);
      int var3 = eo.b(var1.am / 16.0D);
      boolean var4 = false;
      if(var1 instanceof dm) {
         var4 = true;
      }

      if(!var4 && !this.h(var2, var3)) {
         return false;
      } else {
         if(var1 instanceof dm) {
            this.k.add((dm)var1);
            System.out.println("Player count: " + this.k.size());
         }

         this.b(var2, var3).a(var1);
         this.a.add(var1);
         this.b(var1);
         return true;
      }
   }

   protected void b(kh var1) {
      for(int var2 = 0; var2 < this.s.size(); ++var2) {
         ((im)this.s.get(var2)).a(var1);
      }

   }

   protected void c(kh var1) {
      for(int var2 = 0; var2 < this.s.size(); ++var2) {
         ((im)this.s.get(var2)).b(var1);
      }

   }

   public void d(kh var1) {
      var1.F();
      if(var1 instanceof dm) {
         this.k.remove((dm)var1);
         System.out.println("Player count: " + this.k.size());
      }

   }

   public void a(im var1) {
      this.s.add(var1);
   }

   public void b(im var1) {
      this.s.remove(var1);
   }

   public List a(kh var1, cf var2) {
      this.J.clear();
      int var3 = eo.b(var2.a);
      int var4 = eo.b(var2.d + 1.0D);
      int var5 = eo.b(var2.b);
      int var6 = eo.b(var2.e + 1.0D);
      int var7 = eo.b(var2.c);
      int var8 = eo.b(var2.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var7; var10 < var8; ++var10) {
            if(this.d(var9, 64, var10)) {
               for(int var11 = var5 - 1; var11 < var6; ++var11) {
                  ly var12 = ly.n[this.a(var9, var11, var10)];
                  if(var12 != null) {
                     var12.a(this, var9, var11, var10, var2, this.J);
                  }
               }
            }
         }
      }

      double var14 = 0.25D;
      List var15 = this.b(var1, var2.b(var14, var14, var14));

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         cf var13 = ((kh)var15.get(var16)).f_();
         if(var13 != null && var13.a(var2)) {
            this.J.add(var13);
         }

         var13 = var1.b_((kh)var15.get(var16));
         if(var13 != null && var13.a(var2)) {
            this.J.add(var13);
         }
      }

      return this.J;
   }

   public int a(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (eo.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return (int)(var3 * 11.0F);
   }

   public aj b(float var1) {
      float var2 = this.c(var1);
      float var3 = eo.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.D >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.D >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.D & 255L) / 255.0F;
      var4 *= var3;
      var5 *= var3;
      var6 *= var3;
      return aj.b((double)var4, (double)var5, (double)var6);
   }

   public float c(float var1) {
      int var2 = (int)(this.c % 24000L);
      float var3 = ((float)var2 + var1) / 24000.0F - 0.25F;
      if(var3 < 0.0F) {
         ++var3;
      }

      if(var3 > 1.0F) {
         --var3;
      }

      float var4 = var3;
      var3 = 1.0F - (float)((Math.cos((double)var3 * 3.141592653589793D) + 1.0D) / 2.0D);
      var3 = var4 + (var3 - var4) / 3.0F;
      return var3;
   }

   public aj d(float var1) {
      float var2 = this.c(var1);
      float var3 = eo.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.F >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.F >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.F & 255L) / 255.0F;
      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      return aj.b((double)var4, (double)var5, (double)var6);
   }

   public aj e(float var1) {
      float var2 = this.c(var1);
      float var3 = eo.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      float var4 = (float)(this.E >> 16 & 255L) / 255.0F;
      float var5 = (float)(this.E >> 8 & 255L) / 255.0F;
      float var6 = (float)(this.E & 255L) / 255.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return aj.b((double)var4, (double)var5, (double)var6);
   }

   public int d(int var1, int var2) {
      ga var3 = this.a(var1, var2);
      int var4 = 127;
      var1 &= 15;

      for(var2 &= 15; var4 > 0; --var4) {
         int var5 = var3.a(var1, var4, var2);
         if(var5 != 0 && (ly.n[var5].bn.c() || ly.n[var5].bn.d())) {
            return var4 + 1;
         }
      }

      return -1;
   }

   public int e(int var1, int var2) {
      return this.a(var1, var2).b(var1 & 15, var2 & 15);
   }

   public float f(float var1) {
      float var2 = this.c(var1);
      float var3 = 1.0F - (eo.b(var2 * 3.1415927F * 2.0F) * 2.0F + 0.75F);
      if(var3 < 0.0F) {
         var3 = 0.0F;
      }

      if(var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3 * var3 * 0.5F;
   }

   public void h(int var1, int var2, int var3, int var4) {
      jf var5 = new jf(var1, var2, var3, var4);
      byte var6 = 8;
      if(this.a(var1 - var6, var2 - var6, var3 - var6, var1 + var6, var2 + var6, var3 + var6)) {
         if(var4 > 0) {
            var5.a((long)ly.n[var4].a() + this.c);
         }

         if(!this.C.contains(var5)) {
            this.C.add(var5);
            this.B.add(var5);
         }
      }

   }

   public void c() {
      this.a.removeAll(this.A);

      int var1;
      kh var2;
      int var3;
      int var4;
      for(var1 = 0; var1 < this.A.size(); ++var1) {
         var2 = (kh)this.A.get(var1);
         var3 = var2.ba;
         var4 = var2.bc;
         if(var2.aZ && this.h(var3, var4)) {
            this.b(var3, var4).b(var2);
         }
      }

      for(var1 = 0; var1 < this.A.size(); ++var1) {
         this.c((kh)this.A.get(var1));
      }

      this.A.clear();

      for(var1 = 0; var1 < this.a.size(); ++var1) {
         var2 = (kh)this.a.get(var1);
         if(var2.af != null) {
            if(!var2.af.aA && var2.af.ae == var2) {
               continue;
            }

            var2.af.ae = null;
            var2.af = null;
         }

         if(!var2.aA) {
            this.e(var2);
         }

         if(var2.aA) {
            var3 = var2.ba;
            var4 = var2.bc;
            if(var2.aZ && this.h(var3, var4)) {
               this.b(var3, var4).b(var2);
            }

            this.a.remove(var1--);
            this.c(var2);
         }
      }

      for(var1 = 0; var1 < this.b.size(); ++var1) {
         ic var5 = (ic)this.b.get(var1);
         var5.b();
      }

   }

   protected void e(kh var1) {
      int var2 = eo.b(var1.ak);
      int var3 = eo.b(var1.am);
      byte var4 = 16;
      if(this.a(var2 - var4, 0, var3 - var4, var2 + var4, 128, var3 + var4)) {
         var1.aI = var1.ak;
         var1.aJ = var1.al;
         var1.aK = var1.am;
         var1.as = var1.aq;
         var1.at = var1.ar;
         if(var1.af != null) {
            var1.p();
         } else {
            var1.e_();
         }

         int var5 = eo.b(var1.ak / 16.0D);
         int var6 = eo.b(var1.al / 16.0D);
         int var7 = eo.b(var1.am / 16.0D);
         if(!var1.aZ || var1.ba != var5 || var1.bb != var6 || var1.bc != var7) {
            if(var1.aZ && this.h(var1.ba, var1.bc)) {
               this.b(var1.ba, var1.bc).a(var1, var1.bb);
            }

            if(this.h(var5, var7)) {
               this.b(var5, var7).a(var1);
            } else {
               var1.aZ = false;
               System.out.println("Removing entity because it\'s not in a chunk!!");
               var1.F();
            }
         }

         if(var1.ae != null) {
            if(!var1.ae.aA && var1.ae.af == var1) {
               this.e(var1.ae);
            } else {
               var1.ae.af = null;
               var1.ae = null;
            }
         }

         if(Double.isNaN(var1.ak) || Double.isInfinite(var1.ak)) {
            var1.ak = var1.aI;
         }

         if(Double.isNaN(var1.al) || Double.isInfinite(var1.al)) {
            var1.al = var1.aJ;
         }

         if(Double.isNaN(var1.am) || Double.isInfinite(var1.am)) {
            var1.am = var1.aK;
         }

         if(Double.isNaN((double)var1.ar) || Double.isInfinite((double)var1.ar)) {
            var1.ar = var1.at;
         }

         if(Double.isNaN((double)var1.aq) || Double.isInfinite((double)var1.aq)) {
            var1.aq = var1.as;
         }

      }
   }

   public boolean a(cf var1) {
      List var2 = this.b((kh)null, var1);

      for(int var3 = 0; var3 < var2.size(); ++var3) {
         kh var4 = (kh)var2.get(var3);
         if(!var4.aA && var4.ad) {
            return false;
         }
      }

      return true;
   }

   public boolean b(cf var1) {
      int var2 = eo.b(var1.a);
      int var3 = eo.b(var1.d + 1.0D);
      int var4 = eo.b(var1.b);
      int var5 = eo.b(var1.e + 1.0D);
      int var6 = eo.b(var1.c);
      int var7 = eo.b(var1.f + 1.0D);
      if(var1.a < 0.0D) {
         --var2;
      }

      if(var1.b < 0.0D) {
         --var4;
      }

      if(var1.c < 0.0D) {
         --var6;
      }

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               ly var11 = ly.n[this.a(var8, var9, var10)];
               if(var11 != null && var11.bn.d()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean c(cf var1) {
      int var2 = eo.b(var1.a);
      int var3 = eo.b(var1.d + 1.0D);
      int var4 = eo.b(var1.b);
      int var5 = eo.b(var1.e + 1.0D);
      int var6 = eo.b(var1.c);
      int var7 = eo.b(var1.f + 1.0D);

      for(int var8 = var2; var8 < var3; ++var8) {
         for(int var9 = var4; var9 < var5; ++var9) {
            for(int var10 = var6; var10 < var7; ++var10) {
               int var11 = this.a(var8, var9, var10);
               if(var11 == ly.as.bc || var11 == ly.D.bc || var11 == ly.E.bc) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean a(cf var1, gb var2, kh var3) {
      int var4 = eo.b(var1.a);
      int var5 = eo.b(var1.d + 1.0D);
      int var6 = eo.b(var1.b);
      int var7 = eo.b(var1.e + 1.0D);
      int var8 = eo.b(var1.c);
      int var9 = eo.b(var1.f + 1.0D);
      boolean var10 = false;
      aj var11 = aj.b(0.0D, 0.0D, 0.0D);

      for(int var12 = var4; var12 < var5; ++var12) {
         for(int var13 = var6; var13 < var7; ++var13) {
            for(int var14 = var8; var14 < var9; ++var14) {
               ly var15 = ly.n[this.a(var12, var13, var14)];
               if(var15 != null && var15.bn == var2) {
                  double var16 = (double)((float)(var13 + 1) - jp.b(this.e(var12, var13, var14)));
                  if((double)var7 >= var16) {
                     var10 = true;
                     var15.a(this, var12, var13, var14, var3, var11);
                  }
               }
            }
         }
      }

      if(var11.c() > 0.0D) {
         var11 = var11.b();
         double var18 = 0.004D;
         var3.an += var11.a * var18;
         var3.ao += var11.b * var18;
         var3.ap += var11.c * var18;
      }

      return var10;
   }

   public boolean a(cf var1, gb var2) {
      int var3 = eo.b(var1.a);
      int var4 = eo.b(var1.d + 1.0D);
      int var5 = eo.b(var1.b);
      int var6 = eo.b(var1.e + 1.0D);
      int var7 = eo.b(var1.c);
      int var8 = eo.b(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               ly var12 = ly.n[this.a(var9, var10, var11)];
               if(var12 != null && var12.bn == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean b(cf var1, gb var2) {
      int var3 = eo.b(var1.a);
      int var4 = eo.b(var1.d + 1.0D);
      int var5 = eo.b(var1.b);
      int var6 = eo.b(var1.e + 1.0D);
      int var7 = eo.b(var1.c);
      int var8 = eo.b(var1.f + 1.0D);

      for(int var9 = var3; var9 < var4; ++var9) {
         for(int var10 = var5; var10 < var6; ++var10) {
            for(int var11 = var7; var11 < var8; ++var11) {
               ly var12 = ly.n[this.a(var9, var10, var11)];
               if(var12 != null && var12.bn == var2) {
                  int var13 = this.e(var9, var10, var11);
                  double var14 = (double)(var10 + 1);
                  if(var13 < 8) {
                     var14 = (double)(var10 + 1) - (double)var13 / 8.0D;
                  }

                  if(var14 >= var1.b) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public void a(kh var1, double var2, double var4, double var6, float var8) {
      (new je()).a(this, var1, var2, var4, var6, var8);
   }

   public float a(aj var1, cf var2) {
      double var3 = 1.0D / ((var2.d - var2.a) * 2.0D + 1.0D);
      double var5 = 1.0D / ((var2.e - var2.b) * 2.0D + 1.0D);
      double var7 = 1.0D / ((var2.f - var2.c) * 2.0D + 1.0D);
      int var9 = 0;
      int var10 = 0;

      for(float var11 = 0.0F; var11 <= 1.0F; var11 = (float)((double)var11 + var3)) {
         for(float var12 = 0.0F; var12 <= 1.0F; var12 = (float)((double)var12 + var5)) {
            for(float var13 = 0.0F; var13 <= 1.0F; var13 = (float)((double)var13 + var7)) {
               double var14 = var2.a + (var2.d - var2.a) * (double)var11;
               double var16 = var2.b + (var2.e - var2.b) * (double)var12;
               double var18 = var2.c + (var2.f - var2.c) * (double)var13;
               if(this.a(aj.b(var14, var16, var18), var1) == null) {
                  ++var9;
               }

               ++var10;
            }
         }
      }

      return (float)var9 / (float)var10;
   }

   public void i(int var1, int var2, int var3, int var4) {
      if(var4 == 0) {
         --var2;
      }

      if(var4 == 1) {
         ++var2;
      }

      if(var4 == 2) {
         --var3;
      }

      if(var4 == 3) {
         ++var3;
      }

      if(var4 == 4) {
         --var1;
      }

      if(var4 == 5) {
         ++var1;
      }

      if(this.a(var1, var2, var3) == ly.as.bc) {
         this.a((double)((float)var1 + 0.5F), (double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), "random.fizz", 0.5F, 2.6F + (this.n.nextFloat() - this.n.nextFloat()) * 0.8F);
         this.d(var1, var2, var3, 0);
      }

   }

   public kh a(Class var1) {
      return null;
   }

   public String d() {
      return "All: " + this.a.size();
   }

   public ic b(int var1, int var2, int var3) {
      ga var4 = this.b(var1 >> 4, var3 >> 4);
      return var4 != null?var4.d(var1 & 15, var2, var3 & 15):null;
   }

   public void a(int var1, int var2, int var3, ic var4) {
      ga var5 = this.b(var1 >> 4, var3 >> 4);
      if(var5 != null) {
         var5.a(var1 & 15, var2, var3 & 15, var4);
      }

   }

   public void l(int var1, int var2, int var3) {
      ga var4 = this.b(var1 >> 4, var3 >> 4);
      if(var4 != null) {
         var4.e(var1 & 15, var2, var3 & 15);
      }

   }

   public boolean g(int var1, int var2, int var3) {
      ly var4 = ly.n[this.a(var1, var2, var3)];
      return var4 == null?false:var4.b();
   }

   public void a(nu var1) {
      this.a(true, var1);
   }

   public boolean e() {
      int var1 = 1000;

      while(this.z.size() > 0) {
         --var1;
         if(var1 <= 0) {
            return true;
         }

         ((kn)this.z.remove(this.z.size() - 1)).a(this);
      }

      return false;
   }

   public void a(by var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a(var1, var2, var3, var4, var5, var6, var7, true);
   }

   public void a(by var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = (var5 + var2) / 2;
      int var10 = (var7 + var4) / 2;
      if(this.d(var9, 64, var10)) {
         int var11 = this.z.size();
         if(var8) {
            int var12 = 4;
            if(var12 > var11) {
               var12 = var11;
            }

            for(int var13 = 0; var13 < var12; ++var13) {
               kn var14 = (kn)this.z.get(this.z.size() - var13 - 1);
               if(var14.a == var1 && var14.a(var2, var3, var4, var5, var6, var7)) {
                  return;
               }
            }
         }

         this.z.add(new kn(var1, var2, var3, var4, var5, var6, var7));
         if(this.z.size() > 100000) {
            while(this.z.size() > '\uc350') {
               this.e();
            }
         }

      }
   }

   public void f() {
      int var1 = this.a(1.0F);
      if(var1 != this.e) {
         this.e = var1;
      }

   }

   public void g() {
      this.H.a();
      int var1 = this.a(1.0F);
      if(var1 != this.e) {
         this.e = var1;

         for(int var2 = 0; var2 < this.s.size(); ++var2) {
            ((im)this.s.get(var2)).e();
         }
      }

      ++this.c;
      if(this.c % (long)this.j == 0L) {
         this.a(false, (nu)null);
      }

      this.a(false);
      this.h();
   }

   protected void h() {
      this.K.clear();

      int var3;
      int var4;
      int var6;
      int var7;
      for(int var1 = 0; var1 < this.k.size(); ++var1) {
         dm var2 = (dm)this.k.get(var1);
         var3 = eo.b(var2.ak / 16.0D);
         var4 = eo.b(var2.am / 16.0D);
         byte var5 = 9;

         for(var6 = -var5; var6 <= var5; ++var6) {
            for(var7 = -var5; var7 <= var5; ++var7) {
               this.K.add(new ol(var6 + var3, var7 + var4));
            }
         }
      }

      if(this.L > 0) {
         --this.L;
      }

      Iterator var12 = this.K.iterator();

      while(var12.hasNext()) {
         ol var13 = (ol)var12.next();
         var3 = var13.a * 16;
         var4 = var13.b * 16;
         ga var14 = this.b(var13.a, var13.b);
         int var8;
         int var9;
         int var10;
         if(this.L == 0) {
            this.f = this.f * 3 + this.g;
            var6 = this.f >> 2;
            var7 = var6 & 15;
            var8 = var6 >> 8 & 15;
            var9 = var6 >> 16 & 127;
            var10 = var14.a(var7, var9, var8);
            var7 += var3;
            var8 += var4;
            if(var10 == 0 && this.j(var7, var9, var8) <= this.n.nextInt(8) && this.a(by.a, var7, var9, var8) <= 0) {
               dm var11 = this.a((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D, 8.0D);
               if(var11 != null && var11.d((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D) > 4.0D) {
                  this.a((double)var7 + 0.5D, (double)var9 + 0.5D, (double)var8 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.n.nextFloat() * 0.2F);
                  this.L = this.n.nextInt(12000) + 6000;
               }
            }
         }

         if(this.d && this.n.nextInt(4) == 0) {
            this.f = this.f * 3 + this.g;
            var6 = this.f >> 2;
            var7 = var6 & 15;
            var8 = var6 >> 8 & 15;
            var9 = this.d(var7 + var3, var8 + var4);
            if(var9 >= 0 && var9 < 128 && var14.a(by.b, var7, var9, var8) < 10) {
               var10 = var14.a(var7, var9 - 1, var8);
               if(var14.a(var7, var9, var8) == 0 && ly.aT.a(this, var7 + var3, var9, var8 + var4)) {
                  this.d(var7 + var3, var9, var8 + var4, ly.aT.bc);
               }

               if(var10 == ly.C.bc && var14.b(var7, var9 - 1, var8) == 0) {
                  this.d(var7 + var3, var9 - 1, var8 + var4, ly.aU.bc);
               }
            }
         }

         for(var6 = 0; var6 < 80; ++var6) {
            this.f = this.f * 3 + this.g;
            var7 = this.f >> 2;
            var8 = var7 & 15;
            var9 = var7 >> 8 & 15;
            var10 = var7 >> 16 & 127;
            byte var15 = var14.b[var8 << 11 | var9 << 7 | var10];
            if(ly.o[var15]) {
               ly.n[var15].a(this, var8 + var3, var10, var9 + var4, this.n);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      int var2 = this.B.size();
      if(var2 != this.C.size()) {
         throw new IllegalStateException("TickNextTick list out of synch");
      } else {
         if(var2 > 1000) {
            var2 = 1000;
         }

         for(int var3 = 0; var3 < var2; ++var3) {
            jf var4 = (jf)this.B.first();
            if(!var1 && var4.e > this.c) {
               break;
            }

            this.B.remove(var4);
            this.C.remove(var4);
            byte var5 = 8;
            if(this.a(var4.a - var5, var4.b - var5, var4.c - var5, var4.a + var5, var4.b + var5, var4.c + var5)) {
               int var6 = this.a(var4.a, var4.b, var4.c);
               if(var6 == var4.d && var6 > 0) {
                  ly.n[var6].a(this, var4.a, var4.b, var4.c, this.n);
               }
            }
         }

         return this.B.size() != 0;
      }
   }

   public void m(int var1, int var2, int var3) {
      byte var4 = 16;
      Random var5 = new Random();

      for(int var6 = 0; var6 < 1000; ++var6) {
         int var7 = var1 + this.n.nextInt(var4) - this.n.nextInt(var4);
         int var8 = var2 + this.n.nextInt(var4) - this.n.nextInt(var4);
         int var9 = var3 + this.n.nextInt(var4) - this.n.nextInt(var4);
         int var10 = this.a(var7, var8, var9);
         if(var10 > 0) {
            ly.n[var10].b(this, var7, var8, var9, var5);
         }
      }

   }

   public List b(kh var1, cf var2) {
      this.M.clear();
      int var3 = eo.b((var2.a - 2.0D) / 16.0D);
      int var4 = eo.b((var2.d + 2.0D) / 16.0D);
      int var5 = eo.b((var2.c - 2.0D) / 16.0D);
      int var6 = eo.b((var2.f + 2.0D) / 16.0D);

      for(int var7 = var3; var7 <= var4; ++var7) {
         for(int var8 = var5; var8 <= var6; ++var8) {
            if(this.h(var7, var8)) {
               this.b(var7, var8).a(var1, var2, this.M);
            }
         }
      }

      return this.M;
   }

   public List a(Class var1, cf var2) {
      int var3 = eo.b((var2.a - 2.0D) / 16.0D);
      int var4 = eo.b((var2.d + 2.0D) / 16.0D);
      int var5 = eo.b((var2.c - 2.0D) / 16.0D);
      int var6 = eo.b((var2.f + 2.0D) / 16.0D);
      ArrayList var7 = new ArrayList();

      for(int var8 = var3; var8 <= var4; ++var8) {
         for(int var9 = var5; var9 <= var6; ++var9) {
            if(this.h(var8, var9)) {
               this.b(var8, var9).a(var1, var2, var7);
            }
         }
      }

      return var7;
   }

   public List i() {
      return this.a;
   }

   public void b(int var1, int var2, int var3, ic var4) {
      if(this.d(var1, var2, var3)) {
         this.a(var1, var3).f();
      }

      for(int var5 = 0; var5 < this.s.size(); ++var5) {
         ((im)this.s.get(var5)).a(var1, var2, var3, var4);
      }

   }

   public int b(Class var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         kh var4 = (kh)this.a.get(var3);
         if(var1.isAssignableFrom(var4.getClass())) {
            ++var2;
         }
      }

      return var2;
   }

   public void a(List var1) {
      this.a.addAll(var1);

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         this.b((kh)var1.get(var2));
      }

   }

   public void b(List var1) {
      this.A.addAll(var1);
   }

   public void j() {
      while(this.H.a()) {
         ;
      }

   }

   public boolean a(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = this.a(var2, var3, var4);
      ly var7 = ly.n[var6];
      ly var8 = ly.n[var1];
      cf var9 = var8.d(this, var2, var3, var4);
      if(var5) {
         var9 = null;
      }

      return var9 != null && !this.a(var9)?false:(var7 != ly.B && var7 != ly.C && var7 != ly.D && var7 != ly.E && var7 != ly.as && var7 != ly.aT?var1 > 0 && var7 == null && var8.a(this, var2, var3, var4):true);
   }

   public bl a(kh var1, kh var2, float var3) {
      int var4 = eo.b(var1.ak);
      int var5 = eo.b(var1.al);
      int var6 = eo.b(var1.am);
      int var7 = (int)(var3 + 16.0F);
      int var8 = var4 - var7;
      int var9 = var5 - var7;
      int var10 = var6 - var7;
      int var11 = var4 + var7;
      int var12 = var5 + var7;
      int var13 = var6 + var7;
      ci var14 = new ci(this, var8, var9, var10, var11, var12, var13);
      return (new cz(var14)).a(var1, var2, var3);
   }

   public bl a(kh var1, int var2, int var3, int var4, float var5) {
      int var6 = eo.b(var1.ak);
      int var7 = eo.b(var1.al);
      int var8 = eo.b(var1.am);
      int var9 = (int)(var5 + 8.0F);
      int var10 = var6 - var9;
      int var11 = var7 - var9;
      int var12 = var8 - var9;
      int var13 = var6 + var9;
      int var14 = var7 + var9;
      int var15 = var8 + var9;
      ci var16 = new ci(this, var10, var11, var12, var13, var14, var15);
      return (new cz(var16)).a(var1, var2, var3, var4, var5);
   }

   public boolean j(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      return var5 == 0?false:ly.n[var5].c(this, var1, var2, var3, var4);
   }

   public boolean n(int var1, int var2, int var3) {
      return this.j(var1, var2 - 1, var3, 0)?true:(this.j(var1, var2 + 1, var3, 1)?true:(this.j(var1, var2, var3 - 1, 2)?true:(this.j(var1, var2, var3 + 1, 3)?true:(this.j(var1 - 1, var2, var3, 4)?true:this.j(var1 + 1, var2, var3, 5)))));
   }

   public boolean k(int var1, int var2, int var3, int var4) {
      if(this.g(var1, var2, var3)) {
         return this.n(var1, var2, var3);
      } else {
         int var5 = this.a(var1, var2, var3);
         return var5 == 0?false:ly.n[var5].b((nm)this, var1, var2, var3, var4);
      }
   }

   public boolean o(int var1, int var2, int var3) {
      return this.k(var1, var2 - 1, var3, 0)?true:(this.k(var1, var2 + 1, var3, 1)?true:(this.k(var1, var2, var3 - 1, 2)?true:(this.k(var1, var2, var3 + 1, 3)?true:(this.k(var1 - 1, var2, var3, 4)?true:this.k(var1 + 1, var2, var3, 5)))));
   }

   public dm a(kh var1, double var2) {
      return this.a(var1.ak, var1.al, var1.am, var2);
   }

   public dm a(double var1, double var3, double var5, double var7) {
      double var9 = -1.0D;
      dm var11 = null;

      for(int var12 = 0; var12 < this.k.size(); ++var12) {
         dm var13 = (dm)this.k.get(var12);
         double var14 = var13.d(var1, var3, var5);
         if((var7 < 0.0D || var14 < var7 * var7) && (var9 == -1.0D || var14 < var9)) {
            var9 = var14;
            var11 = var13;
         }
      }

      return var11;
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7) {
      int var8 = var1 >> 4;
      int var9 = var3 >> 4;
      int var10 = var1 + var4 - 1 >> 4;
      int var11 = var3 + var6 - 1 >> 4;
      int var12 = 0;
      int var13 = var2;
      int var14 = var2 + var5;
      if(var2 < 0) {
         var13 = 0;
      }

      if(var14 > 128) {
         var14 = 128;
      }

      for(int var15 = var8; var15 <= var10; ++var15) {
         int var16 = var1 - var15 * 16;
         int var17 = var1 + var4 - var15 * 16;
         if(var16 < 0) {
            var16 = 0;
         }

         if(var17 > 16) {
            var17 = 16;
         }

         for(int var18 = var9; var18 <= var11; ++var18) {
            int var19 = var3 - var18 * 16;
            int var20 = var3 + var6 - var18 * 16;
            if(var19 < 0) {
               var19 = 0;
            }

            if(var20 > 16) {
               var20 = 16;
            }

            var12 = this.b(var15, var18).a(var7, var16, var13, var19, var17, var14, var20, var12);
            this.b(var15 * 16 + var16, var13, var18 * 16 + var19, var15 * 16 + var17, var14, var18 * 16 + var20);
         }
      }

   }

   public void k() {}

   public void l() {
      try {
         File var1 = new File(this.t, "session.lock");
         DataInputStream var2 = new DataInputStream(new FileInputStream(var1));

         try {
            if(var2.readLong() != this.G) {
               throw new lx("The save is being accessed from another location, aborting");
            }
         } finally {
            var2.close();
         }

      } catch (IOException var7) {
         throw new lx("Failed to check session lock, aborting");
      }
   }

   public void a(long var1) {
      this.c = var1;
   }

   public void f(kh var1) {
      int var2 = eo.b(var1.ak / 16.0D);
      int var3 = eo.b(var1.am / 16.0D);
      byte var4 = 2;

      for(int var5 = var2 - var4; var5 <= var2 + var4; ++var5) {
         for(int var6 = var3 - var4; var6 <= var3 + var4; ++var6) {
            this.b(var5, var6);
         }
      }

      if(!this.a.contains(var1)) {
         System.out.println("REINSERTING PLAYER!");
         this.a.add(var1);
      }

   }

   static {
      float var0 = 0.05F;

      for(int var1 = 0; var1 <= 15; ++var1) {
         float var2 = 1.0F - (float)var1 / 15.0F;
         i[var1] = (1.0F - var2) / (var2 * 3.0F + 1.0F) * (1.0F - var0) + var0;
      }

   }
}
