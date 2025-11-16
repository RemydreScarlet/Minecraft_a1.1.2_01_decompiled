
public class jw extends di {

   public jw(int var1) {
      super(var1);
      this.aT = 1;
      this.aU = 64;
   }

   public void b(ev var1, ge var2) {
      if(var2 instanceof mv) {
         mv var3 = (mv)var2;
         if(!var3.a) {
            var3.a = true;
            --var1.a;
         }
      }

   }

   public void a(ev var1, ge var2) {
      this.b(var1, var2);
   }
}
