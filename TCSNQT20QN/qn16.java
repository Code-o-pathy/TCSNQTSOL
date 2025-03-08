//sort elements using stacks
import java.util.*;

public class qn16 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);
        recur(stack);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void recur(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top=stack.pop();
        recur(stack);
        Stack<Integer> temp=new Stack<>();
        while(!stack.isEmpty() && stack.peek()<top){
            temp.push(stack.pop());
        }
        stack.push(top);
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

//     public static void recur(Stack<Integer> stack) {
//         if (stack.isEmpty())
//             return;
//         int top = stack.pop();
//         recur(stack);
//         Stack<Integer> tmp = new Stack<>();
//         while (!stack.isEmpty() && stack.peek() > top) {
//             tmp.push(stack.pop());
//         }
//         stack.push(top);
//         while (!tmp.isEmpty()) {
//             stack.push(tmp.pop());
//         }

//     }

}
