import java.util.Scanner;
class AddBinary {
    public static int add(int x ,int y)
    {
     int i =0, carry =0,sum =0;
     int result=0;
     while(x !=0 || y!=0)
     {
       if((x%10 == 0) && (y%10 ==0) && (carry ==0))
       {
           sum = 0;
           carry =0;
       }
       else if((x%10 == 0) && (y%10 ==1) && (carry ==0))
       {
           sum = 1;
           carry =0;
       }
      else if((x%10 == 1) && (y%10 ==0) && (carry ==0))
       {
           sum = 1;
           carry =0;
       }
      else if((x%10 == 1) && (y%10 ==1) && (carry ==0))
       {
           sum = 0;
           carry =1;
       }
      else if((x%10 == 0) && (y%10 ==0) && (carry ==1))
       {
           sum = 1;
           carry =0;
       }
      else if((x%10 == 1) && (y%10 ==0) && (carry ==1))
       {
           sum = 0;
           carry =1;
       }
      else if((x%10 == 0) && (y%10 ==1) && (carry ==1))
       {
           sum = 0;
           carry =1;
       }
      else if((x%10 == 1) && (y%10 ==1) && (carry ==1))
       {
           sum = 1;
           carry =1;
       }
      result =  result + (sum * power(10,i));
      i++;
      x= x/10;
      y= y/10;
    }  
      if(carry == 1)
      {
          result +=  power(10,i);
      }
      return result;
   }
    public static int power(int a, int b)
    {
            int value = 1;
            for(int c=0;c<b;c++)
            value*=a;
            return value;
     }
   public static void main(String arg[])
        {
            Scanner in = new Scanner(System.in);
            System.out.println("enter first number");
            int a = in.nextInt();
            System.out.println("enter second number");
            int b = in.nextInt();
            System.out.println("Result is : " +add(a,b));
        }
    
}
