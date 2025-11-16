
public class ed {

   public aj a;
   public float b;
   public float c;


   public ed(float var1, float var2, float var3, float var4, float var5) {
      this(aj.a((double)var1, (double)var2, (double)var3), var4, var5);
   }

   public ed a(float var1, float var2) {
      return new ed(this, var1, var2);
   }

   public ed(ed var1, float var2, float var3) {
      this.a = var1.a;
      this.b = var2;
      this.c = var3;
   }

   public ed(aj var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }
}
