import org.lwjgl.opengl.GL11;

public abstract class ak {

   protected kx a;
   private fo d = new cr();
   private bc e = new bc();
   protected float b = 0.0F;
   protected float c = 1.0F;


   public abstract void a(kh var1, double var2, double var4, double var6, float var8, float var9);

   protected void a(String var1) {
      ey var2 = this.a.e;
      var2.b(var2.a(var1));
   }

   protected void a(String var1, String var2) {
      ey var3 = this.a.e;
      var3.b(var3.a(var1, var2));
   }

   private void a(kh var1, double var2, double var4, double var6, float var8) {
      GL11.glDisable(2896);
      int var9 = ly.as.bb;
      int var10 = (var9 & 15) << 4;
      int var11 = var9 & 240;
      float var12 = (float)var10 / 256.0F;
      float var13 = ((float)var10 + 15.99F) / 256.0F;
      float var14 = (float)var11 / 256.0F;
      float var15 = ((float)var11 + 15.99F) / 256.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2, (float)var4, (float)var6);
      float var16 = var1.aC * 1.4F;
      GL11.glScalef(var16, var16, var16);
      this.a("/terrain.png");
      ho var17 = ho.a;
      float var18 = 1.0F;
      float var19 = 0.5F;
      float var20 = 0.0F;
      float var21 = var1.aD / var1.aC;
      GL11.glRotatef(-this.a.i, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.4F + (float)((int)var21) * 0.02F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var17.b();

      while(var21 > 0.0F) {
         var17.a((double)(var18 - var19), (double)(0.0F - var20), 0.0D, (double)var13, (double)var15);
         var17.a((double)(0.0F - var19), (double)(0.0F - var20), 0.0D, (double)var12, (double)var15);
         var17.a((double)(0.0F - var19), (double)(1.4F - var20), 0.0D, (double)var12, (double)var14);
         var17.a((double)(var18 - var19), (double)(1.4F - var20), 0.0D, (double)var13, (double)var14);
         --var21;
         --var20;
         var18 *= 0.9F;
         GL11.glTranslatef(0.0F, 0.0F, -0.04F);
      }

      var17.a();
      GL11.glPopMatrix();
      GL11.glEnable(2896);
   }

   private void c(kh var1, double var2, double var4, double var6, float var8, float var9) {
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      ey var10 = this.a.e;
      var10.b(var10.a("%%/shadow.png"));
      cn var11 = this.b();
      GL11.glDepthMask(false);
      float var12 = this.b;
      double var13 = var1.aI + (var1.ak - var1.aI) * (double)var9;
      double var15 = var1.aJ + (var1.al - var1.aJ) * (double)var9 + (double)var1.h_();
      double var17 = var1.aK + (var1.am - var1.aK) * (double)var9;
      int var19 = eo.b(var13 - (double)var12);
      int var20 = eo.b(var13 + (double)var12);
      int var21 = eo.b(var15 - (double)var12);
      int var22 = eo.b(var15);
      int var23 = eo.b(var17 - (double)var12);
      int var24 = eo.b(var17 + (double)var12);
      double var25 = var2 - var13;
      double var27 = var4 - var15;
      double var29 = var6 - var17;
      ho var31 = ho.a;
      var31.b();

      for(int var32 = var19; var32 <= var20; ++var32) {
         for(int var33 = var21; var33 <= var22; ++var33) {
            for(int var34 = var23; var34 <= var24; ++var34) {
               int var35 = var11.a(var32, var33 - 1, var34);
               if(var35 > 0 && var11.j(var32, var33, var34) > 3) {
                  this.a(ly.n[var35], var2, var4 + (double)var1.h_(), var6, var32, var33, var34, var8, var12, var25, var27 + (double)var1.h_(), var29);
               }
            }
         }
      }

      var31.a();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glDepthMask(true);
   }

   private cn b() {
      return this.a.g;
   }

