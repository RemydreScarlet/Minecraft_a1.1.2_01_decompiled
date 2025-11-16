
public class dr {

   private String[][] a = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
   private Object[][] b;


   public dr() {
      this.b = new Object[][]{{ly.y, ly.x, di.m, di.l, di.n}, {di.r, di.v, di.e, di.z, di.G}, {di.q, di.u, di.d, di.y, di.F}, {di.s, di.w, di.f, di.A, di.H}, {di.L, di.M, di.N, di.O, di.P}};
   }

   public void a(dw var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            di var5 = (di)this.b[var4 + 1][var2];
            var1.a(new ev(var5), new Object[]{this.a[var4], Character.valueOf('#'), di.B, Character.valueOf('X'), var3});
         }
      }

   }
}
