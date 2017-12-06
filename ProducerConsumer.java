class Queue
{
    int item;
    boolean busy;
    synchronized int getItem()
    {
        if(busy)
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
        System.out.println("Get:"+item);
        busy = false;
        notify(); 
    }
    synchronized int setItem()
     {
        if(!busy)
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
        System.out.println("Put:"+item);
        busy = true;
        notify(); 
    }
}
class Producer extends Thread{
    Queue q;
    Producer(Queue q){
        this.q=q;
    }
    public void run(){
        for(int i=0;)
        {
            q.setItem(i);
            
        }
}
}
class Comsumer extends Thread{
    Queue q;
    Consumer(Queue q){
        this.q=q;
    }
    public void run(){
        for(int i=0;)
        {
            q.getItem(i);
            
        }
}
}

public class ProducerConsumer 
{
    public static void main(String args[]
   {
    Queue q=new Queue();
    Producer p=new Producer();
    Consumer c=new Consumer();
            p.start();
            c.start();
}
}
  