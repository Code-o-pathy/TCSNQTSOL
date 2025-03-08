import java.util.Scanner;
import java.util.Stack;

public class qn18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = sc.nextLine();
        String res=recur(text);
        System.out.println(res);
        sc.close();
    }
    public static String recur(String text){
        Stack<Character> stack=new Stack<>();
        for(char c:text.toCharArray()){
            stack.push(c);
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.toString();
    }
}


// qn19,qn20 done already in previous sections