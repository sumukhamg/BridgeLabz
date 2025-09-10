import java.util.Arrays;

public class ReverseOnlyDigitsInString {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        char[] chArray = str.toCharArray();

        int i = 0, j = chArray.length - 1;

        while (i < j) {

            if (!Character.isDigit(chArray[i])) {
                i++;
            }
            if (!Character.isDigit(chArray[j])) {
                j--;
            }

            if (i < j) {
                char t = chArray[i];
                chArray[i] = chArray[j];
                chArray[j] = t;
                i++;
                j--;
            }
        }

        System.out.println(new String(chArray));
    }
}
