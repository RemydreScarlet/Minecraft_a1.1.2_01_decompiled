
public class dx extends kh {

   public ev a;
   private int e;
   public int b = 0;
   public int c;
   private int f = 5;
   public float d = (float)(Math.random() * 3.141592653589793D * 2.0D);


   public dx(cn var1, double var2, double var4, double var6, ev var8) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.aB = this.aD / 2.0F;
      this.a(var2, var4, var6);
      this.a = var8;
      this.aq = (float)(Math.random() * 360.0D);
      this.an = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.ao = 0.20000000298023224D;
      this.ap = (double)((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
      this.aG = false;
   }

   public dx(cn var1) {
      super(var1);
      this.a(0.25F, 0.25F);
      this.aB = this.aD / 2.0F;
   }

   public void e_() {
      super.e_();
      if(this.c > 0) {
         --this.c;
      }

      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      this.ao -= 0.03999999910593033D;
      if(this.ag.f(eo.b(this.ak), eo.b(this.al), eo.b(this.am)) == gb.g) {
         this.ao = 0.20000000298023224D;
         this.an = (double)((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F);
         this.ap = (double)((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.2F);
         this.ag.a(this, "random.fizz", 0.4F, 2.0F + this.aQ.nextFloat() * 0.4F);
      }

      this.g(this.ak, this.al, this.am);
      this.g_();
      this.c(this.an, this.ao, this.ap);
      float var1 = 0.98F;
      if(this.av) {
         var1 = 0.58800006F;
         int var2 = this.ag.a(eo.b(this.ak), eo.b(this.au.b) - 1, eo.b(this.am));
         if(var2 > 0) {
            var1 = ly.n[var2].bo * 0.98F;
         }
      }

      this.an *= (double)var1;
      this.ao *= 0.9800000190734863D;
      this.ap *= (double)var1;
      if(this.av) {
         this.ao *= -0.5D;
      }

      ++this.e;
      ++this.b;
      if(this.b >= 6000) {
         this.F();
      }

   }

   public boolean g_() {
      return this.ag.a(this.au, gb.f, this);
   }

   private boolean g(double var1, double var3, double var5) {
      int var7 = eo.b(var1);
      int var8 = eo.b(var3);
      int var9 = eo.b(var5);
      double var10 = var1 - (double)var7;
      double var12 = var3 - (double)var8;
      double var14 = var5 - (double)var9;
      if(ly.p[this.ag.a(var7, var8, var9)]) {
         boolean var16 = !ly.p[this.ag.a(var7 - 1, var8, var9)];
         boolean var17 = !ly.p[this.ag.a(var7 + 1, var8, var9)];
         boolean var18 = !ly.p[this.ag.a(var7, var8 - 1, var9)];
         boolean var19 = !ly.p[this.ag.a(var7, var8 + 1, var9)];
         boolean var20 = !ly.p[this.ag.a(var7, var8, var9 - 1)];
         boolean var21 = !ly.p[this.ag.a(var7, var8, var9 + 1)];
         byte var22 = -1;
         double var23 = 9999.0D;
         if(var16 && var10 < var23) {
            var23 = var10;
            var22 = 0;
         }

         if(var17 && 1.0D - var10 < var23) {
            var23 = 1.0D - var10;
            var22 = 1;
         }

         if(var18 && var12 < var23) {
            var23 = var12;
            var22 = 2;
         }

         if(var19 && 1.0D - var12 < var23) {
            var23 = 1.0D - var12;
            var22 = 3;
         }

         if(var20 && var14 < var23) {
            var23 = var14;
            var22 = 4;
         }

         if(var21 && 1.0D - var14 < var23) {
            var23 = 1.0D - var14;
            var22 = 5;
         }

         float var25 = this.aQ.nextFloat() * 0.2F + 0.1F;
         if(var22 == 0) {
            this.an = (double)(-var25);
         }

         if(var22 == 1) {
            this.an = (double)var25;
         }

         if(var22 == 2) {
            this.ao = (double)(-var25);
         }

         if(var22 == 3) {
            this.ao = (double)var25;
         }

         if(var22 == 4) {
            this.ap = (double)(-var25);
         }

         if(var22 == 5) {
            this.ap = (double)var25;
         }
      }

      return false;
   }

   protected void a(int var1) {
      this.a((kh)null, var1);
   }

   public boolean a(kh var1, int var2) {
      this.f -= var2;
      if(this.f <= 0) {
         this.F();
      }

      return false;
   }

   public void a(hm var1) {
      var1.a("Health", (short)((byte)this.f));
      var1.a("Age", (short)this.b);
      var1.a("Item", this.a.a(new hm()));
   }

   public void b(hm var1) {
      this.f = var1.d("Health") & 255;
      this.b = var1.d("Age");
      hm var2 = var1.k("Item");
      this.a = new ev(var2);
   }

   public void b(dm var1) {
      if(!this.ag.y) {
         int var2 = this.a.a;
         if(this.c == 0 && var1.b.a(this.a)) {
            this.ag.a(this, "random.pop", 0.2F, ((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            var1.a_(this, var2);
            this.F();
         }

      }
   }
}
