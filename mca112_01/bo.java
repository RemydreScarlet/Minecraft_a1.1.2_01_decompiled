
public class bo extends ag {

   public boolean a = false;


   public bo(cn var1) {
      super(var1);
      this.u = "/mob/sheep.png";
      this.a(0.9F, 1.3F);
   }

   public boolean a(kh var1, int var2) {
      if(!this.a && var1 instanceof ge) {
         this.a = true;
         int var3 = 1 + this.aQ.nextInt(3);

         for(int var4 = 0; var4 < var3; ++var4) {
            dx var5 = this.a(ly.ac.bc, 1, 1.0F);
            var5.ao += (double)(this.aQ.nextFloat() * 0.05F);
            var5.an += (double)((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.1F);
            var5.ap += (double)((this.aQ.nextFloat() - this.aQ.nextFloat()) * 0.1F);
         }
      }

      return super.a(var1, var2);
   }

   public void a(hm var1) {
      super.a(var1);
      var1.a("Sheared", this.a);
   }

   public void b(hm var1) {
      super.b(var1);
      this.a = var1.m("Sheared");
   }

   protected String c() {
      return "mob.sheep";
   }

   protected String d() {
      return "mob.sheep";
   }

   protected String e() {
      return "mob.sheep";
   }
}
