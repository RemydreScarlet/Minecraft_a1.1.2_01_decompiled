import java.util.Random;

public class ku extends jt {

   private final boolean a;


   protected ku(int var1, boolean var2) {
      super(var1, gb.d);
      this.a = var2;
      this.bb = 45;
   }

   public int a(int var1, Random var2) {
      return ly.aC.bc;
   }

   public void e(cn var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      this.h(var1, var2, var3, var4);
   }

   private void h(cn var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4 - 1);
      int var6 = var1.a(var2, var3, var4 + 1);
      int var7 = var1.a(var2 - 1, var3, var4);
      int var8 = var1.a(var2 + 1, var3, var4);
      byte var9 = 3;
      if(ly.p[var5] && !ly.p[var6]) {
         var9 = 3;
      }

      if(ly.p[var6] && !ly.p[var5]) {
         var9 = 2;
      }

      if(ly.p[var7] && !ly.p[var8]) {
         var9 = 5;
      }

      if(ly.p[var8] && !ly.p[var7]) {
         var9 = 4;
      }

      var1.b(var2, var3, var4, var9);
   }

   public int a(nm var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return ly.u.bb;
      } else if(var5 == 0) {
         return ly.u.bb;
      } else {
         int var6 = var1.e(var2, var3, var4);
         return var5 != var6?this.bb:(this.a?this.bb + 16:this.bb - 1);
      }
   }

   public void b(cn var1, int var2, int var3, int var4, Random var5) {
      if(this.a) {
         int var6 = var1.e(var2, var3, var4);
         float var7 = (float)var2 + 0.5F;
         float var8 = (float)var3 + 0.0F + var5.nextFloat() * 6.0F / 16.0F;
         float var9 = (float)var4 + 0.5F;
         float var10 = 0.52F;
         float var11 = var5.nextFloat() * 0.6F - 0.3F;
         if(var6 == 4) {
            var1.a("smoke", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 - var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 5) {
            var1.a("smoke", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var10), (double)var8, (double)(var9 + var11), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 2) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 - var10), 0.0D, 0.0D, 0.0D);
         } else if(var6 == 3) {
            var1.a("smoke", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
            var1.a("flame", (double)(var7 + var11), (double)var8, (double)(var9 + var10), 0.0D, 0.0D, 0.0D);
         }

      }
   }

   public int a(int var1) {
      return var1 == 1?ly.u.bc:(var1 == 0?ly.u.bc:(var1 == 3?this.bb - 1:this.bb));
   }

   public boolean a(cn var1, int var2, int var3, int var4, dm var5) {
      ke var6 = (ke)var1.b(var2, var3, var4);
      var5.a(var6);
      return true;
   }

   public static void a(boolean var0, cn var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      ic var6 = var1.b(var2, var3, var4);
      if(var0) {
         var1.d(var2, var3, var4, ly.aD.bc);
      } else {
         var1.d(var2, var3, var4, ly.aC.bc);
      }

      var1.b(var2, var3, var4, var5);
      var1.a(var2, var3, var4, var6);
   }

   protected ic a_() {
      return new ke();
   }
}
