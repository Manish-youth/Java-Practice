
package test;


public class Account_Detail {

String name;
String AccNumber;
Double Bal;

public Account_Detail(String str , String AccNumber, Double Balance)
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
System.out.print("your current balnce is" + Bal);
} 

    
}
