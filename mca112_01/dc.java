import java.util.List;

public class dc extends kh {

   public int a;
   public int b;
   public int c;


   public dc(cn var1) {
      super(var1);
      this.a = 0;
      this.b = 0;
      this.c = 1;
      this.ad = true;
      this.a(1.5F, 0.6F);
      this.aB = this.aD / 2.0F;
      this.aG = false;
   }

   public cf b_(kh var1) {
      return var1.au;
   }

   public cf f_() {
      return this.au;
   }

   public boolean d_() {
      return true;
   }

   public dc(cn var1, double var2, double var4, double var6) {
      this(var1);
      this.a(var2, var4 + (double)this.aB, var6);
      this.an = 0.0D;
      this.ao = 0.0D;
      this.ap = 0.0D;
      this.ah = var2;
      this.ai = var4;
      this.aj = var6;
   }

   public double h() {
      return (double)this.aD * 0.0D - 0.30000001192092896D;
   }

   public boolean a(kh var1, int var2) {
      this.c = -this.c;
      this.b = 10;
      this.a += var2 * 10;
      if(this.a > 40) {
         int var3;
         for(var3 = 0; var3 < 3; ++var3) {
            this.a(ly.y.bc, 1, 0.0F);
         }

         for(var3 = 0; var3 < 2; ++var3) {
            this.a(di.B.aS, 1, 0.0F);
         }

         this.F();
      }

      return true;
   }

   public boolean c_() {
      return !this.aA;
   }

   public void e_() {
      super.e_();
      if(this.b > 0) {
         --this.b;
      }

      if(this.a > 0) {
         --this.a;
      }

      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      byte var1 = 5;
      double var2 = 0.0D;

      for(int var4 = 0; var4 < var1; ++var4) {
         double var5 = this.au.b + (this.au.e - this.au.b) * (double)(var4 + 0) / (double)var1 - 0.125D;
         double var7 = this.au.b + (this.au.e - this.au.b) * (double)(var4 + 1) / (double)var1 - 0.125D;
         cf var9 = cf.b(this.au.a, var5, this.au.c, this.au.d, var7, this.au.f);
         if(this.ag.b(var9, gb.f)) {
            var2 += 1.0D / (double)var1;
         }
      }

      double var23 = var2 * 2.0D - 1.0D;
      this.ao += 0.03999999910593033D * var23;
      if(this.ae != null) {
         this.an += this.ae.an * 0.2D;
         this.ap += this.ae.ap * 0.2D;
      }

      double var6 = 0.4D;
      if(this.an < -var6) {
         this.an = -var6;
      }

      if(this.an > var6) {
         this.an = var6;
      }

      if(this.ap < -var6) {
         this.ap = -var6;
      }

      if(this.ap > var6) {
         this.ap = var6;
      }

      if(this.av) {
         this.an *= 0.5D;
         this.ao *= 0.5D;
         this.ap *= 0.5D;
      }

      this.c(this.an, this.ao, this.ap);
      double var8 = Math.sqrt(this.an * this.an + this.ap * this.ap);
      double var10;
      double var12;
      if(var8 > 0.15D) {
         var10 = Math.cos((double)this.aq * 3.141592653589793D / 180.0D);
         var12 = Math.sin((double)this.aq * 3.141592653589793D / 180.0D);

         for(int var14 = 0; (double)var14 < 1.0D + var8 * 60.0D; ++var14) {
            double var15 = (double)(this.aQ.nextFloat() * 2.0F - 1.0F);
            double var17 = (double)(this.aQ.nextInt(2) * 2 - 1) * 0.7D;
            double var19;
            double var21;
            if(this.aQ.nextBoolean()) {
               var19 = this.ak - var10 * var15 * 0.8D + var12 * var17;
               var21 = this.am - var12 * var15 * 0.8D - var10 * var17;
               this.ag.a("splash", var19, this.al - 0.125D, var21, this.an, this.ao, this.ap);
            } else {
               var19 = this.ak + var10 + var12 * var15 * 0.7D;
               var21 = this.am + var12 - var10 * var15 * 0.7D;
               this.ag.a("splash", var19, this.al - 0.125D, var21, this.an, this.ao, this.ap);
            }
         }
      }

      if(this.aw && var8 > 0.15D) {
         this.F();

         int var24;
         for(var24 = 0; var24 < 3; ++var24) {
            this.a(ly.y.bc, 1, 0.0F);
         }

         for(var24 = 0; var24 < 2; ++var24) {
            this.a(di.B.aS, 1, 0.0F);
         }
      } else {
         this.an *= 0.9900000095367432D;
         this.ao *= 0.949999988079071D;
         this.ap *= 0.9900000095367432D;
      }

      this.ar = 0.0F;
      var10 = (double)this.aq;
      var12 = this.ah - this.ak;
      double var25 = this.aj - this.am;
      if(var12 * var12 + var25 * var25 > 0.001D) {
         var10 = (double)((float)(Math.atan2(var25, var12) * 180.0D / 3.141592653589793D));
      }

      double var16;
      for(var16 = var10 - (double)this.aq; var16 >= 180.0D; var16 -= 360.0D) {
         ;
      }

      while(var16 < -180.0D) {
         var16 += 360.0D;
      }

      if(var16 > 20.0D) {
         var16 = 20.0D;
      }

      if(var16 < -20.0D) {
         var16 = -20.0D;
      }

      this.aq = (float)((double)this.aq + var16);
      this.c(this.aq, this.ar);
      List var18 = this.ag.b((kh)this, this.au.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
      if(var18 != null && var18.size() > 0) {
         for(int var26 = 0; var26 < var18.size(); ++var26) {
            kh var20 = (kh)var18.get(var26);
            if(var20 != this.ae && var20.d_() && var20 instanceof dc) {
               var20.f(this);
            }
         }
      }

      if(this.ae != null && this.ae.aA) {
         this.ae = null;
      }

   }

   protected void i_() {
      double var1 = Math.cos((double)this.aq * 3.141592653589793D / 180.0D) * 0.4D;
      double var3 = Math.sin((double)this.aq * 3.141592653589793D / 180.0D) * 0.4D;
      this.ae.a(this.ak + var1, this.al + this.h() + this.ae.v(), this.am + var3);
   }

   protected void a(hm var1) {}

   protected void b(hm var1) {}

   public float h_() {
      return 0.0F;
   }

   public boolean a(dm var1) {
      var1.g(this);
      return true;
   }
}
