package queue_problems.implementation_of_least_recently_used;

import java.util.*;

class LRUCache<T> {
    private final int capacity;
    private final Map<Integer, T> map;
    private final Deque<Integer> deque;

    LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        deque = new LinkedList<>();
    }

    public T get(int data) {
        if (!map.containsKey(data))
            return null;
        deque.remove(data);
        deque.addLast(data);
        return map.get(data);

    }

    public void put(int key, T value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            deque.remove(key);
            deque.addLast(key);
        } else {
            if (deque.size() == capacity) {
                map.remove(deque.removeFirst());
            }
            map.put(key, value);
            deque.addLast(key);
        }

    }

    public String toString() {
        String dequeString = map.toString();

        return dequeString;
    }
}
