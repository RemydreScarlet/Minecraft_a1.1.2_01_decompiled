
public class oj extends di {

   private int a;


   public oj(int var1, int var2) {
      super(var1);
      this.a = var2;
      this.aT = 1;
   }

   public ev a(ev var1, cn var2, dm var3) {
      --var1.a;
      var3.b(this.a);
      return var1;
   }
}
