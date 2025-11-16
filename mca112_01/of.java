import java.io.File;
import java.util.Random;
import paulscode.sound.SoundSystem;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.codecs.CodecWav;
import paulscode.sound.libraries.LibraryLWJGLOpenAL;

public class of {

   private static SoundSystem a;
   private eb b = new eb();
   private eb c = new eb();
   private eb d = new eb();
   private int e = 0;
   private fr f;
   private static boolean g = false;
   private Random h = new Random();
   private int i;


   public of() {
      this.i = this.h.nextInt(12000);
   }

   public void a(fr var1) {
      this.c.b = false;
      this.f = var1;
      if(!g && (var1 == null || var1.b != 0.0F || var1.a != 0.0F)) {
         this.d();
      }

   }

   private void d() {
      try {
         float var1 = this.f.b;
         float var2 = this.f.a;
         this.f.b = 0.0F;
         this.f.a = 0.0F;
         this.f.b();
         SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
         SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
         SoundSystemConfig.setCodec("mus", ep.class);
         SoundSystemConfig.setCodec("wav", CodecWav.class);
         a = new SoundSystem();
         this.f.b = var1;
         this.f.a = var2;
         this.f.b();
      } catch (Throwable var3) {
         var3.printStackTrace();
         System.err.println("error linking with the LibraryJavaSound plug-in");
      }

      g = true;
   }

   public void a() {
      if(!g && (this.f.b != 0.0F || this.f.a != 0.0F)) {
         this.d();
      }

      if(this.f.a == 0.0F) {
         a.stop("BgMusic");
      } else {
         a.setVolume("BgMusic", this.f.a);
      }

   }

   public void b() {
      if(g) {
         a.cleanup();
      }

   }

   public void a(String var1, File var2) {
      this.b.a(var1, var2);
   }

   public void b(String var1, File var2) {
      this.c.a(var1, var2);
   }

   public void c(String var1, File var2) {
      this.d.a(var1, var2);
   }

   public void c() {
      if(g && this.f.a != 0.0F) {
         if(!a.playing("BgMusic") && !a.playing("streaming")) {
            if(this.i > 0) {
               --this.i;
               return;
            }

            ah var1 = this.d.a();
            if(var1 != null) {
               this.i = this.h.nextInt(24000) + 24000;
               a.backgroundMusic("BgMusic", var1.b, var1.a, false);
               a.setVolume("BgMusic", this.f.a);
               a.play("BgMusic");
            }
         }

      }
   }

   public void a(ge var1, float var2) {
      if(g && this.f.b != 0.0F) {
         if(var1 != null) {
            float var3 = var1.as + (var1.aq - var1.as) * var2;
            double var4 = var1.ah + (var1.ak - var1.ah) * (double)var2;
            double var6 = var1.ai + (var1.al - var1.ai) * (double)var2;
            double var8 = var1.aj + (var1.am - var1.aj) * (double)var2;
            float var10 = eo.b(-var3 * 0.017453292F - 3.1415927F);
            float var11 = eo.a(-var3 * 0.017453292F - 3.1415927F);
            float var12 = -var11;
            float var13 = 0.0F;
            float var14 = -var10;
            float var15 = 0.0F;
            float var16 = 1.0F;
            float var17 = 0.0F;
            a.setListenerPosition((float)var4, (float)var6, (float)var8);
            a.setListenerOrientation(var12, var13, var14, var15, var16, var17);
         }
      }
   }

   public void a(String var1, float var2, float var3, float var4, float var5, float var6) {
      if(g && this.f.b != 0.0F) {
         String var7 = "streaming";
         if(a.playing("streaming")) {
            a.stop("streaming");
         }

         if(var1 != null) {
            ah var8 = this.c.a(var1);
            if(var8 != null && var5 > 0.0F) {
               if(a.playing("BgMusic")) {
                  a.stop("BgMusic");
               }

               float var9 = 16.0F;
               a.newStreamingSource(true, var7, var8.b, var8.a, false, var2, var3, var4, 2, var9 * 4.0F);
               a.setVolume(var7, 0.5F * this.f.b);
               a.play(var7);
            }

         }
      }
   }

   public void b(String var1, float var2, float var3, float var4, float var5, float var6) {
      if(g && this.f.b != 0.0F) {
         ah var7 = this.b.a(var1);
         if(var7 != null && var5 > 0.0F) {
            this.e = (this.e + 1) % 256;
            String var8 = "sound_" + this.e;
            float var9 = 16.0F;
            if(var5 > 1.0F) {
               var9 *= var5;
            }

            a.newSource(var5 > 1.0F, var8, var7.b, var7.a, false, var2, var3, var4, 2, var9);
            a.setPitch(var8, var6);
            if(var5 > 1.0F) {
               var5 = 1.0F;
            }

            a.setVolume(var8, var5 * this.f.b);
            a.play(var8);
         }

      }
   }

   public void a(String var1, float var2, float var3) {
      if(g && this.f.b != 0.0F) {
         ah var4 = this.b.a(var1);
         if(var4 != null) {
            this.e = (this.e + 1) % 256;
            String var5 = "sound_" + this.e;
            a.newSource(false, var5, var4.b, var4.a, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
            if(var2 > 1.0F) {
               var2 = 1.0F;
            }

            var2 *= 0.25F;
            a.setPitch(var5, var3);
            a.setVolume(var5, var2 * this.f.b);
            a.play(var5);
         }

      }
   }

}
