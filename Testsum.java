import java.util.Scanner;
class Testsum
{
public static void sum()
{
int a,b,s;
Scanner obj = new Scanner(System.in);
System.out.println("Enter two number");
a= obj.nextInt();
b= obj.nextInt();
s= a+b;
System.out.println("Sum is" + s);
}
}