import java.util.Random;

public class my extends ly {

   protected my(int var1) {
      super(var1, gb.b);
      this.bb = 3;
      this.b(true);
   }

   public int a(nm var1, int var2, int var3, int var4, int var5) {
      if(var5 == 1) {
         return 0;
      } else if(var5 == 0) {
         return 2;
      } else {
         gb var6 = var1.f(var2, var3 + 1, var4);
         return var6 != gb.s && var6 != gb.t?3:68;
      }
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      if(var1.j(var2, var3 + 1, var4) < 4 && var1.f(var2, var3 + 1, var4).b()) {
         if(var5.nextInt(4) != 0) {
            return;
         }

         var1.d(var2, var3, var4, ly.w.bc);
      } else if(var1.j(var2, var3 + 1, var4) >= 9) {
         int var6 = var2 + var5.nextInt(3) - 1;
         int var7 = var3 + var5.nextInt(5) - 3;
         int var8 = var4 + var5.nextInt(3) - 1;
         if(var1.a(var6, var7, var8) == ly.w.bc && var1.j(var6, var7 + 1, var8) >= 4 && !var1.f(var6, var7 + 1, var8).b()) {
            var1.d(var6, var7, var8, ly.v.bc);
         }
      }

   }

   public int a(int var1, Random var2) {
      return ly.w.a(0, var2);
   }
}
