import java.util.List;
import java.util.Random;

public abstract class kh {

   private static int a = 0;
   public int ab;
   public double ac;
   public boolean ad;
   public kh ae;
   public kh af;
   protected cn ag;
   public double ah;
   public double ai;
   public double aj;
   public double ak;
   public double al;
   public double am;
   public double an;
   public double ao;
   public double ap;
   public float aq;
   public float ar;
   public float as;
   public float at;
   public final cf au;
   public boolean av;
   public boolean aw;
   public boolean ax;
   public boolean ay;
   public boolean az;
   public boolean aA;
   public float aB;
   public float aC;
   public float aD;
   public float aE;
   public float aF;
   protected boolean aG;
   protected float aH;
   private int b;
   public double aI;
   public double aJ;
   public double aK;
   public float aL;
   public float aM;
   public boolean aN;
   public float aO;
   public boolean aP;
   protected Random aQ;
   public int aR;
   public int aS;
   public int aT;
   protected int aU;
   protected boolean aV;
   public int aW;
   public int aX;
   private boolean c;
   public String aY;
   private double d;
   private double e;
   public boolean aZ;
   public int ba;
   public int bb;
   public int bc;
   public int bd;
   public int be;
   public int bf;


   public kh(cn var1) {
      this.ab = a++;
      this.ac = 1.0D;
      this.ad = false;
      this.au = cf.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      this.av = false;
      this.ay = false;
      this.az = true;
      this.aA = false;
      this.aB = 0.0F;
      this.aC = 0.6F;
      this.aD = 1.8F;
      this.aE = 0.0F;
      this.aF = 0.0F;
      this.aG = true;
      this.aH = 0.0F;
      this.b = 1;
      this.aL = 0.0F;
      this.aM = 0.0F;
      this.aN = false;
      this.aO = 0.0F;
      this.aP = false;
      this.aQ = new Random();
      this.aR = 0;
      this.aS = 1;
      this.aT = 0;
      this.aU = 300;
      this.aV = false;
      this.aW = 0;
      this.aX = 300;
      this.c = true;
      this.aZ = false;
      this.ag = var1;
      this.a(0.0D, 0.0D, 0.0D);
   }

   public boolean equals(Object var1) {
      return var1 instanceof kh?((kh)var1).ab == this.ab:false;
   }

   public int hashCode() {
      return this.ab;
   }

   protected void q() {
      if(this.ag != null) {
         while(this.al > 0.0D) {
            this.a(this.ak, this.al, this.am);
            if(this.ag.a(this, this.au).size() == 0) {
               break;
            }

            ++this.al;
         }

         this.an = this.ao = this.ap = 0.0D;
         this.ar = 0.0F;
      }
   }

   public void F() {
      this.aA = true;
   }

   protected void a(float var1, float var2) {
      this.aC = var1;
      this.aD = var2;
   }

   protected void c(float var1, float var2) {
      this.aq = var1;
      this.ar = var2;
   }

   public void a(double var1, double var3, double var5) {
      this.ak = var1;
      this.al = var3;
      this.am = var5;
      float var7 = this.aC / 2.0F;
      float var8 = this.aD;
      this.au.c(var1 - (double)var7, var3 - (double)this.aB + (double)this.aL, var5 - (double)var7, var1 + (double)var7, var3 - (double)this.aB + (double)this.aL + (double)var8, var5 + (double)var7);
   }

   public void d(float var1, float var2) {
      float var3 = this.ar;
      float var4 = this.aq;
      this.aq = (float)((double)this.aq + (double)var1 * 0.15D);
      this.ar = (float)((double)this.ar - (double)var2 * 0.15D);
      if(this.ar < -90.0F) {
         this.ar = -90.0F;
      }

      if(this.ar > 90.0F) {
         this.ar = 90.0F;
      }

      this.at += this.ar - var3;
      this.as += this.aq - var4;
   }

   public void e_() {
      this.y();
   }

