import java.util.List;

public class kg extends kh {

   private int b = -1;
   private int c = -1;
   private int d = -1;
   private int e = 0;
   private boolean f = false;
   public int a = 0;
   private ge g;
   private int h;
   private int i = 0;


   public kg(cn var1) {
      super(var1);
      this.a(0.5F, 0.5F);
   }

   public kg(cn var1, ge var2) {
      super(var1);
      this.g = var2;
      this.a(0.5F, 0.5F);
      this.c(var2.ak, var2.al, var2.am, var2.aq, var2.ar);
      this.ak -= (double)(eo.b(this.aq / 180.0F * 3.1415927F) * 0.16F);
      this.al -= 0.10000000149011612D;
      this.am -= (double)(eo.a(this.aq / 180.0F * 3.1415927F) * 0.16F);
      this.a(this.ak, this.al, this.am);
      this.aB = 0.0F;
      this.an = (double)(-eo.a(this.aq / 180.0F * 3.1415927F) * eo.b(this.ar / 180.0F * 3.1415927F));
      this.ap = (double)(eo.b(this.aq / 180.0F * 3.1415927F) * eo.b(this.ar / 180.0F * 3.1415927F));
      this.ao = (double)(-eo.a(this.ar / 180.0F * 3.1415927F));
      this.a(this.an, this.ao, this.ap, 1.5F, 1.0F);
   }

