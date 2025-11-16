
public class bl {

   private final a[] b;
   public final int a;
   private int c;


   public bl(a[] var1) {
      this.b = var1;
      this.a = var1.length;
   }

   public void a() {
      ++this.c;
   }

   public boolean b() {
      return this.c >= this.b.length;
   }

   public aj a(kh var1) {
      double var2 = (double)this.b[this.c].a + (double)((int)(var1.aC + 1.0F)) * 0.5D;
      double var4 = (double)this.b[this.c].b;
      double var6 = (double)this.b[this.c].c + (double)((int)(var1.aC + 1.0F)) * 0.5D;
      return aj.b(var2, var4, var6);
   }
}
