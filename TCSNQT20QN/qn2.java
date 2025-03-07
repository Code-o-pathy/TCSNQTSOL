//fibonacci using recursion
import java.util.Scanner;

public class qn2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=recur(i);
            System.out.print(num+" ");
        }
    }
    public static int recur(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans=recur(n-1)+recur(n-2);
        return ans;
    }
}
