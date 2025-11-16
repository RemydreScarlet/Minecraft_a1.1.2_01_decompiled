import java.util.Random;

public class hd extends mq {

   protected hd(int var1, int var2) {
      super(var1, var2);
      this.bb = var2;
      this.b(true);
      float var3 = 0.5F;
      this.a(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
   }

   protected boolean b(int var1) {
      return var1 == ly.aB.bc;
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      super.a(var1, var2, var3, var4, var5);
      if(var1.j(var2, var3 + 1, var4) >= 9) {
         int var6 = var1.e(var2, var3, var4);
         if(var6 < 7) {
            float var7 = this.i(var1, var2, var3, var4);
            if(var5.nextInt((int)(100.0F / var7)) == 0) {
               ++var6;
               var1.b(var2, var3, var4, var6);
            }
         }
      }

   }

   private float i(cn var1, int var2, int var3, int var4) {
      float var5 = 1.0F;
      int var6 = var1.a(var2, var3, var4 - 1);
      int var7 = var1.a(var2, var3, var4 + 1);
      int var8 = var1.a(var2 - 1, var3, var4);
      int var9 = var1.a(var2 + 1, var3, var4);
      int var10 = var1.a(var2 - 1, var3, var4 - 1);
      int var11 = var1.a(var2 + 1, var3, var4 - 1);
      int var12 = var1.a(var2 + 1, var3, var4 + 1);
      int var13 = var1.a(var2 - 1, var3, var4 + 1);
      boolean var14 = var8 == this.bc || var9 == this.bc;
      boolean var15 = var6 == this.bc || var7 == this.bc;
      boolean var16 = var10 == this.bc || var11 == this.bc || var12 == this.bc || var13 == this.bc;

      for(int var17 = var2 - 1; var17 <= var2 + 1; ++var17) {
         for(int var18 = var4 - 1; var18 <= var4 + 1; ++var18) {
            int var19 = var1.a(var17, var3 - 1, var18);
            float var20 = 0.0F;
            if(var19 == ly.aB.bc) {
               var20 = 1.0F;
               if(var1.e(var17, var3 - 1, var18) > 0) {
                  var20 = 3.0F;
               }
            }

            if(var17 != var2 || var18 != var4) {
               var20 /= 4.0F;
            }

            var5 += var20;
         }
      }

      if(var16 || var14 && var15) {
         var5 /= 2.0F;
      }

      return var5;
   }

   public int a(int var1, int var2) {
      if(var2 < 0) {
         var2 = 7;
      }

      return this.bb + var2;
   }

   public int f() {
      return 6;
   }

   public void b(cn var1, int var2, int var3, int var4, int var5) {
      super.b(var1, var2, var3, var4, var5);

      for(int var6 = 0; var6 < 3; ++var6) {
         if(var1.n.nextInt(15) <= var5) {
            float var7 = 0.7F;
            float var8 = var1.n.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var9 = var1.n.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            float var10 = var1.n.nextFloat() * var7 + (1.0F - var7) * 0.5F;
            dx var11 = new dx(var1, (double)((float)var2 + var8), (double)((float)var3 + var9), (double)((float)var4 + var10), new ev(di.Q));
            var11.c = 10;
            var1.a((kh)var11);
         }
      }

   }

   public int a(int var1, Random var2) {
      System.out.println("Get resource: " + var1);
      return var1 == 7?di.R.aS:-1;
   }

   public int a(Random var1) {
      return 1;
   }
}
