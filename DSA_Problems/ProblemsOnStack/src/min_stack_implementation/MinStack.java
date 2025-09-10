package min_stack_implementation;

import common_files.StackImpl;

public class MinStack extends StackImpl<Integer> {

    private StackImpl<Integer> minStack;

    public MinStack() {
        super();
        minStack = new StackImpl<>();
    }

    @Override
    public void push(Integer x) {
        super.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    @Override
    public Integer pop() {
        int val = super.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
        return val;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }

}
