import net.minecraft.client.Minecraft;

public class la extends bi {

   private gy bg;
   private int bh = 0;
   private double bi;
   private double bj;
   private double bk;
   private double bl;
   private float bm;
   private float bn;
   private eu bo = new eu((dm)null);


   public la(Minecraft var1, cn var2, dl var3, gy var4) {
      super(var1, var2, var3);
      this.bg = var4;
   }

   public void e_() {
      super.e_();
      this.J();
   }

   public void n() {
      this.J();
   }

   public void J() {
      if(this.bh++ == 20) {
         if(!this.b.a(this.bo)) {
            this.bg.a((fn)(new m(-1, this.b.a)));
            this.bg.a((fn)(new m(-2, this.b.c)));
            this.bg.a((fn)(new m(-3, this.b.b)));
            this.bo = this.b.i();
         }

         this.bh = 0;
      }

      double var1 = this.ak - this.bi;
      double var3 = this.au.b - this.bj;
      double var5 = this.al - this.bk;
      double var7 = this.am - this.bl;
      double var9 = (double)(this.aq - this.bm);
      double var11 = (double)(this.ar - this.bn);
      boolean var13 = var3 != 0.0D || var5 != 0.0D || var1 != 0.0D || var7 != 0.0D;
      boolean var14 = var9 != 0.0D || var11 != 0.0D;
      if(var13 && var14) {
         this.bg.a((fn)(new ch(this.ak, this.au.b, this.al, this.am, this.aq, this.ar, this.av)));
      } else if(var13) {
         this.bg.a((fn)(new s(this.ak, this.au.b, this.al, this.am, this.av)));
      } else if(var14) {
         this.bg.a((fn)(new mh(this.aq, this.ar, this.av)));
      } else {
         this.bg.a((fn)(new eh(this.av)));
      }

      if(var13) {
         this.bi = this.ak;
         this.bj = this.au.b;
         this.bk = this.al;
         this.bl = this.am;
      }

      if(var14) {
         this.bm = this.aq;
         this.bn = this.ar;
      }

   }

   protected void a(dx var1) {
      System.out.println("Dropping?");
      ha var2 = new ha(var1);
      this.bg.a((fn)var2);
      var1.ak = (double)var2.b / 32.0D;
      var1.al = (double)var2.c / 32.0D;
      var1.am = (double)var2.d / 32.0D;
      var1.an = (double)var2.e / 128.0D;
      var1.ao = (double)var2.f / 128.0D;
      var1.ap = (double)var2.g / 128.0D;
   }

   public void a(String var1) {
      this.bg.a((fn)(new ij(var1)));
   }

   public void w() {
      super.w();
      this.bg.a((fn)(new hf(this, 1)));
   }
}
