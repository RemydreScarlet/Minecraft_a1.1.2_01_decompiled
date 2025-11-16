
public abstract class jt extends ly {

   protected jt(int var1, gb var2) {
      super(var1, var2);
      q[var1] = true;
   }

   protected jt(int var1, int var2, gb var3) {
      super(var1, var2, var3);
   }

   public void e(cn var1, int var2, int var3, int var4) {
      super.e(var1, var2, var3, var4);
      var1.a(var2, var3, var4, this.a_());
   }

   public void b(cn var1, int var2, int var3, int var4) {
      super.b(var1, var2, var3, var4);
      var1.l(var2, var3, var4);
   }

   protected abstract ic a_();
}
