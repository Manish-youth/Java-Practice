
import java.util.Scanner;
class Input
{
public static void main(String arg[])
{
int n,r,check=0;
Scanner obj = new Scanner(System.in);
System.out.println("Enter number");
 n= obj.nextInt();
for(int i=2; i<n; i++)
{
r = n%i;
if(r==0)
{
System.out.println("Number is not prime");
check=1;
break;
}
}
if(check==0)
System.out.println("Number is prime");
}
}