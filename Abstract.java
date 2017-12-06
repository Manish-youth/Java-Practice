
package test;
abstract class Android
{
    abstract void fun();
    
}
class Kitkat extends Android
{
    void fun()
    {
        System.out.println("This is the kitkat verson of Android");
    }
}
class Lolipop extends Android
{
    void fun()
    {
        System.out.println("This is the Lolipop verson of Android");
    }
}
class Marshmallow extends Android
{
    void fun()
    {
        System.out.println("This is the Marshmallow verson of Android");
    }
}
public class Abstract 
{
    public static void main (String args[])
    {
        Android k = new Kitkat();
        Android l = new Lolipop();
        Android m = new Marshmallow();
        k.fun();
        l.fun();
        m.fun();
    }
}
