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

        for(int i = count; i >= 0; i--){
            if(i == 0)
                items[i] = item;
            else if (items[i - 1] < item) {
                items[i] = item;
                break;
            } else if(items[i - 1] > item)
                items[i] = items[i - 1];
        }
        count++;
    }

    public int remove() {
        var item = items[0];
        count--;

        var newItems = Arrays.copyOfRange(items, 1, count + 1);
        items = newItems;

        return item;
    }

    public int peek() {
        return items[0];
    }

    public void increaseSize() {
        var newItems = Arrays.copyOf(items, count * 2);
        items = newItems;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }
}
