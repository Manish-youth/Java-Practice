import java.util.*;
import java.io.*;
class WithExt implements FilenameFilter
{
    String ext;
    public WithExt()
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter file name");
                ext = sc.next();
               
            }
    public boolean accept(File dir, String name)
    {
        return name.endsWith(ext);
    }
}
public class FileFilters 
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
            WithExt FF = new WithExt();
            String s[] = f1.list(FF);
            System.out.println("Files with extension:"+FF.ext);
            for(int i= 0; i<s.length; i++)
            {
                System.out.println(s[i]);
            }
        }
    }
}
