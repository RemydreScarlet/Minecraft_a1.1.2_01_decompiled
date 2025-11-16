import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class az {

   private int a;
   private Class b;
   private Class[] c;
   private Set d = new HashSet();


   public az(int var1, Class var2, Class[] var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(cn var1) {
      int var2 = var1.b(this.b);
      if(var2 < this.a) {
         for(int var3 = 0; var3 < 3; ++var3) {
            this.a(var1, 1, (nu)null);
         }
      }

   }

   protected mt a(cn var1, int var2, int var3) {
      int var4 = var2 + var1.n.nextInt(16);
      int var5 = var1.n.nextInt(128);
      int var6 = var3 + var1.n.nextInt(16);
      return new mt(var4, var5, var6);
   }

   private int a(cn var1, int var2, nu var3) {
      this.d.clear();

      int var4;
      int var7;
      int var9;
      int var10;
      for(var4 = 0; var4 < var1.k.size(); ++var4) {
         dm var5 = (dm)var1.k.get(var4);
         int var6 = eo.b(var5.ak / 16.0D);
         var7 = eo.b(var5.am / 16.0D);
         byte var8 = 4;

         for(var9 = -var8; var9 <= var8; ++var9) {
            for(var10 = -var8; var10 <= var8; ++var10) {
               this.d.add(new ol(var9 + var6, var10 + var7));
            }
         }
      }

      var4 = 0;
      Iterator var26 = this.d.iterator();

      while(var26.hasNext()) {
         ol var27 = (ol)var26.next();
         if(var1.n.nextInt(10) == 0) {
            var7 = var1.n.nextInt(this.c.length);
            mt var28 = this.a(var1, var27.a * 16, var27.b * 16);
            var9 = var28.a;
            var10 = var28.b;
            int var11 = var28.c;
            if(var1.g(var9, var10, var11)) {
               return 0;
            }

            if(var1.f(var9, var10, var11) != gb.a) {
               return 0;
            }

            for(int var12 = 0; var12 < 3; ++var12) {
               int var13 = var9;
               int var14 = var10;
               int var15 = var11;
               byte var16 = 6;

               for(int var17 = 0; var17 < 2; ++var17) {
                  var13 += var1.n.nextInt(var16) - var1.n.nextInt(var16);
                  var14 += var1.n.nextInt(1) - var1.n.nextInt(1);
                  var15 += var1.n.nextInt(var16) - var1.n.nextInt(var16);
                  if(var1.g(var13, var14 - 1, var15) && !var1.g(var13, var14, var15) && !var1.f(var13, var14, var15).d() && !var1.g(var13, var14 + 1, var15)) {
                     float var18 = (float)var13 + 0.5F;
                     float var19 = (float)var14;
                     float var20 = (float)var15 + 0.5F;
                     if(var1.a((double)var18, (double)var19, (double)var20, 24.0D) == null) {
                        float var21 = var18 - (float)var1.o;
                        float var22 = var19 - (float)var1.p;
                        float var23 = var20 - (float)var1.q;
                        float var24 = var21 * var21 + var22 * var22 + var23 * var23;
                        if(var24 >= 576.0F) {
                           ge var29;
                           try {
                              var29 = (ge)this.c[var7].getConstructor(new Class[]{cn.class}).newInstance(new Object[]{var1});
                           } catch (Exception var25) {
                              var25.printStackTrace();
                              return var4;
                           }

                           var29.c((double)var18, (double)var19, (double)var20, var1.n.nextFloat() * 360.0F, 0.0F);
                           if(var29.a()) {
                              ++var4;
                              var1.a((kh)var29);
                              if(var29 instanceof ax && var1.n.nextInt(100) == 0) {
                                 cw var30 = new cw(var1);
                                 var30.c((double)var18, (double)var19, (double)var20, var29.aq, 0.0F);
                                 var1.a((kh)var30);
                                 var30.g(var29);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var4;
   }
}
