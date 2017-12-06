class MyThread1 implements Runnable
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
public class TestThread1 
{
 public static void main(String[] args)
 {
     MyThread t = new MyThread();
     Thread mt = new Thread(t);
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
