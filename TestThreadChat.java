class Chat
{
    boolean flag = false;
    public synchronized void Question(String msg)
    {
        if(flag)
        {
            try
            {
                wait();
           
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Question::"+msg);
        flag = true;
        notify();              
    }
    public synchronized void Answer(String msg)
    {
        if(!flag)
        {
            try
            {
                wait();
           
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Answer::"+msg);
        flag = false;
        notify();              
    }
}
class TerminalOne implements Runnable
{
    Chat m;
    String[] s1 ={ "Hii","How are you?","I am also fine!"};
    public TerminalOne(Chat m1)
    {
        this.m=m1;
        new Thread(this,"Question").start();
        
    }
    public void run()
    {
        for(int i=0;i<s1.length;i++)
        {
            m.Question(s1[i]);
        }
    }
            
}
class TerminalTwo implements Runnable
{
    Chat m;
    String[] s2 ={ "Hello","fine What about you","Great!"};
    public TerminalTwo(Chat m)
    {
        this.m=m;
        new Thread(this,"Question").start();
        
    }
    public void run()
    {
        for(int i=0;i<s2.length;i++)
        {
            m.Answer(s2[i]);
        }
    }
            
}

public class TestThreadChat {
    public static void main(String args[])
    {
        Chat m = new Chat();
        new TerminalOne(m);
        new TerminalTwo(m);
    }
    
}
