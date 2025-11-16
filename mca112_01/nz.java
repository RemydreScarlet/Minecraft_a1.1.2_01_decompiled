import org.lwjgl.opengl.GL11;

public class nz extends dn {

   private float f;


   public nz(fo var1, float var2, float var3) {
      super(var1, var2 * var3);
      this.f = var3;
   }

   protected void a(hl var1, float var2) {
      GL11.glScalef(this.f, this.f, this.f);
   }
}
