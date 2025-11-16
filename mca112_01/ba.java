
public class ba extends nq {

   public ba(cn var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.i = 1.0F;
      this.j = 1.0F;
      this.k = 1.0F;
      this.b = 32;
      this.a(0.02F, 0.02F);
      this.g *= this.aQ.nextFloat() * 0.6F + 0.2F;
      this.an = var8 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.ao = var10 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.ap = var12 * 0.20000000298023224D + (double)((float)(Math.random() * 2.0D - 1.0D) * 0.02F);
      this.f = (int)(8.0D / (Math.random() * 0.8D + 0.2D));
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      this.ao += 0.002D;
      this.c(this.an, this.ao, this.ap);
      this.an *= 0.8500000238418579D;
      this.ao *= 0.8500000238418579D;
      this.ap *= 0.8500000238418579D;
      if(this.ag.f(eo.b(this.ak), eo.b(this.al), eo.b(this.am)) != gb.f) {
         this.F();
      }

      if(this.f-- <= 0) {
         this.F();
      }

   }
}
