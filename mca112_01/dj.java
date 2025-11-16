import org.lwjgl.opengl.GL11;

public class dj extends ak {

   private bc d = new bc();


   public dj() {
      this.b = 0.5F;
   }

   public void a(ff var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      this.a("/terrain.png");
      ly var10 = ly.n[var1.a];
      cn var11 = var1.i();
      GL11.glDisable(2896);
      this.d.a(var10, var11, eo.b(var1.ak), eo.b(var1.al), eo.b(var1.am));
      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }
}
