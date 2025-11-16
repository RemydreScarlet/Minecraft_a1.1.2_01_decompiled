import java.io.DataInput;
import java.io.DataOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hm extends el {

   private Map a = new HashMap();


   void a(DataOutput var1) {
      Iterator var2 = this.a.values().iterator();

      while(var2.hasNext()) {
         el var3 = (el)var2.next();
         el.a(var3, var1);
      }

      var1.writeByte(0);
   }

   void a(DataInput var1) {
      this.a.clear();

      el var2;
      while((var2 = el.b(var1)).a() != 0) {
         this.a.put(var2.b(), var2);
      }

   }

   public byte a() {
      return (byte)10;
   }

   public void a(String var1, el var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, byte var2) {
      this.a.put(var1, (new ix(var2)).a(var1));
   }

   public void a(String var1, short var2) {
      this.a.put(var1, (new ls(var2)).a(var1));
   }

   public void a(String var1, int var2) {
      this.a.put(var1, (new io(var2)).a(var1));
   }

   public void a(String var1, long var2) {
      this.a.put(var1, (new gn(var2)).a(var1));
   }

   public void a(String var1, float var2) {
      this.a.put(var1, (new f(var2)).a(var1));
   }

   public void a(String var1, double var2) {
      this.a.put(var1, (new kr(var2)).a(var1));
   }

   public void a(String var1, String var2) {
      this.a.put(var1, (new ne(var2)).a(var1));
   }

   public void a(String var1, byte[] var2) {
      this.a.put(var1, (new dy(var2)).a(var1));
   }

   public void a(String var1, hm var2) {
      this.a.put(var1, var2.a(var1));
   }

   public void a(String var1, boolean var2) {
      this.a(var1, (byte)(var2?1:0));
   }

   public boolean b(String var1) {
      return this.a.containsKey(var1);
   }

   public byte c(String var1) {
      return !this.a.containsKey(var1)?0:((ix)this.a.get(var1)).a;
   }

   public short d(String var1) {
      return !this.a.containsKey(var1)?0:((ls)this.a.get(var1)).a;
   }

   public int e(String var1) {
      return !this.a.containsKey(var1)?0:((io)this.a.get(var1)).a;
   }

   public long f(String var1) {
      return !this.a.containsKey(var1)?0L:((gn)this.a.get(var1)).a;
   }

   public float g(String var1) {
      return !this.a.containsKey(var1)?0.0F:((f)this.a.get(var1)).a;
   }

   public double h(String var1) {
      return !this.a.containsKey(var1)?0.0D:((kr)this.a.get(var1)).a;
   }

   public String i(String var1) {
      return !this.a.containsKey(var1)?"":((ne)this.a.get(var1)).a;
   }

   public byte[] j(String var1) {
      return !this.a.containsKey(var1)?new byte[0]:((dy)this.a.get(var1)).a;
   }

   public hm k(String var1) {
      return !this.a.containsKey(var1)?new hm():(hm)this.a.get(var1);
   }

   public ki l(String var1) {
      return !this.a.containsKey(var1)?new ki():(ki)this.a.get(var1);
   }

   public boolean m(String var1) {
      return this.c(var1) != 0;
   }

   public String toString() {
      return "" + this.a.size() + " entries";
   }
}
