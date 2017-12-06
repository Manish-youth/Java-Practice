import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Testapplet extends Applet
{
Label l1;
TextField t1;
Button b1;
public void init()
{
l1=new Label("Enter a number");
t1=new TextField();
b1=new Button("Find Factorial");
setLayout(null);
l1.setBounds(30,50,100,20);
t1.setBounds(150,50,100,20);
b1.setBounds(100,150,80,20);
add(l1);
add(t1);
add(b1);
}

}