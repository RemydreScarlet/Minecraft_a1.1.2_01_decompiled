import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;

public class iq {

   private Minecraft h;
   private float i = 0.0F;
   public jh a;
   private int j;
   private kh k = null;
   private long l = System.currentTimeMillis();
   private Random m = new Random();
   volatile int b = 0;
   volatile int c = 0;
   FloatBuffer d = df.d(16);
   float e;
   float f;
   float g;
   private float n;
   private float o;


   public iq(Minecraft var1) {
      this.h = var1;
      this.a = new jh(var1);
   }

   public void a() {
      this.n = this.o;
      float var1 = this.h.e.c(eo.b(this.h.g.ak), eo.b(this.h.g.al), eo.b(this.h.g.am));
      float var2 = (float)(3 - this.h.y.e) / 3.0F;
      float var3 = var1 * (1.0F - var2) + var2;
      this.o += (var3 - this.o) * 0.1F;
      ++this.j;
      this.a.a();
      if(this.h.J) {
         this.c();
      }

   }

   public void a(float var1) {
      if(this.h.g != null) {
         double var2 = (double)this.h.b.b();
         this.h.x = this.h.g.a(var2, var1);
         double var4 = var2;
         aj var6 = this.h.g.e(var1);
         if(this.h.x != null) {
            var4 = this.h.x.f.c(var6);
         }

         if(this.h.b instanceof il) {
            var2 = 32.0D;
            var4 = 32.0D;
         } else {
            if(var4 > 3.0D) {
               var4 = 3.0D;
            }

            var2 = var4;
         }

         aj var7 = this.h.g.f(var1);
         aj var8 = var6.c(var7.a * var2, var7.b * var2, var7.c * var2);
         this.k = null;
         List var9 = this.h.e.b((kh)this.h.g, this.h.g.au.a(var7.a * var2, var7.b * var2, var7.c * var2));
         double var10 = 0.0D;

         for(int var12 = 0; var12 < var9.size(); ++var12) {
            kh var13 = (kh)var9.get(var12);
            if(var13.c_()) {
               float var14 = 0.1F;
               cf var15 = var13.au.b((double)var14, (double)var14, (double)var14);
               mf var16 = var15.a(var6, var8);
               if(var16 != null) {
                  double var17 = var6.c(var16.f);
                  if(var17 < var10 || var10 == 0.0D) {
                     this.k = var13;
                     var10 = var17;
                  }
               }
            }
         }

         if(this.k != null && !(this.h.b instanceof il)) {
            this.h.x = new mf(this.k);
         }

      }
   }

   private float d(float var1) {
      bi var2 = this.h.g;
      float var3 = 70.0F;
      if(var2.a(gb.f)) {
         var3 = 60.0F;
      }

      if(var2.E <= 0) {
         float var4 = (float)var2.J + var1;
         var3 /= (1.0F - 500.0F / (var4 + 500.0F)) * 2.0F + 1.0F;
      }

      return var3;
   }

