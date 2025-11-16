import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class nc extends Thread {

   // $FF: synthetic field
   final Minecraft a;
   // $FF: synthetic field
   final String b;
   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final mn d;


   nc(mn var1, Minecraft var2, String var3, int var4) {
      this.d = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
   }

   public void run() {
      try {
         mn.a(this.d, new gy(this.a, this.b, this.c));
         if(mn.a(this.d)) {
            return;
         }

         mn.b(this.d).a((fn)(new gt(this.a.i.b)));
      } catch (UnknownHostException var2) {
         if(mn.a(this.d)) {
            return;
         }

         this.a.a((bh)(new cj("Failed to connect to the server", "Unknown host \'" + this.b + "\'")));
      } catch (ConnectException var3) {
         if(mn.a(this.d)) {
            return;
         }

         this.a.a((bh)(new cj("Failed to connect to the server", var3.getMessage())));
      } catch (Exception var4) {
         if(mn.a(this.d)) {
            return;
         }

         var4.printStackTrace();
         this.a.a((bh)(new cj("Failed to connect to the server", var4.toString())));
      }

   }
}
