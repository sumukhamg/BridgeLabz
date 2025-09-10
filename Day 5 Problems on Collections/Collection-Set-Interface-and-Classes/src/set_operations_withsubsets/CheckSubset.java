package set_operations_withsubsets;

import java.util.*;

public class CheckSubset {

    public static void main(String[] args) {
        // Test with HashSet
        Set<Integer> SetA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> SetB = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Checking for HashSet : " + isSubset(SetA, SetB));

        // Test with LinkedHashSet
        Set<Integer> linkedSetA = new LinkedHashSet<>(Arrays.asList(2, 3));
        Set<Integer> linkedSetB = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Checking for LinkedHashSet : " + isSubset(linkedSetA, linkedSetB));

        // Test with TreeSet
        Set<Integer> treeSetA = new TreeSet<>(Arrays.asList(1, 4));
        Set<Integer> treeSetB = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Checking for TreeSet : " + isSubset(treeSetA, treeSetB));

    }

    // method that returns boolean values based on comparision of 2 Sets of integer.

    public static boolean isSubset(Set<Integer> setA, Set<Integer> setB) {
        return setB.containsAll(setA);
    }
}
