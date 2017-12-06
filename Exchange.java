import java.util.Scanner ;
class Exchange
{
public static void main(String args[])
{
boolean option = true;
while(option== true)
{
int weight , i=2 ,sum = 0,Part_weight ;
Scanner obj = new Scanner(System.in);
weight = obj.nextInt();
if(weight<2 || weight>1000000000 )
{
System.out.println("Error ! \n");
System.out.println("You have entered a number that is out of the range specified ! \n");
System.out.println("Please Enter a number between 2 and 1000000000 included: \n");
weight = obj.nextInt();
}
while(i<=4)
{
Part_weight = weight/i;
sum= sum + Part_weight;
i=i+1;
}
if(sum<weight)
{
sum = weight;
System.out.println(sum);  //you can exchange  m weight blocks of platinum for  m units of currency directly"
}
else
{
System.out.println(sum); 
}
System.out.println("For continue Write  true otherwise Write false /n Du want to continue ");
option = obj.nextBoolean();
}
}
}