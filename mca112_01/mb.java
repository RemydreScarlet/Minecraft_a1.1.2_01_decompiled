
public class mb extends dq {

   public mb(cn var1) {
      super(var1);
      this.u = "/mob/zombie.png";
      this.aa = 0.5F;
      this.e = 5;
   }

   public void j() {
      if(this.ag.b()) {
         float var1 = this.a(1.0F);
         if(var1 > 0.5F && this.ag.i(eo.b(this.ak), eo.b(this.al), eo.b(this.am)) && this.aQ.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F) {
            this.aT = 300;
         }
      }

      super.j();
   }

   protected String c() {
      return "mob.zombie";
   }

   protected String d() {
      return "mob.zombiehurt";
   }

   protected String e() {
      return "mob.zombiedeath";
   }

   protected int g() {
      return di.J.aS;
   }
}
