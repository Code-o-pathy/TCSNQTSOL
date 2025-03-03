//add all the digits in a number
import java.util.Scanner;
public class qn7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int ans=recur(n);
        System.out.println(ans);

    }
    public static int recur(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}