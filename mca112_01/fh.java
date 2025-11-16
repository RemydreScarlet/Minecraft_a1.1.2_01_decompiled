import java.util.ArrayList;

public class fh extends ly {

   public fh(int var1, int var2) {
      super(var1, var2, gb.c);
   }

   public void a(cn var1, int var2, int var3, int var4, cf var5, ArrayList var6) {
      var6.add(cf.b((double)var2, (double)var3, (double)var4, (double)(var2 + 1), (double)var3 + 1.5D, (double)(var4 + 1)));
   }

   public boolean a(cn var1, int var2, int var3, int var4) {
      return var1.a(var2, var3 - 1, var4) == this.bc?false:(!var1.f(var2, var3 - 1, var4).a()?false:super.a(var1, var2, var3, var4));
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public int f() {
      return 11;
   }
}
