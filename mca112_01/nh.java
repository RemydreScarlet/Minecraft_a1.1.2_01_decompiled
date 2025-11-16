
class nh extends Thread {

   // $FF: synthetic field
   final ii a;


   nh(ii var1) {
      this.a = var1;
   }

   public void run() {
      try {
         Thread.sleep(5000L);
         if(ii.e(this.a).isAlive()) {
            try {
               ii.e(this.a).stop();
            } catch (Throwable var3) {
               ;
            }
         }

         if(ii.f(this.a).isAlive()) {
            try {
               ii.f(this.a).stop();
            } catch (Throwable var2) {
               ;
            }
         }
      } catch (InterruptedException var4) {
         var4.printStackTrace();
      }

   }
}
