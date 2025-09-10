package anagram_grouping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsGrouping {
    public static void main(String[] args) {
        String[] words = {
                "listen", "silent", "enlist",
                "race", "care", "acre",
                "earth", "heart",
                "dusty", "study"
        };

        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        // Map to store sorted word as key, list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Convert word to char array, sort, then back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            // Add to map
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(word);
        }

        // Return all groups of anagrams
        return new ArrayList<>(map.values());
    }

}
