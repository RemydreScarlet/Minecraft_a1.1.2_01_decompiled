
public class fu extends di {

   public fu(int var1, int var2) {
      super(var1);
      this.aT = 1;
      this.aU = 32 << var2;
   }

   public boolean a(ev var1, dm var2, cn var3, int var4, int var5, int var6, int var7) {
      int var8 = var3.a(var4, var5, var6);
      gb var9 = var3.f(var4, var5 + 1, var6);
      if((var9.a() || var8 != ly.v.bc) && var8 != ly.w.bc) {
         return false;
      } else {
         ly var10 = ly.aB;
         var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var10.bl.d(), (var10.bl.b() + 1.0F) / 2.0F, var10.bl.c() * 0.8F);
         var3.d(var4, var5, var6, var10.bc);
         var1.b(1);
         if(var3.n.nextInt(8) == 0 && var8 == ly.v.bc) {
            byte var11 = 1;

            for(int var12 = 0; var12 < var11; ++var12) {
               float var13 = 0.7F;
               float var14 = var3.n.nextFloat() * var13 + (1.0F - var13) * 0.5F;
               float var15 = 1.2F;
               float var16 = var3.n.nextFloat() * var13 + (1.0F - var13) * 0.5F;
               dx var17 = new dx(var3, (double)((float)var4 + var14), (double)((float)var5 + var15), (double)((float)var6 + var16), new ev(di.Q));
               var17.c = 10;
               var3.a((kh)var17);
            }
         }

         return true;
      }
   }

   public boolean a() {
      return true;
   }
}
