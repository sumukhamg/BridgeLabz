package queue_problems.circular_queue_implementation;

public class Main {
    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue = new CircularQueue<>();
        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.enQueue(30);
        circularQueue.enQueue(40);
        circularQueue.enQueue(50);

        circularQueue.display();

        circularQueue.deQueue();
        circularQueue.display();

        circularQueue.enQueue(60);
        circularQueue.display();

    }
}
