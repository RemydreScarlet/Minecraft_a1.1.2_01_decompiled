import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class fn {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   public boolean j = false;


   static void a(int var0, Class var1) {
      if(a.containsKey(Integer.valueOf(var0))) {
         throw new IllegalArgumentException("Duplicate packet id:" + var0);
      } else if(b.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate packet class:" + var1);
      } else {
         a.put(Integer.valueOf(var0), var1);
         b.put(var1, Integer.valueOf(var0));
      }
   }

   public static fn a(int var0) {
      try {
         Class var1 = (Class)a.get(Integer.valueOf(var0));
         return var1 == null?null:(fn)var1.newInstance();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("Skipping packet with id " + var0);
         return null;
      }
   }

   public final int b() {
      return ((Integer)b.get(this.getClass())).intValue();
   }

   public static fn b(DataInputStream var0) {
      int var1 = var0.read();
      if(var1 == -1) {
         return null;
      } else {
         fn var2 = a(var1);
         if(var2 == null) {
            throw new IOException("Bad packet id " + var1);
         } else {
            var2.a(var0);
            return var2;
         }
      }
   }

   public static void a(fn var0, DataOutputStream var1) {
      var1.write(var0.b());
      var0.a(var1);
   }

   public abstract void a(DataInputStream var1);

   public abstract void a(DataOutputStream var1);

   public abstract void a(lb var1);

   public abstract int a();

   static {
      a(0, gi.class);
      a(1, hp.class);
      a(2, gt.class);
      a(3, ij.class);
      a(4, du.class);
      a(5, m.class);
      a(6, ji.class);
      a(10, eh.class);
      a(11, s.class);
      a(12, mh.class);
      a(13, ch.class);
      a(14, fg.class);
      a(15, do.class);
      a(16, dz.class);
      a(17, ld.class);
      a(18, hf.class);
      a(20, gp.class);
      a(21, ha.class);
      a(22, bm.class);
      a(23, kj.class);
      a(24, ez.class);
      a(29, ju.class);
      a(30, lq.class);
      a(31, kp.class);
      a(32, jx.class);
      a(33, is.class);
      a(34, jl.class);
      a(50, ka.class);
      a(51, bz.class);
      a(52, na.class);
      a(53, li.class);
      a(59, ny.class);
      a(255, oh.class);
   }
}
