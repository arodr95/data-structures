import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int capacity) {
        items = new int[capacity];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    private boolean isMax(int item) {
        return item > items[count - 1];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new StackOverflowError();

        if(isEmpty() || isMax(item))
            items[count++] = item;
        else {
            for (int i = items.length - 2; i >= 0; i--) {
                items[i + 1] = items[i];
                if (item < items[i]) {
                    items[i] = item;
                    break;
                }            }
            count++;
        }
    }

    public int dequeue() {
        var item = items[0];

        for (int i = 0; i < items.length; i++)
            items[i] = items[i+1];

        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
