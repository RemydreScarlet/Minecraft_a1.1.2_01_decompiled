import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bq {

   protected cn a;
   private List[] b = new List[4];
   private ey c;
   private Random d = new Random();


   public bq(cn var1, ey var2) {
      if(var1 != null) {
         this.a = var1;
      }

      this.c = var2;

      for(int var3 = 0; var3 < 4; ++var3) {
         this.b[var3] = new ArrayList();
      }

   }

   public void a(nq var1) {
      int var2 = var1.c();
      this.b[var2].add(var1);
   }

   public void a() {
      for(int var1 = 0; var1 < 4; ++var1) {
         for(int var2 = 0; var2 < this.b[var1].size(); ++var2) {
            nq var3 = (nq)this.b[var1].get(var2);
            var3.e_();
            if(var3.aA) {
               this.b[var1].remove(var2--);
            }
         }
      }

   }

   public void a(kh var1, float var2) {
      float var3 = eo.b(var1.aq * 3.1415927F / 180.0F);
      float var4 = eo.a(var1.aq * 3.1415927F / 180.0F);
      float var5 = -var4 * eo.a(var1.ar * 3.1415927F / 180.0F);
      float var6 = var3 * eo.a(var1.ar * 3.1415927F / 180.0F);
      float var7 = eo.b(var1.ar * 3.1415927F / 180.0F);
      nq.l = var1.aI + (var1.ak - var1.aI) * (double)var2;
      nq.m = var1.aJ + (var1.al - var1.aJ) * (double)var2;
      nq.n = var1.aK + (var1.am - var1.aK) * (double)var2;

      for(int var8 = 0; var8 < 3; ++var8) {
         if(this.b[var8].size() != 0) {
            int var9 = 0;
            if(var8 == 0) {
               var9 = this.c.a("/particles.png");
            }

            if(var8 == 1) {
               var9 = this.c.a("/terrain.png");
            }

            if(var8 == 2) {
               var9 = this.c.a("/gui/items.png");
            }

            GL11.glBindTexture(3553, var9);
            ho var10 = ho.a;
            var10.b();

            for(int var11 = 0; var11 < this.b[var8].size(); ++var11) {
               nq var12 = (nq)this.b[var8].get(var11);
               var12.a(var10, var2, var3, var7, var4, var5, var6);
            }

            var10.a();
         }
      }

   }

   public void b(kh var1, float var2) {
      byte var3 = 3;
      if(this.b[var3].size() != 0) {
         ho var4 = ho.a;

         for(int var5 = 0; var5 < this.b[var3].size(); ++var5) {
            nq var6 = (nq)this.b[var3].get(var5);
            var6.a(var4, var2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
         }

      }
   }

   public void a(cn var1) {
      this.a = var1;

      for(int var2 = 0; var2 < 4; ++var2) {
         this.b[var2].clear();
      }

   }

   public void a(int var1, int var2, int var3) {
      int var4 = this.a.a(var1, var2, var3);
      if(var4 != 0) {
         ly var5 = ly.n[var4];
         byte var6 = 4;

         for(int var7 = 0; var7 < var6; ++var7) {
            for(int var8 = 0; var8 < var6; ++var8) {
               for(int var9 = 0; var9 < var6; ++var9) {
                  double var10 = (double)var1 + ((double)var7 + 0.5D) / (double)var6;
                  double var12 = (double)var2 + ((double)var8 + 0.5D) / (double)var6;
                  double var14 = (double)var3 + ((double)var9 + 0.5D) / (double)var6;
                  this.a((nq)(new iw(this.a, var10, var12, var14, var10 - (double)var1 - 0.5D, var12 - (double)var2 - 0.5D, var14 - (double)var3 - 0.5D, var5)));
               }
            }
         }

      }
   }

   public void a(int var1, int var2, int var3, int var4) {
      int var5 = this.a.a(var1, var2, var3);
      if(var5 != 0) {
         ly var6 = ly.n[var5];
         float var7 = 0.1F;
         double var8 = (double)var1 + this.d.nextDouble() * (var6.bi - var6.bf - (double)(var7 * 2.0F)) + (double)var7 + var6.bf;
         double var10 = (double)var2 + this.d.nextDouble() * (var6.bj - var6.bg - (double)(var7 * 2.0F)) + (double)var7 + var6.bg;
         double var12 = (double)var3 + this.d.nextDouble() * (var6.bk - var6.bh - (double)(var7 * 2.0F)) + (double)var7 + var6.bh;
         if(var4 == 0) {
            var10 = (double)var2 + var6.bg - (double)var7;
         }

         if(var4 == 1) {
            var10 = (double)var2 + var6.bj + (double)var7;
         }

         if(var4 == 2) {
            var12 = (double)var3 + var6.bh - (double)var7;
         }

         if(var4 == 3) {
            var12 = (double)var3 + var6.bk + (double)var7;
         }

         if(var4 == 4) {
            var8 = (double)var1 + var6.bf - (double)var7;
         }

         if(var4 == 5) {
            var8 = (double)var1 + var6.bi + (double)var7;
         }

         this.a((new iw(this.a, var8, var10, var12, 0.0D, 0.0D, 0.0D, var6)).b(0.2F).d(0.6F));
      }
   }

   public String b() {
      return "" + (this.b[0].size() + this.b[1].size() + this.b[2].size());
   }
}
