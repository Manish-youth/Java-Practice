package test;
import java.util.*;
abstract class Custumer
{
    int amt;
    abstract int discount();
    void showBill()
    {
        System.out.println("Your Bill Amount is"+ amt );
    }
    Custumer(int am)
    {
        amt=am;
    }
    
}
class Unkwn_Custumer extends Custumer
{
    Unkwn_Custumer(int am)
    {
        super(am);
    }
    int discount()
    {
        amt-=(amt*10)/100;
        return amt;
    }
            
}
class Regular_Custumer extends Custumer
{
    Regular_Custumer(int am)
    {
        super(am);
    }
    int discount()
    {
        amt-=(amt*20)/100;
        return amt;
    }
            
}
class Family_Custumer extends Custumer
{
    Family_Custumer(int am)
    {
        super(am);
    }
    int discount()
    {
        amt-=(amt*30)/100;
        return amt;
    }
            
}

public class Resturent {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Custumer c ;
        int x;
        System.out.println("Enter the amount for discount ");
        x = sc.nextInt();
        System.out.println("Press 1 for UNKNOWN Customer" );
        System.out.println("Press 2 for REGULAR Customer" );
        System.out.println("Press 3 for FAMILY Customer" );
           
            choice = sc.nextInt();
            if(choice == 1)
            {
             
                c = new Unkwn_Custumer(x); 
                c.discount();
                c.showBill(); 
            }
            else if (choice == 2)
            {
          
                c = new Regular_Custumer(x);
                c.discount();
                c.showBill();   
            }
            else if (choice == 3)
            {
               
                c = new Family_Custumer(x); 
                c.discount();
                c.showBill();   
            }
            else 
            {
             System.out.println("Invalid Choice");   
            }
        
        
    }
    
}
