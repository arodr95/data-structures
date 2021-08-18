import java.util.Arrays;

public class ArrayStack {
    private int[] items;
    private int count;

    public ArrayStack(int size) {
        items = new int[size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == items.length;
    }

    public void push(int item) {
        if(isFull()) {
            throw new StackOverflowError();
        }

        items[count++] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[count - 1];
    }

    @Override
    public String toString() {
        var stack = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(stack);
    }
}
