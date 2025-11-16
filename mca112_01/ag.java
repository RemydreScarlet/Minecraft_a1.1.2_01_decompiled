
public abstract class ag extends ek {

   public ag(cn var1) {
      super(var1);
   }

   protected float a(int var1, int var2, int var3) {
      return this.ag.a(var1, var2 - 1, var3) == ly.v.bc?10.0F:this.ag.c(var1, var2, var3) - 0.5F;
   }

   public void a(hm var1) {
      super.a(var1);
   }

   public void b(hm var1) {
      super.b(var1);
   }

   public boolean a() {
      int var1 = eo.b(this.ak);
      int var2 = eo.b(this.au.b);
      int var3 = eo.b(this.am);
      return this.ag.a(var1, var2 - 1, var3) == ly.v.bc && this.ag.j(var1, var2, var3) > 8 && super.a();
   }

   public int b() {
      return 120;
   }
}
