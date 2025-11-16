
public class fe extends ic implements gh {

   private ev[] a = new ev[36];


   public int c() {
      return 27;
   }

   public ev c(int var1) {
      return this.a[var1];
   }

   public ev a(int var1, int var2) {
      if(this.a[var1] != null) {
         ev var3;
         if(this.a[var1].a <= var2) {
            var3 = this.a[var1];
            this.a[var1] = null;
            this.j_();
            return var3;
         } else {
            var3 = this.a[var1].a(var2);
            if(this.a[var1].a == 0) {
               this.a[var1] = null;
            }

            this.j_();
            return var3;
         }
      } else {
         return null;
      }
   }

   public void a(int var1, ev var2) {
      this.a[var1] = var2;
      if(var2 != null && var2.a > this.e()) {
         var2.a = this.e();
      }

      this.j_();
   }

   public String d() {
      return "Chest";
   }

   public void a(hm var1) {
      super.a(var1);
      ki var2 = var1.l("Items");
      this.a = new ev[this.c()];

      for(int var3 = 0; var3 < var2.c(); ++var3) {
         hm var4 = (hm)var2.a(var3);
         int var5 = var4.c("Slot") & 255;
         if(var5 >= 0 && var5 < this.a.length) {
            this.a[var5] = new ev(var4);
         }
      }

   }

   public void b(hm var1) {
      super.b(var1);
      ki var2 = new ki();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if(this.a[var3] != null) {
            hm var4 = new hm();
            var4.a("Slot", (byte)var3);
            this.a[var3].a(var4);
            var2.a((el)var4);
         }
      }

      var1.a("Items", (el)var2);
   }

   public int e() {
      return 64;
   }
}
