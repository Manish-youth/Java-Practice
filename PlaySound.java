import java.awt.*;  
import java.applet.*;  
public class PlaySound extends Applet  
  { 
  Image picture ;
  public void init()
          {
               picture = getImage(getDocumentBase(),"img/a2.jpeg"); 
          }
  public void paint(Graphics g)
  { 
    try{
        g.drawImage(picture,10,30, this); 
       play(getDocumentBase(),"1.wav");
	//AudioClip gong = getAudioClip(getDocumentBase(), "1.wav");
   	// gong.play();
	}catch(Exception ex){}

  }  
      

}
/*
<applet code="PlaySound.class" width="700" height="700"> </applet>  */
  