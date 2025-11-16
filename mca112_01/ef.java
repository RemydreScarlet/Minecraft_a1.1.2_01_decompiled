
public class ef extends di {

   public ef(int var1) {
      super(var1);
   }

   public boolean a(ev var1, dm var2, cn var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         --var5;
      }

      if(var7 == 1) {
         ++var5;
      }

      if(var7 == 2) {
         --var6;
      }

      if(var7 == 3) {
         ++var6;
      }

      if(var7 == 4) {
         --var4;
      }

      if(var7 == 5) {
         ++var4;
      }

      if(var3.a(var4, var5, var6) != 0) {
         return false;
      } else {
         if(ly.aw.a(var3, var4, var5, var6)) {
            --var1.a;
            var3.d(var4, var5, var6, ly.aw.bc);
         }

         return true;
      }
   }
}
