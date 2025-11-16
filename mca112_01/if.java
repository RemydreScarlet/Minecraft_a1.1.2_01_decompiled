import java.util.Random;

public class if extends ly {

   protected if(int var1, int var2) {
      super(var1, var2, gb.n);
      this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   public cf d(cn var1, int var2, int var3, int var4) {
      return null;
   }

   public boolean b() {
      return false;
   }

   public mf a(cn var1, int var2, int var3, int var4, aj var5, aj var6) {
      this.a((nm)var1, var2, var3, var4);
      return super.a(var1, var2, var3, var4, var5, var6);
   }

   public void a(nm var1, int var2, int var3, int var4) {
      int var5 = var1.e(var2, var3, var4);
      if(var5 >= 2 && var5 <= 5) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
      } else {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      }

   }

   public int a(int var1, int var2) {
      return var2 >= 6?this.bb - 16:this.bb;
   }

   public boolean c() {
      return false;
   }

   public int f() {
      return 9;
   }

   public int a(Random var1) {
      return 1;
   }

   public boolean a(cn var1, int var2, int var3, int var4) {
      return var1.g(var2, var3 - 1, var4);
   }

   public void e(cn var1, int var2, int var3, int var4) {
      var1.b(var2, var3, var4, 15);
      this.h(var1, var2, var3, var4);
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      int var6 = var1.e(var2, var3, var4);
      boolean var7 = false;
      if(!var1.g(var2, var3 - 1, var4)) {
         var7 = true;
      }

      if(var6 == 2 && !var1.g(var2 + 1, var3, var4)) {
         var7 = true;
      }

      if(var6 == 3 && !var1.g(var2 - 1, var3, var4)) {
         var7 = true;
      }

      if(var6 == 4 && !var1.g(var2, var3, var4 - 1)) {
         var7 = true;
      }

      if(var6 == 5 && !var1.g(var2, var3, var4 + 1)) {
         var7 = true;
      }

      if(var7) {
         this.b_(var1, var2, var3, var4, var1.e(var2, var3, var4));
         var1.d(var2, var3, var4, 0);
      } else if(var5 > 0 && ly.n[var5].d() && mk.a(new mk(this, var1, var2, var3, var4)) == 3) {
         this.h(var1, var2, var3, var4);
      }

   }

   private void h(cn var1, int var2, int var3, int var4) {
      (new mk(this, var1, var2, var3, var4)).a(var1.o(var2, var3, var4));
   }
}
