
public class mr extends di {

   private static final int[] ba = new int[]{3, 8, 6, 3};
   private static final int[] bb = new int[]{11, 16, 15, 13};
   public final int a;
   public final int aX;
   public final int aY;
   public final int aZ;


   public mr(int var1, int var2, int var3, int var4) {
      super(var1);
      this.a = var2;
      this.aX = var4;
      this.aZ = var3;
      this.aY = ba[var4];
      this.aU = bb[var4] * 3 << var2;
      this.aT = 1;
   }

}
