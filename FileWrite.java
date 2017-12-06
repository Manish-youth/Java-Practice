import java.io.*;
public class FileWrite 
{
     public static String[] content()
    {
        String str[]=null;
        for(int i=1; i<16;i++)
        {
           str[i] = "This is line number ";
           str[i] = str[i] + i +"\n"; 
           
        }
        return str;
    }
    public static void main(String args[]) throws IOException
    {
        OutputStream fp = new FileOutputStream("e:/the.txt");
        String s[] = content();
        for(int i =1; i<16;i++)
        {
        byte b[] =  s[i].getBytes();
        fp.write(b[i]);
        }
        fp.close();
      
}
}
