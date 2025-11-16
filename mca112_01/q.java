import java.util.Random;

public class q extends ly {

   public q(int var1, int var2) {
      super(var1, var2, gb.p);
   }

   public int a(int var1) {
      return var1 == 0?this.bb + 2:(var1 == 1?this.bb + 1:this.bb);
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      if(var5 > 0 && ly.n[var5].d() && var1.o(var2, var3, var4)) {
         this.b(var1, var2, var3, var4, 0);
         var1.d(var2, var3, var4, 0);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void c(cn var1, int var2, int var3, int var4) {
      jd var5 = new jd(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
      var5.a = var1.n.nextInt(var5.a / 4) + var5.a / 8;
      var1.a((kh)var5);
   }

   public void b(cn var1, int var2, int var3, int var4, int var5) {
      jd var6 = new jd(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F);
      var1.a((kh)var6);
      var1.a(var6, "random.fuse", 1.0F, 1.0F);
   }
}
