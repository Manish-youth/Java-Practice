Class print

{
   
 public static void main(String args[])
    
{
        
int sum;
        
for(int i=50; i<250; i++)
      
  {
            if( i%3==0 && i%9!=0)

            {
               
 sum=sum + i;
            }
      
  }
    System.out.println("Sum of all required number is " + sum);   
   
 }

}