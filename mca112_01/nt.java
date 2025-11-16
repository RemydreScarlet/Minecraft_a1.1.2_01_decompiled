
public class nt extends dm {

   private int bg;
   private double bh;
   private double bi;
   private double bj;
   private double bk;
   private double bl;
   float a = 0.0F;


   public nt(cn var1, String var2) {
      super(var1);
      this.i = var2;
      this.aB = 0.0F;
      this.aM = 0.0F;
      if(var2 != null && var2.length() > 0) {
         this.aY = "http://www.minecraft.net/skin/" + var2 + ".png";
         System.out.println("Loading texture " + this.aY);
      }

      this.aN = true;
      this.ac = 10.0D;
   }

   public boolean a(kh var1, int var2) {
      return true;
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.aB = 0.0F;
      this.bh = var1;
      this.bi = var3;
      this.bj = var5;
      this.bk = (double)var7;
      this.bl = (double)var8;
      this.bg = var9;
   }

   public void e_() {
      super.e_();
      this.Q = this.R;
      double var1 = this.ak - this.ah;
      double var3 = this.am - this.aj;
      float var5 = eo.a(var1 * var1 + var3 * var3) * 4.0F;
      if(var5 > 1.0F) {
         var5 = 1.0F;
      }

      this.R += (var5 - this.R) * 0.4F;
      this.S += this.R;
   }

   public float h_() {
      return 0.0F;
   }

   public void j() {
      super.b_();
      if(this.bg > 0) {
         double var1 = this.ak + (this.bh - this.ak) / (double)this.bg;
         double var3 = this.al + (this.bi - this.al) / (double)this.bg;
         double var5 = this.am + (this.bj - this.am) / (double)this.bg;

         double var7;
         for(var7 = this.bk - (double)this.aq; var7 < -180.0D; var7 += 360.0D) {
            ;
         }

         while(var7 >= 180.0D) {
            var7 -= 360.0D;
         }

         this.aq = (float)((double)this.aq + var7 / (double)this.bg);
         this.ar = (float)((double)this.ar + (this.bl - (double)this.ar) / (double)this.bg);
         --this.bg;
         this.a(var1, var3, var5);
         this.c(this.aq, this.ar);
      }

      this.e = this.f;
      float var9 = eo.a(this.an * this.an + this.ap * this.ap);
      float var2 = (float)Math.atan(-this.ao * 0.20000000298023224D) * 15.0F;
      if(var9 > 0.1F) {
         var9 = 0.1F;
      }

      if(!this.av || this.E <= 0) {
         var9 = 0.0F;
      }

      if(this.av || this.E <= 0) {
         var2 = 0.0F;
      }

      this.f += (var9 - this.f) * 0.4F;
      this.M += (var2 - this.M) * 0.8F;
   }
}
