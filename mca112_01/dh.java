import java.util.Random;

public class dh extends ly {

   public static boolean a = false;


   public dh(int var1, int var2) {
      super(var1, var2, gb.m);
   }

   public void e(cn var1, int var2, int var3, int var4) {
      var1.h(var2, var3, var4, this.bc);
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      var1.h(var2, var3, var4, this.bc);
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      this.h(var1, var2, var3, var4);
   }

   private void h(cn var1, int var2, int var3, int var4) {
      if(a_(var1, var2, var3 - 1, var4) && var3 >= 0) {
         ff var8 = new ff(var1, (float)var2 + 0.5F, (float)var3 + 0.5F, (float)var4 + 0.5F, this.bc);
         if(a) {
            while(!var8.aA) {
               var8.e_();
            }
         } else {
            var1.a((kh)var8);
         }
      }

   }

   public int a() {
      return 3;
   }

   public static boolean a_(cn var0, int var1, int var2, int var3) {
      int var4 = var0.a(var1, var2, var3);
      if(var4 == 0) {
         return true;
      } else if(var4 == ly.as.bc) {
         return true;
      } else {
         gb var5 = ly.n[var4].bn;
         return var5 == gb.f?true:var5 == gb.g;
      }
   }

}
