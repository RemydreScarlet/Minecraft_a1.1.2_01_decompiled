
public class bs extends di {

   private ly[] aX;
   private float aY = 4.0F;
   private int aZ;
   protected int a;


   public bs(int var1, int var2, int var3, ly[] var4) {
      super(var1);
      this.a = var3;
      this.aX = var4;
      this.aT = 1;
      this.aU = 32 << var3;
      if(var3 == 3) {
         this.aU *= 4;
      }

      this.aY = (float)((var3 + 1) * 2);
      this.aZ = var2 + var3;
   }

   public float a(ev var1, ly var2) {
      for(int var3 = 0; var3 < this.aX.length; ++var3) {
         if(this.aX[var3] == var2) {
            return this.aY;
         }
      }

      return 1.0F;
   }

   public void a(ev var1, ge var2) {
      var1.b(2);
   }

   public void a(ev var1, int var2, int var3, int var4, int var5) {
      var1.b(1);
   }

   public int a(kh var1) {
      return this.aZ;
   }

   public boolean a() {
      return true;
   }
}
