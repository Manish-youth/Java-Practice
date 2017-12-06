import java.util.Scanner;
public class Sum 
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int N,Sum_Of_Even=0,Sum_Of_Odd=0;
     if(sc.hasNextInt())
     {
         N = sc.nextInt();
         if(N>0)
         {
             for(int i=1;i<=N;i++)
             {
                 if(i%2==0)
                 {
                    Sum_Of_Even += i;
                 }
                 else 
                 {
                     Sum_Of_Odd += i;
                 }
             }
             System.out.println("Sum of EVEN Numbers:- " +Sum_Of_Even+ " Sum of ODD Numbers:- "+Sum_Of_Odd );
         }
         else
         {
             System.out.println("Invalid Input");
         }
     }
      else
         {
             System.out.println("Invalid Input");
         }    
    }   
}
