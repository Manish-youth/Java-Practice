class Account_Detail
{
String name;
String AccNumber;
Double Bal;

Account_Detail(String str , String AccNumber, Double Balance)
{
this.name = str;
this.AccNumber =  AccNumber;
this.Bal = Balance;
}

Double Deposit(Double dt)
{
System.out.println("Dear " +  name + "your account is debited by " + dt );
Bal += dt;
return Bal;
}

Double Withdraw(Double wt)
{
if (Bal> wt)
{
System.out.println("Dear " +  name + "your account is credited by " + wt );
Bal -= wt;
}
else 
{
System.out.print("Insufficient ammount");
}
return Bal;
}
void show()
{
System.out.println("Dear" +name +" your current balnce is " + Bal);
}

}
class Account 
{
public static void main(String args[])
{

Account_Detail ac1 = new Account_Detail("Manish" ,"100211", 50000.0);
Account_Detail ac2 = new Account_Detail("Mukesh" ,"100221", 50000.0) ;
//ac1.Account_Detail();
//ac2.Account_Detail();
ac1.Deposit(1000.0);
ac2.Withdraw(1000.0);
ac1.show();
ac2.show();
}
}
