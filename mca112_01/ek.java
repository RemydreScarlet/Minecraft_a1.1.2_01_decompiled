
public class ek extends ge {

   private bl a;
   protected kh f;
   protected boolean g = false;


   public ek(cn var1) {
      super(var1);
   }

   protected void b_() {
      this.g = false;
      float var1 = 16.0F;
      if(this.f == null) {
         this.f = this.i();
         if(this.f != null) {
            this.a = this.ag.a(this, this.f, var1);
         }
      } else if(!this.f.B()) {
         this.f = null;
      } else {
         float var2 = this.f.d((kh)this);
         if(this.c(this.f)) {
            this.a(this.f, var2);
         }
      }

      if(!this.g && this.f != null && (this.a == null || this.aQ.nextInt(20) == 0)) {
         this.a = this.ag.a(this, this.f, var1);
      } else if(this.a == null && this.aQ.nextInt(80) == 0 || this.aQ.nextInt(80) == 0) {
         boolean var21 = false;
         int var3 = -1;
         int var4 = -1;
         int var5 = -1;
         float var6 = -99999.0F;

         for(int var7 = 0; var7 < 10; ++var7) {
            int var8 = eo.b(this.ak + (double)this.aQ.nextInt(13) - 6.0D);
            int var9 = eo.b(this.al + (double)this.aQ.nextInt(7) - 3.0D);
            int var10 = eo.b(this.am + (double)this.aQ.nextInt(13) - 6.0D);
            float var11 = this.a(var8, var9, var10);
            if(var11 > var6) {
               var6 = var11;
               var3 = var8;
               var4 = var9;
               var5 = var10;
               var21 = true;
            }
         }

         if(var21) {
            this.a = this.ag.a(this, var3, var4, var5, 10.0F);
         }
      }

      int var22 = eo.b(this.au.b);
      boolean var23 = this.g_();
      boolean var24 = this.G();
      this.ar = 0.0F;
      if(this.a != null && this.aQ.nextInt(100) != 0) {
         aj var25 = this.a.a(this);
         double var26 = (double)(this.aC * 2.0F);

         while(var25 != null && var25.d(this.ak, var25.b, this.am) < var26 * var26) {
            this.a.a();
            if(this.a.b()) {
               var25 = null;
               this.a = null;
            } else {
               var25 = this.a.a(this);
            }
         }

         this.Y = false;
         if(var25 != null) {
            double var27 = var25.a - this.ak;
            double var28 = var25.c - this.am;
            double var12 = var25.b - (double)var22;
            float var14 = (float)(Math.atan2(var28, var27) * 180.0D / 3.1415927410125732D) - 90.0F;
            float var15 = var14 - this.aq;

            for(this.W = this.aa; var15 < -180.0F; var15 += 360.0F) {
               ;
            }

            while(var15 >= 180.0F) {
               var15 -= 360.0F;
            }

            if(var15 > 30.0F) {
               var15 = 30.0F;
            }

            if(var15 < -30.0F) {
               var15 = -30.0F;
            }

            this.aq += var15;
            if(this.g && this.f != null) {
               double var16 = this.f.ak - this.ak;
               double var18 = this.f.am - this.am;
               float var20 = this.aq;
               this.aq = (float)(Math.atan2(var18, var16) * 180.0D / 3.1415927410125732D) - 90.0F;
               var15 = (var20 - this.aq + 90.0F) * 3.1415927F / 180.0F;
               this.V = -eo.a(var15) * this.W * 1.0F;
               this.W = eo.b(var15) * this.W * 1.0F;
            }

            if(var12 > 0.0D) {
               this.Y = true;
            }
         }

         if(this.f != null) {
            this.b(this.f, 30.0F);
         }

         if(this.aw) {
            this.Y = true;
         }

         if(this.aQ.nextFloat() < 0.8F && (var23 || var24)) {
            this.Y = true;
         }

      } else {
         super.b_();
         this.a = null;
      }
   }

   protected void a(kh var1, float var2) {}

   protected float a(int var1, int var2, int var3) {
      return 0.0F;
   }

   protected kh i() {
      return null;
   }

   public boolean a() {
      int var1 = eo.b(this.ak);
      int var2 = eo.b(this.au.b);
      int var3 = eo.b(this.am);
      return super.a() && this.a(var1, var2, var3) >= 0.0F;
   }
}
