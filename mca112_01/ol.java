
public class ol {

   public int a;
   public int b;


   public ol(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public int hashCode() {
      return this.a << 8 | this.b;
   }

   public boolean equals(Object var1) {
      ol var2 = (ol)var1;
      return var2.a == this.a && var2.b == this.b;
   }
}
