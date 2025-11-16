
class ni extends Thread {

   // $FF: synthetic field
   final ii a;


   ni(ii var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      Object var1 = ii.a;
      synchronized(ii.a) {
         ++ii.b;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(ii.a(this.a)) {
               if(!ii.b(this.a)) {
                  ii.c(this.a);
                  continue;
               }

               var11 = false;
               break;
            }

            var11 = false;
            break;
         } finally {
            if(var11) {
               Object var5 = ii.a;
               synchronized(ii.a) {
                  --ii.b;
               }
            }
         }
      }

      var1 = ii.a;
      synchronized(ii.a) {
         --ii.b;
      }
   }
}
