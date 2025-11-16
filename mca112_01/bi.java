import net.minecraft.client.Minecraft;

public class bi extends dm {

   public lv a;
   private Minecraft bg;


   public bi(Minecraft var1, cn var2, dl var3) {
      super(var2);
      this.bg = var1;
      if(var3 != null && var3.b != null && var3.b.length() > 0) {
         this.aY = "http://www.minecraft.net/skin/" + var3.b + ".png";
         System.out.println("Loading texture " + this.aY);
      }

      this.i = var3.b;
   }

   public void b_() {
      super.b_();
      this.V = this.a.a;
      this.W = this.a.b;
      this.Y = this.a.d;
   }

   public void j() {
      this.a.a(this);
      if(this.a.e && this.aL < 0.2F) {
         this.aL = 0.2F;
      }

      super.j();
   }

   public void k() {
      this.a.a();
   }

   public void a(int var1, boolean var2) {
      this.a.a(var1, var2);
   }

   public void a(hm var1) {
      super.a(var1);
      var1.a("Score", this.d);
   }

   public void b(hm var1) {
      super.b(var1);
      this.d = var1.e("Score");
   }

   public void a(gh var1) {
      this.bg.a((bh)(new ea(this.b, var1)));
   }

   public void a(ob var1) {
      this.bg.a((bh)(new nv(var1)));
   }

   public void l() {
      this.bg.a((bh)(new hx(this.b)));
   }

   public void a(ke var1) {
      this.bg.a((bh)(new id(this.b, var1)));
   }

   public void a(kh var1) {
      int var2 = this.b.a(var1);
      if(var2 > 0) {
         var1.a(this, var2);
         ev var3 = this.t();
         if(var3 != null && var1 instanceof ge) {
            var3.a((ge)var1);
            if(var3.a <= 0) {
               var3.a((dm)this);
               this.u();
            }
         }
      }

   }

   public void a_(kh var1, int var2) {
      this.bg.h.a((nq)(new cd(this.bg.e, var1, this, -0.5F)));
   }

   public int m() {
      return this.b.f();
   }

   public void a_(kh var1) {
      if(!var1.a((dm)this)) {
         ev var2 = this.t();
         if(var2 != null && var1 instanceof ge) {
            var2.b((ge)var1);
            if(var2.a <= 0) {
               var2.a((dm)this);
               this.u();
            }
         }

      }
   }

   public void a(String var1) {}

   public void n() {}

   public boolean o() {
      return this.a.e;
   }
}
