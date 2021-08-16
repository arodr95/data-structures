public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
        count = 0;
    }

    public void print() {
        for(int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int value) {
        if(count == items.length) {
            int[] arr = new int[items.length + 1];
            for(int i = 0; i < items.length; i++) {
                arr[i] = items[i];
            }
            arr[count] = value;
            items = arr;
        } else {
            items[count] = value;
        }
        count++;
    }

    public void removeAt(int index) {
        int[] arr = new int[items.length - 1];
        for(int i = 0; i < index; i++) {
            arr[i] = items[i];
        }
        for(int i = index; i < items.length - 1; i++) {
            arr[i] = items[i + 1];
        }
        items = arr;
    }

    public int indexOf(int value) {
        for(int i = 0; i < items.length; i++) {
            if (items[i] == value) {
                return i;
            }
        }
        return -1;
    }
}