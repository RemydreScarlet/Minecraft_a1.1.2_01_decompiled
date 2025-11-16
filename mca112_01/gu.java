
public class gu implements gh {

   private ev[] a;
   private int b;
   private ar c;


   public gu(ar var1, int var2, int var3) {
      this.b = var2 * var3;
      this.a = new ev[this.b];
      this.c = var1;
   }

   public gu(ar var1, ev[] var2) {
      this.b = var2.length;
      this.a = var2;
      this.c = var1;
   }

   public int c() {
      return this.b;
   }

   public ev c(int var1) {
      return this.a[var1];
   }

   public String d() {
      return "Crafting";
   }

   public ev a(int var1, int var2) {
      if(this.a[var1] != null) {
         ev var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.c.a((gh)this);
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.c.a((gh)this);
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, ev var2) {
      this.a[var1] = var2;
      this.c.a((gh)this);
   }

   public int e() {
      return 64;
   }

   public void j_() {}
}
