import java.io.DataInput;
import java.io.DataOutput;

public class ne extends el {

   public String a;


   public ne() {}

   public ne(String var1) {
      this.a = var1;
      if(var1 == null) {
         throw new IllegalArgumentException("Empty string not allowed");
      }
   }

   void a(DataOutput var1) {
      var1.writeUTF(this.a);
   }

   void a(DataInput var1) {
      this.a = var1.readUTF();
   }

   public byte a() {
      return (byte)8;
   }

   public String toString() {
      return "" + this.a;
   }
}
