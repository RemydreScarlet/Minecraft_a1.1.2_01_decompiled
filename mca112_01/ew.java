import java.util.HashMap;
import java.util.Map;

public class ew {

   private static Map a = new HashMap();
   private static Map b = new HashMap();
   private static Map c = new HashMap();
   private static Map d = new HashMap();


   private static void a(Class var0, String var1, int var2) {
      a.put(var1, var0);
      b.put(var0, var1);
      c.put(Integer.valueOf(var2), var0);
      d.put(var0, Integer.valueOf(var2));
   }

   public static kh a(String var0, cn var1) {
      kh var2 = null;

      try {
         Class var3 = (Class)a.get(var0);
         if(var3 != null) {
            var2 = (kh)var3.getConstructor(new Class[]{cn.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      return var2;
   }

   public static kh a(hm var0, cn var1) {
      kh var2 = null;

      try {
         Class var3 = (Class)a.get(var0.i("id"));
         if(var3 != null) {
            var2 = (kh)var3.getConstructor(new Class[]{cn.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 != null) {
         var2.e(var0);
      } else {
         System.out.println("Skipping Entity with id " + var0.i("id"));
      }

      return var2;
   }

   public static kh a(int var0, cn var1) {
      kh var2 = null;

      try {
         Class var3 = (Class)c.get(Integer.valueOf(var0));
         if(var3 != null) {
            var2 = (kh)var3.getConstructor(new Class[]{cn.class}).newInstance(new Object[]{var1});
         }
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      if(var2 == null) {
         System.out.println("Skipping Entity with id " + var0);
      }

      return var2;
   }

   public static int a(kh var0) {
      return ((Integer)d.get(var0.getClass())).intValue();
   }

   public static String b(kh var0) {
      return (String)b.get(var0.getClass());
   }

   static {
      a(kg.class, "Arrow", 10);
      a(ao.class, "Snowball", 11);
      a(dx.class, "Item", 1);
      a(jc.class, "Painting", 9);
      a(ge.class, "Mob", 48);
      a(dq.class, "Monster", 49);
      a(dd.class, "Creeper", 50);
      a(cw.class, "Skeleton", 51);
      a(ax.class, "Spider", 52);
      a(hl.class, "Giant", 53);
      a(mb.class, "Zombie", 54);
      a(ma.class, "Slime", 55);
      a(mv.class, "Pig", 90);
      a(bo.class, "Sheep", 91);
      a(am.class, "Cow", 91);
      a(mz.class, "Chicken", 91);
      a(jd.class, "PrimedTnt", 20);
      a(ff.class, "FallingSand", 21);
      a(oc.class, "Minecart", 40);
      a(dc.class, "Boat", 41);
   }
}
