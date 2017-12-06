import java.io.*;
public class FileReadLine
{
    public static void main(String args[]) throws IOException
    {
        FileReader fr  = new FileReader("e:/Test.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
        {
         System.out.println();
        }
    }
    
}
