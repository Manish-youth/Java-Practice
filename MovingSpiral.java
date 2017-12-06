import java.awt.*;
import java.applet.*;
import java.util.*;
public class MovingSpiral extends Applet 
{
    public void paint(Graphics g)
    {
        Graphics2D g1 = (Graphics2D)g;
        g1.setStroke(new BasicStroke(1));
        int w=1, h=1, x=500,y=400,stage=1;
        Random rnd  = new Random(); 
        while(true)
        {
            
            g.setColor(new Color(rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255)));
            g.drawOval(x,y,w,h);
           if(stage==1)
            {
              w+=2;
              h+=2;
              x--;
              y--;
            }
           if(stage==2)
                   {
                     w-=2;
                     h-=2;
                     x++;
                     y++;
                   }
           if(x==100)
           {
               stage =2;
           }
           if(x==400)
           {
               stage =1;
           }
            
        }
        
    }
}
/*
<applet code="MovingSpiral.class" width="1200" height="1000"> </applet> */
