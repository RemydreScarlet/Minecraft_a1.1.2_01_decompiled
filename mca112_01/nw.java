import java.util.Random;

public class nw implements aw {

   private Random j;
   private lp k;
   private lp l;
   private lp m;
   private lp n;
   private lp o;
   public lp a;
   public lp b;
   public lp c;
   private cn p;
   private double[] q;
   private double[] r = new double[256];
   private double[] s = new double[256];
   private double[] t = new double[256];
   private cy u = new kk();
   double[] d;
   double[] e;
   double[] f;
   double[] g;
   double[] h;
   int[][] i = new int[32][32];


   public nw(cn var1, long var2) {
      this.p = var1;
      this.j = new Random(var2);
      this.k = new lp(this.j, 16);
      this.l = new lp(this.j, 16);
      this.m = new lp(this.j, 8);
      this.n = new lp(this.j, 4);
      this.o = new lp(this.j, 4);
      this.a = new lp(this.j, 10);
      this.b = new lp(this.j, 16);
      this.c = new lp(this.j, 8);
   }

   public void a(int var1, int var2, byte[] var3) {
      byte var4 = 4;
      byte var5 = 64;
      int var6 = var4 + 1;
      byte var7 = 17;
      int var8 = var4 + 1;
      this.q = this.a(this.q, var1 * var4, 0, var2 * var4, var6, var7, var8);

      for(int var9 = 0; var9 < var4; ++var9) {
         for(int var10 = 0; var10 < var4; ++var10) {
            for(int var11 = 0; var11 < 16; ++var11) {
               double var12 = 0.125D;
               double var14 = this.q[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 0];
               double var16 = this.q[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 0];
               double var18 = this.q[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 0];
               double var20 = this.q[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 0];
               double var22 = (this.q[((var9 + 0) * var8 + var10 + 0) * var7 + var11 + 1] - var14) * var12;
               double var24 = (this.q[((var9 + 0) * var8 + var10 + 1) * var7 + var11 + 1] - var16) * var12;
               double var26 = (this.q[((var9 + 1) * var8 + var10 + 0) * var7 + var11 + 1] - var18) * var12;
               double var28 = (this.q[((var9 + 1) * var8 + var10 + 1) * var7 + var11 + 1] - var20) * var12;

               for(int var30 = 0; var30 < 8; ++var30) {
                  double var31 = 0.25D;
                  double var33 = var14;
                  double var35 = var16;
                  double var37 = (var18 - var14) * var31;
                  double var39 = (var20 - var16) * var31;

                  for(int var41 = 0; var41 < 4; ++var41) {
                     int var42 = var41 + var9 * 4 << 11 | 0 + var10 * 4 << 7 | var11 * 8 + var30;
                     short var43 = 128;
                     double var44 = 0.25D;
                     double var46 = var33;
                     double var48 = (var35 - var33) * var44;

                     for(int var50 = 0; var50 < 4; ++var50) {
                        int var51 = 0;
                        if(var11 * 8 + var30 < var5) {
                           if(this.p.d && var11 * 8 + var30 >= var5 - 1) {
                              var51 = ly.aU.bc;
                           } else {
                              var51 = ly.C.bc;
                           }
                        }

                        if(var46 > 0.0D) {
                           var51 = ly.u.bc;
                        }

                        var3[var42] = (byte)var51;
                        var42 += var43;
                        var46 += var48;
                     }

                     var33 += var37;
                     var35 += var39;
                  }

                  var14 += var22;
                  var16 += var24;
                  var18 += var26;
                  var20 += var28;
               }
            }
         }
      }

   }

