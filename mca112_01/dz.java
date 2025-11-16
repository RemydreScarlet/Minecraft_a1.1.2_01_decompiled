import java.io.DataInputStream;
import java.io.DataOutputStream;

public class dz extends fn {

   public int a;
   public int b;


   public dz() {}

   public dz(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.b);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 6;
   }
}
