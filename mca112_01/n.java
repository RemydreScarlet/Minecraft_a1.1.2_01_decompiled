
public class n extends ar {

   public gu a;
   public gh b = new mw();


   public n(ev[] var1) {
      this.a = new gu(this, var1);
      this.a((gh)this.a);
   }

   public void a(gh var1) {
      int[] var2 = new int[9];

      for(int var3 = 0; var3 < 3; ++var3) {
         for(int var4 = 0; var4 < 3; ++var4) {
            int var5 = -1;
            if(var3 < 2 && var4 < 2) {
               ev var6 = this.a.c(var3 + var4 * 2);
               if(var6 != null) {
                  var5 = var6.c;
               }
            }

            var2[var3 + var4 * 3] = var5;
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
