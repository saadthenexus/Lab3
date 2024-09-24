package Task2;

import java.util.Stack;

public class MaxStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    
    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            if (mainStack.peek().equals(maxStack.peek())) {
                maxStack.pop();
            }
            mainStack.pop();
        }
    }

}
