import java.util.Random;

public abstract class jp extends ly {

   protected int d = 1;


   protected jp(int var1, gb var2) {
      super(var1, (var2 == gb.g?14:12) * 16 + 13, var2);
      float var3 = 0.0F;
      float var4 = 0.0F;
      if(var2 == gb.g) {
         this.d = 2;
      }

      this.a(0.0F + var4, 0.0F + var3, 0.0F + var4, 1.0F + var4, 1.0F + var3, 1.0F + var4);
      this.b(true);
   }

   public static float b(int var0) {
      if(var0 >= 8) {
         var0 = 0;
      }

      float var1 = (float)(var0 + 1) / 9.0F;
      return var1;
   }

   public int a(int var1) {
      return var1 != 0 && var1 != 1?this.bb + 1:this.bb;
   }

   protected int h(cn var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4) != this.bn?-1:var1.e(var2, var3, var4);
   }

   protected int b(nm var1, int var2, int var3, int var4) {
      if(var1.f(var2, var3, var4) != this.bn) {
         return -1;
      } else {
         int var5 = var1.e(var2, var3, var4);
         if(var5 >= 8) {
            var5 = 0;
         }

         return var5;
      }
   }

   public boolean c() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public boolean a(int var1, boolean var2) {
      return var2 && var1 == 0;
   }

   public boolean c(nm var1, int var2, int var3, int var4, int var5) {
      gb var6 = var1.f(var2, var3, var4);
      return var6 == this.bn?false:(var6 == gb.r?false:(var5 == 1?true:super.c(var1, var2, var3, var4, var5)));
   }

   public cf d(cn var1, int var2, int var3, int var4) {
      return null;
   }

   public int f() {
      return 4;
   }

   public int a(int var1, Random var2) {
      return 0;
   }

   public int a(Random var1) {
      return 0;
   }

   private aj e(nm var1, int var2, int var3, int var4) {
      aj var5 = aj.b(0.0D, 0.0D, 0.0D);
      int var6 = this.b(var1, var2, var3, var4);

      for(int var7 = 0; var7 < 4; ++var7) {
         int var8 = var2;
         int var10 = var4;
         if(var7 == 0) {
            var8 = var2 - 1;
         }

         if(var7 == 1) {
            var10 = var4 - 1;
         }

         if(var7 == 2) {
            ++var8;
         }

         if(var7 == 3) {
            ++var10;
         }

         int var11 = this.b(var1, var8, var3, var10);
         int var12;
         if(var11 < 0) {
            if(!var1.f(var8, var3, var10).c()) {
               var11 = this.b(var1, var8, var3 - 1, var10);
               if(var11 >= 0) {
                  var12 = var11 - (var6 - 8);
                  var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
               }
            }
         } else if(var11 >= 0) {
            var12 = var11 - var6;
            var5 = var5.c((double)((var8 - var2) * var12), (double)((var3 - var3) * var12), (double)((var10 - var4) * var12));
         }
      }

      if(var1.e(var2, var3, var4) >= 8) {
         boolean var13 = false;
         if(var13 || this.c(var1, var2, var3, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2, var3, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 - 1, var3, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 + 1, var3, var4, 5)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2, var3 + 1, var4 - 1, 2)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2, var3 + 1, var4 + 1, 3)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 - 1, var3 + 1, var4, 4)) {
            var13 = true;
         }

         if(var13 || this.c(var1, var2 + 1, var3 + 1, var4, 5)) {
            var13 = true;
         }

         if(var13) {
            var5 = var5.b().c(0.0D, -6.0D, 0.0D);
         }
      }

      var5 = var5.b();
      return var5;
   }

   public void a(cn var1, int var2, int var3, int var4, kh var5, aj var6) {
      aj var7 = this.e((nm)var1, var2, var3, var4);
      var6.a += var7.a;
      var6.b += var7.b;
      var6.c += var7.c;
   }

   public int a() {
      return this.bn == gb.f?5:(this.bn == gb.g?30:0);
   }

   public float c(nm var1, int var2, int var3, int var4) {
      float var5 = var1.c(var2, var3, var4);
      float var6 = var1.c(var2, var3 + 1, var4);
      return var5 > var6?var5:var6;
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
   }

   public int g() {
      return this.bn == gb.f?1:0;
   }

   public void b(cn var1, int var2, int var3, int var4, Random var5) {
      if(this.bn == gb.f && var5.nextInt(64) == 0) {
         int var6 = var1.e(var2, var3, var4);
         if(var6 > 0 && var6 < 8) {
            var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "liquid.water", var5.nextFloat() * 0.25F + 0.75F, var5.nextFloat() * 1.0F + 0.5F);
         }
      }

      if(this.bn == gb.g && var1.f(var2, var3 + 1, var4) == gb.a && !var1.g(var2, var3 + 1, var4) && var5.nextInt(100) == 0) {
         double var12 = (double)((float)var2 + var5.nextFloat());
         double var8 = (double)var3 + this.bj;
         double var10 = (double)((float)var4 + var5.nextFloat());
         var1.a("lava", var12, var8, var10, 0.0D, 0.0D, 0.0D);
      }

   }

   public static double a(nm var0, int var1, int var2, int var3, gb var4) {
      aj var5 = null;
      if(var4 == gb.f) {
         var5 = ((jp)ly.B).e(var0, var1, var2, var3);
      }

      if(var4 == gb.g) {
         var5 = ((jp)ly.D).e(var0, var1, var2, var3);
      }

      return var5.a == 0.0D && var5.c == 0.0D?-1000.0D:Math.atan2(var5.c, var5.a) - 1.5707963267948966D;
   }

   public void e(cn var1, int var2, int var3, int var4) {
      this.j(var1, var2, var3, var4);
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      this.j(var1, var2, var3, var4);
   }

   private void j(cn var1, int var2, int var3, int var4) {
      if(var1.a(var2, var3, var4) == this.bc) {
         if(this.bn == gb.g) {
            boolean var5 = false;
            if(var5 || var1.f(var2, var3, var4 - 1) == gb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2, var3, var4 + 1) == gb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2 - 1, var3, var4) == gb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2 + 1, var3, var4) == gb.f) {
               var5 = true;
            }

            if(var5 || var1.f(var2, var3 + 1, var4) == gb.f) {
               var5 = true;
            }

            if(var5) {
               int var6 = var1.e(var2, var3, var4);
               if(var6 == 0) {
                  var1.d(var2, var3, var4, ly.aq.bc);
               } else if(var6 <= 4) {
                  var1.d(var2, var3, var4, ly.x.bc);
               }

               this.i(var1, var2, var3, var4);
            }
         }

      }
   }

   protected void i(cn var1, int var2, int var3, int var4) {
      var1.a((double)((float)var2 + 0.5F), (double)((float)var3 + 0.5F), (double)((float)var4 + 0.5F), "random.fizz", 0.5F, 2.6F + (var1.n.nextFloat() - var1.n.nextFloat()) * 0.8F);

      for(int var5 = 0; var5 < 8; ++var5) {
         var1.a("largesmoke", (double)var2 + Math.random(), (double)var3 + 1.2D, (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
      }

   }
}
