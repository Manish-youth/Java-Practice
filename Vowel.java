import java.util.Scanner;
class Vowel
{
public static void main(String arg[])
{
int len;
String str ;
char c;
Scanner obj = new Scanner(System.in);
System.out.println("Enter a string");
str= obj.nextLine();
len= str.length();
for( int i=0 ; i<len; i++)
{
c = str.charAt(i);
if ((c == 'A') || (c == 'a')|| (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i') || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u'))
{
	    String front = str.substring(0, i);
            String back = str.substring(i + 1);
            str = front + "*" + back;
}
}
System.out.println(str);
}
}