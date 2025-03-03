//decimal to binary
import java.util.*;
public class qn1 {
    public static void main(String[] args) {
        System.out.print("Enter the decimal number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=recur(n);
        System.out.println(ans);
    }
    public static int recur(int n){
        Stack<Integer> stack=new Stack<>();
        while(n>0){
            stack.push(n%2);
            n/=2;
        }
        int num=0;
        while(!stack.isEmpty()){
            num=(num*10)+stack.pop();
        }
        return num;
    }
    
}
