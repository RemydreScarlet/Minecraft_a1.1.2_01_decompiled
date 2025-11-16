
class nk extends Thread {

   // $FF: synthetic field
   final ii a;


   nk(ii var1, String var2) {
      super(var2);
      this.a = var1;
   }

   public void run() {
      Object var1 = ii.a;
      synchronized(ii.a) {
         ++ii.c;
      }

      while(true) {
         boolean var11 = false;

         try {
            var11 = true;
            if(!ii.a(this.a)) {
               var11 = false;
               break;
            }

            ii.d(this.a);
         } finally {
            if(var11) {
               Object var5 = ii.a;
               synchronized(ii.a) {
                  --ii.c;
               }
            }
         }
      }

      var1 = ii.a;
      synchronized(ii.a) {
         --ii.c;
      }
   }
}
