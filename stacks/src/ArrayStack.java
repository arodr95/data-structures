import java.util.Arrays;

public class ArrayStack {
    private int[] items;
    private int count;

    public ArrayStack() {
        items = new int[0];
        count = 0;
    }

    private boolean isFull() {
        return count == items.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(int item) {
        if(isFull()) {
            increaseSize();
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

    private void increaseSize() {
        var newStack = new int [count + 1];
        var index = 0;
        for(int item : items) {
            newStack[index] = item;
            index++;
        }
        items = newStack;
    }
}
