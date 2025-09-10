package maintaining_insertion_order;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        System.out.println(returnLinkedHashSet(list));
    }

    // Method converts list of String into LinkedHashSet of String and remove
    // duplicates.
    static Set<String> returnLinkedHashSet(List<String> list) {
        Set<String> set = new LinkedHashSet<>(list);
        return set;

    }

}
