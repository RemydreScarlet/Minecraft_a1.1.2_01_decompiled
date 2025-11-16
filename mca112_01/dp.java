
public class dp extends nq {

   public dp(cn var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.an = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.ao = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.ap = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.05F);
      this.i = this.j = this.k = this.aQ.nextFloat() * 0.3F + 0.7F;
      this.g = this.aQ.nextFloat() * this.aQ.nextFloat() * 6.0F + 1.0F;
      this.f = (int)(16.0D / ((double)this.aQ.nextFloat() * 0.8D + 0.2D)) + 2;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      if(this.e++ >= this.f) {
         this.F();
      }

      this.b = 7 - this.e * 8 / this.f;
      this.ao += 0.004D;
      this.c(this.an, this.ao, this.ap);
      this.an *= 0.8999999761581421D;
      this.ao *= 0.8999999761581421D;
      this.ap *= 0.8999999761581421D;
      if(this.av) {
         this.an *= 0.699999988079071D;
         this.ap *= 0.699999988079071D;
      }

   }
}
