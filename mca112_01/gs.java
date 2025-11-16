import java.io.File;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class gs extends cn {

   private LinkedList z = new LinkedList();
   private gy A;
   private lz B;
   private boolean C = false;
   private fi D = new fi();
   private Set E = new HashSet();
   private Set F = new HashSet();


   public gs(gy var1) {
      super("MpServer");
      this.A = var1;
      this.o = 8;
      this.p = 64;
      this.q = 8;
   }

   public void g() {
      ++this.c;
      int var1 = this.a(1.0F);
      int var2;
      if(var1 != this.e) {
         this.e = var1;

         for(var2 = 0; var2 < this.s.size(); ++var2) {
            ((im)this.s.get(var2)).e();
         }
      }

      for(var2 = 0; var2 < 10 && !this.F.isEmpty(); ++var2) {
         kh var3 = (kh)this.F.iterator().next();
         this.a(var3);
      }

      this.A.a();

      for(var2 = 0; var2 < this.z.size(); ++var2) {
         lc var4 = (lc)this.z.get(var2);
         if(--var4.d == 0) {
            super.a(var4.a, var4.b, var4.c, var4.e, var4.f);
            super.h(var4.a, var4.b, var4.c);
            this.z.remove(var2--);
         }
      }

   }

   public void c(int var1, int var2, int var3, int var4, int var5, int var6) {
      for(int var7 = 0; var7 < this.z.size(); ++var7) {
         lc var8 = (lc)this.z.get(var7);
         if(var8.a >= var1 && var8.b >= var2 && var8.c >= var3 && var8.a <= var4 && var8.b <= var5 && var8.c <= var6) {
            this.z.remove(var7--);
         }
      }

   }

   protected aw a(File var1) {
      this.B = new lz(this);
      return this.B;
   }

   public void a() {
      this.o = 8;
      this.p = 64;
      this.q = 8;
   }

   protected void h() {}

   public void h(int var1, int var2, int var3, int var4) {}

   public boolean a(boolean var1) {
      return false;
   }

   public void a(int var1, int var2, boolean var3) {
      if(var3) {
         this.B.d(var1, var2);
      } else {
         this.B.c(var1, var2);
      }

      if(!var3) {
         this.b(var1 * 16, 0, var2 * 16, var1 * 16 + 15, 128, var2 * 16 + 15);
      }

   }

   public boolean a(kh var1) {
      boolean var2 = super.a(var1);
      if(var1 instanceof bi) {
         this.E.add(var1);
      }

      return var2;
   }

   public void d(kh var1) {
      super.d(var1);
      if(var1 instanceof bi) {
         this.E.remove(var1);
      }

   }

   protected void b(kh var1) {
      super.b(var1);
      if(this.F.contains(var1)) {
         this.F.remove(var1);
      }

   }

   protected void c(kh var1) {
      super.c(var1);
      if(this.E.contains(var1)) {
         this.F.add(var1);
      }

   }

   public void a(int var1, kh var2) {
      this.E.add(var2);
      if(!this.a(var2)) {
         this.F.add(var2);
      }

      this.D.a(var1, var2);
   }

   public kh b(int var1) {
      return (kh)this.D.a(var1);
   }

   public kh c(int var1) {
      kh var2 = (kh)this.D.b(var1);
      if(var2 != null) {
         this.E.remove(var2);
         this.d(var2);
      }

      return var2;
   }

   public boolean c(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.e(var1, var2, var3);
      if(super.c(var1, var2, var3, var4)) {
         this.z.add(new lc(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4, int var5) {
      int var6 = this.a(var1, var2, var3);
      int var7 = this.e(var1, var2, var3);
      if(super.a(var1, var2, var3, var4, var5)) {
         this.z.add(new lc(this, var1, var2, var3, var6, var7));
         return true;
      } else {
         return false;
      }
   }

   public boolean a(int var1, int var2, int var3, int var4) {
      int var5 = this.a(var1, var2, var3);
      int var6 = this.e(var1, var2, var3);
      if(super.a(var1, var2, var3, var4)) {
         this.z.add(new lc(this, var1, var2, var3, var5, var6));
         return true;
      } else {
         return false;
      }
   }

   public boolean c(int var1, int var2, int var3, int var4, int var5) {
      this.c(var1, var2, var3, var1, var2, var3);
      if(super.a(var1, var2, var3, var4, var5)) {
         this.e(var1, var2, var3, var4);
         return true;
      } else {
         return false;
      }
   }

   public void b(int var1, int var2, int var3, ic var4) {
      if(!this.C) {
         this.A.a((fn)(new ny(var1, var2, var3, var4)));
      }
   }

   public void k() {
      this.A.a((fn)(new oh("Quitting")));
   }
}
