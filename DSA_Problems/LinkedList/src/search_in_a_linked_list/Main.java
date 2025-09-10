package search_in_a_linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.display();

        int key = 20;
        int pos = list.search(key);

        if (pos != -1) {
            System.out.println("Found at position " + pos);
        } else {
            System.out.println("Not found");
        }
    }
}
