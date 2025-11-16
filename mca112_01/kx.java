import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class kx {

   private Map o = new HashMap();
   public static kx a = new kx();
   private kd p;
   public static double b;
   public static double c;
   public static double d;
   public ey e;
   public jh f;
   public cn g;
   public dm h;
   public float i;
   public float j;
   public fr k;
   public double l;
   public double m;
   public double n;


   private kx() {
      this.o.put(ax.class, new ok());
      this.o.put(mv.class, new gm(new ca(), new ca(0.5F), 0.7F));
      this.o.put(bo.class, new ns(new gx(), new bx(), 0.7F));
      this.o.put(am.class, new mc(new dv(), 0.7F));
      this.o.put(mz.class, new eq(new kv(), 0.3F));
      this.o.put(dd.class, new d());
      this.o.put(cw.class, new dn(new fv(), 0.5F));
      this.o.put(mb.class, new dn(new cb(), 0.5F));
      this.o.put(ma.class, new gq(new hh(16), new hh(0), 0.25F));
      this.o.put(dm.class, new bu());
      this.o.put(hl.class, new nz(new cb(), 0.5F, 6.0F));
      this.o.put(ge.class, new dn(new cr(), 0.5F));
      this.o.put(kh.class, new gj());
      this.o.put(jc.class, new bw());
      this.o.put(kg.class, new gk());
      this.o.put(ao.class, new ei());
      this.o.put(dx.class, new ab());
      this.o.put(jd.class, new hw());
      this.o.put(ff.class, new dj());
      this.o.put(oc.class, new kt());
      this.o.put(dc.class, new cp());
      Iterator var1 = this.o.values().iterator();

      while(var1.hasNext()) {
         ak var2 = (ak)var1.next();
         var2.a(this);
      }

   }

   public ak a(Class var1) {
      ak var2 = (ak)this.o.get(var1);
      if(var2 == null && var1 != kh.class) {
         var2 = this.a(var1.getSuperclass());
         this.o.put(var1, var2);
      }

      return var2;
   }

   public ak a(kh var1) {
      return this.a(var1.getClass());
   }

   public void a(cn var1, ey var2, kd var3, dm var4, fr var5, float var6) {
      this.g = var1;
      this.e = var2;
      this.k = var5;
      this.h = var4;
      this.p = var3;
      this.i = var4.as + (var4.aq - var4.as) * var6;
      this.j = var4.at + (var4.ar - var4.at) * var6;
      this.l = var4.aI + (var4.ak - var4.aI) * (double)var6;
      this.m = var4.aJ + (var4.al - var4.aJ) * (double)var6;
      this.n = var4.aK + (var4.am - var4.aK) * (double)var6;
   }

   public void a(kh var1, float var2) {
      double var3 = var1.aI + (var1.ak - var1.aI) * (double)var2;
      double var5 = var1.aJ + (var1.al - var1.aJ) * (double)var2;
      double var7 = var1.aK + (var1.am - var1.aK) * (double)var2;
      float var9 = var1.as + (var1.aq - var1.as) * var2;
      float var10 = var1.a(var2);
      GL11.glColor3f(var10, var10, var10);
      this.a(var1, var3 - b, var5 - c, var7 - d, var9, var2);
   }

   public void a(kh var1, double var2, double var4, double var6, float var8, float var9) {
      ak var10 = this.a(var1);
      if(var10 != null) {
         var10.a(var1, var2, var4, var6, var8, var9);
         var10.b(var1, var2, var4, var6, var8, var9);
      }

   }

   public void a(cn var1) {
      this.g = var1;
   }

   public double a(double var1, double var3, double var5) {
      double var7 = var1 - this.l;
      double var9 = var3 - this.m;
      double var11 = var5 - this.n;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public kd a() {
      return this.p;
   }

}
