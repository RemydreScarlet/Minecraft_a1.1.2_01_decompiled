import java.util.Random;

public class oi extends ly {

   private boolean a;


   public oi(int var1, boolean var2) {
      super(var1, 6, gb.d);
      this.a = var2;
      if(!var2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }

      this.d(255);
   }

   public int a(int var1) {
      return var1 <= 1?6:5;
   }

   public boolean b() {
      return this.a;
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      if(this == ly.al) {
         ;
      }
   }

   public void e(cn var1, int var2, int var3, int var4) {
      if(this != ly.al) {
         super.e(var1, var2, var3, var4);
      }

      int var5 = var1.a(var2, var3 - 1, var4);
      if(var5 == al.bc) {
         var1.d(var2, var3, var4, 0);
         var1.d(var2, var3 - 1, var4, ly.ak.bc);
      }

   }

   public int a(int var1, Random var2) {
      return ly.al.bc;
   }

   public boolean c() {
      return this.a;
   }

   public boolean c(nm var1, int var2, int var3, int var4, int var5) {
      if(this != ly.al) {
         super.c(var1, var2, var3, var4, var5);
      }

      return var5 == 1?true:(!super.c(var1, var2, var3, var4, var5)?false:(var5 == 0?true:var1.a(var2, var3, var4) != this.bc));
   }
}
