import java.util.Comparator;

public class gl implements Comparator {

   private dm a;


   public gl(dm var1) {
      this.a = var1;
   }

   public int a(bn var1, bn var2) {
      boolean var3 = var1.o;
      boolean var4 = var2.o;
      return var3 && !var4?1:(var4 && !var3?-1:(var1.a((kh)this.a) < var2.a((kh)this.a)?1:-1));
   }
}
