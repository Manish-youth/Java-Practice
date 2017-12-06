import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class ClockApplet extends Applet {
  
  public void paint(Graphics g){
  Calendar cal = new GregorianCalendar();
  Date d=cal.getTime();
  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
  g.drawString(sdf.format(d), 20, 30);
  }
}
/*<applet code="ClockApplet.class" width="700" height="700"> </applet>  */  