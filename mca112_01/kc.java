
class kc {

   public double a;
   public double b;
   public double c;
   // $FF: synthetic field
   final cx d;


   public kc(cx var1, int var2, int var3) {
      this.d = var1;
      this.a = this.b = (double)(10 + var3) + cx.j().nextDouble() * 32.0D + (double)var2;
   }

   public void a() {
      this.b = this.a;
      if(this.a > 0.0D) {
         this.c -= 0.6D;
      }

      this.a += this.c;
      this.c *= 0.9D;
      if(this.a < 0.0D) {
         this.a = 0.0D;
         this.c = 0.0D;
      }

   }
}
