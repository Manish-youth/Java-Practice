
package test;


public class Cons {
    int x,y;
    String str;
    Cons(int l, String st)
    {
        x= l;
        str = st;
        
    }
    Cons(int x, int y)
    {
      this.x= x;
        str = "hapy";
        
        
    }
    
   
    void show()
    {
        System.out.println(str+ x+ 23 );
        
    }
    public static void main (String arg[])
    {
            
        Cons c1 = new Cons(23,"c++");
        Cons c2 = new Cons(23,25);
        c1.show();
        c2.show();
        
            }
}
