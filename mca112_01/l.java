
public class l {

   private String[][] a = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
   private Object[][] b;


   public l() {
      this.b = new Object[][]{{di.aD, ly.as, di.m, di.l, di.n}, {di.T, di.X, di.ab, di.af, di.aj}, {di.U, di.Y, di.ac, di.ag, di.ak}, {di.V, di.Z, di.ad, di.ah, di.al}, {di.W, di.aa, di.ae, di.ai, di.am}};
   }

   public void a(dw var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            di var5 = (di)this.b[var4 + 1][var2];
            var1.a(new ev(var5), new Object[]{this.a[var4], Character.valueOf('X'), var3});
         }
      }

   }
}
