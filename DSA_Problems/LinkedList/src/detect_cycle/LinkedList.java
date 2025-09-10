package detect_cycle;

import common_files.LinkedListParent;
import common_files.Node;

public class LinkedList<T> extends LinkedListParent<T> {

    public boolean hasCycle() {
        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void createCycle(int pos) {
        if (head == null)
            return;

        Node<T> temp = head;
        Node<T> cycleNode = null;
        int count = 0;

        while (temp.next != null) {
            if (count == pos) {
                cycleNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = cycleNode;
    }

}
