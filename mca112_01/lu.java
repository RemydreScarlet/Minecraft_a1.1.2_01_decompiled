import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class lu extends lm {

   private static ab d = new ab();
   private List e = new ArrayList();
   private Random f = new Random();
   private Minecraft g;
   public String a = null;
   private int h = 0;
   private String i = "";
   private int j = 0;
   public float b;
   float c = 1.0F;


   public lu(Minecraft var1) {
      this.g = var1;
   }

   public void a(float var1, boolean var2, int var3, int var4) {
      iy var5 = new iy(this.g.c, this.g.d);
      int var6 = var5.a();
      int var7 = var5.b();
      kd var8 = this.g.o;
      this.g.r.b();
      GL11.glEnable(3042);
      if(this.g.y.i) {
         this.a(this.g.g.a(var1), var6, var7);
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBindTexture(3553, this.g.n.a("/gui/gui.png"));
      eu var9 = this.g.g.b;
      this.k = -90.0F;
      this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
      this.b(var6 / 2 - 91 - 1 + var9.d * 20, var7 - 22 - 1, 0, 22, 24, 22);
      GL11.glBindTexture(3553, this.g.n.a("/gui/icons.png"));
      GL11.glEnable(3042);
      GL11.glBlendFunc(775, 769);
      this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
      GL11.glDisable(3042);
      boolean var10 = this.g.g.aW / 3 % 2 == 1;
      if(this.g.g.aW < 10) {
         var10 = false;
      }

      int var11 = this.g.g.E;
      int var12 = this.g.g.F;
      this.f.setSeed((long)(this.h * 312871));
      int var13;
      int var14;
      int var15;
      if(this.g.b.d()) {
         var13 = this.g.g.m();

         int var16;
         for(var14 = 0; var14 < 10; ++var14) {
            var15 = var7 - 32;
            if(var13 > 0) {
               var16 = var6 / 2 + 91 - var14 * 8 - 9;
               if(var14 * 2 + 1 < var13) {
                  this.b(var16, var15, 34, 9, 9, 9);
               }

               if(var14 * 2 + 1 == var13) {
                  this.b(var16, var15, 25, 9, 9, 9);
               }

               if(var14 * 2 + 1 > var13) {
                  this.b(var16, var15, 16, 9, 9, 9);
               }
            }

            byte var27 = 0;
            if(var10) {
               var27 = 1;
            }

            int var17 = var6 / 2 - 91 + var14 * 8;
            if(var11 <= 4) {
               var15 += this.f.nextInt(2);
            }

            this.b(var17, var15, 16 + var27 * 9, 0, 9, 9);
            if(var10) {
               if(var14 * 2 + 1 < var12) {
                  this.b(var17, var15, 70, 0, 9, 9);
               }

               if(var14 * 2 + 1 == var12) {
                  this.b(var17, var15, 79, 0, 9, 9);
               }
            }

            if(var14 * 2 + 1 < var11) {
               this.b(var17, var15, 52, 0, 9, 9);
            }

            if(var14 * 2 + 1 == var11) {
               this.b(var17, var15, 61, 0, 9, 9);
            }
         }

         if(this.g.g.a(gb.f)) {
            var14 = (int)Math.ceil((double)(this.g.g.aX - 2) * 10.0D / 300.0D);
            var15 = (int)Math.ceil((double)this.g.g.aX * 10.0D / 300.0D) - var14;

            for(var16 = 0; var16 < var14 + var15; ++var16) {
               if(var16 < var14) {
                  this.b(var6 / 2 - 91 + var16 * 8, var7 - 32 - 9, 16, 18, 9, 9);
               } else {
                  this.b(var6 / 2 - 91 + var16 * 8, var7 - 32 - 9, 25, 18, 9, 9);
               }
            }
         }
      }

      GL11.glDisable(3042);
      GL11.glEnable('\u803a');
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      i.b();
      GL11.glPopMatrix();

      for(var13 = 0; var13 < 9; ++var13) {
         var14 = var6 / 2 - 90 + var13 * 20 + 2;
         var15 = var7 - 16 - 3;
         this.a(var13, var14, var15, var1);
      }

      i.a();
      GL11.glDisable('\u803a');
      String var21;
      if(Keyboard.isKeyDown(61)) {
         var8.a("Minecraft Alpha v1.1.2_01 (" + this.g.G + ")", 2, 2, 16777215);
         var8.a(this.g.l(), 2, 12, 16777215);
         var8.a(this.g.m(), 2, 22, 16777215);
         var8.a(this.g.n(), 2, 32, 16777215);
         long var22 = Runtime.getRuntime().maxMemory();
         long var26 = Runtime.getRuntime().totalMemory();
         long var29 = Runtime.getRuntime().freeMemory();
         long var19 = var26 - var29;
         var21 = "Used memory: " + var19 * 100L / var22 + "% (" + var19 / 1024L / 1024L + "MB) of " + var22 / 1024L / 1024L + "MB";
         this.b(var8, var21, var6 - var8.a(var21) - 2, 2, 14737632);
         var21 = "Allocated memory: " + var26 * 100L / var22 + "% (" + var26 / 1024L / 1024L + "MB)";
         this.b(var8, var21, var6 - var8.a(var21) - 2, 12, 14737632);
      } else {
         var8.a("Minecraft Alpha v1.1.2_01", 2, 2, 16777215);
      }

      if(this.j > 0) {
         float var23 = (float)this.j - var1;
         var14 = (int)(var23 * 256.0F / 20.0F);
         if(var14 > 255) {
            var14 = 255;
         }

         if(var14 > 0) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            var15 = Color.HSBtoRGB(var23 / 50.0F, 0.7F, 0.6F) & 16777215;
            var8.b(this.i, -var8.a(this.i) / 2, -4, var15 + (var14 << 24));
            GL11.glDisable(3042);
            GL11.glPopMatrix();
         }
      }

      byte var24 = 10;
      boolean var25 = false;
      if(this.g.p instanceof de) {
         var24 = 20;
         var25 = true;
      }

      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3008);
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);

      for(var15 = 0; var15 < this.e.size() && var15 < var24; ++var15) {
         if(((ko)this.e.get(var15)).b < 200 || var25) {
            double var28 = (double)((ko)this.e.get(var15)).b / 200.0D;
            var28 = 1.0D - var28;
            var28 *= 10.0D;
            if(var28 < 0.0D) {
               var28 = 0.0D;
            }

            if(var28 > 1.0D) {
               var28 = 1.0D;
            }

            var28 *= var28;
            int var18 = (int)(255.0D * var28);
            if(var25) {
               var18 = 255;
            }

            if(var18 > 0) {
               byte var30 = 2;
               int var20 = -var15 * 9;
               var21 = ((ko)this.e.get(var15)).a;
               this.a(var30, var20 - 1, var30 + 320, var20 + 8, var18 / 2 << 24);
               GL11.glEnable(3042);
               var8.a(var21, var30, var20, 16777215 + (var18 << 24));
            }
         }
      }

      GL11.glPopMatrix();
      GL11.glEnable(3008);
      GL11.glDisable(3042);
   }

   private void a(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      if(var1 < 0.0F) {
         var1 = 0.0F;
      }

      if(var1 > 1.0F) {
         var1 = 1.0F;
      }

      this.c = (float)((double)this.c + (double)(var1 - this.c) * 0.01D);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glBlendFunc(0, 769);
      GL11.glColor4f(this.c, this.c, this.c, 1.0F);
      GL11.glBindTexture(3553, this.g.n.a("/misc/vignette.png"));
      ho var4 = ho.a;
      var4.b();
      var4.a(0.0D, (double)var3, -90.0D, 0.0D, 1.0D);
      var4.a((double)var2, (double)var3, -90.0D, 1.0D, 1.0D);
      var4.a((double)var2, 0.0D, -90.0D, 1.0D, 0.0D);
      var4.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var4.a();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glBlendFunc(770, 771);
   }

   private void a(int var1, int var2, int var3, float var4) {
      ev var5 = this.g.g.b.a[var1];
      if(var5 != null) {
         float var6 = (float)var5.b - var4;
         if(var6 > 0.0F) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
         }

         d.a(this.g.o, this.g.n, var5, var2, var3);
         if(var6 > 0.0F) {
            GL11.glPopMatrix();
         }

         d.b(this.g.o, this.g.n, var5, var2, var3);
      }
   }

   public void a() {
      if(this.j > 0) {
         --this.j;
      }

      ++this.h;

      for(int var1 = 0; var1 < this.e.size(); ++var1) {
         ++((ko)this.e.get(var1)).b;
      }

   }

   public void a(String var1) {
      while(this.g.o.a(var1) > 320) {
         int var2;
         for(var2 = 1; var2 < var1.length() && this.g.o.a(var1.substring(0, var2 + 1)) <= 320; ++var2) {
            ;
         }

         this.a(var1.substring(0, var2));
         var1 = var1.substring(var2);
      }

      this.e.add(0, new ko(var1));

      while(this.e.size() > 50) {
         this.e.remove(this.e.size() - 1);
      }

   }

   public void b(String var1) {
      this.i = "Now playing: " + var1;
      this.j = 60;
   }

}
