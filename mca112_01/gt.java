import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gt extends fn {

   public String a;


   public gt() {}

   public gt(String var1) {
      this.a = var1;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readUTF();
   }

   public void a(DataOutputStream var1) {
      var1.writeUTF(this.a);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 4 + this.a.length() + 4;
   }
}
