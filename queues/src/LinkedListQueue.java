import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    // O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    // O(1)
    public int size() {
        return count;
    }

    // O(1)
    public void enqueue(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else{
            tail.next = node;
            tail = tail.next;
        }

        count++;
    }

    // O(1)
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        int value;
        if (head == tail) {
            value = head.value;
            head = tail = null;
        }
        else {
            value = head.value;
            var newHead = head.next;
            head.next = null;
            head = newHead;
        }

        count--;

        return value;
    }

    // O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return head.value;
    }

    // O(n)
    @Override
    public String toString() {
        var items = new ArrayList<>();

        Node current = head;
        while(current != null) {
            items.add(current.value);
            current = current.next;
        }

        return items.toString();
    }
}
