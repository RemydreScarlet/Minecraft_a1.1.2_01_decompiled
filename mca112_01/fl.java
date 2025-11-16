import net.minecraft.client.Minecraft;

public class fl extends Thread {

   // $FF: synthetic field
   final Minecraft a;


   public fl(Minecraft var1, String var2) {
      super(var2);
      this.a = var1;
      this.setDaemon(true);
      this.start();
   }

   public void run() {
      while(this.a.F) {
         try {
            Thread.sleep(2147483647L);
         } catch (InterruptedException var2) {
            ;
         }
      }

   }
}
