
public class jd extends kh {

   public int a;


   public jd(cn var1) {
      super(var1);
      this.a = 0;
      this.ad = true;
      this.a(0.98F, 0.98F);
      this.aB = this.aD / 2.0F;
   }

   public jd(cn var1, float var2, float var3, float var4) {
      this(var1);
      this.a((double)var2, (double)var3, (double)var4);
      float var5 = (float)(Math.random() * 3.1415927410125732D * 2.0D);
      this.an = (double)(-eo.a(var5 * 3.1415927F / 180.0F) * 0.02F);
      this.ao = 0.20000000298023224D;
      this.ap = (double)(-eo.b(var5 * 3.1415927F / 180.0F) * 0.02F);
      this.aG = false;
      this.a = 80;
      this.ah = (double)var2;
      this.ai = (double)var3;
      this.aj = (double)var4;
   }

   public boolean c_() {
      return !this.aA;
   }

   public void e_() {
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      this.ao -= 0.03999999910593033D;
      this.c(this.an, this.ao, this.ap);
      this.an *= 0.9800000190734863D;
      this.ao *= 0.9800000190734863D;
      this.ap *= 0.9800000190734863D;
      if(this.av) {
         this.an *= 0.699999988079071D;
         this.ap *= 0.699999988079071D;
         this.ao *= -0.5D;
      }

      if(this.a-- <= 0) {
         this.F();
         this.i();
      } else {
         this.ag.a("smoke", this.ak, this.al + 0.5D, this.am, 0.0D, 0.0D, 0.0D);
      }

   }

   private void i() {
      float var1 = 4.0F;
      this.ag.a((kh)null, this.ak, this.al, this.am, var1);
   }

   protected void a(hm var1) {
      var1.a("Fuse", (byte)this.a);
   }

   protected void b(hm var1) {
      this.a = var1.c("Fuse");
   }

   public float h_() {
      return 0.0F;
   }
}
