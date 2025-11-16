import java.io.DataInput;
import java.io.DataOutput;

public class ls extends el {

   public short a;


   public ls() {}

   public ls(short var1) {
      this.a = var1;
   }

   void a(DataOutput var1) {
      var1.writeShort(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readShort();
   }

   public byte a() {
      return (byte)2;
   }

   public String toString() {
      return "" + this.a;
   }
}
