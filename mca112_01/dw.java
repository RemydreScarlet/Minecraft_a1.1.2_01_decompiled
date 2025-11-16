import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class dw {

   private static final dw a = new dw();
   private List b = new ArrayList();


   public static final dw a() {
      return a;
   }

   private dw() {
      (new dr()).a(this);
      (new nd()).a(this);
      (new lf()).a(this);
      (new hr()).a(this);
      (new fj()).a(this);
      (new l()).a(this);
      this.a(new ev(di.aI, 3), new Object[]{"###", Character.valueOf('#'), di.aH});
      this.a(new ev(di.aJ, 1), new Object[]{"#", "#", "#", Character.valueOf('#'), di.aI});
      this.a(new ev(ly.ba, 2), new Object[]{"###", "###", Character.valueOf('#'), di.B});
      this.a(new ev(ly.aZ, 1), new Object[]{"###", "#X#", "###", Character.valueOf('#'), ly.y, Character.valueOf('X'), di.l});
      this.a(new ev(ly.ao, 1), new Object[]{"###", "XXX", "###", Character.valueOf('#'), ly.y, Character.valueOf('X'), di.aJ});
      this.a(new ev(ly.aV, 1), new Object[]{"##", "##", Character.valueOf('#'), di.aB});
      this.a(new ev(ly.aX, 1), new Object[]{"##", "##", Character.valueOf('#'), di.aG});
      this.a(new ev(ly.am, 1), new Object[]{"##", "##", Character.valueOf('#'), di.aF});
      this.a(new ev(ly.ac, 1), new Object[]{"###", "###", "###", Character.valueOf('#'), di.I});
      this.a(new ev(ly.an, 1), new Object[]{"X#X", "#X#", "X#X", Character.valueOf('X'), di.K, Character.valueOf('#'), ly.F});
      this.a(new ev(ly.al, 3), new Object[]{"###", Character.valueOf('#'), ly.x});
      this.a(new ev(ly.aG, 1), new Object[]{"# #", "###", "# #", Character.valueOf('#'), di.B});
      this.a(new ev(di.at, 1), new Object[]{"##", "##", "##", Character.valueOf('#'), ly.y});
      this.a(new ev(di.az, 1), new Object[]{"##", "##", "##", Character.valueOf('#'), di.m});
      this.a(new ev(di.as, 1), new Object[]{"###", "###", " X ", Character.valueOf('#'), ly.y, Character.valueOf('X'), di.B});
      this.a(new ev(ly.y, 4), new Object[]{"#", Character.valueOf('#'), ly.K});
      this.a(new ev(di.B, 4), new Object[]{"#", "#", Character.valueOf('#'), ly.y});
      this.a(new ev(ly.ar, 4), new Object[]{"X", "#", Character.valueOf('X'), di.k, Character.valueOf('#'), di.B});
      this.a(new ev(di.C, 4), new Object[]{"# #", " # ", Character.valueOf('#'), ly.y});
      this.a(new ev(ly.aH, 16), new Object[]{"X X", "X#X", "X X", Character.valueOf('X'), di.m, Character.valueOf('#'), di.B});
      this.a(new ev(di.ax, 1), new Object[]{"# #", "###", Character.valueOf('#'), di.m});
      this.a(new ev(di.aL, 1), new Object[]{"A", "B", Character.valueOf('A'), ly.av, Character.valueOf('B'), di.ax});
      this.a(new ev(di.aM, 1), new Object[]{"A", "B", Character.valueOf('A'), ly.aC, Character.valueOf('B'), di.ax});
      this.a(new ev(di.aC, 1), new Object[]{"# #", "###", Character.valueOf('#'), ly.y});
      this.a(new ev(di.au, 1), new Object[]{"# #", " # ", Character.valueOf('#'), di.m});
      this.a(new ev(di.g, 1), new Object[]{"A ", " B", Character.valueOf('A'), di.m, Character.valueOf('B'), di.an});
      this.a(new ev(di.S, 1), new Object[]{"###", Character.valueOf('#'), di.R});
      this.a(new ev(ly.au, 4), new Object[]{"#  ", "## ", "###", Character.valueOf('#'), ly.y});
      this.a(new ev(di.aP, 1), new Object[]{"  #", " #X", "# X", Character.valueOf('#'), di.B, Character.valueOf('X'), di.I});
      this.a(new ev(ly.aI, 4), new Object[]{"#  ", "## ", "###", Character.valueOf('#'), ly.x});
      this.a(new ev(di.aq, 1), new Object[]{"###", "#X#", "###", Character.valueOf('#'), di.B, Character.valueOf('X'), ly.ac});
      this.a(new ev(di.ar, 1), new Object[]{"###", "#X#", "###", Character.valueOf('#'), ly.ai, Character.valueOf('X'), di.h});
      this.a(new ev(ly.aK, 1), new Object[]{"X", "#", Character.valueOf('#'), ly.x, Character.valueOf('X'), di.B});
      this.a(new ev(ly.aR, 1), new Object[]{"X", "#", Character.valueOf('#'), di.B, Character.valueOf('X'), di.aA});
      this.a(new ev(di.aO, 1), new Object[]{" # ", "#X#", " # ", Character.valueOf('#'), di.m, Character.valueOf('X'), di.aA});
      this.a(new ev(ly.aS, 1), new Object[]{"#", "#", Character.valueOf('#'), ly.u});
      this.a(new ev(ly.aL, 1), new Object[]{"###", Character.valueOf('#'), ly.u});
      this.a(new ev(ly.aN, 1), new Object[]{"###", Character.valueOf('#'), ly.y});
      Collections.sort(this.b, new fs(this));
      System.out.println(this.b.size() + " recipes");
   }

   void a(ev var1, Object ... var2) {
      String var3 = "";
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if(var2[var4] instanceof String[]) {
         String[] var7 = (String[])((String[])var2[var4++]);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            String var9 = var7[var8];
            ++var6;
            var5 = var9.length();
            var3 = var3 + var9;
         }
      } else {
         while(var2[var4] instanceof String) {
            String var11 = (String)var2[var4++];
            ++var6;
            var5 = var11.length();
            var3 = var3 + var11;
         }
      }

      HashMap var12;
      int var15;
      for(var12 = new HashMap(); var4 < var2.length; var4 += 2) {
         Character var13 = (Character)var2[var4];
         var15 = 0;
         if(var2[var4 + 1] instanceof di) {
            var15 = ((di)var2[var4 + 1]).aS;
         } else if(var2[var4 + 1] instanceof ly) {
            var15 = ((ly)var2[var4 + 1]).bc;
         }

         var12.put(var13, Integer.valueOf(var15));
      }

      int[] var14 = new int[var5 * var6];

      for(var15 = 0; var15 < var5 * var6; ++var15) {
         char var10 = var3.charAt(var15);
         if(var12.containsKey(Character.valueOf(var10))) {
            var14[var15] = ((Integer)var12.get(Character.valueOf(var10))).intValue();
         } else {
            var14[var15] = -1;
         }
      }

      this.b.add(new bv(var5, var6, var14, var1));
   }

   public ev a(int[] var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         bv var3 = (bv)this.b.get(var2);
         if(var3.a(var1)) {
            return var3.b(var1);
         }
      }

      return null;
   }

}