   private void e(float var1) {
      bi var2 = this.h.g;
      float var3 = (float)var2.G - var1;
      float var4;
      if(var2.E <= 0) {
         var4 = (float)var2.J + var1;
         GL11.glRotatef(40.0F - 8000.0F / (var4 + 200.0F), 0.0F, 0.0F, 1.0F);
      }

      if(var3 >= 0.0F) {
         var3 /= (float)var2.H;
         var3 = eo.a(var3 * var3 * var3 * var3 * 3.1415927F);
         var4 = var2.I;
         GL11.glRotatef(-var4, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(-var3 * 14.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
      }
   }

   private void f(float var1) {
      if(!this.h.y.x) {
         bi var2 = this.h.g;
         float var3 = var2.aF - var2.aE;
         float var4 = var2.aF + var3 * var1;
         float var5 = var2.e + (var2.f - var2.e) * var1;
         float var6 = var2.L + (var2.M - var2.L) * var1;
         GL11.glTranslatef(eo.a(var4 * 3.1415927F) * var5 * 0.5F, -Math.abs(eo.b(var4 * 3.1415927F) * var5), 0.0F);
         GL11.glRotatef(eo.a(var4 * 3.1415927F) * var5 * 3.0F, 0.0F, 0.0F, 1.0F);
         GL11.glRotatef(Math.abs(eo.b(var4 * 3.1415927F + 0.2F) * var5) * 5.0F, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var6, 1.0F, 0.0F, 0.0F);
      }
   }

   private void g(float var1) {
      bi var2 = this.h.g;
      double var3 = var2.ah + (var2.ak - var2.ah) * (double)var1;
      double var5 = var2.ai + (var2.al - var2.ai) * (double)var1;
      double var7 = var2.aj + (var2.am - var2.aj) * (double)var1;
      if(this.h.y.x) {
         double var9 = 4.0D;
         float var11 = var2.aq;
         float var12 = var2.ar;
         double var13 = (double)(-eo.a(var11 / 180.0F * 3.1415927F) * eo.b(var12 / 180.0F * 3.1415927F)) * var9;
         double var15 = (double)(eo.b(var11 / 180.0F * 3.1415927F) * eo.b(var12 / 180.0F * 3.1415927F)) * var9;
         double var17 = (double)(-eo.a(var12 / 180.0F * 3.1415927F)) * var9;

         for(int var19 = 0; var19 < 8; ++var19) {
            float var20 = (float)((var19 & 1) * 2 - 1);
            float var21 = (float)((var19 >> 1 & 1) * 2 - 1);
            float var22 = (float)((var19 >> 2 & 1) * 2 - 1);
            var20 *= 0.1F;
            var21 *= 0.1F;
            var22 *= 0.1F;
            mf var23 = this.h.e.a(aj.b(var3 + (double)var20, var5 + (double)var21, var7 + (double)var22), aj.b(var3 - var13 + (double)var20 + (double)var22, var5 - var17 + (double)var21, var7 - var15 + (double)var22));
            if(var23 != null) {
               double var24 = var23.f.c(aj.b(var3, var5, var7));
               if(var24 < var9) {
                  var9 = var24;
               }
            }
         }

         GL11.glRotatef(var2.ar - var12, 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.aq - var11, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, 0.0F, (float)(-var9));
         GL11.glRotatef(var11 - var2.aq, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var12 - var2.ar, 1.0F, 0.0F, 0.0F);
      } else {
         GL11.glTranslatef(0.0F, 0.0F, -0.1F);
      }

      GL11.glRotatef(var2.at + (var2.ar - var2.at) * var1, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var2.as + (var2.aq - var2.as) * var1 + 180.0F, 0.0F, 1.0F, 0.0F);
   }

   private void a(float var1, int var2) {
      this.i = (float)(256 >> this.h.y.e);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float var3 = 0.07F;
      if(this.h.y.g) {
         GL11.glTranslatef((float)(-(var2 * 2 - 1)) * var3, 0.0F, 0.0F);
      }

      GLU.gluPerspective(this.d(var1), (float)this.h.c / (float)this.h.d, 0.05F, this.i);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if(this.h.y.g) {
         GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      this.e(var1);
      if(this.h.y.f) {
         this.f(var1);
      }

      this.g(var1);
   }

   private void b(float var1, int var2) {
      GL11.glLoadIdentity();
      if(this.h.y.g) {
         GL11.glTranslatef((float)(var2 * 2 - 1) * 0.1F, 0.0F, 0.0F);
      }

      GL11.glPushMatrix();
      this.e(var1);
      if(this.h.y.f) {
         this.f(var1);
      }

      if(!this.h.y.x) {
         this.a.a(var1);
      }

      GL11.glPopMatrix();
      if(!this.h.y.x) {
         this.a.b(var1);
         this.e(var1);
      }

      if(this.h.y.f) {
         this.f(var1);
      }

   }

   public void b(float var1) {
      if(!Display.isActive()) {
         if(System.currentTimeMillis() - this.l > 500L) {
            this.h.g();
         }
      } else {
         this.l = System.currentTimeMillis();
      }

      if(this.h.I) {
         this.h.B.c();
         float var2 = this.h.y.c * 0.6F + 0.2F;
         float var3 = var2 * var2 * var2 * 8.0F;
         float var4 = (float)this.h.B.a * var3;
         float var5 = (float)this.h.B.b * var3;
         byte var6 = 1;
         if(this.h.y.d) {
            var6 = -1;
         }

         this.h.g.d(var4, var5 * (float)var6);
      }

      if(!this.h.v) {
         iy var7 = new iy(this.h.c, this.h.d);
         int var8 = var7.a();
         int var9 = var7.b();
         int var10 = Mouse.getX() * var8 / this.h.c;
         int var11 = var9 - Mouse.getY() * var9 / this.h.d - 1;
         if(this.h.e != null) {
            this.c(var1);
            this.h.u.a(var1, this.h.p != null, var10, var11);
         } else {
            GL11.glViewport(0, 0, this.h.c, this.h.d);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16640);
            GL11.glMatrixMode(5889);
            GL11.glLoadIdentity();
            GL11.glMatrixMode(5888);
            GL11.glLoadIdentity();
            this.b();
         }

         if(this.h.p != null) {
            GL11.glClear(256);
            this.h.p.a(var10, var11, var1);
         }

      }
   }

   public void c(float var1) {
      this.a(var1);
      bi var2 = this.h.g;
      e var3 = this.h.f;
      bq var4 = this.h.h;
      double var5 = var2.aI + (var2.ak - var2.aI) * (double)var1;
      double var7 = var2.aJ + (var2.al - var2.aJ) * (double)var1;
      double var9 = var2.aK + (var2.am - var2.aK) * (double)var1;

      for(int var11 = 0; var11 < 2; ++var11) {
         if(this.h.y.g) {
            if(var11 == 0) {
               GL11.glColorMask(false, true, true, false);
            } else {
               GL11.glColorMask(true, false, false, false);
            }
         }

         GL11.glViewport(0, 0, this.h.c, this.h.d);
         this.i(var1);
         GL11.glClear(16640);
         GL11.glEnable(2884);
         this.a(var1, var11);
         j.a();
         if(this.h.y.e < 2) {
            this.a(-1);
            var3.a(var1);
         }

         GL11.glEnable(2912);
         this.a(1);
         kl var12 = new kl();
         var12.a(var5, var7, var9);
         this.h.f.a(var12, var1);
         this.h.f.a(var2, false);
         this.a(0);
         GL11.glEnable(2912);
         GL11.glBindTexture(3553, this.h.n.a("/terrain.png"));
         i.a();
         var3.a(var2, 0, (double)var1);
         i.b();
         var3.a(var2.e(var1), var12, var1);
         var4.b(var2, var1);
         i.a();
         this.a(0);
         var4.a(var2, var1);
         if(this.h.x != null && var2.a(gb.f)) {
            GL11.glDisable(3008);
            var3.a(var2, this.h.x, 0, var2.b.a(), var1);
            var3.b(var2, this.h.x, 0, var2.b.a(), var1);
            GL11.glEnable(3008);
         }

         GL11.glBlendFunc(770, 771);
         this.a(0);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         GL11.glBindTexture(3553, this.h.n.a("/terrain.png"));
         if(this.h.y.i) {
            GL11.glColorMask(false, false, false, false);
            int var13 = var3.a(var2, 1, (double)var1);
            GL11.glColorMask(true, true, true, true);
            if(this.h.y.g) {
               if(var11 == 0) {
                  GL11.glColorMask(false, true, true, false);
               } else {
                  GL11.glColorMask(true, false, false, false);
               }
            }

            if(var13 > 0) {
               var3.a(1, (double)var1);
            }
         } else {
            var3.a(var2, 1, (double)var1);
         }

         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         GL11.glDisable(3042);
         if(this.h.x != null && !var2.a(gb.f)) {
            GL11.glDisable(3008);
            var3.a(var2, this.h.x, 0, var2.b.a(), var1);
            var3.b(var2, this.h.x, 0, var2.b.a(), var1);
            GL11.glEnable(3008);
         }

         GL11.glDisable(2912);
         if(this.h.e.d) {
            this.h(var1);
         }

         if(this.k != null) {
            ;
         }

         this.a(0);
         GL11.glEnable(2912);
         var3.b(var1);
         GL11.glDisable(2912);
         this.a(1);
         GL11.glClear(256);
         this.b(var1, var11);
         if(!this.h.y.g) {
            return;
         }
      }

      GL11.glColorMask(true, true, true, false);
   }

   private void c() {
      if(this.h.y.i) {
         bi var1 = this.h.g;
         cn var2 = this.h.e;
         int var3 = eo.b(var1.ak);
         int var4 = eo.b(var1.al);
         int var5 = eo.b(var1.am);
         byte var6 = 16;

         for(int var7 = 0; var7 < 150; ++var7) {
            int var8 = var3 + this.m.nextInt(var6) - this.m.nextInt(var6);
            int var9 = var5 + this.m.nextInt(var6) - this.m.nextInt(var6);
            int var10 = var2.e(var8, var9);
            int var11 = var2.a(var8, var10 - 1, var9);
            if(var10 <= var4 + var6 && var10 >= var4 - var6) {
               float var12 = this.m.nextFloat();
               float var13 = this.m.nextFloat();
               if(var11 > 0) {
                  this.h.h.a((nq)(new nf(var2, (double)((float)var8 + var12), (double)((float)var10 + 0.1F) - ly.n[var11].bg, (double)((float)var9 + var13))));
               }
            }
         }

      }
   }

   private void h(float var1) {
      bi var2 = this.h.g;
      cn var3 = this.h.e;
      int var4 = eo.b(var2.ak);
      int var5 = eo.b(var2.al);
      int var6 = eo.b(var2.am);
      ho var7 = ho.a;
      GL11.glDisable(2884);
      GL11.glNormal3f(0.0F, 1.0F, 0.0F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glBindTexture(3553, this.h.n.a("/snow.png"));
      double var8 = var2.aI + (var2.ak - var2.aI) * (double)var1;
      double var10 = var2.aJ + (var2.al - var2.aJ) * (double)var1;
      double var12 = var2.aK + (var2.am - var2.aK) * (double)var1;
      byte var14 = 5;
      if(this.h.y.i) {
         var14 = 10;
      }

      for(int var15 = var4 - var14; var15 <= var4 + var14; ++var15) {
         for(int var16 = var6 - var14; var16 <= var6 + var14; ++var16) {
            int var17 = var3.d(var15, var16);
            if(var17 < 0) {
               var17 = 0;
            }

            int var18 = var5 - var14;
            int var19 = var5 + var14;
            if(var18 < var17) {
               var18 = var17;
            }

            if(var19 < var17) {
               var19 = var17;
            }

            float var20 = 2.0F;
            if(var18 != var19) {
               this.m.setSeed((long)(var15 * var15 * 3121 + var15 * 45238971 + var16 * var16 * 418711 + var16 * 13761));
               float var21 = (float)this.j + var1;
               float var22 = ((float)(this.j & 511) + var1) / 512.0F;
               float var23 = this.m.nextFloat() + var21 * 0.01F * (float)this.m.nextGaussian();
               float var24 = this.m.nextFloat() + var21 * (float)this.m.nextGaussian() * 0.001F;
               double var25 = (double)((float)var15 + 0.5F) - var2.ak;
               double var27 = (double)((float)var16 + 0.5F) - var2.am;
               float var29 = eo.a(var25 * var25 + var27 * var27) / (float)var14;
               var7.b();
               float var30 = var3.c(var15, 128, var16);
               GL11.glColor4f(var30, var30, var30, (1.0F - var29 * var29) * 0.7F);
               var7.b(-var8 * 1.0D, -var10 * 1.0D, -var12 * 1.0D);
               var7.a((double)(var15 + 0), (double)var18, (double)(var16 + 0), (double)(0.0F * var20 + var23), (double)((float)var18 * var20 / 8.0F + var22 * var20 + var24));
               var7.a((double)(var15 + 1), (double)var18, (double)(var16 + 1), (double)(1.0F * var20 + var23), (double)((float)var18 * var20 / 8.0F + var22 * var20 + var24));
               var7.a((double)(var15 + 1), (double)var19, (double)(var16 + 1), (double)(1.0F * var20 + var23), (double)((float)var19 * var20 / 8.0F + var22 * var20 + var24));
               var7.a((double)(var15 + 0), (double)var19, (double)(var16 + 0), (double)(0.0F * var20 + var23), (double)((float)var19 * var20 / 8.0F + var22 * var20 + var24));
               var7.a((double)(var15 + 0), (double)var18, (double)(var16 + 1), (double)(0.0F * var20 + var23), (double)((float)var18 * var20 / 8.0F + var22 * var20 + var24));
               var7.a((double)(var15 + 1), (double)var18, (double)(var16 + 0), (double)(1.0F * var20 + var23), (double)((float)var18 * var20 / 8.0F + var22 * var20 + var24));
               var7.a((double)(var15 + 1), (double)var19, (double)(var16 + 0), (double)(1.0F * var20 + var23), (double)((float)var19 * var20 / 8.0F + var22 * var20 + var24));
               var7.a((double)(var15 + 0), (double)var19, (double)(var16 + 1), (double)(0.0F * var20 + var23), (double)((float)var19 * var20 / 8.0F + var22 * var20 + var24));
               var7.b(0.0D, 0.0D, 0.0D);
               var7.a();
            }
         }
      }

      GL11.glEnable(2884);
      GL11.glDisable(3042);
   }

   public void b() {
      iy var1 = new iy(this.h.c, this.h.d);
      int var2 = var1.a();
      int var3 = var1.b();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)var2, (double)var3, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   private void i(float var1) {
      cn var2 = this.h.e;
      bi var3 = this.h.g;
      float var4 = 1.0F / (float)(4 - this.h.y.e);
      var4 = 1.0F - (float)Math.pow((double)var4, 0.25D);
      aj var5 = var2.b(var1);
      float var6 = (float)var5.a;
      float var7 = (float)var5.b;
      float var8 = (float)var5.c;
      aj var9 = var2.e(var1);
      this.e = (float)var9.a;
      this.f = (float)var9.b;
      this.g = (float)var9.c;
      this.e += (var6 - this.e) * var4;
      this.f += (var7 - this.f) * var4;
      this.g += (var8 - this.g) * var4;
      if(var3.a(gb.f)) {
         this.e = 0.02F;
         this.f = 0.02F;
         this.g = 0.2F;
      } else if(var3.a(gb.g)) {
         this.e = 0.6F;
         this.f = 0.1F;
         this.g = 0.0F;
      }

      float var10 = this.n + (this.o - this.n) * var1;
      this.e *= var10;
      this.f *= var10;
      this.g *= var10;
      if(this.h.y.g) {
         float var11 = (this.e * 30.0F + this.f * 59.0F + this.g * 11.0F) / 100.0F;
         float var12 = (this.e * 30.0F + this.f * 70.0F) / 100.0F;
         float var13 = (this.e * 30.0F + this.g * 70.0F) / 100.0F;
         this.e = var11;
         this.f = var12;
         this.g = var13;
      }

      GL11.glClearColor(this.e, this.f, this.g, 0.0F);
   }

   private void a(int var1) {
      bi var2 = this.h.g;
      GL11.glFog(2918, this.a(this.e, this.f, this.g, 1.0F));
      GL11.glNormal3f(0.0F, -1.0F, 0.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3;
      float var4;
      float var5;
      float var6;
      float var7;
      float var8;
      if(var2.a(gb.f)) {
         GL11.glFogi(2917, 2048);
         GL11.glFogf(2914, 0.1F);
         var3 = 0.4F;
         var4 = 0.4F;
         var5 = 0.9F;
         if(this.h.y.g) {
            var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
            var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
         }
      } else if(var2.a(gb.g)) {
         GL11.glFogi(2917, 2048);
         GL11.glFogf(2914, 2.0F);
         var3 = 0.4F;
         var4 = 0.3F;
         var5 = 0.3F;
         if(this.h.y.g) {
            var6 = (var3 * 30.0F + var4 * 59.0F + var5 * 11.0F) / 100.0F;
            var7 = (var3 * 30.0F + var4 * 70.0F) / 100.0F;
            var8 = (var3 * 30.0F + var5 * 70.0F) / 100.0F;
         }
      } else {
         GL11.glFogi(2917, 9729);
         GL11.glFogf(2915, this.i * 0.25F);
         GL11.glFogf(2916, this.i);
         if(var1 < 0) {
            GL11.glFogf(2915, 0.0F);
            GL11.glFogf(2916, this.i * 0.8F);
         }

         if(GLContext.getCapabilities().GL_NV_fog_distance) {
            GL11.glFogi('\u855a', '\u855b');
         }
      }

      GL11.glEnable(2903);
      GL11.glColorMaterial(1028, 4608);
   }

   private FloatBuffer a(float var1, float var2, float var3, float var4) {
      this.d.clear();
      this.d.put(var1).put(var2).put(var3).put(var4);
      this.d.flip();
      return this.d;
   }
}
