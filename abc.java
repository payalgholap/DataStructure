import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="KeyEventDemo" height="400"width="400">
</applet>
*/
public class KeyEventDemo extends applet implements KeyListener
{
   String msg="";
   public void init()
   {
     addKeyListener(this);
   }
   public void KeyReleased(KeyEvent k)
   {
   showStatus("Key Released");
   repaint();
   }
   public void KeyTyped(KeyEvent k)
   
   { 
     showStatus("Key Typed");
   repaint();
   }
    
   public void KeyPressed(KeyEvent k)
   
   { 
     showStatus("Key Pressed");
   repaint();
   }
    public void paint(Graphicsg)
    
    {
     g.drawString(msg,10,10);
    }
} 