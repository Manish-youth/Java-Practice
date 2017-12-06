import java.applet.*;
import java.awt.*;
public class FindMaxParam extends Applet
{
    int num1,num2,num3;
    String str;
    public void init()
    {
        try
        {
        num1 = Integer.parseInt(getParameter("N1"));
        num2 = Integer.parseInt(getParameter("N2"));
        num3 = Integer.parseInt(getParameter("N3"));
        if(num1>num2 && num1>num3)
        {
            str = "Number num1 "+ num1+" is greater";
        }
        if(num2>num1 && num2>num3)
        {
            str = "Number num2 "+ num2+" is greater";
        }
        if(num3>num2 && num3>num2)
        {
            str = "Number num3 "+ num3+" is greater";
        }
        }
        catch(Exception ex ){}
    }
    public void paint(Graphics g)
    {
        g.drawString(str, 30, 50);
    }
    
    
} 

/*<applet code ="FindMaxParam.java" height=400 width = 500>
<param name="N1" value =20>
<param name="N2" value = 30>
<param name="N3" value = 50>
</applet>  */