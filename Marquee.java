import java.awt.*;
import java.applet.*;
public class Marquee extends Applet implements Runnable
{
    String msg = "WELCOME TO JAVA";
    Thread t= null;
    int state;
    boolean stop;
    int x= 1;
    int y= 500;
    public void init()
    {
        setBackground(Color.BLUE);
        setForeground(Color.RED);
        Font f = new Font("Arial",Font.BOLD,80);
        setFont(f);
    } 
        public void start()
        {
         t= new Thread(this);
         stop = false;
         t.start();
        }
        public void run()
        {
            for(;;)
            {
                try{
                    repaint(50);
                    Thread.sleep(100);
                    x++;
                    if((x-10)>(this.getSize().width))
                    {
                        x=1;
                    }
                    if(stop )
                    {
                        break;
                    }
                }
                catch(Exception ex)
                {
                    msg = "Thread Intrupted";
                }
            }
        }
         public void stop()
            {
                stop = false;
                t= null;
            }
        public void paint(Graphics g)
        {
           g.drawString(msg,x,y); 
        }   
    
}
/*<applet code="Marquee.class" width="1200" height="1000"> </applet>  */