
public class nd {

   private String[][] a = new String[][]{{"X", "X", "#"}};
   private Object[][] b;


   public nd() {
      this.b = new Object[][]{{ly.y, ly.x, di.m, di.l, di.n}, {di.p, di.t, di.o, di.x, di.E}};
   }

   public void a(dw var1) {
      for(int var2 = 0; var2 < this.b[0].length; ++var2) {
         Object var3 = this.b[0][var2];

         for(int var4 = 0; var4 < this.b.length - 1; ++var4) {
            di var5 = (di)this.b[var4 + 1][var2];
            var1.a(new ev(var5), new Object[]{this.a[var4], Character.valueOf('#'), di.B, Character.valueOf('X'), var3});
         }
      }

      var1.a(new ev(di.i, 1), new Object[]{" #X", "# X", " #X", Character.valueOf('X'), di.I, Character.valueOf('#'), di.B});
      var1.a(new ev(di.j, 4), new Object[]{"X", "#", "Y", Character.valueOf('Y'), di.J, Character.valueOf('X'), di.an, Character.valueOf('#'), di.B});
   }
}
