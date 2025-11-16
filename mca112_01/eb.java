import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class eb {

   private Random c = new Random();
   private Map d = new HashMap();
   private List e = new ArrayList();
   public int a = 0;
   public boolean b = true;


   public ah a(String var1, File var2) {
      try {
         String var3 = var1;
         var1 = var1.substring(0, var1.indexOf("."));
         if(this.b) {
            while(Character.isDigit(var1.charAt(var1.length() - 1))) {
               var1 = var1.substring(0, var1.length() - 1);
            }
         }

         var1 = var1.replaceAll("/", ".");
         if(!this.d.containsKey(var1)) {
            this.d.put(var1, new ArrayList());
         }

         ah var4 = new ah(var3, var2.toURI().toURL());
         ((List)this.d.get(var1)).add(var4);
         this.e.add(var4);
         ++this.a;
         return var4;
      } catch (MalformedURLException var5) {
         var5.printStackTrace();
         throw new RuntimeException(var5);
      }
   }

   public ah a(String var1) {
      List var2 = (List)this.d.get(var1);
      return var2 == null?null:(ah)var2.get(this.c.nextInt(var2.size()));
   }

   public ah a() {
      return this.e.size() == 0?null:(ah)this.e.get(this.c.nextInt(this.e.size()));
   }
}
