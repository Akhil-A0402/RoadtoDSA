package Stack.Question;

import java.util.Stack;

public class ReverseAStack {

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void pushAtBottom(int value, Stack<Integer> stack){
        if(stack.empty()){
            stack.push(value);
            return;
        }
        int temp = stack.pop();
        pushAtBottom(value, stack);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        reverse(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
