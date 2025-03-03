//binary to decimal
import java.util.*;
public class qn2 {
    public static void main(String[] args) {
        System.out.print("Enter the binary number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=recur(n);
        System.out.println(ans);
    }
    public static int recur(int n){
        int ans=0;
        int ind=0;
        while(n>0){
            ans+=(n%10)*Math.pow(2,ind++);
            n/=10;
        }
        return ans;
    }
}
