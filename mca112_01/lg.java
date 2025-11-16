
public class lg extends di {

   private String a;


   protected lg(int var1, String var2) {
      super(var1);
      this.a = var2;
      this.aT = 1;
   }

   public boolean a(ev var1, dm var2, cn var3, int var4, int var5, int var6, int var7) {
      if(var3.a(var4, var5, var6) == ly.aZ.bc && var3.e(var4, var5, var6) == 0) {
         var3.b(var4, var5, var6, this.aS - di.aQ.aS + 1);
         var3.a(this.a, var4, var5, var6);
         --var1.a;
         return true;
      } else {
         return false;
      }
   }
}
