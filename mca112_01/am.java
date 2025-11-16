
public class am extends ag {

   public boolean a = false;


   public am(cn var1) {
      super(var1);
      this.u = "/mob/cow.png";
      this.a(0.9F, 1.3F);
   }

   public void a(hm var1) {
      super.a(var1);
   }

   public void b(hm var1) {
      super.b(var1);
   }

   protected String c() {
      return "mob.cow";
   }

   protected String d() {
      return "mob.cowhurt";
   }

   protected String e() {
      return "mob.cowhurt";
   }

   protected float f() {
      return 0.4F;
   }

   protected int g() {
      return di.aD.aS;
   }

   public boolean a(dm var1) {
      ev var2 = var1.b.a();
      if(var2 != null && var2.c == di.au.aS) {
         var1.b.a(var1.b.d, new ev(di.aE));
         return true;
      } else {
         return false;
      }
   }
}
