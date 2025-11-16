import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class jh {

   private Minecraft a;
   private ev b = null;
   private float c = 0.0F;
   private float d = 0.0F;
   private bc e = new bc();


   public jh(Minecraft var1) {
      this.a = var1;
   }

   public void a(ev var1) {
      GL11.glPushMatrix();
      if(var1.c < 256 && bc.a(ly.n[var1.c].f())) {
         GL11.glBindTexture(3553, this.a.n.a("/terrain.png"));
         this.e.a(ly.n[var1.c]);
      } else {
         if(var1.c < 256) {
            GL11.glBindTexture(3553, this.a.n.a("/terrain.png"));
         } else {
            GL11.glBindTexture(3553, this.a.n.a("/gui/items.png"));
         }

         ho var2 = ho.a;
         float var3 = (float)(var1.b() % 16 * 16 + 0) / 256.0F;
         float var4 = (float)(var1.b() % 16 * 16 + 16) / 256.0F;
         float var5 = (float)(var1.b() / 16 * 16 + 0) / 256.0F;
         float var6 = (float)(var1.b() / 16 * 16 + 16) / 256.0F;
         float var7 = 1.0F;
         float var8 = 0.0F;
         float var9 = 0.3F;
         GL11.glEnable('\u803a');
         GL11.glTranslatef(-var8, -var9, 0.0F);
         float var10 = 1.5F;
         GL11.glScalef(var10, var10, var10);
         GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
         float var11 = 0.0625F;
         var2.b();
         var2.b(0.0F, 0.0F, 1.0F);
         var2.a(0.0D, 0.0D, 0.0D, (double)var4, (double)var6);
         var2.a((double)var7, 0.0D, 0.0D, (double)var3, (double)var6);
         var2.a((double)var7, 1.0D, 0.0D, (double)var3, (double)var5);
         var2.a(0.0D, 1.0D, 0.0D, (double)var4, (double)var5);
         var2.a();
         var2.b();
         var2.b(0.0F, 0.0F, -1.0F);
         var2.a(0.0D, 1.0D, (double)(0.0F - var11), (double)var4, (double)var5);
         var2.a((double)var7, 1.0D, (double)(0.0F - var11), (double)var3, (double)var5);
         var2.a((double)var7, 0.0D, (double)(0.0F - var11), (double)var3, (double)var6);
         var2.a(0.0D, 0.0D, (double)(0.0F - var11), (double)var4, (double)var6);
         var2.a();
         var2.b();
         var2.b(-1.0F, 0.0F, 0.0F);

         int var12;
         float var13;
         float var14;
         float var15;
         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var4 + (var3 - var4) * var13 - 0.001953125F;
            var15 = var7 * var13;
            var2.a((double)var15, 0.0D, (double)(0.0F - var11), (double)var14, (double)var6);
            var2.a((double)var15, 0.0D, 0.0D, (double)var14, (double)var6);
            var2.a((double)var15, 1.0D, 0.0D, (double)var14, (double)var5);
            var2.a((double)var15, 1.0D, (double)(0.0F - var11), (double)var14, (double)var5);
         }

         var2.a();
         var2.b();
         var2.b(1.0F, 0.0F, 0.0F);

         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var4 + (var3 - var4) * var13 - 0.001953125F;
            var15 = var7 * var13 + 0.0625F;
            var2.a((double)var15, 1.0D, (double)(0.0F - var11), (double)var14, (double)var5);
            var2.a((double)var15, 1.0D, 0.0D, (double)var14, (double)var5);
            var2.a((double)var15, 0.0D, 0.0D, (double)var14, (double)var6);
            var2.a((double)var15, 0.0D, (double)(0.0F - var11), (double)var14, (double)var6);
         }

         var2.a();
         var2.b();
         var2.b(0.0F, 1.0F, 0.0F);

         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var6 + (var5 - var6) * var13 - 0.001953125F;
            var15 = var7 * var13 + 0.0625F;
            var2.a(0.0D, (double)var15, 0.0D, (double)var4, (double)var14);
            var2.a((double)var7, (double)var15, 0.0D, (double)var3, (double)var14);
            var2.a((double)var7, (double)var15, (double)(0.0F - var11), (double)var3, (double)var14);
            var2.a(0.0D, (double)var15, (double)(0.0F - var11), (double)var4, (double)var14);
         }

         var2.a();
         var2.b();
         var2.b(0.0F, -1.0F, 0.0F);

         for(var12 = 0; var12 < 16; ++var12) {
            var13 = (float)var12 / 16.0F;
            var14 = var6 + (var5 - var6) * var13 - 0.001953125F;
            var15 = var7 * var13;
            var2.a((double)var7, (double)var15, 0.0D, (double)var3, (double)var14);
            var2.a(0.0D, (double)var15, 0.0D, (double)var4, (double)var14);
            var2.a(0.0D, (double)var15, (double)(0.0F - var11), (double)var4, (double)var14);
            var2.a((double)var7, (double)var15, (double)(0.0F - var11), (double)var3, (double)var14);
         }

         var2.a();
         GL11.glDisable('\u803a');
      }

      GL11.glPopMatrix();
   }

   public void a(float var1) {
      float var2 = this.d + (this.c - this.d) * var1;
      bi var3 = this.a.g;
      GL11.glPushMatrix();
      GL11.glRotatef(var3.at + (var3.ar - var3.at) * var1, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var3.as + (var3.aq - var3.as) * var1, 0.0F, 1.0F, 0.0F);
      i.b();
      GL11.glPopMatrix();
      float var4 = this.a.e.c(eo.b(var3.ak), eo.b(var3.al), eo.b(var3.am));
      GL11.glColor4f(var4, var4, var4, 1.0F);
      float var5;
      float var6;
      float var7;
      float var8;
      if(this.b != null) {
         GL11.glPushMatrix();
         var5 = 0.8F;
         var6 = var3.d(var1);
         var7 = eo.a(var6 * 3.1415927F);
         var8 = eo.a(eo.c(var6) * 3.1415927F);
         GL11.glTranslatef(-var8 * 0.4F, eo.a(eo.c(var6) * 3.1415927F * 2.0F) * 0.2F, -var7 * 0.2F);
         GL11.glTranslatef(0.7F * var5, -0.65F * var5 - (1.0F - var2) * 0.6F, -0.9F * var5);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var6 = var3.d(var1);
         var7 = eo.a(var6 * var6 * 3.1415927F);
         var8 = eo.a(eo.c(var6) * 3.1415927F);
         GL11.glRotatef(-var7 * 20.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var8 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(-var8 * 80.0F, 1.0F, 0.0F, 0.0F);
         var6 = 0.4F;
         GL11.glScalef(var6, var6, var6);
         this.a(this.b);
         GL11.glPopMatrix();
      } else {
         GL11.glPushMatrix();
         var5 = 0.8F;
         var6 = var3.d(var1);
         var7 = eo.a(var6 * 3.1415927F);
         var8 = eo.a(eo.c(var6) * 3.1415927F);
         GL11.glTranslatef(-var8 * 0.3F, eo.a(eo.c(var6) * 3.1415927F * 2.0F) * 0.4F, -var7 * 0.4F);
         GL11.glTranslatef(0.8F * var5, -0.75F * var5 - (1.0F - var2) * 0.6F, -0.9F * var5);
         GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
         GL11.glEnable('\u803a');
         var6 = var3.d(var1);
         var7 = eo.a(var6 * var6 * 3.1415927F);
         var8 = eo.a(eo.c(var6) * 3.1415927F);
         GL11.glRotatef(var8 * 70.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var7 * 20.0F, 0.0F, 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.a.n.a(this.a.g.aY, this.a.g.x()));
         GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
         GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glTranslatef(5.6F, 0.0F, 0.0F);
         ak var9 = kx.a.a((kh)this.a.g);
         bu var10 = (bu)var9;
         var8 = 1.0F;
         GL11.glScalef(var8, var8, var8);
         var10.b();
         GL11.glPopMatrix();
      }

      GL11.glDisable('\u803a');
      i.a();
   }

   public void b(float var1) {
      GL11.glDisable(3008);
      int var2;
      if(this.a.g.aT > 0) {
         var2 = this.a.n.a("/terrain.png");
         GL11.glBindTexture(3553, var2);
         this.d(var1);
      }

      if(this.a.g.I()) {
         var2 = eo.b(this.a.g.ak);
         int var3 = eo.b(this.a.g.al);
         int var4 = eo.b(this.a.g.am);
         int var5 = this.a.n.a("/terrain.png");
         GL11.glBindTexture(3553, var5);
         int var6 = this.a.e.a(var2, var3, var4);
         if(ly.n[var6] != null) {
            this.a(var1, ly.n[var6].a(2));
         }
      }

      if(this.a.g.a(gb.f)) {
         var2 = this.a.n.a("/water.png");
         GL11.glBindTexture(3553, var2);
         this.c(var1);
      }

      GL11.glEnable(3008);
   }

   private void a(float var1, int var2) {
      ho var3 = ho.a;
      this.a.g.a(var1);
      float var4 = 0.1F;
      GL11.glColor4f(var4, var4, var4, 0.5F);
      GL11.glPushMatrix();
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = 0.0078125F;
      float var11 = (float)(var2 % 16) / 256.0F - var10;
      float var12 = ((float)(var2 % 16) + 15.99F) / 256.0F + var10;
      float var13 = (float)(var2 / 16) / 256.0F - var10;
      float var14 = ((float)(var2 / 16) + 15.99F) / 256.0F + var10;
      var3.b();
      var3.a((double)var5, (double)var7, (double)var9, (double)var12, (double)var14);
      var3.a((double)var6, (double)var7, (double)var9, (double)var11, (double)var14);
      var3.a((double)var6, (double)var8, (double)var9, (double)var11, (double)var13);
      var3.a((double)var5, (double)var8, (double)var9, (double)var12, (double)var13);
      var3.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void c(float var1) {
      ho var2 = ho.a;
      float var3 = this.a.g.a(var1);
      GL11.glColor4f(var3, var3, var3, 0.5F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glPushMatrix();
      float var4 = 4.0F;
      float var5 = -1.0F;
      float var6 = 1.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -0.5F;
      float var10 = -this.a.g.aq / 64.0F;
      float var11 = this.a.g.ar / 64.0F;
      var2.b();
      var2.a((double)var5, (double)var7, (double)var9, (double)(var4 + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var7, (double)var9, (double)(0.0F + var10), (double)(var4 + var11));
      var2.a((double)var6, (double)var8, (double)var9, (double)(0.0F + var10), (double)(0.0F + var11));
      var2.a((double)var5, (double)var8, (double)var9, (double)(var4 + var10), (double)(0.0F + var11));
      var2.a();
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   private void d(float var1) {
      ho var2 = ho.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      float var3 = 1.0F;

      for(int var4 = 0; var4 < 2; ++var4) {
         GL11.glPushMatrix();
         int var5 = ly.as.bb + var4 * 16;
         int var6 = (var5 & 15) << 4;
         int var7 = var5 & 240;
         float var8 = (float)var6 / 256.0F;
         float var9 = ((float)var6 + 15.99F) / 256.0F;
         float var10 = (float)var7 / 256.0F;
         float var11 = ((float)var7 + 15.99F) / 256.0F;
         float var12 = (0.0F - var3) / 2.0F;
         float var13 = var12 + var3;
         float var14 = 0.0F - var3 / 2.0F;
         float var15 = var14 + var3;
         float var16 = -0.5F;
         GL11.glTranslatef((float)(-(var4 * 2 - 1)) * 0.24F, -0.3F, 0.0F);
         GL11.glRotatef((float)(var4 * 2 - 1) * 10.0F, 0.0F, 1.0F, 0.0F);
         var2.b();
         var2.a((double)var12, (double)var14, (double)var16, (double)var9, (double)var11);
         var2.a((double)var13, (double)var14, (double)var16, (double)var8, (double)var11);
         var2.a((double)var13, (double)var15, (double)var16, (double)var8, (double)var10);
         var2.a((double)var12, (double)var15, (double)var16, (double)var9, (double)var10);
         var2.a();
         GL11.glPopMatrix();
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
   }

   public void a() {
      this.d = this.c;
      bi var1 = this.a.g;
      ev var2 = var1.b.a();
      float var4 = 0.4F;
      float var5 = var2 == this.b?1.0F:0.0F;
      float var6 = var5 - this.c;
      if(var6 < -var4) {
         var6 = -var4;
      }

      if(var6 > var4) {
         var6 = var4;
      }

      this.c += var6;
      if(this.c < 0.1F) {
         this.b = var2;
      }

   }

   public void b() {
      this.c = 0.0F;
   }

   public void c() {
      this.c = 0.0F;
   }
}
