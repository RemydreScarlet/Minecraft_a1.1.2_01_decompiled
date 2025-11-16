
public class nf extends nq {

   public nf(cn var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
      this.an *= 0.30000001192092896D;
      this.ao = (double)((float)Math.random() * 0.2F + 0.1F);
      this.ap *= 0.30000001192092896D;
      this.i = 1.0F;
      this.j = 1.0F;
      this.k = 1.0F;
      this.b = 19 + this.aQ.nextInt(4);
      this.a(0.01F, 0.01F);
      this.h = 0.06F;
      this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      this.ao -= (double)this.h;
      this.c(this.an, this.ao, this.ap);
      this.an *= 0.9800000190734863D;
      this.ao *= 0.9800000190734863D;
      this.ap *= 0.9800000190734863D;
      if(this.f-- <= 0) {
         this.F();
      }

      if(this.av) {
         if(Math.random() < 0.5D) {
            this.F();
         }

         this.an *= 0.699999988079071D;
         this.ap *= 0.699999988079071D;
      }

      gb var1 = this.ag.f(eo.b(this.ak), eo.b(this.al), eo.b(this.am));
      if(var1.d() || var1.a()) {
         double var2 = (double)((float)(eo.b(this.al) + 1) - jp.b(this.ag.e(eo.b(this.ak), eo.b(this.al), eo.b(this.am))));
         if(this.al < var2) {
            this.F();
         }
      }

   }
}
