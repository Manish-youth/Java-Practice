/*Write a class TV with following atributes name of company and screen size. 
Create an object of colorTV which has atribute of Tv type and
object of black_&_white Tv which have also attribute of TV type. 
Create an abstract method Showprice*/
import java.util.Scanner;

abstract class TV
{
    String Name_of_Coampany =  "SAMSUNG";
    double Screen_size;
    double price ;
    TV(double size)
    {
     Screen_size = size;
    }
    abstract void showPrice();   
}
class Color_TV extends TV
{
    Color_TV(double size )
    {
        super(size );
    }
    
    void showPrice()
    {   
        price  = Screen_size*500;
        System.out.println("WELCOME TO SAMSUNG TV");
       System.out.println("The price of Color_TV of size "+Screen_size+"cm"+ " is RS " + price +"only" ); 
    }
}
class Black_and_White_TV extends TV
{
    Black_and_White_TV(double size )
    {
        super(size );
    }
    
    void showPrice()
    {   
        price  = Screen_size*400;
        System.out.println("WELCOME TO SAMSUNG TV");
       System.out.println("The price of Color_TV of size "+Screen_size+"cm"+ " is RS " + price +"only" ); 
    }
}
public class TVMain
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        TV t = null;
        System.out.println("Enter the size of TV");
        double cost  = sc.nextDouble();
        System.out.println("If you want to know the price of Color TV Press 1\n             And for Black_and_White TV   Press 2");
        int ch = sc.nextInt();
        if(ch == 1)
        {
            t =new Color_TV(cost);
        }
        if(ch  == 2 )
        {
            t= new Black_and_White_TV(cost);
        }
        t.showPrice();
       
    }
}