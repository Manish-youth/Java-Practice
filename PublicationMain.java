import java.util.Scanner;
abstract class Publication
{
    final String Title =  "Oracle";
    double price  = 20000;
    double data;
    abstract void setdata(double d);
    abstract double getdata();
    abstract void display();   
}
class Book extends Publication
{   
    void setdata(double dta)
    {
        data = dta;
    }
    double getdata()
    {
        return data;
    }
    void display()
    {
  //    Book b  = new Book();
      System.out.println("The number of page count is "+getdata());
    }
}
class Tape extends Publication
{   
    void setdata(double dta)
    {
        data = dta;
    }
    double getdata()
    {
        return data;
    }
    void display()
    {
     // Tape t  = new Tape();
      System.out.println("The Playing time of the tape is  "+getdata()+ " minute");
    }
}
public class PublicationMain {
    public static void main(String args[])
    {
        Scanner  sc = new Scanner (System.in);
        Publication p = null;
       // Book b = new Book();
        //Tape t = new Tape();
               
       // System.out.println("Welcome to "+ p.Title);
        System.out.println(" Press 1 : you are Book reader\n Press 2 : You are a Tape User ");
        int choice  =  sc.nextInt();
        if(choice ==1)
        {
            p = new Book();
	    System.out.println("Enter the number of page_count");
       	    double page = sc.nextDouble();
            p.setdata(page);
            p.display();
        }
        if(choice ==2)
        {
            p = new Tape();
            System.out.println("Enter the Paying time of Tape");
            double time = sc.nextDouble();
            p.setdata(time);
            p.display();
        }
        
       
    }
    
}
