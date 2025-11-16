
public class cq extends nq {

   private float a;


   public cq(cn var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.an *= 0.800000011920929D;
      this.ao *= 0.800000011920929D;
      this.ap *= 0.800000011920929D;
      this.ao = (double)(this.aQ.nextFloat() * 0.4F + 0.05F);
      this.i = this.j = this.k = 1.0F;
      this.g *= this.aQ.nextFloat() * 2.0F + 0.2F;
      this.a = this.g;
      this.f = (int)(16.0D / (Math.random() * 0.8D + 0.2D));
      this.aN = false;
      this.b = 49;
   }

   public float a(float var1) {
      return 1.0F;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f;
      this.g = this.a * (1.0F - var8 * var8);
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      if(this.e++ >= this.f) {
         this.F();
      }

      float var1 = (float)this.e / (float)this.f;
      if(this.aQ.nextFloat() > var1) {
         this.ag.a("smoke", this.ak, this.al, this.am, this.an, this.ao, this.ap);
      }

      this.ao -= 0.03D;
      this.c(this.an, this.ao, this.ap);
      this.an *= 0.9990000128746033D;
      this.ao *= 0.9990000128746033D;
      this.ap *= 0.9990000128746033D;
      if(this.av) {
         this.an *= 0.699999988079071D;
         this.ap *= 0.699999988079071D;
      }

   }
}
