
public class ac extends di {

   private int a;


   public ac(int var1, int var2) {
      super(var1);
      this.aT = 1;
      this.aU = 64;
      this.a = var2;
   }

   public ev a(ev var1, cn var2, dm var3) {
      float var4 = 1.0F;
      float var5 = var3.at + (var3.ar - var3.at) * var4;
      float var6 = var3.as + (var3.aq - var3.as) * var4;
      double var7 = var3.ah + (var3.ak - var3.ah) * (double)var4;
      double var9 = var3.ai + (var3.al - var3.ai) * (double)var4;
      double var11 = var3.aj + (var3.am - var3.aj) * (double)var4;
      aj var13 = aj.b(var7, var9, var11);
      float var14 = eo.b(-var6 * 0.017453292F - 3.1415927F);
      float var15 = eo.a(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -eo.b(-var5 * 0.017453292F);
      float var17 = eo.a(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      aj var23 = var13.c((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      mf var24 = var2.a(var13, var23, this.a == 0);
      if(var24 == null) {
         return var1;
      } else {
         if(var24.a == 0) {
            int var25 = var24.b;
            int var26 = var24.c;
            int var27 = var24.d;
            if(this.a == 0) {
               if(var2.f(var25, var26, var27) == gb.f && var2.e(var25, var26, var27) == 0) {
                  var2.d(var25, var26, var27, 0);
                  return new ev(di.av);
               }

               if(var2.f(var25, var26, var27) == gb.g && var2.e(var25, var26, var27) == 0) {
                  var2.d(var25, var26, var27, 0);
                  return new ev(di.aw);
               }
            } else {
               if(this.a < 0) {
                  return new ev(di.au);
               }

               if(var24.e == 0) {
                  --var26;
               }

               if(var24.e == 1) {
                  ++var26;
               }

               if(var24.e == 2) {
                  --var27;
               }

               if(var24.e == 3) {
                  ++var27;
               }

               if(var24.e == 4) {
                  --var25;
               }

               if(var24.e == 5) {
                  ++var25;
               }

               if(var2.a(var25, var26, var27) == 0 || !var2.f(var25, var26, var27).a()) {
                  var2.b(var25, var26, var27, this.a, 0);
                  return new ev(di.au);
               }
            }
         } else if(this.a == 0 && var24.g instanceof am) {
            return new ev(di.aE);
         }

         return var1;
      }
   }
}