   public void a(double var1, double var3, double var5, float var7, float var8) {
      float var9 = eo.a(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.aQ.nextGaussian() * 0.007499999832361937D * (double)var8;
      var3 += this.aQ.nextGaussian() * 0.007499999832361937D * (double)var8;
      var5 += this.aQ.nextGaussian() * 0.007499999832361937D * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.an = var1;
      this.ao = var3;
      this.ap = var5;
      float var10 = eo.a(var1 * var1 + var5 * var5);
      this.as = this.aq = (float)(Math.atan2(var1, var5) * 180.0D / 3.1415927410125732D);
      this.at = this.ar = (float)(Math.atan2(var3, (double)var10) * 180.0D / 3.1415927410125732D);
      this.h = 0;
   }

   public void e_() {
      super.e_();
      if(this.a > 0) {
         --this.a;
      }

      if(this.f) {
         int var1 = this.ag.a(this.b, this.c, this.d);
         if(var1 == this.e) {
            ++this.h;
            if(this.h == 1200) {
               this.F();
            }

            return;
         }

         this.f = false;
         this.an *= (double)(this.aQ.nextFloat() * 0.2F);
         this.ao *= (double)(this.aQ.nextFloat() * 0.2F);
         this.ap *= (double)(this.aQ.nextFloat() * 0.2F);
         this.h = 0;
         this.i = 0;
      } else {
         ++this.i;
      }

      aj var15 = aj.b(this.ak, this.al, this.am);
      aj var2 = aj.b(this.ak + this.an, this.al + this.ao, this.am + this.ap);
      mf var3 = this.ag.a(var15, var2);
      var15 = aj.b(this.ak, this.al, this.am);
      var2 = aj.b(this.ak + this.an, this.al + this.ao, this.am + this.ap);
      if(var3 != null) {
         var2 = aj.b(var3.f.a, var3.f.b, var3.f.c);
      }

      kh var4 = null;
      List var5 = this.ag.b((kh)this, this.au.a(this.an, this.ao, this.ap).b(1.0D, 1.0D, 1.0D));
      double var6 = 0.0D;

      float var10;
      for(int var8 = 0; var8 < var5.size(); ++var8) {
         kh var9 = (kh)var5.get(var8);
         if(var9.c_() && (var9 != this.g || this.i >= 5)) {
            var10 = 0.3F;
            cf var11 = var9.au.b((double)var10, (double)var10, (double)var10);
            mf var12 = var11.a(var15, var2);
            if(var12 != null) {
               double var13 = var15.c(var12.f);
               if(var13 < var6 || var6 == 0.0D) {
                  var4 = var9;
                  var6 = var13;
               }
            }
         }
      }

      if(var4 != null) {
         var3 = new mf(var4);
      }

      float var16;
      if(var3 != null) {
         if(var3.g != null) {
            if(var3.g.a(this.g, 4)) {
               this.ag.a(this, "random.drr", 1.0F, 1.2F / (this.aQ.nextFloat() * 0.2F + 0.9F));
               this.F();
            } else {
               this.an *= -0.10000000149011612D;
               this.ao *= -0.10000000149011612D;
               this.ap *= -0.10000000149011612D;
               this.aq += 180.0F;
               this.as += 180.0F;
               this.i = 0;
            }
         } else {
            this.b = var3.b;
            this.c = var3.c;
            this.d = var3.d;
            this.e = this.ag.a(this.b, this.c, this.d);
            this.an = (double)((float)(var3.f.a - this.ak));
            this.ao = (double)((float)(var3.f.b - this.al));
            this.ap = (double)((float)(var3.f.c - this.am));
            var16 = eo.a(this.an * this.an + this.ao * this.ao + this.ap * this.ap);
            this.ak -= this.an / (double)var16 * 0.05000000074505806D;
            this.al -= this.ao / (double)var16 * 0.05000000074505806D;
            this.am -= this.ap / (double)var16 * 0.05000000074505806D;
            this.ag.a(this, "random.drr", 1.0F, 1.2F / (this.aQ.nextFloat() * 0.2F + 0.9F));
            this.f = true;
            this.a = 7;
         }
      }

      this.ak += this.an;
      this.al += this.ao;
      this.am += this.ap;
      var16 = eo.a(this.an * this.an + this.ap * this.ap);
      this.aq = (float)(Math.atan2(this.an, this.ap) * 180.0D / 3.1415927410125732D);

      for(this.ar = (float)(Math.atan2(this.ao, (double)var16) * 180.0D / 3.1415927410125732D); this.ar - this.at < -180.0F; this.at -= 360.0F) {
         ;
      }

      while(this.ar - this.at >= 180.0F) {
         this.at += 360.0F;
      }

      while(this.aq - this.as < -180.0F) {
         this.as -= 360.0F;
      }

      while(this.aq - this.as >= 180.0F) {
         this.as += 360.0F;
      }

      this.ar = this.at + (this.ar - this.at) * 0.2F;
      this.aq = this.as + (this.aq - this.as) * 0.2F;
      float var17 = 0.99F;
      var10 = 0.03F;
      if(this.g_()) {
         for(int var18 = 0; var18 < 4; ++var18) {
            float var19 = 0.25F;
            this.ag.a("bubble", this.ak - this.an * (double)var19, this.al - this.ao * (double)var19, this.am - this.ap * (double)var19, this.an, this.ao, this.ap);
         }

         var17 = 0.8F;
      }

      this.an *= (double)var17;
      this.ao *= (double)var17;
      this.ap *= (double)var17;
      this.ao -= (double)var10;
      this.a(this.ak, this.al, this.am);
   }

   public void a(hm var1) {
      var1.a("xTile", (short)this.b);
      var1.a("yTile", (short)this.c);
      var1.a("zTile", (short)this.d);
      var1.a("inTile", (byte)this.e);
      var1.a("shake", (byte)this.a);
      var1.a("inGround", (byte)(this.f?1:0));
   }

   public void b(hm var1) {
      this.b = var1.d("xTile");
      this.c = var1.d("yTile");
      this.d = var1.d("zTile");
      this.e = var1.c("inTile") & 255;
      this.a = var1.c("shake") & 255;
      this.f = var1.c("inGround") == 1;
   }

   public void b(dm var1) {
      if(this.f && this.g == var1 && this.a <= 0 && var1.b.a(new ev(di.j.aS, 1))) {
         this.ag.a(this, "random.pop", 0.2F, ((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         var1.a_(this, 1);
         this.F();
      }

   }

   public float h_() {
      return 0.0F;
   }
}
