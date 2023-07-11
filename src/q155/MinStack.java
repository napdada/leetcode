package q155;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> numStack = new Stack<>();

    private Stack<Integer> minStack = new Stack<>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    public void push(int val) {
        numStack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            if (minStack.peek() >= val) {
                minStack.push(val);
            } else {
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop() {
        numStack.pop();
        minStack.pop();
    }

    public int top() {
        return numStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
