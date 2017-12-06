import java.util.Scanner;
public class ShortName
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please");
        String name = sc.nextLine();
        String arr[] = name.split(" ");
        int length = arr.length;
        for(int i=0;i<(length-1);i++)
        {
            System.out.print((arr[i].charAt(0))+". ");
            
        }
        System.out.println(arr[length-1]);
    }
}