import java.util.Scanner;
class Recursive
{
public static void main(String arg[])
{
int n;
int result;
Scanner obj = new Scanner(System.in);
System.out.println("Enter a number");
n= obj.nextInt();
result = fact(n);
System.out.println(result);
}
public static int fact(int n)
{
int result;
if (n==1)
return(n);
result = n * fact(n-1) ;
return (result);
}
}