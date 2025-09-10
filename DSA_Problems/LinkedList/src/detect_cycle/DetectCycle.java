package detect_cycle;

public class DetectCycle {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println("Has cycle? " + list.hasCycle());
        list.createCycle(1);

        System.out.println("Has cycle? " + list.hasCycle());

    }
}
