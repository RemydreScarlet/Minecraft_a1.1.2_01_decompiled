import java.io.DataInputStream;
import java.io.DataOutputStream;

public class oh extends fn {

   public String a;


   public oh() {}

   public oh(String var1) {
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
      return this.a.length();
   }
}
