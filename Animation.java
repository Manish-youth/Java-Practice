import java.awt.*;  
import java.applet.*;  
public class Animation extends Applet  
  { 
  Image picture ;
  public void init()
          {
               picture = getImage(getDocumentBase(),"img/a1.jpeg"); 
          }
  public void paint(Graphics g)
  { 
	AudioClip gong = getAudioClip(getDocumentBase(), "1.wav");
   	 gong.play();
    for(int i=0;i<500;i++)
    {
        g.drawImage(picture,i,30, this); 
        try
        {
	 
          Thread.sleep(10);  
        }catch(Exception ex){}
    }    
  }  
      

}
/*
<applet code="Animation.class" width="1080" height="600"> </applet>  */
  