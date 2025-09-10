package stack_sort;

import common_files.StackImpl;

public class StackSort {
    public static void main(String[] args) {
        StackImpl<Integer> stack = new StackImpl<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Stack before: " + stack);

        sortStack(stack);

        System.out.print("Stack after sorting: ");
        System.out.println(stack);
    }

    public static void sortStack(StackImpl<Integer> stack) {
        StackImpl<Integer> tempStack = new StackImpl<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
