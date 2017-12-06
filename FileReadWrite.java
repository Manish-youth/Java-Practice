import java.util.*;
import java.io.*;
public class FileReadWrite 
{
   /* public String content()
    {
        String str = "This is line number";
        for(int i=1; i<16;i++)
        {
           str = str + i; 
           
        }
        return str;
    }*/
    public static void main(String args[])
    {  
        
   try
    {
        byte b[] = new byte[500];
        File f = new File("e:/Test.txt");
       // FileOutputStream fo = new FileOutputStream(f);
        FileInputStream fin = new FileInputStream(f);
       //Scanner sc = Scanner(System.in);
       int choice  = 1;
       System.out.println("Press 1 for Top Read \nPress 2 for bottom read \n Press 3 for middle Read");
       int a = fin.available();
       int a1=a/3;
       int a2=2*a/3;
       switch(choice)
        {
            case 1:
            {
                fin.read(b, 0, a1);
            }
            case 2:
            {
                fin.read(b, a1,a2 );
            }
            case 3:
            {
                fin.read(b, a2, a);
            }
        
        } 
       String str = new String(b);
       System.out.println(str);
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
    }


    
}
