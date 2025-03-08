//implement a stack to return minimum element in O(1) time;

import java.util.*;
class minStack{
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> temp=new Stack<>();
    void pushInt(int x){
        if(stack.size()==0){
            stack.push(x);
            return;
        }
        while(!stack.isEmpty() && stack.peek()<x){
            temp.push(stack.pop());
        }
        stack.push(x);
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }
    int min(){
        return stack.peek();
    }
    int popInt(){
        return stack.pop();
    }
    int size(){
        return stack.size();
    }
    int peek(){
        return stack.peek();
    }
    boolean isEmpty(){
        return stack.size()==0;
    }


}
public class qn17 {
    public static void main(String args[]){
        minStack stack=new minStack();
        stack.pushInt(12);
        stack.pushInt(11);
        stack.pushInt(-12);
        stack.pushInt(14);
        stack.pushInt(-3);
        System.out.println(stack.min());
    }
}
