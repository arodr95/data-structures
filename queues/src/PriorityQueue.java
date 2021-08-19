import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[1];
    private int count;

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public void add(int item) {
        if (isFull())
            increaseSize();

        var i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public int peek() {
        return items[count - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }

    private void increaseSize() {
        var newItems = Arrays.copyOf(items, count + 1);
        items = newItems;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for(i = count - 1; i >= 0; i--){
            if(items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return ++i;
    }
}
