
package test;
class Parrent
{
   void fun()
   {
       System.out.println("This is parrent class");
   }
}
class Child extends Parrent
{
    void fun1()
    {
        System.out.println("This is child class");
    }
    
}
public class ParrentChild  {
    public static void main(String args[])
    {
        Child ch = new  Child();
        ch.fun();
        ch.fun1();
        
    }
    
}
  
