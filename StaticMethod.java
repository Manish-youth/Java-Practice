
package test;

public class StaticMethod {
    int x ;
    public static void myMethod()
    {
        int c =0;
        if(true)
        {   
            c=c+5;
            System.out.println("Hello Sttic Method " + c);    
        }
    }
    public static void main(String args[])
    {
        StaticMethod.myMethod();
        new StaticMethod().myMethod();
    }
    
}
