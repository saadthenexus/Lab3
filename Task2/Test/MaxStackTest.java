package Task2.Test;

import Task2.MaxStack;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxStackTest {
 
    @Test
    public void testPushAndMax() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.max());
    }
    
    @Test
    public void testPopAndMax() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.pop();
        assertEquals(5, stack.max());
    }

    @Test
    public void testPushAndMaxAgain() {
        MaxStack stack = new MaxStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        assertEquals(3, stack.max());
    }
    
}

