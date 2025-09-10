package queue_problems.implementation_of_least_recently_used;

public class Main {
    public static void main(String[] args) {
        LRUCache<Integer> lru = new LRUCache<>(3);
        lru.put(1, 10);
        lru.put(2, 20);
        lru.put(3, 30);
        System.out.println(lru);

        lru.get(2);
        System.out.println(lru);

        lru.put(4, 40);
        System.out.println(lru);
    }
}
