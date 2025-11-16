
public class en extends nq {

   float a;


   public en(cn var1, double var2, double var4, double var6) {
      this(var1, var2, var4, var6, 1.0F);
   }

   public en(cn var1, double var2, double var4, double var6, float var8) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.an *= 0.10000000149011612D;
      this.ao *= 0.10000000149011612D;
      this.ap *= 0.10000000149011612D;
      this.i = (float)(Math.random() * 0.30000001192092896D) + 0.7F;
      this.j = this.k = (float)(Math.random() * 0.10000000149011612D);
      this.g *= 0.75F;
      this.g *= var8;
      this.a = this.g;
      this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
      this.f = (int)((float)this.f * var8);
      this.aN = false;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.e + var2) / (float)this.f * 32.0F;
      if(var8 < 0.0F) {
         var8 = 0.0F;
      }

      if(var8 > 1.0F) {
         var8 = 1.0F;
      }

      this.g = this.a * var8;
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
      this.c(this.an, this.ao, this.ap);
      if(this.al == this.ai) {
         this.an *= 1.1D;
         this.ap *= 1.1D;
      }

      this.an *= 0.9599999785423279D;
      this.ao *= 0.9599999785423279D;
      this.ap *= 0.9599999785423279D;
      if(this.av) {
         this.an *= 0.699999988079071D;
         this.ap *= 0.699999988079071D;
      }

   }
}
