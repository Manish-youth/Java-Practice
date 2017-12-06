import java.util.Scanner;
class SumEven
{
public static void main(String arg[])
{
int n,s=0;
Scanner obj = new Scanner(System.in);
System.out.println("Enter lsat term");
n= obj.nextInt();
for( int i=1; i<=n; i++)
if (i%2=0)
s=s+i;

System.out.println(s);
}
}