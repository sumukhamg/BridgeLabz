package valid_parentheses;

import common_files.StackImpl;

public class ValidParantheses {

    public static void main(String[] args) {
        String input = "[()]";

        if (isValid(input))
            System.out.println("Its a valid parantheses");
        else
            System.out.println("Not a valid Parantehses");

    }

    static boolean isValid(String str) {
        if (str.length() == 0)
            return true;
        StackImpl<Character> stk = new StackImpl<>();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (character == '{' || character == '(' || character == '[') {
                stk.push(character);
            } else {
                if (stk.isEmpty())
                    return false;
                char top = stk.pop();
                if ((character == ')' && top != '(') ||
                        (character == '}' && top != '{') ||
                        (character == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return true;
    }
}
