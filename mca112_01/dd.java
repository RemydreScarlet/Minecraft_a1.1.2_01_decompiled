
public class dd extends dq {

   int a;
   int b;
   int c = 30;
   int d = -1;


   public dd(cn var1) {
      super(var1);
      this.u = "/mob/creeper.png";
   }

   public void a(hm var1) {
      super.a(var1);
   }

   public void b(hm var1) {
      super.b(var1);
   }

   protected void b_() {
      this.b = this.a;
      if(this.a > 0 && this.d < 0) {
         --this.a;
      }

      if(this.d >= 0) {
         this.d = 2;
      }

      super.b_();
      if(this.d != 1) {
         this.d = -1;
      }

   }

   protected String d() {
      return "mob.creeper";
   }

   protected String e() {
      return "mob.creeperdeath";
   }

   public void b(kh var1) {
      super.b(var1);
      if(var1 instanceof cw) {
         this.b(di.aQ.aS + this.aQ.nextInt(2), 1);
      }

   }

   protected void a(kh var1, float var2) {
      if(this.d <= 0 && var2 < 3.0F || this.d > 0 && var2 < 7.0F) {
         if(this.a == 0) {
            this.ag.a(this, "random.fuse", 1.0F, 0.5F);
         }

         this.d = 1;
         ++this.a;
         if(this.a == this.c) {
            this.ag.a(this, this.ak, this.al, this.am, 3.0F);
            this.F();
         }

         this.g = true;
      }

   }

   public float b(float var1) {
      return ((float)this.b + (float)(this.a - this.b) * var1) / (float)(this.c - 2);
   }

   protected int g() {
      return di.K.aS;
   }
}
