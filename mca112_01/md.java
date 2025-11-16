
public class md extends di {

   public md(int var1) {
      super(var1);
      this.aU = 64;
      this.aT = 1;
   }

   public boolean a(ev var1, dm var2, cn var3, int var4, int var5, int var6, int var7) {
      if(var7 == 0) {
         return false;
      } else if(!var3.f(var4, var5, var6).a()) {
         return false;
      } else {
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

         if(!ly.aE.a(var3, var4, var5, var6)) {
            return false;
         } else {
            if(var7 == 1) {
               var3.b(var4, var5, var6, ly.aE.bc, eo.b((double)((var2.aq + 180.0F) * 16.0F / 360.0F) + 0.5D) & 15);
            } else {
               var3.b(var4, var5, var6, ly.aJ.bc, var7);
            }

            --var1.a;
            var2.a((ob)var3.b(var4, var5, var6));
            return true;
         }
      }
   }
}
