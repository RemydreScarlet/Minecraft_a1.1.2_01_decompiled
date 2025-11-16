import org.lwjgl.opengl.GL11;

public class cd extends nq {

   private kh a;
   private kh o;
   private int p = 0;
   private int q = 0;
   private float r;


   public cd(cn var1, kh var2, kh var3, float var4) {
      super(var1, var2.ak, var2.al, var2.am, var2.an, var2.ao, var2.ap);
      this.a = var2;
      this.o = var3;
      this.q = 3;
      this.r = var4;
   }

   public void a(ho var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      float var8 = ((float)this.p + var2) / (float)this.q;
      var8 *= var8;
      double var9 = this.a.ak;
      double var11 = this.a.al;
      double var13 = this.a.am;
      double var15 = this.o.aI + (this.o.ak - this.o.aI) * (double)var2;
      double var17 = this.o.aJ + (this.o.al - this.o.aJ) * (double)var2 + (double)this.r;
      double var19 = this.o.aK + (this.o.am - this.o.aK) * (double)var2;
      double var21 = var9 + (var15 - var9) * (double)var8;
      double var23 = var11 + (var17 - var11) * (double)var8;
      double var25 = var13 + (var19 - var13) * (double)var8;
      int var27 = eo.b(var21);
      int var28 = eo.b(var23 + (double)(this.aB / 2.0F));
      int var29 = eo.b(var25);
      float var30 = this.ag.c(var27, var28, var29);
      var21 -= l;
      var23 -= m;
      var25 -= n;
      GL11.glColor4f(var30, var30, var30, 1.0F);
      kx.a.a(this.a, (double)((float)var21), (double)((float)var23), (double)((float)var25), this.a.aq, var2);
   }

   public void e_() {
      ++this.p;
      if(this.p == this.q) {
         this.F();
      }

   }

   public int c() {
      return 3;
   }
}
