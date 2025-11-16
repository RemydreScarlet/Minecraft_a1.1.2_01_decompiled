
public class me extends di {

   public me(int var1) {
      super(var1);
      this.aT = 1;
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
      mf var24 = var2.a(var13, var23, true);
      if(var24 == null) {
         return var1;
      } else {
         if(var24.a == 0) {
            int var25 = var24.b;
            int var26 = var24.c;
            int var27 = var24.d;
            var2.a((kh)(new dc(var2, (double)((float)var25 + 0.5F), (double)((float)var26 + 1.5F), (double)((float)var27 + 0.5F))));
            --var1.a;
         }

         return var1;
      }
   }
}
