import java.util.ArrayList;
import java.util.Random;

public class km extends ly {

   private ly a;


   protected km(int var1, ly var2) {
      super(var1, var2.bb, var2.bn);
      this.a = var2;
      this.c(var2.bd);
      this.b(var2.be / 3.0F);
      this.a(var2.bl);
   }

   public boolean b() {
      return false;
   }

   public boolean c() {
      return false;
   }

   public int f() {
      return 10;
   }

   public boolean c(nm var1, int var2, int var3, int var4, int var5) {
      return super.c(var1, var2, var3, var4, var5);
   }

   public void a(cn var1, int var2, int var3, int var4, cf var5, ArrayList var6) {
      int var7 = var1.e(var2, var3, var4);
      if(var7 == 0) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var7 == 1) {
         this.a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var7 == 2) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      } else if(var7 == 3) {
         this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
         super.a(var1, var2, var3, var4, var5, var6);
         this.a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
         super.a(var1, var2, var3, var4, var5, var6);
      }

      this.a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(cn var1, int var2, int var3, int var4, int var5) {
      if(!var1.y) {
         if(var1.f(var2, var3 + 1, var4).a()) {
            var1.d(var2, var3, var4, this.a.bc);
         } else {
            this.h(var1, var2, var3, var4);
            this.h(var1, var2 + 1, var3 - 1, var4);
            this.h(var1, var2 - 1, var3 - 1, var4);
            this.h(var1, var2, var3 - 1, var4 - 1);
            this.h(var1, var2, var3 - 1, var4 + 1);
            this.h(var1, var2 + 1, var3 + 1, var4);
            this.h(var1, var2 - 1, var3 + 1, var4);
            this.h(var1, var2, var3 + 1, var4 - 1);
            this.h(var1, var2, var3 + 1, var4 + 1);
         }

         this.a.a(var1, var2, var3, var4, var5);
      }
   }

   private void h(cn var1, int var2, int var3, int var4) {
      if(this.j(var1, var2, var3, var4)) {
         byte var5 = -1;
         if(this.j(var1, var2 + 1, var3 + 1, var4)) {
            var5 = 0;
         }

         if(this.j(var1, var2 - 1, var3 + 1, var4)) {
            var5 = 1;
         }

         if(this.j(var1, var2, var3 + 1, var4 + 1)) {
            var5 = 2;
         }

         if(this.j(var1, var2, var3 + 1, var4 - 1)) {
            var5 = 3;
         }

         if(var5 < 0) {
            if(this.i(var1, var2 + 1, var3, var4) && !this.i(var1, var2 - 1, var3, var4)) {
               var5 = 0;
            }

            if(this.i(var1, var2 - 1, var3, var4) && !this.i(var1, var2 + 1, var3, var4)) {
               var5 = 1;
            }

            if(this.i(var1, var2, var3, var4 + 1) && !this.i(var1, var2, var3, var4 - 1)) {
               var5 = 2;
            }

            if(this.i(var1, var2, var3, var4 - 1) && !this.i(var1, var2, var3, var4 + 1)) {
               var5 = 3;
            }
         }

         if(var5 < 0) {
            if(this.j(var1, var2 - 1, var3 - 1, var4)) {
               var5 = 0;
            }

            if(this.j(var1, var2 + 1, var3 - 1, var4)) {
               var5 = 1;
            }

            if(this.j(var1, var2, var3 - 1, var4 - 1)) {
               var5 = 2;
            }

            if(this.j(var1, var2, var3 - 1, var4 + 1)) {
               var5 = 3;
            }
         }

         if(var5 >= 0) {
            var1.b(var2, var3, var4, var5);
         }

      }
   }

   private boolean i(cn var1, int var2, int var3, int var4) {
      return var1.f(var2, var3, var4).a();
   }

   private boolean j(cn var1, int var2, int var3, int var4) {
      int var5 = var1.a(var2, var3, var4);
      return var5 == 0?false:ly.n[var5].f() == 10;
   }

   public void b(cn var1, int var2, int var3, int var4, Random var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void b(cn var1, int var2, int var3, int var4, dm var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public void b(cn var1, int var2, int var3, int var4, int var5) {
      this.a.b(var1, var2, var3, var4, var5);
   }

   public float c(nm var1, int var2, int var3, int var4) {
      return this.a.c(var1, var2, var3, var4);
   }

   public float a(kh var1) {
      return this.a.a(var1);
   }

   public int g() {
      return this.a.g();
   }

   public int a(int var1, Random var2) {
      return this.a.a(var1, var2);
   }

   public int a(Random var1) {
      return this.a.a(var1);
   }

   public int a(int var1, int var2) {
      return this.a.a(var1, var2);
   }

   public int a(int var1) {
      return this.a.a(var1);
   }

   public int a(nm var1, int var2, int var3, int var4, int var5) {
      return this.a.a(var1, var2, var3, var4, var5);
   }

   public int a() {
      return this.a.a();
   }

   public cf f(cn var1, int var2, int var3, int var4) {
      return this.a.f(var1, var2, var3, var4);
   }

   public void a(cn var1, int var2, int var3, int var4, kh var5, aj var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   public boolean h() {
      return this.a.h();
   }

   public boolean a(int var1, boolean var2) {
      return this.a.a(var1, var2);
   }

   public boolean a(cn var1, int var2, int var3, int var4) {
      return this.a.a(var1, var2, var3, var4);
   }

   public void e(cn var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 0);
      this.a.e(var1, var2, var3, var4);
   }

   public void b(cn var1, int var2, int var3, int var4) {
      this.a.b(var1, var2, var3, var4);
   }

   public void a(cn var1, int var2, int var3, int var4, int var5, float var6) {
      this.a.a(var1, var2, var3, var4, var5, var6);
   }

   public void b_(cn var1, int var2, int var3, int var4, int var5) {
      this.a.b_(var1, var2, var3, var4, var5);
   }

   public void a(cn var1, int var2, int var3, int var4, kh var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   public void a(cn var1, int var2, int var3, int var4, Random var5) {
      this.a.a(var1, var2, var3, var4, var5);
   }

   public boolean a(cn var1, int var2, int var3, int var4, dm var5) {
      return this.a.a(var1, var2, var3, var4, var5);
   }

   public void c(cn var1, int var2, int var3, int var4) {
      this.a.c(var1, var2, var3, var4);
   }
}
