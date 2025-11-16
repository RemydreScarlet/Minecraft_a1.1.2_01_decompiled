
// $FF: synthetic class
public class fq {

   // $FF: synthetic field
   public static final int[] a = new int[ih.values().length];


   static {
      try {
         a[ih.a.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         a[ih.b.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[ih.c.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[ih.d.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
