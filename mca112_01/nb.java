import java.awt.Canvas;
import java.awt.Dimension;

class nb extends Canvas {

   public nb(int var1) {
      this.setPreferredSize(new Dimension(var1, var1));
      this.setMinimumSize(new Dimension(var1, var1));
   }
}
