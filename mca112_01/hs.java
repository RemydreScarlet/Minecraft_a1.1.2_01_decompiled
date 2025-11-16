
public class hs implements gh {

   private String a;
   private gh b;
   private gh c;


   public hs(String var1, gh var2, gh var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public int c() {
      return this.b.c() + this.c.c();
   }

   public String d() {
      return this.a;
   }

   public ev c(int var1) {
      return var1 >= this.b.c()?this.c.c(var1 - this.b.c()):this.b.c(var1);
   }

   public ev a(int var1, int var2) {
      return var1 >= this.b.c()?this.c.a(var1 - this.b.c(), var2):this.b.a(var1, var2);
   }

   public void a(int var1, ev var2) {
      if(var1 >= this.b.c()) {
         this.c.a(var1 - this.b.c(), var2);
      } else {
         this.b.a(var1, var2);
      }

   }

   public int e() {
      return this.b.e();
   }

   public void j_() {
      this.b.j_();
      this.c.j_();
   }
}
