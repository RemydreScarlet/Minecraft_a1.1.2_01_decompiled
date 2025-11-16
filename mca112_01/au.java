import org.lwjgl.opengl.GL11;

public class au extends bh {

   public void a() {
      this.e.clear();
      this.e.add(new fk(1, this.c / 2 - 100, this.d / 4 + 72, "Respawn"));
      this.e.add(new fk(2, this.c / 2 - 100, this.d / 4 + 96, "Title menu"));
      if(this.b.i == null) {
         ((fk)this.e.get(1)).g = false;
      }

   }

   protected void a(char var1, int var2) {}

   protected void a(fk var1) {
      if(var1.f == 0) {
         ;
      }

      if(var1.f == 1) {
         this.b.o();
         this.b.a((bh)null);
      }

      if(var1.f == 2) {
         this.b.a((cn)null);
         this.b.a((bh)(new cx()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.a(0, 0, this.c, this.d, 1615855616, -1602211792);
      GL11.glPushMatrix();
      GL11.glScalef(2.0F, 2.0F, 2.0F);
      this.a(this.g, "Game over!", this.c / 2 / 2, 30, 16777215);
      GL11.glPopMatrix();
      this.a(this.g, "Score: &e" + this.b.g.r(), this.c / 2, 100, 16777215);
      super.a(var1, var2, var3);
   }

   public boolean b() {
      return false;
   }
}
