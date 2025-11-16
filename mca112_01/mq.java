import java.util.Random;

public class mq extends ly {

   protected mq(int var1, int var2) {
      super(var1, gb.i);
      this.bb = var2;
      this.b(true);
      float var3 = 0.2F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, var3 * 3.0F, 0.5F + var3);
   }

   public boolean a(cn var1, int var2, int var3, int var4) {
      return this.b(var1.a(var2, var3 - 1, var4));
   }

   protected boolean b(int var1) {
      return var1 == ly.v.bc || var1 == ly.w.bc || var1 == ly.aB.bc;
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      super.a(var1, var2, var3, var4, var5);
      this.h(var1, var2, var3, var4);
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   protected final void h(cn var1, int var2, int var3, int var4) {
      if(!this.g(var1, var2, var3, var4)) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      }

   }

   public boolean g(cn var1, int var2, int var3, int var4) {
      return (var1.j(var2, var3, var4) >= 8 || var1.i(var2, var3, var4)) && this.b(var1.a(var2, var3 - 1, var4));
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

   public int f() {
      return 1;
   }
}
