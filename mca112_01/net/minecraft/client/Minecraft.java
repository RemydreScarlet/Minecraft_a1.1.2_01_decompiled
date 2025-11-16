package net.minecraft.client;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.File;
import net.minecraft.client.MinecraftApplet;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public abstract class Minecraft implements Runnable {

   public hq b;
   private boolean a = false;
   public int c;
   public int d;
   private be L;
   private ir M = new ir(20.0F);
   public cn e;
   public e f;
   public bi g;
   public bq h;
   public dl i = null;
   public String j;
   public Canvas k;
   public boolean l = true;
   public volatile boolean m = false;
   public ey n;
   public kd o;
   public bh p = null;
   public gr q = new gr(this);
   public iq r = new iq(this);
   private bf N;
   private int O = 0;
   private int P = 0;
   private int Q;
   private int R;
   public String s = null;
   public int t = 0;
   public lu u;
   public boolean v = false;
   public cr w = new cr(0.0F);
   public mf x = null;
   public fr y;
   protected MinecraftApplet z;
   public of A = new of();
   public mp B;
   public File C;
   public static long[] D = new long[512];
   public static int E = 0;
   private String S;
   private int T;
   private ml U = new ml();
   private at V = new at();
   private static File W = null;
   public volatile boolean F = true;
   public String G = "";
   long H = -1L;
   public boolean I = false;
   private int X = 0;
   public boolean J = false;
   long K = System.currentTimeMillis();
   private int Y = 0;


   public Minecraft(Component var1, Canvas var2, MinecraftApplet var3, int var4, int var5, boolean var6) {
      this.Q = var4;
      this.R = var5;
      this.a = var6;
      this.z = var3;
      new fl(this, "Timer hack thread");
      this.k = var2;
      this.c = var4;
      this.d = var5;
      this.a = var6;
   }

   public abstract void a(go var1);

   public void a(String var1, int var2) {
      this.S = var1;
      this.T = var2;
   }

   public void a() {
      if(this.k != null) {
         Graphics var1 = this.k.getGraphics();
         if(var1 != null) {
            var1.setColor(Color.BLACK);
            var1.fillRect(0, 0, this.c, this.d);
            var1.dispose();
         }

         Display.setParent(this.k);
      } else if(this.a) {
         Display.setFullscreen(true);
         this.c = Display.getDisplayMode().getWidth();
         this.d = Display.getDisplayMode().getHeight();
         if(this.c <= 0) {
            this.c = 1;
         }

         if(this.d <= 0) {
            this.d = 1;
         }
      } else {
         Display.setDisplayMode(new DisplayMode(this.c, this.d));
      }

      Display.setTitle("Minecraft Minecraft Alpha v1.1.2_01");

      try {
         Display.create();
      } catch (LWJGLException var6) {
         var6.printStackTrace();

         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var5) {
            ;
         }

         Display.create();
      }

      kx.a.f = new jh(this);
      this.C = b();
      this.y = new fr(this, this.C);
      this.n = new ey(this.y);
      this.o = new kd(this.y, "/default.png", this.n);
      this.p();
      Keyboard.create();
      Mouse.create();
      this.B = new mp(this.k);

      try {
         Controllers.create();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

      this.c("Pre startup");
      GL11.glEnable(3553);
      GL11.glShadeModel(7425);
      GL11.glClearDepth(1.0D);
      GL11.glEnable(2929);
      GL11.glDepthFunc(515);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glCullFace(1029);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      this.c("Startup");
      this.L = new be();
      this.A.a(this.y);
      this.n.a((z)this.V);
      this.n.a((z)this.U);
      this.n.a((z)(new aa(this)));
      this.n.a((z)(new ht()));
      this.n.a((z)(new eg()));
      this.n.a((z)(new jz(0)));
      this.n.a((z)(new jz(1)));
      this.f = new e(this, this.n);
      GL11.glViewport(0, 0, this.c, this.d);
      this.h = new bq(this.e, this.n);

      try {
         this.N = new bf(this.C, this);
         this.N.start();
      } catch (Exception var3) {
         ;
      }

      this.c("Post startup");
      this.u = new lu(this);
      if(this.S != null) {
         this.a((bh)(new mn(this, this.S, this.T)));
      } else {
         this.a((bh)(new cx()));
      }

   }

   private void p() {
      iy var1 = new iy(this.c, this.d);
      int var2 = var1.a();
      int var3 = var1.b();
      GL11.glClear(16640);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)var2, (double)var3, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glViewport(0, 0, this.c, this.d);
      GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      ho var4 = ho.a;
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glDisable(2912);
      GL11.glBindTexture(3553, this.n.a("/title/mojang.png"));
      var4.b();
      var4.b(16777215);
      var4.a(0.0D, (double)this.d, 0.0D, 0.0D, 0.0D);
      var4.a((double)this.c, (double)this.d, 0.0D, 0.0D, 0.0D);
      var4.a((double)this.c, 0.0D, 0.0D, 0.0D, 0.0D);
      var4.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      var4.a();
      short var5 = 256;
      short var6 = 256;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4.b(16777215);
      this.a((this.c / 2 - var5) / 2, (this.d / 2 - var6) / 2, 0, 0, var5, var6);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      Display.swapBuffers();
   }

   public void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      ho var9 = ho.a;
      var9.b();
      var9.a((double)(var1 + 0), (double)(var2 + var6), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + var6), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.a((double)(var1 + var5), (double)(var2 + 0), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.a((double)(var1 + 0), (double)(var2 + 0), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.a();
   }

   public static File b() {
      if(W == null) {
         W = a("minecraft");
      }

      return W;
   }

   public static File a(String var0) {
      String var1 = System.getProperty("user.home", ".");
      File var2;
      switch(fq.a[q().ordinal()]) {
      case 1:
      case 2:
         var2 = new File(var1, '.' + var0 + '/');
         break;
      case 3:
         String var3 = System.getenv("APPDATA");
         if(var3 != null) {
            var2 = new File(var3, "." + var0 + '/');
         } else {
            var2 = new File(var1, '.' + var0 + '/');
         }
         break;
      case 4:
         var2 = new File(var1, "Library/Application Support/" + var0);
         break;
      default:
         var2 = new File(var1, var0 + '/');
      }

      if(!var2.exists() && !var2.mkdirs()) {
         throw new RuntimeException("The working directory could not be created: " + var2);
      } else {
         return var2;
      }
   }

   private static ih q() {
      String var0 = System.getProperty("os.name").toLowerCase();
      return var0.contains("win")?ih.c:(var0.contains("mac")?ih.d:(var0.contains("solaris")?ih.b:(var0.contains("sunos")?ih.b:(var0.contains("linux")?ih.a:(var0.contains("unix")?ih.a:ih.e)))));
   }

   public void a(bh var1) {
      if(!(this.p instanceof as)) {
         if(this.p != null) {
            this.p.h();
         }

         if(var1 == null && this.e == null) {
            var1 = new cx();
         } else if(var1 == null && this.g.E <= 0) {
            var1 = new au();
         }

         this.p = (bh)var1;
         if(var1 != null) {
            this.f();
            iy var2 = new iy(this.c, this.d);
            int var3 = var2.a();
            int var4 = var2.b();
            ((bh)var1).a(this, var3, var4);
            this.v = false;
         } else {
            this.e();
         }

      }
   }

   private void c(String var1) {
      int var2 = GL11.glGetError();
      if(var2 != 0) {
         String var3 = GLU.gluErrorString(var2);
         System.out.println("########## GL ERROR ##########");
         System.out.println("@ " + var1);
         System.out.println(var2 + ": " + var3);
         System.exit(0);
      }

   }

   public void c() {
      if(this.z != null) {
         this.z.c();
      }

      try {
         if(this.N != null) {
            this.N.b();
         }
      } catch (Exception var8) {
         ;
      }

      try {
         System.out.println("Stopping!");
         this.a((cn)null);

         try {
            df.a();
         } catch (Exception var6) {
            ;
         }

         this.A.b();
         Mouse.destroy();
         Keyboard.destroy();
      } finally {
         Display.destroy();
      }

      System.gc();
   }

   public void run() {
      this.F = true;

      try {
         this.a();
      } catch (Exception var13) {
         var13.printStackTrace();
         this.a(new go("Failed to start game", var13));
         return;
      }

      try {
         try {
            long var1 = System.currentTimeMillis();
            int var3 = 0;

            while(this.F && (this.z == null || this.z.isActive())) {
               cf.a();
               aj.a();
               if(this.k == null && Display.isCloseRequested()) {
                  this.d();
               }

               if(this.m && this.e != null) {
                  float var4 = this.M.c;
                  this.M.a();
                  this.M.c = var4;
               } else {
                  this.M.a();
               }

               for(int var17 = 0; var17 < this.M.b; ++var17) {
                  ++this.O;

                  try {
                     this.i();
                  } catch (lx var12) {
                     this.e = null;
                     this.a((cn)null);
                     this.a((bh)(new iv()));
                  }
               }

               this.c("Pre render");
               this.A.a(this.g, this.M.c);
               GL11.glEnable(3553);
               if(this.e != null) {
                  while(true) {
                     if(this.e.e()) {
                        continue;
                     }
                  }
               }

               if(!this.v) {
                  if(this.b != null) {
                     this.b.a(this.M.c);
                  }

                  this.r.b(this.M.c);
               }

               if(!Display.isActive()) {
                  if(this.a) {
                     this.h();
                  }

                  Thread.sleep(10L);
               }

               if(Keyboard.isKeyDown(64)) {
                  this.r();
               } else {
                  this.H = System.nanoTime();
               }

               Thread.yield();
               Display.update();
               if(this.k != null && !this.a && (this.k.getWidth() != this.c || this.k.getHeight() != this.d)) {
                  this.c = this.k.getWidth();
                  this.d = this.k.getHeight();
                  if(this.c <= 0) {
                     this.c = 1;
                  }

                  if(this.d <= 0) {
                     this.d = 1;
                  }

                  this.a(this.c, this.d);
               }

               if(this.y.h) {
                  Thread.sleep(5L);
               }

               this.c("Post render");
               ++var3;

               for(this.m = !this.j() && this.p != null && this.p.b(); System.currentTimeMillis() >= var1 + 1000L; var3 = 0) {
                  this.G = var3 + " fps, " + bn.b + " chunk updates";
                  bn.b = 0;
                  var1 += 1000L;
               }
            }
         } catch (nr var14) {
            ;
         } catch (Throwable var15) {
            this.e = null;
            var15.printStackTrace();
            this.a(new go("Unexpected error", var15));
         }

      } finally {
         ;
      }
   }

   private void r() {
      if(this.H == -1L) {
         this.H = System.nanoTime();
      }

      long var1 = System.nanoTime();
      D[E++ & D.length - 1] = var1 - this.H;
      this.H = var1;
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.c, (double)this.d, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      ho var3 = ho.a;
      var3.a(7);
      var3.b(538968064);
      var3.a(0.0D, (double)(this.d - 100), 0.0D);
      var3.a(0.0D, (double)this.d, 0.0D);
      var3.a((double)D.length, (double)this.d, 0.0D);
      var3.a((double)D.length, (double)(this.d - 100), 0.0D);
      var3.a();
      long var4 = 0L;

      int var6;
      for(var6 = 0; var6 < D.length; ++var6) {
         var4 += D[var6];
      }

      var6 = (int)(var4 / 200000L / (long)D.length);
      var3.a(7);
      var3.b(541065216);
      var3.a(0.0D, (double)(this.d - var6), 0.0D);
      var3.a(0.0D, (double)this.d, 0.0D);
      var3.a((double)D.length, (double)this.d, 0.0D);
      var3.a((double)D.length, (double)(this.d - var6), 0.0D);
      var3.a();
      var3.a(1);

      for(int var7 = 0; var7 < D.length; ++var7) {
         int var8 = (var7 - E & D.length - 1) * 255 / D.length;
         int var9 = var8 * var8 / 255;
         var9 = var9 * var9 / 255;
         int var10 = var9 * var9 / 255;
         var10 = var10 * var10 / 255;
         var3.b(-16777216 + var10 + var9 * 256 + var8 * 65536);
         long var11 = D[var7] / 200000L;
         var3.a((double)((float)var7 + 0.5F), (double)((float)((long)this.d - var11) + 0.5F), 0.0D);
         var3.a((double)((float)var7 + 0.5F), (double)((float)this.d + 0.5F), 0.0D);
      }

      var3.a();
      GL11.glEnable(3553);
   }

   public void d() {
      this.F = false;
   }

   public void e() {
      if(Display.isActive()) {
         if(!this.I) {
            this.I = true;
            this.B.a();
            this.a((bh)null);
            this.X = this.O + 10000;
         }
      }
   }

   public void f() {
      if(this.I) {
         if(this.g != null) {
            this.g.k();
         }

         this.I = false;
         this.B.b();
      }
   }

   public void g() {
      if(this.p == null) {
         this.a((bh)(new ie()));
      }
   }

   private void a(int var1, boolean var2) {
      if(!this.b.b) {
         if(var1 != 0 || this.P <= 0) {
            if(var2 && this.x != null && this.x.a == 0 && var1 == 0) {
               int var3 = this.x.b;
               int var4 = this.x.c;
               int var5 = this.x.d;
               this.b.c(var3, var4, var5, this.x.e);
               this.h.a(var3, var4, var5, this.x.e);
            } else {
               this.b.a();
            }

         }
      }
   }

   private void a(int var1) {
      if(var1 != 0 || this.P <= 0) {
         if(var1 == 0) {
            this.g.w();
         }

         int var3;
         if(this.x == null) {
            if(var1 == 0 && !(this.b instanceof il)) {
               this.P = 10;
            }
         } else if(this.x.a == 1) {
            if(var1 == 0) {
               this.g.a(this.x.g);
            }

            if(var1 == 1) {
               this.g.a_(this.x.g);
            }
         } else if(this.x.a == 0) {
            int var2 = this.x.b;
            var3 = this.x.c;
            int var4 = this.x.d;
            int var5 = this.x.e;
            ly var6 = ly.n[this.e.a(var2, var3, var4)];
            if(var1 == 0) {
               this.e.i(var2, var3, var4, this.x.e);
               if(var6 != ly.A || this.g.c >= 100) {
                  this.b.a(var2, var3, var4, this.x.e);
               }
            } else {
               ev var7 = this.g.b.a();
               int var8 = var7 != null?var7.a:0;
               if(this.b.a(this.g, this.e, var7, var2, var3, var4, var5)) {
                  this.g.w();
               }

               if(var7 == null) {
                  return;
               }

               if(var7.a == 0) {
                  this.g.b.a[this.g.b.d] = null;
               } else if(var7.a != var8) {
                  this.r.a.b();
               }
            }
         }

         if(var1 == 1) {
            ev var9 = this.g.b.a();
            if(var9 != null) {
               var3 = var9.a;
               ev var10 = var9.a(this.e, this.g);
               if(var10 != var9 || var10 != null && var10.a != var3) {
                  this.g.b.a[this.g.b.d] = var10;
                  this.r.a.c();
                  if(var10.a == 0) {
                     this.g.b.a[this.g.b.d] = null;
                  }
               }
            }
         }

      }
   }

   public void h() {
      try {
         this.a = !this.a;
         System.out.println("Toggle fullscreen!");
         if(this.a) {
            Display.setDisplayMode(Display.getDesktopDisplayMode());
            this.c = Display.getDisplayMode().getWidth();
            this.d = Display.getDisplayMode().getHeight();
            if(this.c <= 0) {
               this.c = 1;
            }

            if(this.d <= 0) {
               this.d = 1;
            }
         } else {
            if(this.k != null) {
               this.c = this.k.getWidth();
               this.d = this.k.getHeight();
            } else {
               this.c = this.Q;
               this.d = this.R;
            }

            if(this.c <= 0) {
               this.c = 1;
            }

            if(this.d <= 0) {
               this.d = 1;
            }

            Display.setDisplayMode(new DisplayMode(this.Q, this.R));
         }

         this.f();
         Display.setFullscreen(this.a);
         Display.update();
         Thread.sleep(1000L);
         if(this.a) {
            this.e();
         }

         if(this.p != null) {
            this.f();
            this.a(this.c, this.d);
         }

         System.out.println("Size: " + this.c + ", " + this.d);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   private void a(int var1, int var2) {
      if(var1 <= 0) {
         var1 = 1;
      }

      if(var2 <= 0) {
         var2 = 1;
      }

      this.c = var1;
      this.d = var2;
      if(this.p != null) {
         iy var3 = new iy(var1, var2);
         int var4 = var3.a();
         int var5 = var3.b();
         this.p.a(this, var4, var5);
      }

   }

   private void s() {
      if(this.x != null) {
         int var1 = this.e.a(this.x.b, this.x.c, this.x.d);
         if(var1 == ly.v.bc) {
            var1 = ly.w.bc;
         }

         if(var1 == ly.ak.bc) {
            var1 = ly.al.bc;
         }

         if(var1 == ly.A.bc) {
            var1 = ly.u.bc;
         }

         this.g.b.a(var1, this.b instanceof il);
      }

   }

   public void i() {
      this.u.a();
      this.r.a(1.0F);
      if(this.g != null) {
         this.g.n();
      }

      if(!this.m && this.e != null) {
         this.b.c();
      }

      GL11.glBindTexture(3553, this.n.a("/terrain.png"));
      if(!this.m) {
         this.n.a();
      }

      if(this.p == null && this.g != null && this.g.E <= 0) {
         this.a((bh)null);
      }

      if(this.p != null) {
         this.X = this.O + 10000;
      }

      if(this.p != null) {
         this.p.d();
         if(this.p != null) {
            this.p.g();
         }
      }

      if(this.p == null || this.p.f) {
         while(Mouse.next()) {
            long var1 = System.currentTimeMillis() - this.K;
            if(var1 <= 200L) {
               int var3 = Mouse.getEventDWheel();
               if(var3 != 0) {
                  this.g.b.a(var3);
               }

               if(this.p == null) {
                  if(!this.I && Mouse.getEventButtonState()) {
                     this.e();
                  } else {
                     if(Mouse.getEventButton() == 0 && Mouse.getEventButtonState()) {
                        this.a(0);
                        this.X = this.O;
                     }

                     if(Mouse.getEventButton() == 1 && Mouse.getEventButtonState()) {
                        this.a(1);
                        this.X = this.O;
                     }

                     if(Mouse.getEventButton() == 2 && Mouse.getEventButtonState()) {
                        this.s();
                     }
                  }
               } else if(this.p != null) {
                  this.p.e();
               }
            }
         }

         if(this.P > 0) {
            --this.P;
         }

         while(Keyboard.next()) {
            this.g.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
            if(Keyboard.getEventKeyState()) {
               if(Keyboard.getEventKey() == 87) {
                  this.h();
               } else {
                  if(this.p != null) {
                     this.p.f();
                  } else {
                     if(Keyboard.getEventKey() == 1) {
                        this.g();
                     }

                     if(Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                        this.t();
                     }

                     if(Keyboard.getEventKey() == 63) {
                        this.y.x = !this.y.x;
                     }

                     if(Keyboard.getEventKey() == this.y.o.b) {
                        this.a((bh)(new lo(this.g.b, this.g.b.c)));
                     }

                     if(Keyboard.getEventKey() == this.y.p.b) {
                        this.g.a(this.g.b.a(this.g.b.d, 1), false);
                     }

                     if(this.j() && Keyboard.getEventKey() == this.y.q.b) {
                        this.a((bh)(new de()));
                     }
                  }

                  for(int var4 = 0; var4 < 9; ++var4) {
                     if(Keyboard.getEventKey() == 2 + var4) {
                        this.g.b.d = var4;
                     }
                  }

                  if(Keyboard.getEventKey() == this.y.r.b) {
                     this.y.b(4, !Keyboard.isKeyDown(42) && !Keyboard.isKeyDown(54)?1:-1);
                  }
               }
            }
         }

         if(this.p == null) {
            if(Mouse.isButtonDown(0) && (float)(this.O - this.X) >= this.M.a / 4.0F && this.I) {
               this.a(0);
               this.X = this.O;
            }

            if(Mouse.isButtonDown(1) && (float)(this.O - this.X) >= this.M.a / 4.0F && this.I) {
               this.a(1);
               this.X = this.O;
            }
         }

         this.a(0, this.p == null && Mouse.isButtonDown(0) && this.I);
      }

      if(this.e != null) {
         if(this.g != null) {
            ++this.Y;
            if(this.Y == 30) {
               this.Y = 0;
               this.e.f(this.g);
            }
         }

         this.e.l = this.y.w;
         if(!this.m) {
            this.r.a();
         }

         if(!this.m) {
            this.f.d();
         }

         if(!this.m) {
            this.e.c();
         }

         if(!this.m || this.j()) {
            this.e.g();
         }

         if(!this.m && this.e != null) {
            this.e.m(eo.b(this.g.ak), eo.b(this.g.al), eo.b(this.g.am));
         }

         if(!this.m) {
            this.h.a();
         }
      }

      this.K = System.currentTimeMillis();
   }

   private void t() {
      System.out.println("FORCING RELOAD!");
      this.A = new of();
      this.A.a(this.y);
      this.N.a();
   }

   public boolean j() {
      return this.e != null && this.e.y;
   }

   public void b(String var1) {
      this.a((cn)null);
      System.gc();
      cn var2 = new cn(new File(b(), "saves"), var1);
      if(var2.r) {
         this.a(var2, "Generating level");
      } else {
         this.a(var2, "Loading level");
      }

   }

   public void a(cn var1) {
      this.a(var1, "");
   }

   public void a(cn var1, String var2) {
      this.A.a((String)null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      if(this.e != null) {
         this.e.a((nu)this.q);
      }

      this.e = var1;
      if(var1 != null) {
         this.b.a(var1);
         var1.m = this.o;
         if(!this.j()) {
            this.g = (bi)var1.a(bi.class);
         } else if(this.g != null) {
            this.g.q();
            if(var1 != null) {
               var1.a((kh)this.g);
            }
         }

         if(!var1.y) {
            this.d(var2);
         }

         if(this.g == null) {
            this.g = (bi)this.b.b(var1);
            this.g.q();
            this.b.a((dm)this.g);
         }

         this.g.a = new gd(this.y);
         if(this.f != null) {
            this.f.a(var1);
         }

         if(this.h != null) {
            this.h.a(var1);
         }

         this.b.b((dm)this.g);
         var1.a((dm)this.g);
         if(var1.r) {
            var1.a((nu)this.q);
         }
      } else {
         this.g = null;
      }

      System.gc();
      this.K = 0L;
   }

   private void d(String var1) {
      this.q.a(var1);
      this.q.d("Building terrain");
      short var2 = 128;
      int var3 = 0;
      int var4 = var2 * 2 / 16 + 1;
      var4 *= var4;

      for(int var5 = -var2; var5 <= var2; var5 += 16) {
         int var6 = this.e.o;
         int var7 = this.e.q;
         if(this.g != null) {
            var6 = (int)this.g.ak;
            var7 = (int)this.g.am;
         }

         for(int var8 = -var2; var8 <= var2; var8 += 16) {
            this.q.a(var3++ * 100 / var4);
            this.e.a(var6 + var5, 64, var7 + var8);

            while(this.e.e()) {
               ;
            }
         }
      }

      this.q.d("Simulating world for a bit");
      boolean var9 = true;
      this.e.j();
   }

   public void a(String var1, File var2) {
      int var3 = var1.indexOf("/");
      String var4 = var1.substring(0, var3);
      var1 = var1.substring(var3 + 1);
      if(var4.equalsIgnoreCase("sound")) {
         this.A.a(var1, var2);
      } else if(var4.equalsIgnoreCase("newsound")) {
         this.A.a(var1, var2);
      } else if(var4.equalsIgnoreCase("streaming")) {
         this.A.b(var1, var2);
      } else if(var4.equalsIgnoreCase("music")) {
         this.A.c(var1, var2);
      } else if(var4.equalsIgnoreCase("newmusic")) {
         this.A.c(var1, var2);
      }

   }

   public be k() {
      return this.L;
   }

   public String l() {
      return this.f.b();
   }

   public String m() {
      return this.f.c();
   }

   public String n() {
      return "P: " + this.h.b() + ". T: " + this.e.d();
   }

   public void o() {
      this.e.a();
      if(this.g != null) {
         this.e.d(this.g);
      }

      this.g = (bi)this.b.b(this.e);
      this.g.q();
      this.b.a((dm)this.g);
      this.e.a((dm)this.g);
      this.g.a = new gd(this.y);
      this.b.b((dm)this.g);
      this.d("Respawning");
   }

   public static void a(String var0, String var1) {
      a(var0, var1, (String)null);
   }

   public static void a(String var0, String var1, String var2) {
      boolean var3 = false;
      Frame var5 = new Frame("Minecraft");
      Canvas var6 = new Canvas();
      var5.setLayout(new BorderLayout());
      var5.add(var6, "Center");
      var6.setPreferredSize(new Dimension(854, 480));
      var5.pack();
      var5.setLocationRelativeTo((Component)null);
      fm var7 = new fm(var5, var6, (MinecraftApplet)null, 854, 480, var3, var5);
      Thread var8 = new Thread(var7, "Minecraft main thread");
      var8.setPriority(10);
      var7.l = false;
      var7.j = "www.minecraft.net";
      if(var0 != null && var1 != null) {
         var7.i = new dl(var0, var1);
      } else {
         var7.i = new dl("Player" + System.currentTimeMillis() % 1000L, "");
      }

      if(var2 != null) {
         String[] var9 = var2.split(":");
         var7.a(var9[0], Integer.parseInt(var9[1]));
      }

      var5.setVisible(true);
      var5.addWindowListener(new fp(var7, var8));
      var8.start();
   }

   public static void main(String[] var0) {
      String var1 = "Player" + System.currentTimeMillis() % 1000L;
      if(var0.length > 0) {
         var1 = var0[0];
      }

      String var2 = "-";
      if(var0.length > 1) {
         var2 = var0[1];
      }

      a(var1, var2);
   }

}
