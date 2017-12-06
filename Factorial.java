
import java.util.Scanner;
public class Factorial
{
	public static void fact() 
{
		int n,fact=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number of which u want to factorial");
n= sc.nextInt();
for( int i=1 ; i<=n; i++)
{
 fact = fact *i;
}
System.out.println("factorial of a number is " + fact);
}
}