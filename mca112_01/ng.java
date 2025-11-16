
public class ng extends ly {

   protected ng(int var1) {
      super(var1, gb.j);
      this.bb = 48;
   }

   public void e(cn var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               if(var1.f(var6, var7, var8) == gb.f) {
                  ;
               }
            }
         }
      }

   }

   public void b(cn var1, int var2, int var3, int var4) {
      byte var5 = 2;

      for(int var6 = var2 - var5; var6 <= var2 + var5; ++var6) {
         for(int var7 = var3 - var5; var7 <= var3 + var5; ++var7) {
            for(int var8 = var4 - var5; var8 <= var4 + var5; ++var8) {
               var1.g(var6, var7, var8, var1.a(var6, var7, var8));
            }
         }
      }

   }
}
