package Stack.Question;

import java.util.Stack;

public class PushAtBottom {

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
        pushAtBottom(4, stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}