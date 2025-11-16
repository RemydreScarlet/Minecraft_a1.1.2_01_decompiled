import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

public class le implements af {

   private File a;
   private boolean b;


   public le(File var1, boolean var2) {
      this.a = var1;
      this.b = var2;
   }

   private File a(int var1, int var2) {
      String var3 = "c." + Integer.toString(var1, 36) + "." + Integer.toString(var2, 36) + ".dat";
      String var4 = Integer.toString(var1 & 63, 36);
      String var5 = Integer.toString(var2 & 63, 36);
      File var6 = new File(this.a, var4);
      if(!var6.exists()) {
         if(!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var5);
      if(!var6.exists()) {
         if(!this.b) {
            return null;
         }

         var6.mkdir();
      }

      var6 = new File(var6, var3);
      return !var6.exists() && !this.b?null:var6;
   }

   public ga a(cn var1, int var2, int var3) {
      File var4 = this.a(var2, var3);
      if(var4 != null && var4.exists()) {
         try {
            FileInputStream var5 = new FileInputStream(var4);
            hm var6 = x.a((InputStream)var5);
            if(!var6.b("Level")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing level data, skipping");
               return null;
            }

            if(!var6.k("Level").b("Blocks")) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is missing block data, skipping");
               return null;
            }

            ga var7 = a(var1, var6.k("Level"));
            if(!var7.a(var2, var3)) {
               System.out.println("Chunk file at " + var2 + "," + var3 + " is in the wrong location; relocating. (Expected " + var2 + ", " + var3 + ", got " + var7.j + ", " + var7.k + ")");
               var6.a("xPos", var2);
               var6.a("zPos", var3);
               var7 = a(var1, var6.k("Level"));
            }

            return var7;
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }

      return null;
   }

   public void a(cn var1, ga var2) {
      var1.l();
      File var3 = this.a(var2.j, var2.k);
      if(var3.exists()) {
         var1.v -= var3.length();
      }

      try {
         File var4 = new File(this.a, "tmp_chunk.dat");
         FileOutputStream var5 = new FileOutputStream(var4);
         hm var6 = new hm();
         hm var7 = new hm();
         var6.a("Level", (el)var7);
         this.a(var2, var1, var7);
         x.a(var6, (OutputStream)var5);
         var5.close();
         if(var3.exists()) {
            var3.delete();
         }

         var4.renameTo(var3);
         var1.v += var3.length();
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public void a(ga var1, cn var2, hm var3) {
      var2.l();
      var3.a("xPos", var1.j);
      var3.a("zPos", var1.k);
      var3.a("LastUpdate", var2.c);
      var3.a("Blocks", var1.b);
      var3.a("Data", var1.e.a);
      var3.a("SkyLight", var1.f.a);
      var3.a("BlockLight", var1.g.a);
      var3.a("HeightMap", var1.h);
      var3.a("TerrainPopulated", var1.n);
      var1.r = false;
      ki var4 = new ki();

      Iterator var6;
      hm var8;
      for(int var5 = 0; var5 < var1.m.length; ++var5) {
         var6 = var1.m[var5].iterator();

         while(var6.hasNext()) {
            kh var7 = (kh)var6.next();
            var1.r = true;
            var8 = new hm();
            if(var7.c(var8)) {
               var4.a((el)var8);
            }
         }
      }

      var3.a("Entities", (el)var4);
      ki var9 = new ki();
      var6 = var1.l.values().iterator();

      while(var6.hasNext()) {
         ic var10 = (ic)var6.next();
         var8 = new hm();
         var10.b(var8);
         var9.a((el)var8);
      }

      var3.a("TileEntities", (el)var9);
   }

   public static ga a(cn var0, hm var1) {
      int var2 = var1.e("xPos");
      int var3 = var1.e("zPos");
      ga var4 = new ga(var0, var2, var3);
      var4.b = var1.j("Blocks");
      var4.e = new mu(var1.j("Data"));
      var4.f = new mu(var1.j("SkyLight"));
      var4.g = new mu(var1.j("BlockLight"));
      var4.h = var1.j("HeightMap");
      var4.n = var1.m("TerrainPopulated");
      if(!var4.e.a()) {
         var4.e = new mu(var4.b.length);
      }

      if(var4.h == null || !var4.f.a()) {
         var4.h = new byte[256];
         var4.f = new mu(var4.b.length);
         var4.c();
      }

      if(!var4.g.a()) {
         var4.g = new mu(var4.b.length);
         var4.a();
      }

      ki var5 = var1.l("Entities");
      if(var5 != null) {
         for(int var6 = 0; var6 < var5.c(); ++var6) {
            hm var7 = (hm)var5.a(var6);
            kh var8 = ew.a(var7, var0);
            var4.r = true;
            if(var8 != null) {
               var4.a(var8);
            }
         }
      }

      ki var10 = var1.l("TileEntities");
      if(var10 != null) {
         for(int var11 = 0; var11 < var10.c(); ++var11) {
            hm var12 = (hm)var10.a(var11);
            ic var9 = ic.c(var12);
            if(var9 != null) {
               var4.a(var9);
            }
         }
      }

      return var4;
   }

   public void a() {}

   public void b() {}

   public void b(cn var1, ga var2) {}
}
