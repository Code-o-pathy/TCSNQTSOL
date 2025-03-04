//climbing n stairs
import java.util.*;
public class qn10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of stairs to be climbed: ");
        int n=sc.nextInt();

        //recurrrence
        // int ans=recur(n);
        //TC-exponential, sc=O(n) for stack calls
        
        //memoization
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // int ans=recurMemo(n,dp);
        //TC-O(n), sc=O(N+N)  N for stack calls and N for dp array
        
        //dynamic programming
        // int ans=recurDP(n);
        //TC-O(N), sc=O(N)  N for dp array
        
        //space optimization in dp
        int ans=recurDpSpace(n);
        //TC-O(N), sc=O(1)
        System.out.println(ans);
    }
    public static int recurDpSpace(int n){
        int prev=1;
        int prevprev=1;
        for(int i=2;i<=n;i++){
           int curr=prevprev+prev;
           prevprev=prev;
           prev=curr;
        }
        return prev;

    }
    public static int recurDP(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
    public static int recurMemo(int n,int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        //take 1 step;
        int take1=recurMemo(n-1,dp);
        //take 2 step;
        int take2=recurMemo(n-2,dp);
        return dp[n]=take1+take2;

    }
    public static int recur(int n){
        if(n==0){
            return 1;
        }
        if(n<0) return 0;
        //take 1 step;
        int take1=recur(n-1);
        //take 2 step;
        int take2=recur(n-2);
        return take1+take2;
    }
}
