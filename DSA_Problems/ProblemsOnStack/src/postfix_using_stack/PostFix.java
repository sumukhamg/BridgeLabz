package postfix_using_stack;

import common_files.StackImpl;

public class PostFix {
    public static void main(String[] args) {
        String exp = "53+62/*35*+";
        int result = getPostFix(exp);
        System.out.println("Result: " + result);
        // System.out.println((int) '1' - 48);
    }

    public static int getPostFix(String expr) {
        StackImpl<Integer> stack = new StackImpl<>();

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
