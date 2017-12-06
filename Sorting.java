import java.util.*;
class Sorting
{
public static void main(String arg[])
{
int n,temp;
Scanner obj = new Scanner(System.in);
int a[] = new int[5];
System.out.println("Enter number");
for(int i=0; i<5; i++)
{
 a[i] = obj.nextInt();
}
Arrays.sort(a);
System.out.println("Sorted Arrays Are"-);
for(int i=0; i<5; i++)
{
System.out.println(a[i]);
}
}
}
