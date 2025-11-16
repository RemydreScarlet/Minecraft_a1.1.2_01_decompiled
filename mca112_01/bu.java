import org.lwjgl.opengl.GL11;

public class bu extends dn {

   private cr f;
   private cr g;
   private cr h;
   private static final String[] i = new String[]{"cloth", "chain", "iron", "diamond", "gold"};


   public bu() {
      super(new cr(0.0F), 0.5F);
      this.f = (cr)this.d;
      this.g = new cr(1.0F);
      this.h = new cr(0.5F);
   }

   protected boolean a(dm var1, int var2) {
      ev var3 = var1.b.d(3 - var2);
      if(var3 != null) {
         di var4 = var3.a();
         if(var4 instanceof mr) {
            mr var5 = (mr)var4;
            this.a("/armor/" + i[var5.aZ] + "_" + (var2 == 2?2:1) + ".png");
            cr var6 = var2 == 2?this.h:this.g;
            var6.a.h = var2 == 0;
            var6.b.h = var2 == 0;
            var6.c.h = var2 == 1 || var2 == 2;
            var6.d.h = var2 == 1;
            var6.e.h = var2 == 1;
            var6.f.h = var2 == 2 || var2 == 3;
            var6.g.h = var2 == 2 || var2 == 3;
            this.a(var6);
            return true;
         }
      }

      return false;
   }

   public void a(dm var1, double var2, double var4, double var6, float var8, float var9) {
      ev var10 = var1.b.a();
      this.g.i = this.h.i = this.f.i = var10 != null;
      this.g.j = this.h.j = this.f.j = var1.o();
      super.a((ge)var1, var2, var4 - (double)var1.aB, var6, var8, var9);
      this.g.j = this.h.j = this.f.j = false;
      this.g.i = this.h.i = this.f.i = false;
      kd var11 = this.a();
      float var12 = 1.6F;
      float var13 = 0.016666668F * var12;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.0F, (float)var4 + 2.3F, (float)var6);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.a.i, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(this.a.j, 1.0F, 0.0F, 0.0F);
      float var14 = var1.d(this.a.h);
      var13 = (float)((double)var13 * (Math.sqrt((double)var14) / 2.0D));
      GL11.glScalef(-var13, -var13, var13);
      String var15 = var1.i;
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glDisable(2929);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      ho var16 = ho.a;
      GL11.glDisable(3553);
      var16.b();
      int var17 = var11.a(var15) / 2;
      var16.a(0.0F, 0.0F, 0.0F, 0.25F);
      var16.a((double)(-var17 - 1), -1.0D, 0.0D);
      var16.a((double)(-var17 - 1), 8.0D, 0.0D);
      var16.a((double)(var17 + 1), 8.0D, 0.0D);
      var16.a((double)(var17 + 1), -1.0D, 0.0D);
      var16.a();
      GL11.glEnable(3553);
      var11.b(var15, -var11.a(var15) / 2, 0, 553648127);
      GL11.glEnable(2929);
      GL11.glDepthMask(true);
      var11.b(var15, -var11.a(var15) / 2, 0, -1);
      GL11.glEnable(2896);
      GL11.glDisable(3042);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
   }

   protected void a(dm var1, float var2) {
      ev var3 = var1.b.a();
      if(var3 != null) {
         GL11.glPushMatrix();
         this.f.d.b(0.0625F);
         GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
         float var4;
         if(var3.c < 256 && bc.a(ly.n[var3.c].f())) {
            var4 = 0.5F;
            GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
            var4 *= 0.75F;
            GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
         } else if(di.c[var3.c].a()) {
            var4 = 0.625F;
            GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
            GL11.glScalef(var4, -var4, var4);
            GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         } else {
            var4 = 0.375F;
            GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
            GL11.glScalef(var4, var4, var4);
            GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
         }

         this.a.f.a(var3);
         GL11.glPopMatrix();
      }

   }

   protected void b(dm var1, float var2) {
      float var3 = 0.9375F;
      GL11.glScalef(var3, var3, var3);
   }

   public void b() {
      this.f.k = 0.0F;
      this.f.a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
      this.f.d.a(0.0625F);
   }

}
