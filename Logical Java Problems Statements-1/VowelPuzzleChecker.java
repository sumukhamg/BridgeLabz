public class VowelPuzzleChecker {

    public static void main(String[] args) {
        String input = "abcaedfi";
        boolean res = isValid(input);
        if (res)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    static boolean isValid(String str) {
        int c = 0;
        String vow = "aeiou";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vow.indexOf(ch) != -1) {
                if (i == 0 || i == str.length() - 1) {
                    c++;
                } else {
                    c++;
                }
            }

        }
        return c == 4;
    }
}