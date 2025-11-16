import java.util.Random;

public class he extends fc {

   public he(int var1, int var2) {
      super(var1, var2, gb.r, false);
      this.bo = 0.98F;
      this.b(true);
   }

   public int g() {
      return 1;
   }

   public boolean c(nm var1, int var2, int var3, int var4, int var5) {
      return super.c(var1, var2, var3, var4, 1 - var5);
   }

   public void b(cn var1, int var2, int var3, int var4) {
      gb var5 = var1.f(var2, var3 - 1, var4);
      if(var5.c() || var5.d()) {
         var1.d(var2, var3, var4, ly.B.bc);
      }

   }

   public int a(Random var1) {
      return 0;
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      if(var1.a(by.b, var2, var3, var4) > 11 - ly.r[this.bc]) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, ly.C.bc);
      }

   }
}
