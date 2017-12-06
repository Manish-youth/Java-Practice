
package test;

interface Shape
{
    double area();
    double peri();
}
class Rect1 implements Shape
{
    double length , breadth;
    Rect1(int l , int b)
    {
        length  = l ;
        breadth = b;
    }
    public double area()
    {
        return (length*breadth);
    }
    public double peri()
    {
        return 2*(length+breadth);
    }
}
public class InterFace {
    public static void main(String args[])
    {
        Shape s;
        s = new Rect1(10,12);
        System.out.println(s.area());
        System.out.println(s.peri());
        
    }
    
}
