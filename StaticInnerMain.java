class MyOuter
{
    static class MyInner 
    {
        int y;
        int x;
        MyInner()
        {
            x= 12;
            y =6;
        }
        void showvalue()
                {
                 System.out.println(x+ " \n"+y);
                }
    }
}
public class StaticInnerMain {
    public static void main(String args[])
    {
        MyOuter.MyInner ms = new MyOuter.MyInner();
        ms.showvalue();
    }
    
    
}
