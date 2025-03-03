//replace all 0s with 5
import java.util.*;
public class qn8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int ans=recur(n);
        System.out.println(ans);
    }
    private static int recur(int n){
        if(n<0)return -1;
        if(n==0) return 5;
        Stack<Integer> stack=new Stack<>();
        while(n>0){
            stack.push(n%10);
            n/=10;
        }
        int newNum=0;
        while(!stack.isEmpty()){
            int lastDig=stack.pop();
            if(lastDig==0){
                newNum=(newNum*10)+5;
            }
            else{
                newNum=(newNum*10) + lastDig;
            }
        }
        return newNum;
    }
}
