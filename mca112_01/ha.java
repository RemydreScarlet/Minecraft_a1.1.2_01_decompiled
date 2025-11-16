import java.io.DataInputStream;
import java.io.DataOutputStream;

public class ha extends fn {

   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;
   public byte g;
   public int h;
   public int i;


   public ha() {}

   public ha(dx var1) {
      this.a = var1.ab;
      this.h = var1.a.c;
      this.i = var1.a.a;
      this.b = eo.b(var1.ak * 32.0D);
      this.c = eo.b(var1.al * 32.0D);
      this.d = eo.b(var1.am * 32.0D);
      this.e = (byte)((int)(var1.an * 128.0D));
      this.f = (byte)((int)(var1.ao * 128.0D));
      this.g = (byte)((int)(var1.ap * 128.0D));
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.h = var1.readShort();
      this.i = var1.readByte();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readByte();
      this.f = var1.readByte();
      this.g = var1.readByte();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeShort(this.h);
      var1.writeByte(this.i);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeByte(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 22;
   }
}
