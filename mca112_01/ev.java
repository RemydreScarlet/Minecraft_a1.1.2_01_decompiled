
public final class ev {

   public int a;
   public int b;
   public int c;
   public int d;


   public ev(ly var1) {
      this(var1, 1);
   }

   public ev(ly var1, int var2) {
      this(var1.bc, var2);
   }

   public ev(di var1) {
      this(var1, 1);
   }

   public ev(di var1, int var2) {
      this(var1.aS, var2);
   }

   public ev(int var1) {
      this(var1, 1);
   }

   public ev(int var1, int var2) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
   }

   public ev(int var1, int var2, int var3) {
      this.a = 0;
      this.c = var1;
      this.a = var2;
      this.d = var3;
   }

   public ev(hm var1) {
      this.a = 0;
      this.b(var1);
   }

   public ev a(int var1) {
      this.a -= var1;
      return new ev(this.c, var1, this.d);
   }

   public di a() {
      return di.c[this.c];
   }

   public int b() {
      return this.a().a(this);
   }

   public boolean a(dm var1, cn var2, int var3, int var4, int var5, int var6) {
      return this.a().a(this, var1, var2, var3, var4, var5, var6);
   }

   public float a(ly var1) {
      return this.a().a(this, var1);
   }

   public ev a(cn var1, dm var2) {
      return this.a().a(this, var1, var2);
   }

   public hm a(hm var1) {
      var1.a("id", (short)this.c);
      var1.a("Count", (byte)this.a);
      var1.a("Damage", (short)this.d);
      return var1;
   }

   public void b(hm var1) {
      this.c = var1.d("id");
      this.a = var1.c("Count");
      this.d = var1.d("Damage");
   }

   public int c() {
      return this.a().b();
   }

   public int d() {
      return di.c[this.c].c();
   }

   public void b(int var1) {
      this.d += var1;
      if(this.d > this.d()) {
         --this.a;
         if(this.a < 0) {
            this.a = 0;
         }

         this.d = 0;
      }

   }

   public void a(ge var1) {
      di.c[this.c].a(this, var1);
   }

   public void a(int var1, int var2, int var3, int var4) {
      di.c[this.c].a(this, var1, var2, var3, var4);
   }

   public int a(kh var1) {
      return di.c[this.c].a(var1);
   }

   public boolean b(ly var1) {
      return di.c[this.c].a(var1);
   }

   public void a(dm var1) {}

   public void b(ge var1) {
      di.c[this.c].b(this, var1);
   }

   public ev e() {
      return new ev(this.c, this.a, this.d);
   }
}
