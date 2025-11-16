import java.util.Comparator;

public class fb implements Comparator {

   private kh a;


   public fb(kh var1) {
      this.a = var1;
   }

   public int a(bn var1, bn var2) {
      return var1.a(this.a) < var2.a(this.a)?-1:1;
   }
}
