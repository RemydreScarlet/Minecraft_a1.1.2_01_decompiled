package net.minecraft.isom;

import java.applet.Applet;
import java.awt.BorderLayout;

public class IsomPreviewApplet extends Applet {

   private ad a = new ad();


   public IsomPreviewApplet() {
      this.setLayout(new BorderLayout());
      this.add(this.a, "Center");
   }

   public void start() {
      this.a.b();
   }

   public void stop() {
      this.a.c();
   }
}
