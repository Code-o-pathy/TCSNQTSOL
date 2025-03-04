//Valid parenthesis or not
import java.util.*;
public class qn9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the parenthesis string: ");
        String text=sc.nextLine();
        boolean ans=recur(text);
        System.out.println(ans);
    }
    public static boolean recur(String text){
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<text.length()){
            char c=text.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(c==']'){
                if(!stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                if(!stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();

    }
}
