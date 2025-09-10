package sorted_unique_elements;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueElementsMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 2, 9, 1, 2, 9);

        System.out.println(sortedUniqElements(list));
    }

    static Set<Integer> sortedUniqElements(List<Integer> list) {
        Set<Integer> treeSet = new TreeSet<>(list);
        return treeSet;
    }
}
