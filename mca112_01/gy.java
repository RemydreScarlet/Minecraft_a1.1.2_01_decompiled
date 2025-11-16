import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class gy extends lb {

   private boolean c = false;
   private ii d;
   public String a;
   private Minecraft e;
   private gs f;
   private boolean g = false;
   Random b = new Random();


   public gy(Minecraft var1, String var2, int var3) {
      this.e = var1;
      Socket var4 = new Socket(InetAddress.getByName(var2), var3);
      this.d = new ii(var4, "Client", this);
   }

   public void a() {
      if(!this.c) {
         this.d.a();
      }
   }

   public void a(hp var1) {
      this.e.b = new nj(this.e, this);
      this.f = new gs(this);
      this.f.y = true;
      this.e.a((cn)this.f);
      this.e.a((bh)(new dg(this)));
   }

   public void a(ha var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      dx var8 = new dx(this.f, var2, var4, var6, new ev(var1.h, var1.i));
      var8.an = (double)var1.e / 128.0D;
      var8.ao = (double)var1.f / 128.0D;
      var8.ap = (double)var1.g / 128.0D;
      var8.bd = var1.b;
      var8.be = var1.c;
      var8.bf = var1.d;
      this.f.a(var1.a, var8);
   }

   public void a(kj var1) {
      double var2 = (double)var1.b / 32.0D;
      double var4 = (double)var1.c / 32.0D;
      double var6 = (double)var1.d / 32.0D;
      Object var8 = null;
      if(var1.e == 10) {
         var8 = new oc(this.f, var2, var4, var6, 0);
      }

      if(var1.e == 11) {
         var8 = new oc(this.f, var2, var4, var6, 1);
      }

      if(var1.e == 12) {
         var8 = new oc(this.f, var2, var4, var6, 2);
      }

      if(var1.e == 1) {
         var8 = new dc(this.f, var2, var4, var6);
      }

      if(var8 != null) {
         ((kh)var8).bd = var1.b;
         ((kh)var8).be = var1.c;
         ((kh)var8).bf = var1.d;
         ((kh)var8).aq = 0.0F;
         ((kh)var8).ar = 0.0F;
         ((kh)var8).ab = var1.a;
         this.f.a(var1.a, (kh)var8);
      }

   }

   public void a(gp var1) {
      double var2 = (double)var1.c / 32.0D;
      double var4 = (double)var1.d / 32.0D;
      double var6 = (double)var1.e / 32.0D;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      nt var10 = new nt(this.e.e, var1.b);
      var10.bd = var1.c;
      var10.be = var1.d;
      var10.bf = var1.e;
      int var11 = var1.h;
      if(var11 == 0) {
         var10.b.a[var10.b.d] = null;
      } else {
         var10.b.a[var10.b.d] = new ev(var11);
      }

      var10.b(var2, var4, var6, var8, var9);
      this.f.a(var1.a, var10);
   }

   public void a(jl var1) {
      kh var2 = this.f.b(var1.a);
      if(var2 != null) {
         var2.bd = var1.b;
         var2.be = var1.c;
         var2.bf = var1.d;
         double var3 = (double)var2.bd / 32.0D;
         double var5 = (double)var2.be / 32.0D;
         double var7 = (double)var2.bf / 32.0D;
         float var9 = (float)(var1.e * 360) / 256.0F;
         float var10 = (float)(var1.f * 360) / 256.0F;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(lq var1) {
      kh var2 = this.f.b(var1.a);
      if(var2 != null) {
         var2.bd += var1.b;
         var2.be += var1.c;
         var2.bf += var1.d;
         double var3 = (double)var2.bd / 32.0D;
         double var5 = (double)var2.be / 32.0D;
         double var7 = (double)var2.bf / 32.0D;
         float var9 = var1.g?(float)(var1.e * 360) / 256.0F:var2.aq;
         float var10 = var1.g?(float)(var1.f * 360) / 256.0F:var2.ar;
         var2.a(var3, var5, var7, var9, var10, 3);
      }
   }

   public void a(ju var1) {
      this.f.c(var1.a);
   }

   public void a(eh var1) {
      bi var2 = this.e.g;
      double var3 = var2.ak;
      double var5 = var2.al;
      double var7 = var2.am;
      float var9 = var2.aq;
      float var10 = var2.ar;
      if(var1.h) {
         var3 = var1.a;
         var5 = var1.b;
         var7 = var1.c;
      }

      if(var1.i) {
         var9 = var1.e;
         var10 = var1.f;
      }

      var2.aL = 0.0F;
      var2.an = var2.ao = var2.ap = 0.0D;
      var2.b(var3, var5, var7, var9, var10);
      var1.a = var2.ak;
      var1.b = var2.au.b;
      var1.c = var2.am;
      var1.d = var2.al;
      this.d.a((fn)var1);
      if(!this.g) {
         this.e.g.ah = this.e.g.ak;
         this.e.g.ai = this.e.g.al;
         this.e.g.aj = this.e.g.am;
         this.g = true;
         this.e.a((bh)null);
      }

   }

   public void a(ka var1) {
      this.f.a(var1.a, var1.b, var1.c);
   }

   public void a(na var1) {
      ga var2 = this.f.b(var1.a, var1.b);
      int var3 = var1.a * 16;
      int var4 = var1.b * 16;

      for(int var5 = 0; var5 < var1.f; ++var5) {
         short var6 = var1.c[var5];
         int var7 = var1.d[var5] & 255;
         byte var8 = var1.e[var5];
         int var9 = var6 >> 12 & 15;
         int var10 = var6 >> 8 & 15;
         int var11 = var6 & 255;
         var2.a(var9, var11, var10, var7, var8);
         this.f.c(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
         this.f.b(var9 + var3, var11, var10 + var4, var9 + var3, var11, var10 + var4);
      }

   }

   public void a(bz var1) {
      this.f.c(var1.a, var1.b, var1.c, var1.a + var1.d - 1, var1.b + var1.e - 1, var1.c + var1.f - 1);
      this.f.a(var1.a, var1.b, var1.c, var1.d, var1.e, var1.f, var1.g);
   }

   public void a(li var1) {
      this.f.c(var1.a, var1.b, var1.c, var1.d, var1.e);
   }

   public void a(oh var1) {
      this.d.a("Got kicked");
      this.c = true;
      this.e.a((cn)null);
      this.e.a((bh)(new cj("Disconnected by server", var1.a)));
   }

   public void a(String var1) {
      if(!this.c) {
         this.c = true;
         this.e.a((cn)null);
         this.e.a((bh)(new cj("Connection lost", var1)));
      }
   }

   public void a(fn var1) {
      if(!this.c) {
         this.d.a(var1);
      }
   }

   public void a(bm var1) {
      dx var2 = (dx)this.f.b(var1.a);
      Object var3 = (ge)this.f.b(var1.b);
      if(var3 == null) {
         var3 = this.e.g;
      }

      if(var2 != null) {
         this.f.a(var2, "random.pop", 0.2F, ((this.b.nextFloat() - this.b.nextFloat()) * 0.7F + 1.0F) * 2.0F);
         this.e.h.a((nq)(new cd(this.e.e, var2, (kh)var3, -0.5F)));
         this.f.c(var1.a);
      }

   }

   public void a(dz var1) {
      kh var2 = this.f.b(var1.a);
      if(var2 != null) {
         dm var3 = (dm)var2;
         int var4 = var1.b;
         if(var4 == 0) {
            var3.b.a[var3.b.d] = null;
         } else {
            var3.b.a[var3.b.d] = new ev(var4);
         }

      }
   }

   public void a(ij var1) {
      this.e.u.a(var1.a);
   }

   public void a(hf var1) {
      kh var2 = this.f.b(var1.a);
      if(var2 != null) {
         dm var3 = (dm)var2;
         var3.w();
      }
   }

   public void a(ld var1) {
      this.e.g.b.a(new ev(var1.a, var1.b, var1.c));
   }

   public void a(gt var1) {
      if(var1.a.equals("-")) {
         this.a((fn)(new hp(this.e.i.b, "Password", 2)));
      } else {
         try {
            URL var2 = new URL("http://www.minecraft.net/game/joinserver.jsp?user=" + this.e.i.b + "&sessionId=" + this.e.i.c + "&serverId=" + var1.a);
            BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.openStream()));
            String var4 = var3.readLine();
            var3.close();
            if(var4.equalsIgnoreCase("ok")) {
               this.a((fn)(new hp(this.e.i.b, "Password", 2)));
            } else {
               this.d.a("Failed to login: " + var4);
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            this.d.a("Internal client error: " + var5.toString());
         }
      }

   }

   public void b() {
      this.c = true;
      this.d.a("Closed");
   }

   public void a(ez var1) {
      double var2 = (double)var1.c / 32.0D;
      double var4 = (double)var1.d / 32.0D;
      double var6 = (double)var1.e / 32.0D;
      float var8 = (float)(var1.f * 360) / 256.0F;
      float var9 = (float)(var1.g * 360) / 256.0F;
      ge var10 = (ge)ew.a(var1.b, this.e.e);
      var10.bd = var1.c;
      var10.be = var1.d;
      var10.bf = var1.e;
      var10.b(var2, var4, var6, var8, var9);
      var10.B = true;
      this.f.a(var1.a, var10);
   }

   public void a(du var1) {
      this.e.e.a(var1.a);
   }

   public void a(m var1) {
      bi var2 = this.e.g;
      if(var1.a == -1) {
         var2.b.a = var1.b;
      }

      if(var1.a == -2) {
         var2.b.c = var1.b;
      }

      if(var1.a == -3) {
         var2.b.b = var1.b;
      }

   }

   public void a(ny var1) {
      ic var2 = this.f.b(var1.a, var1.b, var1.c);
      if(var2 != null) {
         var2.a(var1.e);
         this.f.b(var1.a, var1.b, var1.c, var1.a, var1.b, var1.c);
      }

   }

   public void a(ji var1) {
      this.f.o = var1.a;
      this.f.p = var1.b;
      this.f.q = var1.c;
   }
}
