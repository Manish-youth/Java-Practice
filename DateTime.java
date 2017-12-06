import java.awt.*;  
import java.applet.*;
import java.time.*;  
import java.text.*;
public class DateTime extends Applet  
  { 
  public void paint(Graphics g)
  {  
	try{
	LocalDateTime no = LocalDateTime.now();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
	String strDate = sdf.format(no);  
	g.drawString(strDate,30,30);
	    }catch(Exception ex){}
  }  
}
/*<applet code="DateTime.class" width="700" height="700"> </applet>  */  