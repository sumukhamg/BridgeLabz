package word_count;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "As the golden sun dipped below the distant mountains, the evening sky transformed into a canvas of vibrant colors, filling the world with a sense of peace and wonder.";
        System.out.println(countOccurance(str));
    }

    private static Map<String, Integer> countOccurance(String str) {
        Map<String, Integer> count = new HashMap<>();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (count.containsKey(words[i]))
                count.replace(words[i], count.get(words[i]) + 1);
            else
                count.put(words[i], 1);
        }

        return count;
    }
}
