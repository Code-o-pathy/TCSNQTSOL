//check if the number is armstrong number
import java.util.*;
class qn3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean ans=recur(n);
        System.out.println(ans);



        //comment the above code and uncomment the below code to print all the armstrong numbers between 1 to 1000;
        // for(int i=1;i<1000;i++){
        //     if(recur(i)){
        //         System.out.println(i);
        //     }
        // }
        // System.out.println("completed");
    }
    public static boolean recur(int n){
        int x=n;
        int countDig=0;
        while(x>0){
            countDig++;
            x=x/10;
        }
        int sum=0;
        x=n;
        while(n>0){
            int lastDig=n%10;
            n=n/10;
            sum+=Math.pow(lastDig,countDig);
        }
        return (sum==x);
    }
}
