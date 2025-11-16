import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class fr {

   private static final String[] y = new String[]{"FAR", "NORMAL", "SHORT", "TINY"};
   private static final String[] z = new String[]{"Peaceful", "Easy", "Normal", "Hard"};
   public float a = 1.0F;
   public float b = 1.0F;
   public float c = 0.5F;
   public boolean d = false;
   public int e = 0;
   public boolean f = true;
   public boolean g = false;
   public boolean h = false;
   public boolean i = true;
   public it j = new it("Forward", 17);
   public it k = new it("Left", 30);
   public it l = new it("Back", 31);
   public it m = new it("Right", 32);
   public it n = new it("Jump", 57);
   public it o = new it("Inventory", 23);
   public it p = new it("Drop", 16);
   public it q = new it("Chat", 20);
   public it r = new it("Toggle fog", 33);
   public it s = new it("Sneak", 42);
   public it[] t;
   protected Minecraft u;
   private File A;
   public int v;
   public int w;
   public boolean x;


   public fr(Minecraft var1, File var2) {
      this.t = new it[]{this.j, this.k, this.l, this.m, this.n, this.s, this.p, this.o, this.q, this.r};
      this.v = 10;
      this.w = 2;
      this.x = false;
      this.u = var1;
      this.A = new File(var2, "options.txt");
      this.a();
   }

   public fr() {
      this.t = new it[]{this.j, this.k, this.l, this.m, this.n, this.s, this.p, this.o, this.q, this.r};
      this.v = 10;
      this.w = 2;
      this.x = false;
   }

   public String a(int var1) {
      return this.t[var1].a + ": " + Keyboard.getKeyName(this.t[var1].b);
   }

   public void a(int var1, int var2) {
      this.t[var1].b = var2;
      this.b();
   }

   public void a(int var1, float var2) {
      if(var1 == 0) {
         this.a = var2;
         this.u.A.a();
      }

      if(var1 == 1) {
         this.b = var2;
         this.u.A.a();
      }

      if(var1 == 3) {
         this.c = var2;
      }

   }

   public void b(int var1, int var2) {
      if(var1 == 2) {
         this.d = !this.d;
      }

      if(var1 == 4) {
         this.e = this.e + var2 & 3;
      }

      if(var1 == 5) {
         this.f = !this.f;
      }

      if(var1 == 6) {
         this.g = !this.g;
         this.u.n.b();
      }

      if(var1 == 7) {
         this.h = !this.h;
      }

      if(var1 == 8) {
         this.w = this.w + var2 & 3;
      }

      if(var1 == 9) {
         this.i = !this.i;
         this.u.f.a();
      }

      this.b();
   }

   public int b(int var1) {
      return var1 == 0?1:(var1 == 1?1:(var1 == 3?1:0));
   }

   public float c(int var1) {
      return var1 == 0?this.a:(var1 == 1?this.b:(var1 == 3?this.c:0.0F));
   }

   public String d(int var1) {
      return var1 == 0?"Music: " + (this.a > 0.0F?(int)(this.a * 100.0F) + "%":"OFF"):(var1 == 1?"Sound: " + (this.b > 0.0F?(int)(this.b * 100.0F) + "%":"OFF"):(var1 == 2?"Invert mouse: " + (this.d?"ON":"OFF"):(var1 == 3?(this.c == 0.0F?"Sensitivity: *yawn*":(this.c == 1.0F?"Sensitivity: HYPERSPEED!!!":"Sensitivity: " + (int)(this.c * 200.0F) + "%")):(var1 == 4?"Render distance: " + y[this.e]:(var1 == 5?"View bobbing: " + (this.f?"ON":"OFF"):(var1 == 6?"3d anaglyph: " + (this.g?"ON":"OFF"):(var1 == 7?"Limit framerate: " + (this.h?"ON":"OFF"):(var1 == 8?"Difficulty: " + z[this.w]:(var1 == 9?"Graphics: " + (this.i?"FANCY":"FAST"):"")))))))));
   }

   public void a() {
      try {
         if(!this.A.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(new FileReader(this.A));
         String var2 = "";

         while((var2 = var1.readLine()) != null) {
            String[] var3 = var2.split(":");
            if(var3[0].equals("music")) {
               this.a = this.a(var3[1]);
            }

            if(var3[0].equals("sound")) {
               this.b = this.a(var3[1]);
            }

            if(var3[0].equals("mouseSensitivity")) {
               this.c = this.a(var3[1]);
            }

            if(var3[0].equals("invertYMouse")) {
               this.d = var3[1].equals("true");
            }

            if(var3[0].equals("viewDistance")) {
               this.e = Integer.parseInt(var3[1]);
            }

            if(var3[0].equals("bobView")) {
               this.f = var3[1].equals("true");
            }

            if(var3[0].equals("anaglyph3d")) {
               this.g = var3[1].equals("true");
            }

            if(var3[0].equals("limitFramerate")) {
               this.h = var3[1].equals("true");
            }

            if(var3[0].equals("difficulty")) {
               this.w = Integer.parseInt(var3[1]);
            }

            if(var3[0].equals("fancyGraphics")) {
               this.i = var3[1].equals("true");
            }

            for(int var4 = 0; var4 < this.t.length; ++var4) {
               if(var3[0].equals("key_" + this.t[var4].a)) {
                  this.t[var4].b = Integer.parseInt(var3[1]);
               }
            }
         }

         var1.close();
      } catch (Exception var5) {
         System.out.println("Failed to load options");
         var5.printStackTrace();
      }

   }

   private float a(String var1) {
      return var1.equals("true")?1.0F:(var1.equals("false")?0.0F:Float.parseFloat(var1));
   }

   public void b() {
      try {
         PrintWriter var1 = new PrintWriter(new FileWriter(this.A));
         var1.println("music:" + this.a);
         var1.println("sound:" + this.b);
         var1.println("invertYMouse:" + this.d);
         var1.println("mouseSensitivity:" + this.c);
         var1.println("viewDistance:" + this.e);
         var1.println("bobView:" + this.f);
         var1.println("anaglyph3d:" + this.g);
         var1.println("limitFramerate:" + this.h);
         var1.println("difficulty:" + this.w);
         var1.println("fancyGraphics:" + this.i);

         for(int var2 = 0; var2 < this.t.length; ++var2) {
            var1.println("key_" + this.t[var2].a + ":" + this.t[var2].b);
         }

         var1.close();
      } catch (Exception var3) {
         System.out.println("Failed to save options");
         var3.printStackTrace();
      }

   }

}
