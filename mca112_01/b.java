import java.util.Random;

public class b extends jt {

   private Random a = new Random();


   protected b(int var1) {
      super(var1, gb.c);
      this.bb = 26;
   }

   public int a(nm var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return this.bb - 1;
      } else if(var5 == 0) {
         return this.bb - 1;
      } else {
         int var6 = var1.a(var2, var3, var4 - 1);
         int var7 = var1.a(var2, var3, var4 + 1);
         int var8 = var1.a(var2 - 1, var3, var4);
         int var9 = var1.a(var2 + 1, var3, var4);
         int var10;
         int var11;
         int var12;
         byte var13;
         if(var6 != this.bc && var7 != this.bc) {
            if(var8 != this.bc && var9 != this.bc) {
               byte var14 = 3;
               if(ly.p[var6] && !ly.p[var7]) {
                  var14 = 3;
               }

               if(ly.p[var7] && !ly.p[var6]) {
                  var14 = 2;
               }

               if(ly.p[var8] && !ly.p[var9]) {
                  var14 = 5;
               }

               if(ly.p[var9] && !ly.p[var8]) {
                  var14 = 4;
               }

               return var5 == var14?this.bb + 1:this.bb;
            } else if(var5 != 4 && var5 != 5) {
               var10 = 0;
               if(var8 == this.bc) {
                  var10 = -1;
               }

               var11 = var1.a(var8 == this.bc?var2 - 1:var2 + 1, var3, var4 - 1);
               var12 = var1.a(var8 == this.bc?var2 - 1:var2 + 1, var3, var4 + 1);
               if(var5 == 3) {
                  var10 = -1 - var10;
               }

               var13 = 3;
               if((ly.p[var6] || ly.p[var11]) && !ly.p[var7] && !ly.p[var12]) {
                  var13 = 3;
               }

               if((ly.p[var7] || ly.p[var12]) && !ly.p[var6] && !ly.p[var11]) {
                  var13 = 2;
               }

               return (var5 == var13?this.bb + 16:this.bb + 32) + var10;
            } else {
               return this.bb;
            }
         } else if(var5 != 2 && var5 != 3) {
            var10 = 0;
            if(var6 == this.bc) {
               var10 = -1;
            }

            var11 = var1.a(var2 - 1, var3, var6 == this.bc?var4 - 1:var4 + 1);
            var12 = var1.a(var2 + 1, var3, var6 == this.bc?var4 - 1:var4 + 1);
            if(var5 == 4) {
               var10 = -1 - var10;
            }

            var13 = 5;
            if((ly.p[var8] || ly.p[var11]) && !ly.p[var9] && !ly.p[var12]) {
               var13 = 5;
            }

            if((ly.p[var9] || ly.p[var12]) && !ly.p[var8] && !ly.p[var11]) {
               var13 = 4;
            }

            return (var5 == var13?this.bb + 16:this.bb + 32) + var10;
         } else {
            return this.bb;
         }
      }
   }

   public int a(int var1) {
      return var1 == 1?this.bb - 1:(var1 == 0?this.bb - 1:(var1 == 3?this.bb + 1:this.bb));
   }

   public boolean a(cn var1, int var2, int var3, int var4) {
      int var5 = 0;
      if(var1.a(var2 - 1, var3, var4) == this.bc) {
         ++var5;
      }

      if(var1.a(var2 + 1, var3, var4) == this.bc) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 - 1) == this.bc) {
         ++var5;
      }

      if(var1.a(var2, var3, var4 + 1) == this.bc) {
         ++var5;
      }

      return var5 > 1?false:(this.h(var1, var2 - 1, var3, var4)?false:(this.h(var1, var2 + 1, var3, var4)?false:(this.h(var1, var2, var3, var4 - 1)?false:!this.h(var1, var2, var3, var4 + 1))));
   }

   private boolean h(cn var1, int var2, int var3, int var4) {
      return var1.a(var2, var3, var4) != this.bc?false:(var1.a(var2 - 1, var3, var4) == this.bc?true:(var1.a(var2 + 1, var3, var4) == this.bc?true:(var1.a(var2, var3, var4 - 1) == this.bc?true:var1.a(var2, var3, var4 + 1) == this.bc)));
   }

   public void b(cn var1, int var2, int var3, int var4) {
      fe var5 = (fe)var1.b(var2, var3, var4);

      for(int var6 = 0; var6 < var5.c(); ++var6) {
         ev var7 = var5.c(var6);
         if(var7 != null) {
            float var8 = this.a.nextFloat() * 0.8F + 0.1F;
            float var9 = this.a.nextFloat() * 0.8F + 0.1F;
            float var10 = this.a.nextFloat() * 0.8F + 0.1F;

            while(var7.a > 0) {
               int var11 = this.a.nextInt(21) + 10;
               if(var11 > var7.a) {
                  var11 = var7.a;
               }

               var7.a -= var11;
               dx var12 = new dx(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new ev(var7.c, var11, var7.d));
               float var13 = 0.05F;
               var12.an = (double)((float)this.a.nextGaussian() * var13);
               var12.ao = (double)((float)this.a.nextGaussian() * var13 + 0.2F);
               var12.ap = (double)((float)this.a.nextGaussian() * var13);
               var1.a((kh)var12);
            }
         }
      }

      super.b(var1, var2, var3, var4);
   }

   public boolean a(cn var1, int var2, int var3, int var4, dm var5) {
      Object var6 = (fe)var1.b(var2, var3, var4);
      if(var1.g(var2, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 - 1, var3, var4) == this.bc && var1.g(var2 - 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2 + 1, var3, var4) == this.bc && var1.g(var2 + 1, var3 + 1, var4)) {
         return true;
      } else if(var1.a(var2, var3, var4 - 1) == this.bc && var1.g(var2, var3 + 1, var4 - 1)) {
         return true;
      } else if(var1.a(var2, var3, var4 + 1) == this.bc && var1.g(var2, var3 + 1, var4 + 1)) {
         return true;
      } else {
         if(var1.a(var2 - 1, var3, var4) == this.bc) {
            var6 = new hs("Large chest", (fe)var1.b(var2 - 1, var3, var4), (gh)var6);
         }

         if(var1.a(var2 + 1, var3, var4) == this.bc) {
            var6 = new hs("Large chest", (gh)var6, (fe)var1.b(var2 + 1, var3, var4));
         }

         if(var1.a(var2, var3, var4 - 1) == this.bc) {
            var6 = new hs("Large chest", (fe)var1.b(var2, var3, var4 - 1), (gh)var6);
         }

         if(var1.a(var2, var3, var4 + 1) == this.bc) {
            var6 = new hs("Large chest", (gh)var6, (fe)var1.b(var2, var3, var4 + 1));
         }

         var5.a((gh)var6);
         return true;
      }
   }

   protected ic a_() {
      return new fe();
   }
}