   public void y() {
      if(this.af != null && this.af.aA) {
         this.af = null;
      }

      ++this.aR;
      this.aE = this.aF;
      this.ah = this.ak;
      this.ai = this.al;
      this.aj = this.am;
      this.at = this.ar;
      this.as = this.aq;
      if(this.g_()) {
         if(!this.aV && !this.c) {
            float var1 = eo.a(this.an * this.an * 0.20000000298023224D + this.ao * this.ao + this.ap * this.ap * 0.20000000298023224D) * 0.2F;
            if(var1 > 1.0F) {
               var1 = 1.0F;
            }

            this.ag.a(this, "random.splash", var1, 1.0F + (this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.4F);
            float var2 = (float)eo.b(this.au.b);

            int var3;
            float var4;
            float var5;
            for(var3 = 0; (float)var3 < 1.0F + this.aC * 20.0F; ++var3) {
               var4 = (this.aQ.nextFloat() * 2.0F - 1.0F) * this.aC;
               var5 = (this.aQ.nextFloat() * 2.0F - 1.0F) * this.aC;
               this.ag.a("bubble", this.ak + (double)var4, (double)(var2 + 1.0F), this.am + (double)var5, this.an, this.ao - (double)(this.aQ.nextFloat() * 0.2F), this.ap);
            }

            for(var3 = 0; (float)var3 < 1.0F + this.aC * 20.0F; ++var3) {
               var4 = (this.aQ.nextFloat() * 2.0F - 1.0F) * this.aC;
               var5 = (this.aQ.nextFloat() * 2.0F - 1.0F) * this.aC;
               this.ag.a("splash", this.ak + (double)var4, (double)(var2 + 1.0F), this.am + (double)var5, this.an, this.ao, this.ap);
            }
         }

         this.aH = 0.0F;
         this.aV = true;
         this.aT = 0;
      } else {
         this.aV = false;
      }

      if(this.aT > 0) {
         if(this.aT % 20 == 0) {
            this.a((kh)null, 1);
         }

         --this.aT;
      }

      if(this.G()) {
         this.a((kh)null, 10);
         this.aT = 600;
      }

      if(this.al < -64.0D) {
         this.E();
      }

      this.c = false;
   }

   protected void E() {
      this.F();
   }

   public boolean b(double var1, double var3, double var5) {
      cf var7 = this.au.c(var1, var3, var5);
      List var8 = this.ag.a(this, var7);
      return var8.size() > 0?false:!this.ag.b(var7);
   }

   public void c(double var1, double var3, double var5) {
      if(this.aN) {
         this.au.d(var1, var3, var5);
         this.ak = (this.au.a + this.au.d) / 2.0D;
         this.al = this.au.b + (double)this.aB - (double)this.aL;
         this.am = (this.au.c + this.au.f) / 2.0D;
      } else {
         double var7 = this.ak;
         double var9 = this.am;
         double var11 = var1;
         double var13 = var3;
         double var15 = var5;
         cf var17 = this.au.c();
         boolean var18 = this.av && this.o();
         if(var18) {
            double var19;
            for(var19 = 0.05D; var1 != 0.0D && this.ag.a(this, this.au.c(var1, -1.0D, 0.0D)).size() == 0; var11 = var1) {
               if(var1 < var19 && var1 >= -var19) {
                  var1 = 0.0D;
               } else if(var1 > 0.0D) {
                  var1 -= var19;
               } else {
                  var1 += var19;
               }
            }

            for(; var5 != 0.0D && this.ag.a(this, this.au.c(0.0D, -1.0D, var5)).size() == 0; var15 = var5) {
               if(var5 < var19 && var5 >= -var19) {
                  var5 = 0.0D;
               } else if(var5 > 0.0D) {
                  var5 -= var19;
               } else {
                  var5 += var19;
               }
            }
         }

         List var35 = this.ag.a(this, this.au.a(var1, var3, var5));

         for(int var20 = 0; var20 < var35.size(); ++var20) {
            var3 = ((cf)var35.get(var20)).b(this.au, var3);
         }

         this.au.d(0.0D, var3, 0.0D);
         if(!this.az && var13 != var3) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         boolean var36 = this.av || var13 != var3 && var13 < 0.0D;

         int var21;
         for(var21 = 0; var21 < var35.size(); ++var21) {
            var1 = ((cf)var35.get(var21)).a(this.au, var1);
         }

         this.au.d(var1, 0.0D, 0.0D);
         if(!this.az && var11 != var1) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         for(var21 = 0; var21 < var35.size(); ++var21) {
            var5 = ((cf)var35.get(var21)).c(this.au, var5);
         }

         this.au.d(0.0D, 0.0D, var5);
         if(!this.az && var15 != var5) {
            var5 = 0.0D;
            var3 = 0.0D;
            var1 = 0.0D;
         }

         double var23;
         int var28;
         double var37;
         if(this.aM > 0.0F && var36 && this.aL < 0.05F && (var11 != var1 || var15 != var5)) {
            var37 = var1;
            var23 = var3;
            double var25 = var5;
            var1 = var11;
            var3 = (double)this.aM;
            var5 = var15;
            cf var27 = this.au.c();
            this.au.b(var17);
            var35 = this.ag.a(this, this.au.a(var11, var3, var15));

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var3 = ((cf)var35.get(var28)).b(this.au, var3);
            }

            this.au.d(0.0D, var3, 0.0D);
            if(!this.az && var13 != var3) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var1 = ((cf)var35.get(var28)).a(this.au, var1);
            }

            this.au.d(var1, 0.0D, 0.0D);
            if(!this.az && var11 != var1) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            for(var28 = 0; var28 < var35.size(); ++var28) {
               var5 = ((cf)var35.get(var28)).c(this.au, var5);
            }

            this.au.d(0.0D, 0.0D, var5);
            if(!this.az && var15 != var5) {
               var5 = 0.0D;
               var3 = 0.0D;
               var1 = 0.0D;
            }

            if(var37 * var37 + var25 * var25 >= var1 * var1 + var5 * var5) {
               var1 = var37;
               var3 = var23;
               var5 = var25;
               this.au.b(var27);
            } else {
               this.aL = (float)((double)this.aL + 0.5D);
            }
         }

         this.ak = (this.au.a + this.au.d) / 2.0D;
         this.al = this.au.b + (double)this.aB - (double)this.aL;
         this.am = (this.au.c + this.au.f) / 2.0D;
         this.aw = var11 != var1 || var15 != var5;
         this.ax = var13 != var3;
         this.av = var13 != var3 && var13 < 0.0D;
         this.ay = this.aw || this.ax;
         if(this.av) {
            if(this.aH > 0.0F) {
               this.c(this.aH);
               this.aH = 0.0F;
            }
         } else if(var3 < 0.0D) {
            this.aH = (float)((double)this.aH - var3);
         }

         if(var11 != var1) {
            this.an = 0.0D;
         }

         if(var13 != var3) {
            this.ao = 0.0D;
         }

         if(var15 != var5) {
            this.ap = 0.0D;
         }

         var37 = this.ak - var7;
         var23 = this.am - var9;
         this.aF = (float)((double)this.aF + (double)eo.a(var37 * var37 + var23 * var23) * 0.6D);
         int var26;
         int var38;
         int var40;
         if(this.aG && !var18) {
            var38 = eo.b(this.ak);
            var26 = eo.b(this.al - 0.20000000298023224D - (double)this.aB);
            var40 = eo.b(this.am);
            var28 = this.ag.a(var38, var26, var40);
            if(this.aF > (float)this.b && var28 > 0) {
               ++this.b;
               bb var29 = ly.n[var28].bl;
               if(this.ag.a(var38, var26 + 1, var40) == ly.aT.bc) {
                  var29 = ly.aT.bl;
                  this.ag.a(this, var29.d(), var29.b() * 0.15F, var29.c());
               } else if(!ly.n[var28].bn.d()) {
                  this.ag.a(this, var29.d(), var29.b() * 0.15F, var29.c());
               }

               ly.n[var28].a(this.ag, var38, var26, var40, this);
            }
         }

         var38 = eo.b(this.au.a);
         var26 = eo.b(this.au.b);
         var40 = eo.b(this.au.c);
         var28 = eo.b(this.au.d);
         int var41 = eo.b(this.au.e);
         int var30 = eo.b(this.au.f);

         for(int var31 = var38; var31 <= var28; ++var31) {
            for(int var32 = var26; var32 <= var41; ++var32) {
               for(int var33 = var40; var33 <= var30; ++var33) {
                  int var34 = this.ag.a(var31, var32, var33);
                  if(var34 > 0) {
                     ly.n[var34].b(this.ag, var31, var32, var33, this);
                  }
               }
            }
         }

         this.aL *= 0.4F;
         boolean var39 = this.g_();
         if(this.ag.c(this.au)) {
            this.a(1);
            if(!var39) {
               ++this.aT;
               if(this.aT == 0) {
                  this.aT = 300;
               }
            }
         } else if(this.aT <= 0) {
            this.aT = -this.aS;
         }

         if(var39 && this.aT > 0) {
            this.ag.a(this, "random.fizz", 0.7F, 1.6F + (this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.4F);
            this.aT = -this.aS;
         }

      }
   }

