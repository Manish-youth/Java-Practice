
package test;
public class Disp3DigitNmber {
    
    public static void main(String arg[])
    {
     int a=0,b=0,c=0,s=0; 
      for(int i = 1; i<=4; i++)
      {    
          a=i;
          a = a*100;
          for(int j = 1; j<=4; j++)
           {    
               b=j;
               b  = a+(b*10);
               for(int k = 1; k<=4; k++)
                    {
                        c =k;
                        c = b+c;
                        System.out.print(c + " "); 
                        s= s+1;
                    }
           }
      }
      System.out.println(" \n Totel number of 3 Digit Number is "+ s);
    }
}