
public class ke extends ic implements gh {

   private ev[] a = new ev[3];
   private int b = 0;
   private int c = 0;
   private int d = 0;


   public int c() {
      return this.a.length;
   }

   public ev c(int var1) {
      return this.a[var1];
   }

   public ev a(int var1, int var2) {
      if(this.a[var1] != null) {
         ev var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, ev var2) {
      this.a[var1] = var2;
      if(var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

   }

   public String d() {
      return "Chest";
   }

   public void a(hm var1) {
      super.a(var1);
      ki var2 = var1.l("Items");
      this.a = new ev[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         hm var4 = (hm)var2.a(var3);
         byte var5 = var4.c("Slot");
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = new ev(var4);
         }
      }

      this.b = var1.d("BurnTime");
      this.d = var1.d("CookTime");
      this.c = this.a(this.a[1]);
   }

   public void b(hm var1) {
      super.b(var1);
      var1.a("BurnTime", (short)this.b);
      var1.a("CookTime", (short)this.d);
      ki var2 = new ki();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null) {
            hm var4 = new hm();
            var4.a("Slot", (byte)var3);
            this.a[var3].a(var4);
            var2.a((el)var4);
         }
      }

      var1.a("Items", (el)var2);
   }

   public int e() {
      return 64;
   }

   public int a(int var1) {
      return this.d * var1 / 200;
   }

   public int b(int var1) {
      if(this.c == 0) {
         this.c = 200;
      }

      return this.b * var1 / this.c;
   }

   public boolean a() {
      return this.b > 0;
   }

   public void b() {
      boolean var1 = this.b > 0;
      boolean var2 = false;
      if(this.b > 0) {
         --this.b;
      }

      if(!this.e.y) {
         if(this.b == 0 && this.j()) {
            this.c = this.b = this.a(this.a[1]);
            if(this.b > 0) {
               var2 = true;
               if(this.a[1] != null) {
                  --this.a[1].a;
                  if(this.a[1].a == 0) {
                     this.a[1] = null;
                  }
               }
            }
         }

         if(this.a() && this.j()) {
            ++this.d;
            if(this.d == 200) {
               this.d = 0;
               this.i();
               var2 = true;
            }
         } else {
            this.d = 0;
         }

         if(var1 != this.b > 0) {
            var2 = true;
            ku.a(this.b > 0, this.e, this.f, this.g, this.h);
         }
      }

      if(var2) {
         this.j_();
      }

   }

   private boolean j() {
      if(this.a[0] == null) {
         return false;
      } else {
         int var1 = this.d(this.a[0].a().aS);
         return var1 < 0?false:(this.a[2] == null?true:(this.a[2].c != var1?false:(this.a[2].a < this.e() && this.a[2].a < this.a[2].c()?true:this.a[2].a < di.c[var1].b())));
      }
   }

   public void i() {
      if(this.j()) {
         int var1 = this.d(this.a[0].a().aS);
         if(this.a[2] == null) {
            this.a[2] = new ev(var1, 1);
         } else if(this.a[2].c == var1) {
            ++this.a[2].a;
         }

         --this.a[0].a;
         if(this.a[0].a <= 0) {
            this.a[0] = null;
         }

      }
   }

   private int d(int var1) {
      return var1 == ly.I.bc?di.m.aS:(var1 == ly.H.bc?di.n.aS:(var1 == ly.ax.bc?di.l.aS:(var1 == ly.F.bc?ly.N.bc:(var1 == di.ao.aS?di.ap.aS:(var1 == ly.x.bc?ly.u.bc:(var1 == di.aG.aS?di.aF.aS:-1))))));
   }

   private int a(ev var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = var1.a().aS;
         return var2 < 256 && ly.n[var2].bn == gb.c?300:(var2 == di.B.aS?100:(var2 == di.k.aS?1600:(var2 == di.aw.aS?20000:0)));
      }
   }
}
