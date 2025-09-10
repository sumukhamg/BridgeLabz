package first_non_repeating_character;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharMain {

    public static void main(String[] args) {
        String input = "swiss";
        Character result = findFirstNonRepeatingChar(input);

        if (result != null) {
            System.out.println("First non repeating character: " + result);
        } else {
            System.out.println("Character Notfound.");
        }
    }

    public static Character findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        // This loop count the character frequency
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

}
