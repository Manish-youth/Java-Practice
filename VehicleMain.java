/*Declare a class vehicle. From this class derive class 2_wheeler ,3_wheeler ,4_wheeler.
and display each type of vehicle using memeber function of the class*/
package mypack;
import java.util.Scanner;
abstract class Vehicle
{
    
 void Commen_fateure()
 {
  System.out.println(" vehicle have Headlight /Backligh");
  System.out.println(" vehicle have Built-In Performance Meters");
  System.out.println(" vehicle have Mirror to see the object behind it.");
 }
 abstract void Special_feature();
}
class Two_wheeler extends Vehicle
{
void Special_feature()
{
    System.out.println("Number of Passenger Load is 2 ");
    System.out.println("Number of Wheel is 2");
    System.out.println("Efficient Load is 2 quintel");
    System.out.println("Fuel used is Petrol");
    System.out.println("For saftey Halemt should be used");   
}
}
class Three_wheeler extends Vehicle
{
void Special_feature()
{
    System.out.println("Number of Passenger Load is 5-6 ");
    System.out.println("Number of Wheel is 3");
    System.out.println("Efficient Load is 5-6 quintel");
    System.out.println("Fuel used is Diesel");
    
}
}
class Four_wheeler extends Vehicle
{
void Special_feature()
{
    System.out.println("Number of Passenger Load is 6-7 ");
    System.out.println("Number of Wheel is 4");
    System.out.println("Efficient Load is 5-6 quintel");
    System.out.println("Fuel used is Diesel");
    System.out.println("For saftey Halemt should be used");   
    
}
}
public class VehicleMain 
{
    public static void main(String args[])
    {
        Vehicle v=null;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Press 2 for Feature of 2_wheeler vehicle\nPress 3 for Feature of 3_wheeler vehicle\nPress 4 for Feature of 4_wheeler vehicle\n");
        int choice  = sc.nextInt();
        switch(choice)
        {
            case 2:
                v = new Two_wheeler();
                break;
            case 3:
                v = new Three_wheeler();
                break;
            case 4:
                v = new Four_wheeler();
                break;
            default :
                System.out.println("You have entered wrong choice");
        }
        v.Special_feature();
        v.Commen_fateure();
        
    }
    
}
