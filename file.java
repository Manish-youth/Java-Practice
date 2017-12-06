
import java.util.Scanner;
public class file {
    
    public static long Dec2Bin(int x)
    {
        long result=0;
        int cnt=0,r=0;
        while(x!=0)
        {
         r = x%2;
         result  += (r * power(10,cnt));
         cnt++;
         x=x/2;
        }
        return result;
    }
    public static int power(int a, int b)
    {
            int value = 1;
            for(int c=0;c<b;c++)
            value*=a;
           return value;
     }
    public static void main(String arg[])
        {
            Scanner in = new Scanner(System.in);
            System.out.println("enter number");
            int a = in.nextInt();
            System.out.println(Dec2Bin(a));
        }
    
    
}

