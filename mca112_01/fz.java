import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class fz {

   private Map m = new HashMap();
   public static fz a = new fz();
   private kd n;
   public static double b;
   public static double c;
   public static double d;
   public ey e;
   public cn f;
   public dm g;
   public float h;
   public float i;
   public double j;
   public double k;
   public double l;


   private fz() {
      this.m.put(ob.class, new in());
      this.m.put(bd.class, new r());
      Iterator var1 = this.m.values().iterator();

      while(var1.hasNext()) {
         ex var2 = (ex)var1.next();
         var2.a(this);
      }

   }

   public ex a(Class var1) {
      ex var2 = (ex)this.m.get(var1);
      if(var2 == null && var1 != ic.class) {
         var2 = this.a(var1.getSuperclass());
         this.m.put(var1, var2);
      }

      return var2;
   }

   public boolean a(ic var1) {
      return this.b(var1) != null;
   }

   public ex b(ic var1) {
      return this.a(var1.getClass());
   }

   public void a(cn var1, ey var2, kd var3, dm var4, float var5) {
      this.f = var1;
      this.e = var2;
      this.g = var4;
      this.n = var3;
      this.h = var4.as + (var4.aq - var4.as) * var5;
      this.i = var4.at + (var4.ar - var4.at) * var5;
      this.j = var4.aI + (var4.ak - var4.aI) * (double)var5;
      this.k = var4.aJ + (var4.al - var4.aJ) * (double)var5;
      this.l = var4.aK + (var4.am - var4.aK) * (double)var5;
   }

   public void a(ic var1, float var2) {
      if(var1.a(this.j, this.k, this.l) < 4096.0D) {
         float var3 = this.f.c(var1.f, var1.g, var1.h);
         GL11.glColor3f(var3, var3, var3);
         this.a(var1, (double)var1.f - b, (double)var1.g - c, (double)var1.h - d, var2);
      }

   }

   public void a(ic var1, double var2, double var4, double var6, float var8) {
      ex var9 = this.b(var1);
      if(var9 != null) {
         var9.a(var1, var2, var4, var6, var8);
      }

   }

   public kd a() {
      return this.n;
   }

}
