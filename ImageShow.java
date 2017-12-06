import java.awt.*;  
import java.applet.*;  
public class ImageShow extends Applet  
  { 
  Image picture; 
  String[] list = {"img/a1.jpeg","img/a2.jpeg","img/a3.jpeg","img/a4.jpeg","img/a5.jpeg" ,"img/a6.jpeg","img/a7.jpeg","img/a8.jpeg","img/a9.jpeg","img/a10.jpeg"};
  
  public void paint(Graphics g)
  { 
   while(true)
   {
    for(int i=0;i<list.length;i++)
    {
        picture = getImage(getDocumentBase(),list[i]);
	g.drawImage(picture, 10,10, this);
	 try
	{
	 Thread.sleep(500);
	}catch(Exception ex){}
	Dimension d = getSize();
	g.setColor(Color.WHITE);
	g.fillRect(0, 0, d.width, d.height);
     }    
   }
  }  
}
/*<applet code="ImageShow.class" width="1200" height="650"> </applet>  */