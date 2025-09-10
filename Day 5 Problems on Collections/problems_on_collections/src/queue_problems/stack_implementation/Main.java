package queue_problems.stack_implementation;

public class Main {
    public static void main(String[] args) {
        StackImpl<Integer> s = new StackImpl<>();
        s.push(1);
        System.out.println(s.top());
        System.out.println(s.size());

        s.push(2);
        System.out.println(s.top());

        s.push(3);
        System.out.println(s.top());

        System.out.println();
        System.out.println(s.top());

        s.display();

    }
}
