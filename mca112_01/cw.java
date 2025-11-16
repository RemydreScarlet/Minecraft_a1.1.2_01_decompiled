
public class cw extends dq {

   public cw(cn var1) {
      super(var1);
      this.u = "/mob/skeleton.png";
   }

   protected String c() {
      return "mob.skeleton";
   }

   protected String d() {
      return "mob.skeletonhurt";
   }

   protected String e() {
      return "mob.skeletonhurt";
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

   protected void a(kh var1, float var2) {
      if(var2 < 10.0F) {
         double var3 = var1.ak - this.ak;
         double var5 = var1.am - this.am;
         if(this.K == 0) {
            kg var7 = new kg(this.ag, this);
            ++var7.al;
            double var8 = var1.al - 0.20000000298023224D - var7.al;
            float var10 = eo.a(var3 * var3 + var5 * var5) * 0.2F;
            this.ag.a(this, "random.bow", 1.0F, 1.0F / (this.aQ.nextFloat() * 0.4F + 0.8F));
            this.ag.a((kh)var7);
            var7.a(var3, var8 + (double)var10, var5, 0.6F, 12.0F);
            this.K = 30;
         }

         this.aq = (float)(Math.atan2(var5, var3) * 180.0D / 3.1415927410125732D) - 90.0F;
         this.g = true;
      }

   }

   public void a(hm var1) {
      super.a(var1);
   }

   public void b(hm var1) {
      super.b(var1);
   }

   protected int g() {
      return di.j.aS;
   }
}
