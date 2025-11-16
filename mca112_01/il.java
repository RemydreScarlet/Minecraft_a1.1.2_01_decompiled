import net.minecraft.client.Minecraft;

public class il extends hq {

   public il(Minecraft var1) {
      super(var1);
      this.b = true;
   }

   public void b(dm var1) {
      for(int var2 = 0; var2 < 9; ++var2) {
         if(var1.b.a[var2] == null) {
            this.a.g.b.a[var2] = new ev(((ly)dl.a.get(var2)).bc);
         } else {
            this.a.g.b.a[var2].a = 1;
         }
      }

   }

   public boolean d() {
      return false;
   }

   public void a(cn var1) {
      super.a(var1);
   }

   public void c() {}
}
