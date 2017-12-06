import java.util.Scanner;
class SmallArr
{
public static void main(String arg[])
{
int n;
Scanner obj = new Scanner(System.in);
System.out.println("Enter the number of item");
n = obj.nextInt();
int a[] = new int[n];
System.out.println("Enter number");
for(int i=0; i<n; i++)
{
 a[i] = obj.nextInt();
}
int small = a[0];
for(int i=1; i<n; i++)
{
if (a[i]<small)
{
 small = a[i];
}
}
System.out.println(small);
}
}