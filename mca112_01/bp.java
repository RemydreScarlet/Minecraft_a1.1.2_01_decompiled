
public class bp extends di {

   public bp(int var1) {
      super(var1);
      this.aT = 16;
   }

   public ev a(ev var1, cn var2, dm var3) {
      --var1.a;
      var2.a(var3, "random.bow", 0.5F, 0.4F / (b.nextFloat() * 0.4F + 0.8F));
      var2.a((kh)(new ao(var2, var3)));
      return var1;
   }
}
