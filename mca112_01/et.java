
public class et extends ar {

   public gu a = new gu(this, 3, 3);
   public gh b = new mw();


   public void a(gh var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 3; ++var4) {
            int var5 = var3 + var4 * 3;
            ev var6 = this.a.c(var5);
            if(var6 == null) {
               var2[var5] = -1;
            } else {
               var2[var5] = var6.c;
            }
         }
      }

      this.b.a(0, dw.a().a(var2));
   }

   public void a(dm var1) {
      super.a(var1);

      for(int var2 = 0; var2 < 9; ++var2) {
         ev var3 = this.a.c(var2);
         if(var3 != null) {
            var1.a(var3);
         }
      }

   }
}
