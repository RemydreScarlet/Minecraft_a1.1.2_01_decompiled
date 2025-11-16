import java.io.DataInputStream;
import java.io.DataOutputStream;

public class du extends fn {

   public long a;


   public void a(DataInputStream var1) {
      this.a = var1.readLong();
   }

   public void a(DataOutputStream var1) {
      var1.writeLong(this.a);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 8;
   }
}
