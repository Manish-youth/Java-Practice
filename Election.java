
import java.util.Scanner;
public class Election {
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        int No_Of_Candidate = sc.nextInt();
        ++No_Of_Candidate;
        int vote=1;
        int Candidate;
        int winner=0;
        int highest_vote;
        //int Counting = ++No_Of_Candidate;
       // int No_Of_Votes =0;
        int count;
        int[][] Voting;
        Voting = new int[No_Of_Candidate][3];
        
        for( Candidate=1;Candidate<No_Of_Candidate;Candidate++ )
        {
           
            Voting[Candidate][0]=Candidate;
            Voting[Candidate][1]=0;
            
        }   
           
            while(vote!=0)
            {
              vote  = sc.nextInt();
              count = Voting[vote][1];
              Voting[vote][1]= ++count;
            }
        for(int i=1;i<No_Of_Candidate;i++)
        {
        System.out.println(Voting[i][0]+" " +Voting[i][1] );
        }
        highest_vote = Voting[1][1];
        for(int i=1;i<No_Of_Candidate;i++)
        {
            
            if(highest_vote < Voting[i][1])
            {
                highest_vote = Voting[i][1];
                winner = Voting[i][0];
            }
        }
        System.out.println(winner);
        System.out.println(highest_vote);
        
    }
    
}