   public void b(int var1, int var2, byte[] var3) {
      byte var4 = 64;
      double var5 = 0.03125D;
      this.r = this.n.a(this.r, (double)(var1 * 16), (double)(var2 * 16), 0.0D, 16, 16, 1, var5, var5, 1.0D);
      this.s = this.n.a(this.s, (double)(var2 * 16), 109.0134D, (double)(var1 * 16), 16, 1, 16, var5, 1.0D, var5);
      this.t = this.o.a(this.t, (double)(var1 * 16), (double)(var2 * 16), 0.0D, 16, 16, 1, var5 * 2.0D, var5 * 2.0D, var5 * 2.0D);

      for(int var7 = 0; var7 < 16; ++var7) {
         for(int var8 = 0; var8 < 16; ++var8) {
            boolean var9 = this.r[var7 + var8 * 16] + this.j.nextDouble() * 0.2D > 0.0D;
            boolean var10 = this.s[var7 + var8 * 16] + this.j.nextDouble() * 0.2D > 3.0D;
            int var11 = (int)(this.t[var7 + var8 * 16] / 3.0D + 3.0D + this.j.nextDouble() * 0.25D);
            int var12 = -1;
            byte var13 = (byte)ly.v.bc;
            byte var14 = (byte)ly.w.bc;

            for(int var15 = 127; var15 >= 0; --var15) {
               int var16 = (var7 * 16 + var8) * 128 + var15;
               if(var15 <= 0 + this.j.nextInt(6) - 1) {
                  var3[var16] = (byte)ly.A.bc;
               } else {
                  byte var17 = var3[var16];
                  if(var17 == 0) {
                     var12 = -1;
                  } else if(var17 == ly.u.bc) {
                     if(var12 == -1) {
                        if(var11 <= 0) {
                           var13 = 0;
                           var14 = (byte)ly.u.bc;
                        } else if(var15 >= var4 - 4 && var15 <= var4 + 1) {
                           var13 = (byte)ly.v.bc;
                           var14 = (byte)ly.w.bc;
                           if(var10) {
                              var13 = 0;
                           }

                           if(var10) {
                              var14 = (byte)ly.G.bc;
                           }

                           if(var9) {
                              var13 = (byte)ly.F.bc;
                           }

                           if(var9) {
                              var14 = (byte)ly.F.bc;
                           }
                        }

                        if(var15 < var4 && var13 == 0) {
                           var13 = (byte)ly.C.bc;
                        }

                        var12 = var11;
                        if(var15 >= var4 - 1) {
                           var3[var16] = var13;
                        } else {
                           var3[var16] = var14;
                        }
                     } else if(var12 > 0) {
                        --var12;
                        var3[var16] = var14;
                     }
                  }
               }
            }
         }
      }

   }

   public ga b(int var1, int var2) {
      this.j.setSeed((long)var1 * 341873128712L + (long)var2 * 132897987541L);
      byte[] var3 = new byte['\u8000'];
      ga var4 = new ga(this.p, var3, var1, var2);
      this.a(var1, var2, var3);
      this.b(var1, var2, var3);
      this.u.a(this, this.p, var1, var2, var3);
      var4.c();
      return var4;
   }

