public class Runrate
{
   public static void main(String args[])
   {
       double tr = 282;
       double cr = 3.2f;
       double co = 10,po = 40,r,x;
       r=((tr-(cr*co))/po);
       x=Math.round(r*1e2)/1e2;
       System.out.println(x);
   }
}
