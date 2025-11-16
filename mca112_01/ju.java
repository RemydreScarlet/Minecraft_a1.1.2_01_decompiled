import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ju extends fn {

   public int a;


   public void a(DataInputStream var1) {
      this.a = var1.readInt();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 4;
   }
}
