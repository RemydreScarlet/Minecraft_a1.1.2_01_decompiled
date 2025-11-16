
public class iw extends nq {

   public iw(cn var1, double var2, double var4, double var6, double var8, double var10, double var12, ly var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.b = var14.bb;
      this.h = var14.bm;
      this.i = this.j = this.k = 0.6F;
      this.g /= 2.0F;
   }

   public int c() {
      return 1;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)(this.b % 16) + this.c / 4.0F) / 16.0F;
      float var9 = var8 + 0.015609375F;
      float var10 = ((float)(this.b / 16) + this.d / 4.0F) / 16.0F;
      float var11 = var10 + 0.015609375F;
      float var12 = 0.1F * this.g;
      float var13 = (float)(this.ah + (this.ak - this.ah) * (double)var2 - l);
      float var14 = (float)(this.ai + (this.al - this.ai) * (double)var2 - m);
      float var15 = (float)(this.aj + (this.am - this.aj) * (double)var2 - n);
      float var16 = this.a(var2);
      var1.a(var16 * this.i, var16 * this.j, var16 * this.k);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var8, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var9, (double)var11);
   }
}
