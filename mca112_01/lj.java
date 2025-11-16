
class lj extends mm {

   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final lo d;


   lj(lo var1, ee var2, gh var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6);
      this.d = var1;
      this.c = var7;
   }

   public boolean a(ev var1) {
      return var1.a() instanceof mr?((mr)var1.a()).aX == this.c:false;
   }

   public int c() {
      return 15 + this.c * 16;
   }
}
