//check if a number is perfect number
// a number is perfect number if it sums up to its proper divisors
//for eg 6 divisors of 6 are 1 2 3 (sum of all sums up to 6) (exclude the number itself);
//other example is 28 1,2,4,7,14 (sums up to 28)

import java.util.Scanner;
public class qn4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean ans=recur(n);
        System.out.println(ans);

        //run the below section to find all the perfect numbers upto 10000
        // for(int i=1;i<10000;i++){
        //     if(recur(i)){
        //         System.out.println(i);
        //     }
        // }

    }
    public static boolean recur(int n){
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                sum+=i;
                sum+=(n/i);
            }
        }
        return sum==n;
    }
}
