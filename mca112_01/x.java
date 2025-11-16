import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class x {

   public static hm a(InputStream var0) {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(var0));

      hm var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static void a(hm var0, OutputStream var1) {
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

   }

   public static hm a(byte[] var0) {
      DataInputStream var1 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(var0)));

      hm var2;
      try {
         var2 = a((DataInput)var1);
      } finally {
         var1.close();
      }

      return var2;
   }

   public static byte[] a(hm var0) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(new GZIPOutputStream(var1));

      try {
         a(var0, (DataOutput)var2);
      } finally {
         var2.close();
      }

      return var1.toByteArray();
   }

   public static hm a(DataInput var0) {
      el var1 = el.b(var0);
      if(var1 instanceof hm) {
         return (hm)var1;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(hm var0, DataOutput var1) {
      el.a(var0, var1);
   }
}
