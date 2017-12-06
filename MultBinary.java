    package test;

import java.util.Scanner;

public class MultBinary {
    
    public static long mult(long a, long b)
    {
      int mult=0;
      long product=0;
      long r1=0,r2=0;
      while(a !=0 )
     {
         b= b%10;
      if((a%10 == 0) && (b%10 ==0) )
       {
          mult = 0;
       }  
      else if((a%10 == 0) && (b%10 ==1) )
       {
          mult = 0;
       } 
      else if((a%10 == 1) && (b%10 ==1) )
       {
          mult = 0;
       }  
      else if((a%10 == 1) && (b%10 ==1) )
       {
          mult = 1;
       }  
    }
      return product;
    }
    
    public static long add(long x ,long y)
    {
     int i =0, carry =0,sum =0;
     long result=0;
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
            System.out.println(add(a,b));
        }
    
}