   private double[] a(double[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 == null) {
         var1 = new double[var5 * var6 * var7];
      }

      double var8 = 684.412D;
      double var10 = 684.412D;
      this.g = this.a.a(this.g, (double)var2, (double)var3, (double)var4, var5, 1, var7, 1.0D, 0.0D, 1.0D);
      this.h = this.b.a(this.h, (double)var2, (double)var3, (double)var4, var5, 1, var7, 100.0D, 0.0D, 100.0D);
      this.d = this.m.a(this.d, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8 / 80.0D, var10 / 160.0D, var8 / 80.0D);
      this.e = this.k.a(this.e, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      this.f = this.l.a(this.f, (double)var2, (double)var3, (double)var4, var5, var6, var7, var8, var10, var8);
      int var12 = 0;
      int var13 = 0;

      for(int var14 = 0; var14 < var5; ++var14) {
         for(int var15 = 0; var15 < var7; ++var15) {
            double var16 = (this.g[var13] + 256.0D) / 512.0D;
            if(var16 > 1.0D) {
               var16 = 1.0D;
            }

            double var18 = 0.0D;
            double var20 = this.h[var13] / 8000.0D;
            if(var20 < 0.0D) {
               var20 = -var20;
            }

            var20 = var20 * 3.0D - 3.0D;
            if(var20 < 0.0D) {
               var20 /= 2.0D;
               if(var20 < -1.0D) {
                  var20 = -1.0D;
               }

               var20 /= 1.4D;
               var20 /= 2.0D;
               var16 = 0.0D;
            } else {
               if(var20 > 1.0D) {
                  var20 = 1.0D;
               }

               var20 /= 6.0D;
            }

            var16 += 0.5D;
            var20 = var20 * (double)var6 / 16.0D;
            double var22 = (double)var6 / 2.0D + var20 * 4.0D;
            ++var13;

            for(int var24 = 0; var24 < var6; ++var24) {
               double var25 = 0.0D;
               double var27 = ((double)var24 - var22) * 12.0D / var16;
               if(var27 < 0.0D) {
                  var27 *= 4.0D;
               }

               double var29 = this.e[var12] / 512.0D;
               double var31 = this.f[var12] / 512.0D;
               double var33 = (this.d[var12] / 10.0D + 1.0D) / 2.0D;
               if(var33 < 0.0D) {
                  var25 = var29;
               } else if(var33 > 1.0D) {
                  var25 = var31;
               } else {
                  var25 = var29 + (var31 - var29) * var33;
               }

               var25 -= var27;
               double var35;
               if(var24 > var6 - 4) {
                  var35 = (double)((float)(var24 - (var6 - 4)) / 3.0F);
                  var25 = var25 * (1.0D - var35) + -10.0D * var35;
               }

               if((double)var24 < var18) {
                  var35 = (var18 - (double)var24) / 4.0D;
                  if(var35 < 0.0D) {
                     var35 = 0.0D;
                  }

                  if(var35 > 1.0D) {
                     var35 = 1.0D;
                  }

                  var25 = var25 * (1.0D - var35) + -10.0D * var35;
               }

               var1[var12] = var25;
               ++var12;
            }
         }
      }

      return var1;
   }

   public boolean a(int var1, int var2) {
      return true;
   }

   public void a(aw var1, int var2, int var3) {
      dh.a = true;
      int var4 = var2 * 16;
      int var5 = var3 * 16;
      this.j.setSeed(this.p.u);
      long var6 = this.j.nextLong() / 2L * 2L + 1L;
      long var8 = this.j.nextLong() / 2L * 2L + 1L;
      this.j.setSeed((long)var2 * var6 + (long)var3 * var8 ^ this.p.u);
      double var10 = 0.25D;

      int var12;
      int var13;
      int var14;
      int var15;
      for(var12 = 0; var12 < 8; ++var12) {
         var13 = var4 + this.j.nextInt(16) + 8;
         var14 = this.j.nextInt(128);
         var15 = var5 + this.j.nextInt(16) + 8;
         (new cg()).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 10; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(128);
         var15 = var5 + this.j.nextInt(16);
         (new gv(32)).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 20; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(128);
         var15 = var5 + this.j.nextInt(16);
         (new cu(ly.w.bc, 32)).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 10; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(128);
         var15 = var5 + this.j.nextInt(16);
         (new cu(ly.G.bc, 32)).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 20; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(128);
         var15 = var5 + this.j.nextInt(16);
         (new cu(ly.J.bc, 16)).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 20; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(64);
         var15 = var5 + this.j.nextInt(16);
         (new cu(ly.I.bc, 8)).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 2; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(32);
         var15 = var5 + this.j.nextInt(16);
         (new cu(ly.H.bc, 8)).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 8; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(16);
         var15 = var5 + this.j.nextInt(16);
         (new cu(ly.aO.bc, 7)).a(this.p, this.j, var13, var14, var15);
      }

      for(var12 = 0; var12 < 1; ++var12) {
         var13 = var4 + this.j.nextInt(16);
         var14 = this.j.nextInt(16);
         var15 = var5 + this.j.nextInt(16);
         (new cu(ly.ax.bc, 7)).a(this.p, this.j, var13, var14, var15);
      }

      var10 = 0.5D;
      var12 = (int)((this.c.a((double)var4 * var10, (double)var5 * var10) / 8.0D + this.j.nextDouble() * 4.0D + 4.0D) / 3.0D);
      if(var12 < 0) {
         var12 = 0;
      }

      if(this.j.nextInt(10) == 0) {
         ++var12;
      }

      Object var18 = new oa();
      if(this.j.nextInt(10) == 0) {
         var18 = new ej();
      }

      int var16;
      for(var14 = 0; var14 < var12; ++var14) {
         var15 = var4 + this.j.nextInt(16) + 8;
         var16 = var5 + this.j.nextInt(16) + 8;
         ((ik)var18).a(1.0D, 1.0D, 1.0D);
         ((ik)var18).a(this.p, this.j, var15, this.p.c(var15, var16), var16);
      }

      int var17;
      for(var14 = 0; var14 < 2; ++var14) {
         var15 = var4 + this.j.nextInt(16) + 8;
         var16 = this.j.nextInt(128);
         var17 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.ae.bc)).a(this.p, this.j, var15, var16, var17);
      }

