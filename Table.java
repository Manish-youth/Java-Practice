import java.util.Scanner;
class Table
{
public static void main(String arg[])
{
Scanner sc = new  Scanner(System.in);
int c =1;
System.out.println("Enter a number");
int n  = sc.nextInt();
while(c<11)
{
 int s = n*c;
System.out.println(n +" * " + c +" =" + s);
c++;
}
}
}
