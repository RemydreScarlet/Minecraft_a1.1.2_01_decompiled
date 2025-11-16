
public class gf extends di {

   private int a;


   public gf(int var1, ly var2) {
      super(var1);
      this.a = var2.bc;
   }

   public boolean a(ev var1, dm var2, cn var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == ly.aT.bc) {
         var7 = 0;
      } else {
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
      }

      if(var1.a == 0) {
         return false;
      } else {
         if(var3.a(this.a, var4, var5, var6, false)) {
            ly var8 = ly.n[this.a];
            if(var3.d(var4, var5, var6, this.a)) {
               ly.n[this.a].d(var3, var4, var5, var6, var7);
               var3.a((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var8.bl.d(), (var8.bl.b() + 1.0F) / 2.0F, var8.bl.c() * 0.8F);
               --var1.a;
            }
         }

         return true;
      }
   }
}
