
public class mt {

   public final int a;
   public final int b;
   public final int c;


   public mt(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public boolean equals(Object var1) {
      if(!(var1 instanceof mt)) {
         return false;
      } else {
         mt var2 = (mt)var1;
         return var2.a == this.a && var2.b == this.b && var2.c == this.c;
      }
   }

   public int hashCode() {
      return this.a * 8976890 + this.b * 981131 + this.c;
   }
}
