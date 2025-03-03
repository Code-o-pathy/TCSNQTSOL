//pascals triangle
import java.util.*;
public class qn6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int dp[][]=recur(n);
        int spaces=n-1;
        for(int i=0;i<n;i++){
            for(int p=0;p<spaces;p++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
            spaces--;
        }
        
    }
    public static int[][] recur(int n){
        int dp[][]=new int[n][n];
        dp[0][0]=1;
        for(int i=1;i<n;i++){
            dp[i][0]=1;
            for(int j=1;j<=i;j++){
                dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
            }
        }
        return dp;
    }
}
