import java.util.*;
import java.io.*;
public class TraverseinDir
{
    public static void main(String args[])
    {
        String dname;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Directory Name");
        dname = sc.next();
        File f1 = new File(dname);
        if(f1.isDirectory())
        {
            System.out.println("Directory of"+dname);
            String flist[]= f1.list();
            for(int i=0;i<flist.length;i++)
            {
                File f = new File(dname +"/"+flist[i]);
                if(f.isDirectory())
                {
                    System.out.println(flist[i]+"is directory");
                }
                else
                {
                     System.out.println(flist[i]+" is file");
                }
            }
        }
    }
    
}
