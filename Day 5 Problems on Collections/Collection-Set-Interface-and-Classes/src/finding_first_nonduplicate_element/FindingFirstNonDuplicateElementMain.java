package finding_first_nonduplicate_element;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindingFirstNonDuplicateElementMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        System.out.println(findFirstNonDuplicate(list));

    }

    // method identifies unique and duplicate elements using 2 Set objects and
    // returns integer valus.
    public static Integer findFirstNonDuplicate(List<Integer> list) {
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        Set<Integer> duplicateSet = new LinkedHashSet<>();

        for (int num : list) {
            if (uniqueSet.contains(num)) {
                uniqueSet.remove(num);
                duplicateSet.add(num);
            } else if (!duplicateSet.contains(num)) {
                uniqueSet.add(num);
            }
        }

        // The first element in uniqueSet is the first non-duplicate
        return uniqueSet.isEmpty() ? null : uniqueSet.iterator().next();
    }

}
