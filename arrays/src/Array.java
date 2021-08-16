public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item) {
        // O(n)
        // O(n) - space
        if (items.length == count) {
            int[] newItems = new int[count*2];

            for(int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        // O(n)
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index; i < count; i++)
            items[i] = items[i+1];


        count--;
    }

    public int indexOf(int item) {
        // O(n)
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;

        return -1;
    }

    public int max() {
        int max = -1;
        for(int i = 0; i < count; i ++)
            if(items[i] > max)
                max = items[i];

        return max;
    }

    public int[] intersect(int[] items2) {
        // O(n^2)
        // O(n) - space
        int[] intersect = new int[count];

        for(int i = 0; i < count; i ++)
            for(int j = 0; j < items2.length; i++)
                if (items[i] == items2[j])
                    intersect[i] = items[i];

        return intersect;
    }

    public void print() {
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);

    }
}