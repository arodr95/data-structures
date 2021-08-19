import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Integer> items;

    public LinkedListStack() {
        items = new LinkedList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push (int item) {
        items.add(item);
    }

    public int pop() {
        if(isEmpty())
            throw new IllegalStateException();
        return items.remove(items.size() - 1);
    }

    public int peek() {
        return items.getLast();
    }

    @Override
    public String toString() {
        return items.toString();
    }

}
