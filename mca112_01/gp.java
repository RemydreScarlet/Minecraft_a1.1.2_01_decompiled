import java.io.DataInputStream;
import java.io.DataOutputStream;

public class gp extends fn {

   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public byte f;
   public byte g;
   public int h;


   public gp() {}

   public gp(dm var1) {
      this.a = var1.ab;
      this.b = var1.i;
      this.c = eo.b(var1.ak * 32.0D);
      this.d = eo.b(var1.al * 32.0D);
      this.e = eo.b(var1.am * 32.0D);
      this.f = (byte)((int)(var1.aq * 256.0F / 360.0F));
      this.g = (byte)((int)(var1.ar * 256.0F / 360.0F));
      ev var2 = var1.b.a();
      this.h = var2 == null?0:var2.c;
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readUTF();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readByte();
      this.g = var1.readByte();
      this.h = var1.readShort();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeUTF(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeByte(this.f);
      var1.writeByte(this.g);
      var1.writeShort(this.h);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 28;
   }
}
