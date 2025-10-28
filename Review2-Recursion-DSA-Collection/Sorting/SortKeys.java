package Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortKeys {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(3, 100);
        map.put(2, 200);
        map.put(4, 10);
        map.put(5, 10);

        Map<Integer, Integer> map2 = new TreeMap<>(map);
        System.out.println(map2);

        Set<Integer> keys = map2.keySet();

        for (int key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

    }
}
