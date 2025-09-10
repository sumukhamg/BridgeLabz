package reverse_linked_list;

public class ReverseALinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);
        list.reverse();
        System.out.println(list);
    }
}