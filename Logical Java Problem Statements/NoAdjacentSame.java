public class NoAdjacentSame {
    public static void main(String[] args) {
        String str = "aaabbc";
        String res = getReArranged(str);
        System.out.println(res);
    }

    static boolean containsRepeated(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                return true;
        }
        return false;
    }

    static String getReArranged(String str) {
        char[] chArr = str.toCharArray();
        int n = 0;
        while (containsRepeated(str)) {
            for (int i = 0; i < chArr.length - 2; i++) {
                if (chArr[i] == chArr[i + 1]) {
                    char t = chArr[i + 1];
                    chArr[i + 1] = chArr[i + 2];
                    chArr[i + 2] = t;
                }
            }
            n++;
            if (n == str.length()) {
                break;
            }
        }

        return new String(chArr);
    }
}
