import java.util.*;
public class DigitCounter {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count;
        int temp=0;
        int no_of_occur;
        int Max_Occurance=0;
        int store[][]  = new int[10][3];
        int num = sc.nextInt();
        int Elements[] = new int[num];
        for(int i=0;i<10;i++)
        {
            store[i][0]= i;
            store[i][1]=0;
        }
        for(int i=0;i<num;i++)
        {
            Elements[i]= sc.nextInt();
            while(Elements[i]!=0)
            {
               int r = Elements[i]%10;
               count = store[r][1];
               store[r][1]=++count;
               Elements[i] = Elements[i]/10;
            }
        }
        no_of_occur = store[9][1];
        for(int i=9;i>=0;i--)
        {
            if(no_of_occur < store[i][1])
            {
              no_of_occur = store[i][1] ; 
              Max_Occurance = store[i][0];
            }
        }
        System.out.println("Most Occured digit : " + Max_Occurance);
        System.out.print("Digits that did not occur : ");
        for(int i=0;i<10;i++)
        {
            
       // System.out.println(store[i][0]+" " +store[i][1] );
        if(store[i][1]==0)
        {
            if(temp!=0)
            {
               System.out.print(",");                
            }
            System.out.print(store[i][0]);
            temp = 1;
        }
        }
        
    }  
}