   public boolean o() {
      return false;
   }

   public cf f_() {
      return null;
   }

   protected void a(int var1) {
      this.a((kh)null, var1);
   }

   protected void c(float var1) {}

   public boolean g_() {
      return this.ag.a(this.au.b(0.0D, -0.4000000059604645D, 0.0D), gb.f, this);
   }

   public boolean a(gb var1) {
      double var2 = this.al + (double)this.s();
      int var4 = eo.b(this.ak);
      int var5 = eo.d((float)eo.b(var2));
      int var6 = eo.b(this.am);
      int var7 = this.ag.a(var4, var5, var6);
      if(var7 != 0 && ly.n[var7].bn == var1) {
         float var8 = jp.b(this.ag.e(var4, var5, var6)) - 0.11111111F;
         float var9 = (float)(var5 + 1) - var8;
         return var2 < (double)var9;
      } else {
         return false;
      }
   }

   protected float s() {
      return 0.0F;
   }

   public boolean G() {
      return this.ag.a(this.au.b(0.0D, -0.4000000059604645D, 0.0D), gb.g);
   }

   public void a(float var1, float var2, float var3) {
      float var4 = eo.c(var1 * var1 + var2 * var2);
      if(var4 >= 0.01F) {
         if(var4 < 1.0F) {
            var4 = 1.0F;
         }

         var4 = var3 / var4;
         var1 *= var4;
         var2 *= var4;
         float var5 = eo.a(this.aq * 3.1415927F / 180.0F);
         float var6 = eo.b(this.aq * 3.1415927F / 180.0F);
         this.an += (double)(var1 * var6 - var2 * var5);
         this.ap += (double)(var2 * var6 + var1 * var5);
      }
   }

