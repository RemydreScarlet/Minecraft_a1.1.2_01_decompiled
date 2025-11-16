import java.io.DataInputStream;
import java.io.DataOutputStream;

public class jl extends fn {

   public int a;
   public int b;
   public int c;
   public int d;
   public byte e;
   public byte f;


   public jl() {}

   public jl(kh var1) {
      this.a = var1.ab;
      this.b = eo.b(var1.ak * 32.0D);
      this.c = eo.b(var1.al * 32.0D);
      this.d = eo.b(var1.am * 32.0D);
      this.e = (byte)((int)(var1.aq * 256.0F / 360.0F));
      this.f = (byte)((int)(var1.ar * 256.0F / 360.0F));
   }

   public void a(DataInputStream var1) {
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = (byte)var1.read();
      this.f = (byte)var1.read();
   }

   public void a(DataOutputStream var1) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.write(this.e);
      var1.write(this.f);
   }

   public void a(lb var1) {
      var1.a(this);
   }

   public int a() {
      return 34;
   }
}
