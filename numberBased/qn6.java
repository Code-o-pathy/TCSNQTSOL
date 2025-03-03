//sum of all the natural numbers till n 
import java.util.Scanner;
public class qn6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int ans=recur(n);
        System.out.println(ans);
    }
    public static int recur(int n){
        // O (n) approach

        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum+=i;
        // }
        // return sum;

        //O(1) approach
        return n*(n+1)/2;
    }
}