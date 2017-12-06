
package test;

class OuterEx 
{
final private String pwd;
OuterEx(String pwd)
{
    this.pwd = pwd;
}
private class Inner 
{
void matchpwd(String calledpwd)
{
if(pwd.equals(calledpwd))
{
System.out.println("Password matched");
}
else 
{
    System.out.println("Password do not matched");
}
}}
void fakepass_matched(String calledpwd)
{
    new Inner().matchpwd(pwd);
}}
public class InnerMain
        {
    public static void main(String args[])
    {
        OuterEx out  = new OuterEx("she");
        out.fakepass_matched("she");
    }

}



