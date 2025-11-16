
public class dq extends ek implements co {

   protected int e = 2;


   public dq(cn var1) {
      super(var1);
      this.E = 20;
   }

   public void j() {
      float var1 = this.a(1.0F);
      if(var1 > 0.5F) {
         this.U += 2;
      }

      super.j();
   }

   public void e_() {
      super.e_();
      if(this.ag.l == 0) {
         this.F();
      }

   }

   protected kh i() {
      dm var1 = this.ag.a(this, 16.0D);
      return var1 != null && this.c(var1)?var1:null;
   }

   public boolean a(kh var1, int var2) {
      if(super.a(var1, var2)) {
         if(this.ae != var1 && this.af != var1) {
            if(var1 != this) {
               this.f = var1;
            }

            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   protected void a(kh var1, float var2) {
      if((double)var2 < 2.5D && var1.au.e > this.au.b && var1.au.b < this.au.e) {
         this.K = 20;
         var1.a(this, this.e);
      }

   }

   protected float a(int var1, int var2, int var3) {
      return 0.5F - this.ag.c(var1, var2, var3);
   }

   public void a(hm var1) {
      super.a(var1);
   }

   public void b(hm var1) {
      super.b(var1);
   }

   public boolean a() {
      int var1 = eo.b(this.ak);
      int var2 = eo.b(this.au.b);
      int var3 = eo.b(this.am);
      if(this.ag.a(by.a, var1, var2, var3) > this.aQ.nextInt(32)) {
         return false;
      } else {
         int var4 = this.ag.j(var1, var2, var3);
         return var4 <= this.aQ.nextInt(8) && super.a();
      }
   }
}
