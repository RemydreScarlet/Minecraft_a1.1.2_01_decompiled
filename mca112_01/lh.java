
class lh extends Thread {

   // $FF: synthetic field
   final ad a;


   lh(ad var1) {
      this.a = var1;
   }

   public void run() {
      while(ad.a(this.a)) {
         this.a.d();

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
            ;
         }
      }

   }
}
