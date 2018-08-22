package src.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack/description/
 * <p>
 * Difficulty:Easy
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStack {

    // todo: https://leetcode.com/problems/min-stack/discuss/49014/Java-accepted-solution-using-one-stack
    // todo: https://leetcode.com/problems/min-stack/discuss/49031/Share-my-Java-solution-with-ONLY-ONE-stack

    /**
     * initialize your data structure here.
     */
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack_min = new Stack<>();

    public MinStack() {
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack_min.push(x);
        }
        stack_min.push(x < stack_min.peek() ? x : stack_min.peek());
        stack.push(x);
    }

    public void pop() {
        stack.pop();
        stack_min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack_min.peek();
    }

}
