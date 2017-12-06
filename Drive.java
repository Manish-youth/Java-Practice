import java.util.Scanner;
abstract class Driver       
{
   String name;
   int age;
   boolean english,graduation,chk=false;
   Driver(String D_Name,int D_Age ,boolean D_english ,boolean D_graduation)
   {
       name  = D_Name;
       age = D_Age;
       english = D_english;
       graduation = D_graduation;
   }
   abstract void chkElegiblity();
   void showEligiblity()
   {    
       if (chk == true)
       {
        System.out.println("Congratultion " + name +"! You are elgible to be a driver");  
       }
       else
       {
       System.out.println("OOPs Sorry "+name +"! You are not elgible to be a driver");  
       }
       
   }
}
class Male extends Driver
{
    Male(String D_Name,int D_Age ,boolean D_english ,boolean D_graduation)
    {
     super (D_Name, D_Age ,D_english ,D_graduation);   
    }
    void chkElegiblity()
    {
       if(age >=35 && english == true && graduation == true  ) 
       {
       chk = true;
       }
    }  
}
class Female extends Driver
{
    Female(String D_Name,int D_Age ,boolean D_english ,boolean D_graduation)
    {
     super (D_Name, D_Age ,D_english ,D_graduation);   
    }
    void chkElegiblity()
    {
       if(age >=30 && graduation == true  || english == true ) 
       {
       chk = true;
       }
    }  
}
public class Drive {
    public static void main (String args[])
    {
        Driver d =null;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Your Name ");
        String D_Name = sc.next();
        System.out.println("Hello  " + D_Name +"   Please Enter your age");
        int age = sc.nextInt();
        System.out.println(D_Name + "   Write true if you have completed your graduation otherwise false");
        boolean graduation  = sc.nextBoolean();
        System.out.println(D_Name + "   Write true if you can cammunicate in english very well otherwise false");
        boolean english  = sc.nextBoolean();
        System.out.println("  if you are Male Press 1 \n  If you are female Press 2");
        int ch = sc.nextInt();
        if (ch== 1)
        {
            d  = new Male(D_Name,age ,english ,graduation);
        }
        if (ch== 2)
        {
            d  = new Female(D_Name,age ,english ,graduation);
        }
         d.chkElegiblity();
         d.showEligiblity();
     
    }
    
}
