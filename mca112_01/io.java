import java.io.DataInput;
import java.io.DataOutput;

public class io extends el {

   public int a;


   public io() {}

   public io(int var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeInt(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readInt();
   }

   public byte a() {
      return (byte)3;
   }

   public String toString() {
      return "" + this.a;
   }
}
