//check if a number is pallindrome
import java.util.*;
public class qn6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer to be checked: ");
        int n=sc.nextInt();
        boolean ans=recur(n);
        System.out.println(ans);
    }
    public static boolean recur(int n){
        int x=n;
        int num=0;
        while(n>0){
            num=(num*10)+n%10;
            n/=10;
        }
        return x==num;
    }
}
