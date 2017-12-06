
package test;
import java.util.Scanner;
abstract class Customer
{
    String c_name;
    int amt, amt_afterDiscount;
    Customer(String name , int am)
    {
        c_name = name;
        amt = am;
    }
    void showAmount()
    {
        System.out.println("Your product price after discount is " + amt_afterDiscount);
    }
    abstract void discount();
}

class Unknown_Cust extends Customer
{
    Unknown_Cust(String nm , int am)
    {
      super(nm,am);  
    }
    void discount ()
    {
        amt_afterDiscount = amt -(amt*10)/100;
    }
}

class Family_Cust extends Customer
{
    Family_Cust(String nm , int am)
    {
      super(nm,am);  
    }
    void discount ()
    {
        amt_afterDiscount =amt -(amt*20)/100;
    }
}

class Regular_Cust extends Customer
{
    Regular_Cust(String nm , int am)
    {
      super(nm,am);
    }
    void discount ()
    {
        amt_afterDiscount = amt-(amt*30)/100;
    }
}
public class Discount 
{
    public static void main(String args[])
    {
        Customer c = null;
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter Customer name");
        String nm = sc.next();
        System.out.println("Enter product price :");
        int amt = sc.nextInt();
        System.out.println("Enter the type of customer: \n Press 1 for Unknown Customer \n Press 2 for Family Customer \n Press 3 for Regular Customer");
        int ty = sc.nextInt();
        if(ty == 1)
        {
            c  = new Unknown_Cust(nm , amt);
        }
        if(ty == 2)
        {
            c  = new Family_Cust(nm , amt);
        }
        if(ty == 3)
        {
            c  = new Regular_Cust(nm , amt);
        }
        c.discount();
        c.showAmount();
        
        
    };
    
}
