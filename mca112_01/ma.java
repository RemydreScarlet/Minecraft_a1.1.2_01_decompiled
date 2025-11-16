
public class ma extends ge implements co {

   public float a;
   public float b;
   private int d = 0;
   public int c = 1;


   public ma(cn var1) {
      super(var1);
      this.u = "/mob/slime.png";
      this.c = 1 << this.aQ.nextInt(3);
      this.aB = 0.0F;
      this.d = this.aQ.nextInt(20) + 10;
      this.c(this.c);
   }

   public void c(int var1) {
      this.c = var1;
      this.a(0.6F * (float)var1, 0.6F * (float)var1);
      this.E = var1 * var1;
      this.a(this.ak, this.al, this.am);
   }

   public void a(hm var1) {
      super.a(var1);
      var1.a("Size", this.c - 1);
   }

   public void b(hm var1) {
      super.b(var1);
      this.c = var1.e("Size") + 1;
   }

   public void e_() {
      this.b = this.a;
      boolean var1 = this.av;
      super.e_();
      if(this.av && !var1) {
         for(int var2 = 0; var2 < this.c * 8; ++var2) {
            float var3 = this.aQ.nextFloat() * 3.1415927F * 2.0F;
            float var4 = this.aQ.nextFloat() * 0.5F + 0.5F;
            float var5 = eo.a(var3) * (float)this.c * 0.5F * var4;
            float var6 = eo.b(var3) * (float)this.c * 0.5F * var4;
            this.ag.a("slime", this.ak + (double)var5, this.au.b, this.am + (double)var6, 0.0D, 0.0D, 0.0D);
         }

         if(this.c > 2) {
            this.ag.a(this, "mob.slime", this.f(), ((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F + 1.0F) / 0.8F);
         }

         this.a = -0.5F;
      }

      this.a *= 0.6F;
   }

   protected void b_() {
      dm var1 = this.ag.a(this, 16.0D);
      if(var1 != null) {
         this.b(var1, 10.0F);
      }

      if(this.av && this.d-- <= 0) {
         this.d = this.aQ.nextInt(20) + 10;
         if(var1 != null) {
            this.d /= 3;
         }

         this.Y = true;
         if(this.c > 1) {
            this.ag.a(this, "mob.slime", this.f(), ((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F + 1.0F) * 0.8F);
         }

         this.a = 1.0F;
         this.V = 1.0F - this.aQ.nextFloat() * 2.0F;
         this.W = (float)(1 * this.c);
      } else {
         this.Y = false;
         if(this.av) {
            this.V = this.W = 0.0F;
         }
      }

   }

   public void F() {
      if(this.c > 1 && this.E == 0) {
         for(int var1 = 0; var1 < 4; ++var1) {
            float var2 = ((float)(var1 % 2) - 0.5F) * (float)this.c / 4.0F;
            float var3 = ((float)(var1 / 2) - 0.5F) * (float)this.c / 4.0F;
            ma var4 = new ma(this.ag);
            var4.c(this.c / 2);
            var4.c(this.ak + (double)var2, this.al + 0.5D, this.am + (double)var3, this.aQ.nextFloat() * 360.0F, 0.0F);
            this.ag.a((kh)var4);
         }
      }

      super.F();
   }

   public void b(dm var1) {
      if(this.c > 1 && this.c(var1) && (double)this.d(var1) < 0.6D * (double)this.c && var1.a(this, this.c)) {
         this.ag.a(this, "mob.slimeattack", 1.0F, (this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F + 1.0F);
      }

   }

   protected String d() {
      return "mob.slime";
   }

   protected String e() {
      return "mob.slime";
   }

   protected int g() {
      return this.c == 1?di.aK.aS:0;
   }

   public boolean a() {
      ga var1 = this.ag.a(eo.b(this.ak), eo.b(this.al));
      return (this.c == 1 || this.ag.l > 0) && this.aQ.nextInt(10) == 0 && var1.a(987234911L).nextInt(10) == 0 && this.al < 16.0D;
   }

   protected float f() {
      return 0.6F;
   }
}
