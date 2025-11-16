import java.util.List;

public class dm extends ge {

   public eu b = new eu(this);
   public byte c = 0;
   public int d = 0;
   public float e;
   public float f;
   public boolean g = false;
   public int h = 0;
   public String i;
   private int a = 0;


   public dm(cn var1) {
      super(var1);
      this.aB = 1.62F;
      this.c((double)var1.o + 0.5D, (double)(var1.p + 1), (double)var1.q + 0.5D, 0.0F, 0.0F);
      this.E = 20;
      this.x = "humanoid";
      this.w = 180.0F;
      this.aS = 20;
      this.u = "/char.png";
   }

   public void p() {
      super.p();
      this.e = this.f;
      this.f = 0.0F;
   }

   public void q() {
      this.aB = 1.62F;
      this.a(0.6F, 1.8F);
      super.q();
      this.E = 20;
      this.J = 0;
   }

   protected void b_() {
      if(this.g) {
         ++this.h;
         if(this.h == 8) {
            this.h = 0;
            this.g = false;
         }
      } else {
         this.h = 0;
      }

      this.D = (float)this.h / 8.0F;
   }

   public void j() {
      if(this.ag.l == 0 && this.E < 20 && this.aR % 20 * 4 == 0) {
         this.b(1);
      }

      this.b.b();
      this.e = this.f;
      super.j();
      float var1 = eo.a(this.an * this.an + this.ap * this.ap);
      float var2 = (float)Math.atan(-this.ao * 0.20000000298023224D) * 15.0F;
      if(var1 > 0.1F) {
         var1 = 0.1F;
      }

      if(!this.av || this.E <= 0) {
         var1 = 0.0F;
      }

      if(this.av || this.E <= 0) {
         var2 = 0.0F;
      }

      this.f += (var1 - this.f) * 0.4F;
      this.M += (var2 - this.M) * 0.8F;
      if(this.E > 0) {
         List var3 = this.ag.b((kh)this, this.au.b(1.0D, 0.0D, 1.0D));
         if(var3 != null) {
            for(int var4 = 0; var4 < var3.size(); ++var4) {
               this.h((kh)var3.get(var4));
            }
         }
      }

   }

   private void h(kh var1) {
      var1.b(this);
   }

   public int r() {
      return this.d;
   }

   public void b(kh var1) {
      this.a(0.2F, 0.2F);
      this.a(this.ak, this.al, this.am);
      this.ao = 0.10000000149011612D;
      if(this.i.equals("Notch")) {
         this.a(new ev(di.h, 1), true);
      }

      this.b.g();
      if(var1 != null) {
         this.an = (double)(-eo.b((this.I + this.aq) * 3.1415927F / 180.0F) * 0.1F);
         this.ap = (double)(-eo.a((this.I + this.aq) * 3.1415927F / 180.0F) * 0.1F);
      } else {
         this.an = this.ap = 0.0D;
      }

      this.aB = 0.1F;
   }

   public void b(kh var1, int var2) {
      this.d += var2;
   }

   public void a(ev var1) {
      this.a(var1, false);
   }

   public void a(ev var1, boolean var2) {
      if(var1 != null) {
         dx var3 = new dx(this.ag, this.ak, this.al - 0.30000001192092896D + (double)this.s(), this.am, var1);
         var3.c = 40;
         float var4 = 0.1F;
         float var5;
         if(var2) {
            var5 = this.aQ.nextFloat() * 0.5F;
            float var6 = this.aQ.nextFloat() * 3.1415927F * 2.0F;
            var3.an = (double)(-eo.a(var6) * var5);
            var3.ap = (double)(eo.b(var6) * var5);
            var3.ao = 0.20000000298023224D;
         } else {
            var4 = 0.3F;
            var3.an = (double)(-eo.a(this.aq / 180.0F * 3.1415927F) * eo.b(this.ar / 180.0F * 3.1415927F) * var4);
            var3.ap = (double)(eo.b(this.aq / 180.0F * 3.1415927F) * eo.b(this.ar / 180.0F * 3.1415927F) * var4);
            var3.ao = (double)(-eo.a(this.ar / 180.0F * 3.1415927F) * var4 + 0.1F);
            var4 = 0.02F;
            var5 = this.aQ.nextFloat() * 3.1415927F * 2.0F;
            var4 *= this.aQ.nextFloat();
            var3.an += Math.cos((double)var5) * (double)var4;
            var3.ao += (double)((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.1F);
            var3.ap += Math.sin((double)var5) * (double)var4;
         }

         this.a(var3);
      }
   }

   protected void a(dx var1) {
      this.ag.a((kh)var1);
   }

   public float a(ly var1) {
      float var2 = this.b.a(var1);
      if(this.a(gb.f)) {
         var2 /= 5.0F;
      }

      if(!this.av) {
         var2 /= 5.0F;
      }

      return var2;
   }

   public boolean b(ly var1) {
      return this.b.b(var1);
   }

   public void b(hm var1) {
      super.b(var1);
      ki var2 = var1.l("Inventory");
      this.b.b(var2);
   }

   public void a(hm var1) {
      super.a(var1);
      var1.a("Inventory", (el)this.b.a(new ki()));
   }

   public void a(gh var1) {}

   public void l() {}

   public void a_(kh var1, int var2) {}

   protected float s() {
      return 0.12F;
   }

   public boolean a(kh var1, int var2) {
      this.U = 0;
      if(this.E <= 0) {
         return false;
      } else if((float)this.aW > (float)this.j / 2.0F) {
         return false;
      } else {
         if(var1 instanceof dq || var1 instanceof kg) {
            if(this.ag.l == 0) {
               var2 = 0;
            }

            if(this.ag.l == 1) {
               var2 = var2 / 3 + 1;
            }

            if(this.ag.l == 3) {
               var2 = var2 * 3 / 2;
            }
         }

         int var3 = 25 - this.b.f();
         int var4 = var2 * var3 + this.a;
         this.b.e(var2);
         var2 = var4 / 25;
         this.a = var4 % 25;
         return var2 == 0?false:super.a(var1, var2);
      }
   }

   public void a(ke var1) {}

   public void a(ob var1) {}

   public void a_(kh var1) {}

   public ev t() {
      return this.b.a();
   }

   public void u() {
      this.b.a(this.b.d, (ev)null);
   }

   public double v() {
      return (double)(this.aB - 0.5F);
   }

   public void w() {
      this.h = -1;
      this.g = true;
   }
}