      if(this.j.nextInt(2) == 0) {
         var14 = var4 + this.j.nextInt(16) + 8;
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.af.bc)).a(this.p, this.j, var14, var15, var16);
      }

      if(this.j.nextInt(4) == 0) {
         var14 = var4 + this.j.nextInt(16) + 8;
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.ag.bc)).a(this.p, this.j, var14, var15, var16);
      }

      if(this.j.nextInt(8) == 0) {
         var14 = var4 + this.j.nextInt(16) + 8;
         var15 = this.j.nextInt(128);
         var16 = var5 + this.j.nextInt(16) + 8;
         (new ae(ly.ah.bc)).a(this.p, this.j, var14, var15, var16);
      }

      for(var14 = 0; var14 < 10; ++var14) {
         var15 = var4 + this.j.nextInt(16) + 8;
         var16 = this.j.nextInt(128);
         var17 = var5 + this.j.nextInt(16) + 8;
         (new es()).a(this.p, this.j, var15, var16, var17);
      }

      for(var14 = 0; var14 < 1; ++var14) {
         var15 = var4 + this.j.nextInt(16) + 8;
         var16 = this.j.nextInt(128);
         var17 = var5 + this.j.nextInt(16) + 8;
         (new da()).a(this.p, this.j, var15, var16, var17);
      }

      for(var14 = 0; var14 < 50; ++var14) {
         var15 = var4 + this.j.nextInt(16) + 8;
         var16 = this.j.nextInt(this.j.nextInt(120) + 8);
         var17 = var5 + this.j.nextInt(16) + 8;
         (new nn(ly.B.bc)).a(this.p, this.j, var15, var16, var17);
      }

      for(var14 = 0; var14 < 20; ++var14) {
         var15 = var4 + this.j.nextInt(16) + 8;
         var16 = this.j.nextInt(this.j.nextInt(this.j.nextInt(112) + 8) + 8);
         var17 = var5 + this.j.nextInt(16) + 8;
         (new nn(ly.D.bc)).a(this.p, this.j, var15, var16, var17);
      }

      for(var14 = var4 + 8 + 0; var14 < var4 + 8 + 16; ++var14) {
         for(var15 = var5 + 8 + 0; var15 < var5 + 8 + 16; ++var15) {
            var16 = this.p.d(var14, var15);
            if(this.p.d && var16 > 0 && var16 < 128 && this.p.a(var14, var16, var15) == 0 && this.p.f(var14, var16 - 1, var15).c() && this.p.f(var14, var16 - 1, var15) != gb.r) {
               this.p.d(var14, var16, var15, ly.aT.bc);
            }
         }
      }

      dh.a = false;
   }

   public boolean a(boolean var1, nu var2) {
      return true;
   }

   public boolean a() {
      return false;
   }

   public boolean b() {
      return true;
   }
}
