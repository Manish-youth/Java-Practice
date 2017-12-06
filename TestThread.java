class MyThread extends Thread
{
    public void run()
            {
                for(int i=0; i<10;i++)
                {
                    System.out.println("This is Run method " + i);
                    try{
                    Thread.sleep(500);}
                    catch(Exception ex){}
                    
                }  
    }
}
public class TestThread 
{
 public static void main(String[] args)
 {
     MyThread mt = new MyThread();
     mt.start();
     for(int i=0; i<10;i++)
                {
                    System.out.println("This is main method "+ i);
                    try{
                    Thread.sleep(500);}
                    catch(Exception ex){}
                    
                }  
 }
}