   private void a(ly var1, double var2, double var4, double var6, int var8, int var9, int var10, float var11, float var12, double var13, double var15, double var17) {
      ho var19 = ho.a;
      if(var1.c()) {
         double var20 = ((double)var11 - (var4 - ((double)var9 + var15)) / 2.0D) * 0.5D * (double)this.b().c(var8, var9, var10);
         if(var20 >= 0.0D) {
            if(var20 > 1.0D) {
               var20 = 1.0D;
            }

            var19.a(1.0F, 1.0F, 1.0F, (float)var20);
            double var22 = (double)var8 + var1.bf + var13;
            double var24 = (double)var8 + var1.bi + var13;
            double var26 = (double)var9 + var1.bg + var15 + 0.015625D;
            double var28 = (double)var10 + var1.bh + var17;
            double var30 = (double)var10 + var1.bk + var17;
            float var32 = (float)((var2 - var22) / 2.0D / (double)var12 + 0.5D);
            float var33 = (float)((var2 - var24) / 2.0D / (double)var12 + 0.5D);
            float var34 = (float)((var6 - var28) / 2.0D / (double)var12 + 0.5D);
            float var35 = (float)((var6 - var30) / 2.0D / (double)var12 + 0.5D);
            var19.a(var22, var26, var28, (double)var32, (double)var34);
            var19.a(var22, var26, var30, (double)var32, (double)var35);
            var19.a(var24, var26, var30, (double)var33, (double)var35);
            var19.a(var24, var26, var28, (double)var33, (double)var34);
         }
      }
   }

   public static void a(cf var0, double var1, double var3, double var5) {
      GL11.glDisable(3553);
      ho var7 = ho.a;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var7.b();
      var7.b(var1, var3, var5);
      var7.b(0.0F, 0.0F, -1.0F);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(0.0F, 0.0F, 1.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.b(0.0F, -1.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.b, var0.f);
      var7.a(var0.a, var0.b, var0.f);
      var7.b(0.0F, 1.0F, 0.0F);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.a, var0.e, var0.c);
      var7.b(-1.0F, 0.0F, 0.0F);
      var7.a(var0.a, var0.b, var0.f);
      var7.a(var0.a, var0.e, var0.f);
      var7.a(var0.a, var0.e, var0.c);
      var7.a(var0.a, var0.b, var0.c);
      var7.b(1.0F, 0.0F, 0.0F);
      var7.a(var0.d, var0.b, var0.c);
      var7.a(var0.d, var0.e, var0.c);
      var7.a(var0.d, var0.e, var0.f);
      var7.a(var0.d, var0.b, var0.f);
      var7.b(0.0D, 0.0D, 0.0D);
      var7.a();
      GL11.glEnable(3553);
   }

   public static void a(cf var0) {
      ho var1 = ho.a;
      var1.b();
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.f);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.f);
      var1.a(var0.a, var0.e, var0.f);
      var1.a(var0.a, var0.e, var0.c);
      var1.a(var0.a, var0.b, var0.c);
      var1.a(var0.d, var0.b, var0.c);
      var1.a(var0.d, var0.e, var0.c);
      var1.a(var0.d, var0.e, var0.f);
      var1.a(var0.d, var0.b, var0.f);
      var1.a();
   }

   public void a(kx var1) {
      this.a = var1;
   }

   public void b(kh var1, double var2, double var4, double var6, float var8, float var9) {
      if(this.a.k.i && this.b > 0.0F) {
         double var10 = this.a.a(var1.ak, var1.al, var1.am);
         float var12 = (float)((1.0D - var10 / 256.0D) * (double)this.c);
         if(var12 > 0.0F) {
            this.c(var1, var2, var4, var6, var12, var9);
         }
      }

      if(var1.aT > 0) {
         this.a(var1, var2, var4, var6, var9);
      }

   }

   public kd a() {
      return this.a.a();
   }
}
