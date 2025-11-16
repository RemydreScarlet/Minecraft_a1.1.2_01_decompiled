import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lz implements aw {

   private ga a;
   private Map b = new HashMap();
   private List c = new ArrayList();
   private cn d;


   public lz(cn var1) {
      this.a = new ga(var1, new byte['\u8000'], 0, 0);
      this.a.q = true;
      this.a.p = true;
      this.d = var1;
   }

   public boolean a(int var1, int var2) {
      hc var3 = new hc(var1, var2);
      return this.b.containsKey(var3);
   }

   public void c(int var1, int var2) {
      ga var3 = this.b(var1, var2);
      if(!var3.q) {
         var3.e();
      }

      this.b.remove(new hc(var1, var2));
      this.c.remove(var3);
   }

   public ga d(int var1, int var2) {
      hc var3 = new hc(var1, var2);
      byte[] var4 = new byte['\u8000'];
      ga var5 = new ga(this.d, var4, var1, var2);
      Arrays.fill(var5.f.a, (byte)-1);
      this.b.put(var3, var5);
      var5.c = true;
      return var5;
   }

   public ga b(int var1, int var2) {
      hc var3 = new hc(var1, var2);
      ga var4 = (ga)this.b.get(var3);
      return var4 == null?this.a:var4;
   }

   public boolean a(boolean var1, nu var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return false;
   }

   public void a(aw var1, int var2, int var3) {}
}
