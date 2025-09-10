package duplicate_elements_in_an_array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsMain {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 4, 7, 8, 5, 5, 8 };
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print duplicates with their counts
        System.out.println("Duplicate elements and their counts:");
        boolean found = false;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No duplicates found.");
        }
    }

}
