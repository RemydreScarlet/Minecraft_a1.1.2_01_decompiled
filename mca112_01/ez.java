import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ez extends fn {

   public int a;
   public byte b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;


   public ez() {}

   public ez(ge var1) {
      this.a = var1.ab;
      this.b = (byte)ew.a(var1);
      this.c = eo.b(var1.ak * 32.0D);
      this.d = eo.b(var1.al * 32.0D);
      this.e = eo.b(var1.am * 32.0D);
      this.f = (byte)((int)(var1.aq * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.ar * 256.0F / 360.0F));
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readByte();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeByte(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 19;
   }
}
