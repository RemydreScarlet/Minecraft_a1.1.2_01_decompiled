import java.util.Comparator;

class fs implements Comparator {

   // $FF: synthetic field
   final dw a;


   fs(dw var1) {
      this.a = var1;
   }

   public int a(bv var1, bv var2) {
      return var2.a() < var1.a()?-1:(var2.a() > var1.a()?1:0);
   }
}
