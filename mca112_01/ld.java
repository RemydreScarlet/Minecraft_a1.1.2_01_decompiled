import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ld extends fn {

   public int a;
   public int b;
   public int c;


   public void a(DataInputStream var1) {
      this.a = var1.readShort();
      this.b = var1.readByte();
      this.c = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeShort(this.a);
      var1.writeByte(this.b);
      var1.writeShort(this.c);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 5;
   }
}
