import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        var current = first;
        var index = 0;
        while(current != null) {
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        var second = first.next;
        first.next = null;
        first = second;
    }
}
