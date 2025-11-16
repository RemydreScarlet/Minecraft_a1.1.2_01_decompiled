
public class nq extends kh {

   protected int b;
   protected float c;
   protected float d;
   protected int e = 0;
   protected int f = 0;
   protected float g;
   protected float h;
   protected float i;
   protected float j;
   protected float k;
   public static double l;
   public static double m;
   public static double n;


   public nq(cn var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.a(0.2F, 0.2F);
      this.aB = this.aD / 2.0F;
      this.a(var2, var4, var6);
      this.i = this.j = this.k = 1.0F;
      this.an = var8 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.ao = var10 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      this.ap = var12 + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.4F);
      float var14 = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
      float var15 = eo.a(this.an * this.an + this.ao * this.ao + this.ap * this.ap);
      this.an = this.an / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.ao = this.ao / (double)var15 * (double)var14 * 0.4000000059604645D + 0.10000000149011612D;
      this.ap = this.ap / (double)var15 * (double)var14 * 0.4000000059604645D;
      this.c = this.aQ.nextFloat() * 3.0F;
      this.d = this.aQ.nextFloat() * 3.0F;
      this.g = (this.aQ.nextFloat() * 0.5F + 0.5F) * 2.0F;
      this.f = (int)(4.0F / (this.aQ.nextFloat() * 0.9F + 0.1F));
      this.e = 0;
      this.aG = false;
   }

   public nq b(float var1) {
      this.an *= (double)var1;
      this.ao = (this.ao - 0.10000000149011612D) * (double)var1 + 0.10000000149011612D;
      this.ap *= (double)var1;
      return this;
   }

   public nq d(float var1) {
      this.a(0.2F * var1, 0.2F * var1);
      this.g *= var1;
      return this;
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      if(this.e++ >= this.f) {
         this.F();
      }

      this.ao -= 0.04D * (double)this.h;
      this.c(this.an, this.ao, this.ap);
      this.an *= 0.9800000190734863D;
      this.ao *= 0.9800000190734863D;
      this.ap *= 0.9800000190734863D;
      if(this.av) {
         this.an *= 0.699999988079071D;
         this.ap *= 0.699999988079071D;
      }

   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = (float)(this.b % 16) / 16.0F;
      float var9 = var8 + 0.0624375F;
      float var10 = (float)(this.b / 16) / 16.0F;
      float var11 = var10 + 0.0624375F;
      float var12 = 0.1F * this.g;
      float var13 = (float)(this.ah + (this.ak - this.ah) * (double)var2 - l);
      float var14 = (float)(this.ai + (this.al - this.ai) * (double)var2 - m);
      float var15 = (float)(this.aj + (this.am - this.aj) * (double)var2 - n);
      float var16 = this.a(var2);
      var1.a(this.i * var16, this.j * var16, this.k * var16);
      var1.a((double)(var13 - var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 - var5 * var12 - var7 * var12), (double)var8, (double)var11);
      var1.a((double)(var13 - var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 - var5 * var12 + var7 * var12), (double)var8, (double)var10);
      var1.a((double)(var13 + var3 * var12 + var6 * var12), (double)(var14 + var4 * var12), (double)(var15 + var5 * var12 + var7 * var12), (double)var9, (double)var10);
      var1.a((double)(var13 + var3 * var12 - var6 * var12), (double)(var14 - var4 * var12), (double)(var15 + var5 * var12 - var7 * var12), (double)var9, (double)var11);
   }

   public int c() {
      return 0;
   }

   public void a(hm var1) {}

   public void b(hm var1) {}
}
