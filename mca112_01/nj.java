import net.minecraft.client.Minecraft;

public class nj extends hq {

   private int c = -1;
   private int d = -1;
   private int e = -1;
   private float f = 0.0F;
   private float g = 0.0F;
   private float h = 0.0F;
   private int i = 0;
   private boolean j = false;
   private gy k;
   private int l = 0;


   public nj(Minecraft var1, gy var2) {
      super(var1);
      this.k = var2;
   }

   public void a(dm var1) {
      var1.aq = -180.0F;
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      this.k.a((fn)(new fg(3, var1, var2, var3, var4)));
      int var5 = this.a.e.a(var1, var2, var3);
      int var6 = this.a.e.e(var1, var2, var3);
      boolean var7 = super.b(var1, var2, var3, var4);
      ev var8 = this.a.g.t();
      if(var8 != null) {
         var8.a(var5, var1, var2, var3);
         if(var8.a == 0) {
            var8.a((dm)this.a.g);
            this.a.g.u();
         }
      }

      if(var7 && this.a.g.b(ly.n[var5])) {
         ly.n[var5].b_(this.a.e, var1, var2, var3, var6);
      }

      return var7;
   }

   public void a(int var1, int var2, int var3, int var4) {
      this.j = true;
      this.k.a((fn)(new fg(0, var1, var2, var3, var4)));
      int var5 = this.a.e.a(var1, var2, var3);
      if(var5 > 0 && this.f == 0.0F) {
         ly.n[var5].b(this.a.e, var1, var2, var3, (dm)this.a.g);
      }

      if(var5 > 0 && ly.n[var5].a((dm)this.a.g) >= 1.0F) {
         this.b(var1, var2, var3, var4);
      }

   }

   public void a() {
      if(this.j) {
         this.j = false;
         this.k.a((fn)(new fg(2, 0, 0, 0, 0)));
         this.f = 0.0F;
         this.i = 0;
      }
   }

   public void c(int var1, int var2, int var3, int var4) {
      this.j = true;
      this.e();
      this.k.a((fn)(new fg(1, var1, var2, var3, var4)));
      if(this.i > 0) {
         --this.i;
      } else {
         if(var1 == this.c && var2 == this.d && var3 == this.e) {
            int var5 = this.a.e.a(var1, var2, var3);
            if(var5 == 0) {
               return;
            }

            ly var6 = ly.n[var5];
            this.f += var6.a((dm)this.a.g);
            if(this.h % 4.0F == 0.0F && var6 != null) {
               this.a.A.b(var6.bl.d(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.bl.b() + 1.0F) / 8.0F, var6.bl.c() * 0.5F);
            }

            ++this.h;
            if(this.f >= 1.0F) {
               this.b(var1, var2, var3, var4);
               this.f = 0.0F;
               this.g = 0.0F;
               this.h = 0.0F;
               this.i = 5;
            }
         } else {
            this.f = 0.0F;
            this.g = 0.0F;
            this.h = 0.0F;
            this.c = var1;
            this.d = var2;
            this.e = var3;
         }

      }
   }

   public void a(float var1) {
      if(this.f <= 0.0F) {
         this.a.u.b = 0.0F;
         this.a.f.i = 0.0F;
      } else {
         float var2 = this.g + (this.f - this.g) * var1;
         this.a.u.b = var2;
         this.a.f.i = var2;
      }

   }

   public float b() {
      return 4.0F;
   }

   public void a(cn var1) {
      super.a(var1);
   }

   public void c() {
      this.e();
      this.g = this.f;
   }

   private void e() {
      ev var1 = this.a.g.b.a();
      int var2 = 0;
      if(var1 != null) {
         var2 = var1.c;
      }

      if(var2 != this.l) {
         this.l = var2;
         this.k.a((fn)(new dz(0, this.l)));
      }

   }

   public boolean a(dm var1, cn var2, ev var3, int var4, int var5, int var6, int var7) {
      this.e();
      this.k.a((fn)(new do(var3 != null?var3.c:-1, var4, var5, var6, var7)));
      return super.a(var1, var2, var3, var4, var5, var6, var7);
   }

   public dm b(cn var1) {
      return new la(this.a, var1, this.a.i, this.k);
   }
}
