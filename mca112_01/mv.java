
public class mv extends ag {

   public boolean a = false;


   public mv(cn var1) {
      super(var1);
      this.u = "/mob/pig.png";
      this.a(0.9F, 0.9F);
      this.a = false;
   }

   public void a(hm var1) {
      super.a(var1);
      var1.a("Saddle", this.a);
   }

   public void b(hm var1) {
      super.b(var1);
      this.a = var1.m("Saddle");
   }

   protected String c() {
      return "mob.pig";
   }

   protected String d() {
      return "mob.pig";
   }

   protected String e() {
      return "mob.pigdeath";
   }

   public boolean a(dm var1) {
      if(this.a) {
         var1.g(this);
         return true;
      } else {
         return false;
      }
   }

   protected int g() {
      return di.ao.aS;
   }
}
