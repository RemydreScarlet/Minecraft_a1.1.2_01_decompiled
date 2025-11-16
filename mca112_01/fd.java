import java.util.Random;

public class fd extends ly {

   protected fd(int var1, int var2) {
      super(var1, var2, gb.s);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.b(true);
   }

   public cf d(cn var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public boolean a(cn var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3 - 1, var4);
      return var5 != 0 && ly.n[var5].b()?var1.f(var2, var3 - 1, var4).c():false;
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      this.h(var1, var2, var3, var4);
   }

   private boolean h(cn var1, int var2, int var3, int var4) {
      if(!this.a(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
         return false;
      } else {
         return true;
      }
   }

   public void a_(cn var1, int var2, int var3, int var4, int var5) {
      int var6 = di.aB.aS;
      float var7 = 0.7F;
      double var8 = (double)(var1.n.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      double var10 = (double)(var1.n.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      double var12 = (double)(var1.n.nextFloat() * var7) + (double)(1.0F - var7) * 0.5D;
      dx var14 = new dx(var1, (double)var2 + var8, (double)var3 + var10, (double)var4 + var12, new ev(var6));
      var14.c = 10;
      var1.a((kh)var14);
      var1.d(var2, var3, var4, 0);
   }

   public int a(int var1, Random var2) {
      return di.aB.aS;
   }

   public int a(Random var1) {
      return 0;
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(by.b, var2, var3, var4) > 11) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean c(nm var1, int var2, int var3, int var4, int var5) {
      gb var6 = var1.f(var2, var3, var4);
      return var5 == 1?true:(var6 == this.bn?false:super.c(var1, var2, var3, var4, var5));
   }
}
