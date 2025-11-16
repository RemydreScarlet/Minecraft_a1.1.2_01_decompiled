
public class mz extends ag {

   public boolean a = false;
   public float b = 0.0F;
   public float c = 0.0F;
   public float d;
   public float e;
   public float h = 1.0F;
   public int i;


   public mz(cn var1) {
      super(var1);
      this.u = "/mob/chicken.png";
      this.a(0.3F, 0.4F);
      this.E = 4;
      this.i = this.aQ.nextInt(6000) + 6000;
   }

   public void j() {
      super.j();
      this.e = this.b;
      this.d = this.c;
      this.c = (float)((double)this.c + (double)(this.av?-1:4) * 0.3D);
      if(this.c < 0.0F) {
         this.c = 0.0F;
      }

      if(this.c > 1.0F) {
         this.c = 1.0F;
      }

      if(!this.av && this.h < 1.0F) {
         this.h = 1.0F;
      }

      this.h = (float)((double)this.h * 0.9D);
      if(!this.av && this.ao < 0.0D) {
         this.ao *= 0.6D;
      }

      this.b += this.h * 2.0F;
      if(!this.ag.y && --this.i <= 0) {
         this.ag.a(this, "mob.chickenplop", 1.0F, (this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F + 1.0F);
         this.b(di.aN.aS, 1);
         this.i = this.aQ.nextInt(6000) + 6000;
      }

   }

   protected void c(float var1) {}

   public void a(hm var1) {
      super.a(var1);
   }

   public void b(hm var1) {
      super.b(var1);
   }

   protected String c() {
      return "mob.chicken";
   }

   protected String d() {
      return "mob.chickenhurt";
   }

   protected String e() {
      return "mob.chickenhurt";
   }

   protected int g() {
      return di.J.aS;
   }
}
