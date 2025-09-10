import java.util.HashMap;
import java.util.Map;

public class RepeatingPatternInAString {
    public static void main(String[] args) {
        String str = "abcabcabcabc";
        String st = str + str;
        int index = st.indexOf(str, 1);
        System.out.println(st.substring(0, index));
    }
}
