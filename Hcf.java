import java.util.Scanner;
class Hcf
{
public static void main(String[] args)
{
int a,b,t=1,max,min;
Scanner obj = new Scanner(System.in);
System.out.println("Enter two number");
a= obj.nextInt();
b= obj.nextInt();
if(a>b)
{
min=b;
max =a;
}
else
{
max= b;
min= a;
}

do
{
t=max%min;
max= min;
min= t;
}
while(t==0);
System.out.println(t);
}
}