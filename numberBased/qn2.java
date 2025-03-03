//check for prime
import java.util.*;
class qn2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        boolean ans=isPrime(num);
        System.out.println(ans);
    }
    public static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }  
        return true;      
    }
}