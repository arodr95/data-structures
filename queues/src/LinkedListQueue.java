import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Integer> items;

    public LinkedListQueue() {
        items = new LinkedList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(int item) {
        items.addLast(item);
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        return items.removeFirst();
    }

    public int peek() {
        return items.getFirst();
    }

    @Override
    public String toString() {
        return Arrays.toString(items.toArray());
    }
}
