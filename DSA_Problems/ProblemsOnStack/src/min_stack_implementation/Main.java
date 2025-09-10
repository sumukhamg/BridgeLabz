package min_stack_implementation;

public class Main {
    public static void main(String[] args) {
        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);
        ms.push(2);

        System.out.println("Min element: " + ms.getMin());
        ms.pop();
        System.out.println("Min element after popping 2: " + ms.getMin());

    }
}
