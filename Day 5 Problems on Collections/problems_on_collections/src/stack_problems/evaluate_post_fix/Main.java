package stack_problems.evaluate_post_fix;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String exp = "53+62/*35*+";
        int result = getPostFix(exp);
        System.out.println("Result: " + result);
    }

    public static int getPostFix(String expr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char character = expr.charAt(i);

            if (character >= '0' && character <= '9') {
                stack.push((int) (character - 48));
            } else {

                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (character) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid ");
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

}
