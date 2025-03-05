
// Print all the prime numbers uptill the given range
import java.util.Scanner;

public class qn4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the end of the range: ");
        int n=sc.nextInt();
        recur(n);
    }
    public static void recur(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)) System.out.println(i);
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}


//bubble  sort qn2
//sum of all elements qn3
//already solved in previous sections