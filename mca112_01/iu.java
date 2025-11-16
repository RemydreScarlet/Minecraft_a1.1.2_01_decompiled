
public class iu extends di {

   private int a;


   public iu(int var1, int var2) {
      super(var1);
      this.aT = 1;
      this.aU = 32 << var2;
      if(var2 == 3) {
         this.aU *= 4;
      }

      this.a = 4 + var2 * 2;
   }

   public float a(ev var1, ly var2) {
      return 1.5F;
   }

   public void a(ev var1, ge var2) {
      var1.b(1);
   }

   public void a(ev var1, int var2, int var3, int var4, int var5) {
      var1.b(2);
   }

   public int a(kh var1) {
      return this.a;
   }

   public boolean a() {
      return true;
   }
}
