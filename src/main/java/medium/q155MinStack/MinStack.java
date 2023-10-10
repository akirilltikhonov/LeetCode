package medium.q155MinStack;

import java.util.Stack;

public class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!minStack.isEmpty()) {
            minStack.push(Math.min(x, minStack.peek()));
        } else {
            minStack.push(x);
        }
    }


    public void pop() {
        stack.pop();
        minStack.pop();
    }


    public int top() {
        return stack.peek();
    }


    public int getMin() {
        return minStack.peek();
    }
}