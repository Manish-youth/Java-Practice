
public class Plus {
  
        public static int add( int x, int y)
        {
            int carry;
            while(y!=0)
            {
                carry = x&y;
                x = x^y;
                y= carry<<1;
              
            }
            return x;
            
        }
        public static void main(String arg[])
        {
            System.out.println(add(5,12));
        }
    
}
