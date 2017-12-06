import java.io.*;
public class FileWriteLine 
{
 public static void main(String args[]) throws IOException
 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //String str = "It is demo of File Writer in java";
     String str = br.readLine();
     char buff[] =  new char[str.length()];
     str.getChars(0, str.length(), buff, 0);
     FileWriter fw = new FileWriter("e:/the.txt");
     for(int i=0;i<buff.length;i++)
     {
         fw.write(buff[i]);
     }
     fw.close();
 }
}
