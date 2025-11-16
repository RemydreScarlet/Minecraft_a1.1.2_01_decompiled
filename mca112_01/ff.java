
public class ff extends kh {

   public int a;
   public int b = 0;


   public ff(cn var1) {
      super(var1);
   }

   public ff(cn var1, float var2, float var3, float var4, int var5) {
      super(var1);
      this.a = var5;
      this.ad = true;
      this.a(0.98F, 0.98F);
      this.aB = this.aD / 2.0F;
      this.a((double)var2, (double)var3, (double)var4);
      this.an = 0.0D;
      this.ao = 0.0D;
      this.ap = 0.0D;
      this.aG = false;
      this.ah = (double)var2;
      this.ai = (double)var3;
      this.aj = (double)var4;
   }

   public boolean c_() {
      return !this.aA;
   }

   public void e_() {
      if(this.a == 0) {
         this.F();
      } else {
         this.ah = this.ak;
         this.ai = this.al;
         this.aj = this.am;
         ++this.b;
         this.ao -= 0.03999999910593033D;
         this.c(this.an, this.ao, this.ap);
         this.an *= 0.9800000190734863D;
         this.ao *= 0.9800000190734863D;
         this.ap *= 0.9800000190734863D;
         int var1 = eo.b(this.ak);
         int var2 = eo.b(this.al);
         int var3 = eo.b(this.am);
         if(this.ag.a(var1, var2, var3) == this.a) {
            this.ag.d(var1, var2, var3, 0);
         }

         if(this.av) {
            this.an *= 0.699999988079071D;
            this.ap *= 0.699999988079071D;
            this.ao *= -0.5D;
            this.F();
            if(!this.ag.a(this.a, var1, var2, var3, true) || !this.ag.d(var1, var2, var3, this.a)) {
               this.b(this.a, 1);
            }
         } else if(this.b > 100) {
            this.b(this.a, 1);
            this.F();
         }

      }
   }

   protected void a(hm var1) {
      var1.a("Tile", (byte)this.a);
   }

   protected void b(hm var1) {
      this.a = var1.c("Tile") & 255;
   }

   public float h_() {
      return 0.0F;
   }

   public cn i() {
      return this.ag;
   }
}
