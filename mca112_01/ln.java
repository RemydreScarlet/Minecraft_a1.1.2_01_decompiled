
// $FF: synthetic class
class ln {

   // $FF: synthetic field
   static final int[] a = new int[fa.values().length];


   static {
      try {
         a[fa.a.ordinal()] = 1;
      } catch (NoSuchFieldError var4) {
         ;
      }

      try {
         a[fa.b.ordinal()] = 2;
      } catch (NoSuchFieldError var3) {
         ;
      }

      try {
         a[fa.c.ordinal()] = 3;
      } catch (NoSuchFieldError var2) {
         ;
      }

      try {
         a[fa.d.ordinal()] = 4;
      } catch (NoSuchFieldError var1) {
         ;
      }

   }
}
