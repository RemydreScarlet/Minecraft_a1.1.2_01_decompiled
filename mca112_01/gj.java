import org.lwjgl.opengl.GL11;

public class gj extends ak {

   public void a(kh var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glPushMatrix();
      a(var1.au, var2 - var1.aI, var4 - var1.aJ, var6 - var1.aK);
      GL11.glPopMatrix();
   }
}
