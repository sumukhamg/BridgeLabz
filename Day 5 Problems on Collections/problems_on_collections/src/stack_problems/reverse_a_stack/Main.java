package stack_problems.reverse_a_stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.add(10);
        stk.add(40);
        stk.add(60);
        stk.add(70);
        stk.add(80);
        System.out.println("Reversed Stack: " + reverseStack(stk));
    }

    static Stack<Integer> reverseStack(Stack<Integer> stk) {
        Stack<Integer> newStack = new Stack<>();
        int i = stk.size();
        while (i > 0) {
            newStack.add(stk.pop());
            i--;
        }

        return newStack;
    }

}
