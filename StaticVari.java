
package test;

public class StaticVari {
    static int no0fObj;
    int x;
    StaticVari()
    {
        no0fObj++;
         x++;
    }
   void show()
   {
       System.out.println("Total number of Object "+ no0fObj ); 
       System.out.println("Value of x "+ x );    
   }
   public static void main(String args[])
   {
       StaticVari sc = new StaticVari();
       sc.show();
       StaticVari sc1 = new StaticVari();
       sc1.show();
       StaticVari sc2 = new StaticVari();
       sc2.show();
       
   }
}