   public float a(float var1) {
      int var2 = eo.b(this.ak);
      double var3 = (this.au.e - this.au.b) * 0.66D;
      int var5 = eo.b(this.al - (double)this.aB + var3);
      int var6 = eo.b(this.am);
      return this.ag.c(var2, var5, var6);
   }

   public void a(cn var1) {
      this.ag = var1;
   }

   public void b(double var1, double var3, double var5, float var7, float var8) {
      this.ah = this.ak = var1;
      this.ai = this.al = var3;
      this.aj = this.am = var5;
      this.aq = var7;
      this.ar = var8;
      this.aL = 0.0F;
      double var9 = (double)(this.as - var7);
      if(var9 < -180.0D) {
         this.as += 360.0F;
      }

      if(var9 >= 180.0D) {
         this.as -= 360.0F;
      }

      this.a(this.ak, this.al, this.am);
   }

   public void c(double var1, double var3, double var5, float var7, float var8) {
      this.ah = this.ak = var1;
      this.ai = this.al = var3 + (double)this.aB;
      this.aj = this.am = var5;
      this.aq = var7;
      this.ar = var8;
      this.a(this.ak, this.al, this.am);
   }

   public float d(kh var1) {
      float var2 = (float)(this.ak - var1.ak);
      float var3 = (float)(this.al - var1.al);
      float var4 = (float)(this.am - var1.am);
      return eo.c(var2 * var2 + var3 * var3 + var4 * var4);
   }

