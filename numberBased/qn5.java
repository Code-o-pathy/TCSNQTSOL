//fibonacci series till n 
import java.util.Scanner;
public class qn5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        recur(n);
    }
    public static void recur(int n){
        if(n<2 || n>47 ){
            System.out.println("Enter any number above 2 and below 48");
            return;
        }
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}