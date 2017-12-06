import java.io.*;
import java.util.Scanner;
public class FileStreamTest 
{
   public static void main(String args[])
   {
       try
       {
       byte b[] = new byte[5000];
       InputStream is = new FileInputStream("e:/Test.txt"); 
       int a = is.available(); 
       int a1=a/3;
       int a2=(2*a)/3;
       //System.out.println(""+a+" "+a1+" "+a2);
       Scanner sc  = new Scanner(System.in);
       System.out.println("Press 1 for Top Read \nPress 2 for bottom read \n Press 3 for middle Read");
       int choice = sc.nextInt();
       switch(choice)
        {
            case 1:
            {
                is.read(b,0,a/3);
                break;
            }
            case 2:
            {
                is.skip(a1);
                is.read(b,0,a/3);
                break;
            }
            case 3:
            {
                is.skip(a2);
                is.read(b, 0,a/3);
                break;
            }
        
        } 

       String str  = new String(b);
       System.out.println(str);
       is.close();
       }
       catch(IOException e)
            {
                e.printStackTrace();
            }
   }    
}