   public double d(double var1, double var3, double var5) {
      double var7 = this.ak - var1;
      double var9 = this.al - var3;
      double var11 = this.am - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double e(double var1, double var3, double var5) {
      double var7 = this.ak - var1;
      double var9 = this.al - var3;
      double var11 = this.am - var5;
      return (double)eo.a(var7 * var7 + var9 * var9 + var11 * var11);
   }

   public double e(kh var1) {
      double var2 = this.ak - var1.ak;
      double var4 = this.al - var1.al;
      double var6 = this.am - var1.am;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   public void b(dm var1) {}

   public void f(kh var1) {
      if(var1.ae != this && var1.af != this) {
         double var2 = var1.ak - this.ak;
         double var4 = var1.am - this.am;
         double var6 = eo.a(var2, var4);
         if(var6 >= 0.009999999776482582D) {
            var6 = (double)eo.a(var6);
            var2 /= var6;
            var4 /= var6;
            double var8 = 1.0D / var6;
            if(var8 > 1.0D) {
               var8 = 1.0D;
            }

            var2 *= var8;
            var4 *= var8;
            var2 *= 0.05000000074505806D;
            var4 *= 0.05000000074505806D;
            var2 *= (double)(1.0F - this.aO);
            var4 *= (double)(1.0F - this.aO);
            this.f(-var2, 0.0D, -var4);
            var1.f(var2, 0.0D, var4);
         }

      }
   }

   public void f(double var1, double var3, double var5) {
      this.an += var1;
      this.ao += var3;
      this.ap += var5;
   }

   public boolean a(kh var1, int var2) {
      return false;
   }

   public boolean c_() {
      return false;
   }

   public boolean d_() {
      return false;
   }

   public void b(kh var1, int var2) {}

   public boolean a(aj var1) {
      double var2 = this.ak - var1.a;
      double var4 = this.al - var1.b;
      double var6 = this.am - var1.c;
      double var8 = var2 * var2 + var4 * var4 + var6 * var6;
      return this.a(var8);
   }

   public boolean a(double var1) {
      double var3 = this.au.b();
      var3 *= 64.0D * this.ac;
      return var1 < var3 * var3;
   }

   public String x() {
      return null;
   }

   public boolean c(hm var1) {
      String var2 = this.H();
      if(!this.aA && var2 != null) {
         var1.a("id", var2);
         this.d(var1);
         return true;
      } else {
         return false;
      }
   }

   public void d(hm var1) {
      var1.a("Pos", (el)this.a(new double[]{this.ak, this.al, this.am}));
      var1.a("Motion", (el)this.a(new double[]{this.an, this.ao, this.ap}));
      var1.a("Rotation", (el)this.a(new float[]{this.aq, this.ar}));
      var1.a("FallDistance", this.aH);
      var1.a("Fire", (short)this.aT);
      var1.a("Air", (short)this.aX);
      var1.a("OnGround", this.av);
      this.a(var1);
   }

   public void e(hm var1) {
      ki var2 = var1.l("Pos");
      ki var3 = var1.l("Motion");
      ki var4 = var1.l("Rotation");
      this.a(0.0D, 0.0D, 0.0D);
      this.an = ((kr)var3.a(0)).a;
      this.ao = ((kr)var3.a(1)).a;
      this.ap = ((kr)var3.a(2)).a;
      this.ah = this.aI = this.ak = ((kr)var2.a(0)).a;
      this.ai = this.aJ = this.al = ((kr)var2.a(1)).a;
      this.aj = this.aK = this.am = ((kr)var2.a(2)).a;
      this.as = this.aq = ((f)var4.a(0)).a;
      this.at = this.ar = ((f)var4.a(1)).a;
      this.aH = var1.g("FallDistance");
      this.aT = var1.d("Fire");
      this.aX = var1.d("Air");
      this.av = var1.m("OnGround");
      this.a(this.ak, this.al, this.am);
      this.b(var1);
   }

   protected final String H() {
      return ew.b(this);
   }

   protected abstract void b(hm var1);

   protected abstract void a(hm var1);

   protected ki a(double ... var1) {
      ki var2 = new ki();
      double[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         double var6 = var3[var5];
         var2.a((el)(new kr(var6)));
      }

      return var2;
   }

   protected ki a(float ... var1) {
      ki var2 = new ki();
      float[] var3 = var1;
      int var4 = var1.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         float var6 = var3[var5];
         var2.a((el)(new f(var6)));
      }

      return var2;
   }

   public float h_() {
      return this.aD / 2.0F;
   }

   public dx b(int var1, int var2) {
      return this.a(var1, var2, 0.0F);
   }

   public dx a(int var1, int var2, float var3) {
      dx var4 = new dx(this.ag, this.ak, this.al + (double)var3, this.am, new ev(var1, var2));
      var4.c = 10;
      this.ag.a((kh)var4);
      return var4;
   }

   public boolean B() {
      return !this.aA;
   }

   public boolean I() {
      int var1 = eo.b(this.ak);
      int var2 = eo.b(this.al + (double)this.s());
      int var3 = eo.b(this.am);
      return this.ag.g(var1, var2, var3);
   }

   public boolean a(dm var1) {
      return false;
   }

   public cf b_(kh var1) {
      return null;
   }

   public void p() {
      if(this.af.aA) {
         this.af = null;
      } else {
         this.an = 0.0D;
         this.ao = 0.0D;
         this.ap = 0.0D;
         this.e_();
         this.af.i_();
         this.e += (double)(this.af.aq - this.af.as);

         for(this.d += (double)(this.af.ar - this.af.at); this.e >= 180.0D; this.e -= 360.0D) {
            ;
         }

         while(this.e < -180.0D) {
            this.e += 360.0D;
         }

         while(this.d >= 180.0D) {
            this.d -= 360.0D;
         }

         while(this.d < -180.0D) {
            this.d += 360.0D;
         }

         double var1 = this.e * 0.5D;
         double var3 = this.d * 0.5D;
         float var5 = 10.0F;
         if(var1 > (double)var5) {
            var1 = (double)var5;
         }

         if(var1 < (double)(-var5)) {
            var1 = (double)(-var5);
         }

         if(var3 > (double)var5) {
            var3 = (double)var5;
         }

         if(var3 < (double)(-var5)) {
            var3 = (double)(-var5);
         }

         this.e -= var1;
         this.d -= var3;
         this.aq = (float)((double)this.aq + var1);
         this.ar = (float)((double)this.ar + var3);
      }
   }

   protected void i_() {
      this.ae.a(this.ak, this.al + this.h() + this.ae.v(), this.am);
   }

   public double v() {
      return (double)this.aB;
   }

   public double h() {
      return (double)this.aD * 0.75D;
   }

   public void g(kh var1) {
      this.d = 0.0D;
      this.e = 0.0D;
      if(this.af == var1) {
         this.af.ae = null;
         this.af = null;
         this.c(var1.ak, var1.au.b + (double)var1.aD, var1.am, this.aq, this.ar);
      } else {
         if(this.af != null) {
            this.af.ae = null;
         }

         if(var1.ae != null) {
            var1.ae.af = null;
         }

         this.af = var1;
         var1.ae = this;
      }
   }

   public void a(double var1, double var3, double var5, float var7, float var8, int var9) {
      this.a(var1, var3, var5);
      this.c(var7, var8);
   }

}
