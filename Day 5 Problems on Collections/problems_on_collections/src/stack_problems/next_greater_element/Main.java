package stack_problems.next_greater_element;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25 };
        int[] result = nextGreaterElements(arr);

        System.out.print("Next Greater Elements: ");
        System.out.println(Arrays.toString(result));

    }

    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        return result;
    }
}
