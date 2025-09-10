package frequency_counter;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        String str = "sumukhamg";
        System.out.println(countFrequency(str));
    }

    private static Map<Character, Integer> countFrequency(String str) {
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count.containsKey(ch))
                count.replace(ch, count.get(ch) + 1);
            else
                count.put(ch, 1);
        }

        return count;
    }
}
