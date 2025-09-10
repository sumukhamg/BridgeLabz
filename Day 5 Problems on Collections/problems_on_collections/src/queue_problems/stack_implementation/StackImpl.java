package queue_problems.stack_implementation;

import java.util.LinkedList;
import java.util.Queue;

public class StackImpl<T> {
    private Queue<Integer> q = new LinkedList<>();
    private int size;

    public int size() {
        return size;
    }

    public void push(int x) {
        q.add(x);
        size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.remove();
    }

    public int top() {
        if (q.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    void display() {
        System.out.println(q);
    }
}
