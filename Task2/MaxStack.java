package Task2;

import java.util.Stack;

import java.util.Stack;

public class MaxStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;
    private Stack<Integer> minStack;


    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);

        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    
    public void pop() {
        if (!mainStack.isEmpty()) {

            int poppedValue = mainStack.pop();
            
            if (poppedValue == maxStack.peek()) {
                maxStack.pop();
            }

            if (poppedValue == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int max() {
        if (!maxStack.isEmpty()) {
            return maxStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

}

