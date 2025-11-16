import net.minecraft.client.Minecraft;

public class hq {

   protected final Minecraft a;
   public boolean b = false;


   public hq(Minecraft var1) {
      this.a = var1;
   }

   public void a(cn var1) {}

   public void a(int var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4);
   }

   public boolean b(int var1, int var2, int var3, int var4) {
      this.a.h.a(var1, var2, var3);
      cn var5 = this.a.e;
      ly var6 = ly.n[var5.a(var1, var2, var3)];
      int var7 = var5.e(var1, var2, var3);
      boolean var8 = var5.d(var1, var2, var3, 0);
      if(var6 != null && var8) {
         this.a.A.b(var6.bl.a(), (float)var1 + 0.5F, (float)var2 + 0.5F, (float)var3 + 0.5F, (var6.bl.b() + 1.0F) / 2.0F, var6.bl.c() * 0.8F);
         var6.b(var5, var1, var2, var3, var7);
      }

      return var8;
   }

   public void c(int var1, int var2, int var3, int var4) {}

   public void a() {}

   public void a(float var1) {}

   public float b() {
      return 5.0F;
   }

   public void a(dm var1) {}

   public void c() {}

   public boolean d() {
      return true;
   }

   public void b(dm var1) {}

   public boolean a(dm var1, cn var2, ev var3, int var4, int var5, int var6, int var7) {
      int var8 = var2.a(var4, var5, var6);
      return var8 > 0 && ly.n[var8].a(var2, var4, var5, var6, var1)?true:(var3 == null?false:var3.a(var1, var2, var4, var5, var6, var7));
   }

   public dm b(cn var1) {
      return new bi(this.a, var1, this.a.i);
   }
}
