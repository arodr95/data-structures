public class LinearHashMap {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry[] items;
    private int count;

    public LinearHashMap(int capacity) {
        items = new Entry[capacity];
    }

    // put(int, String)
    // get(int) -> string
    // remove(int)
    // size()

    private int hash(int key) {
        return key % items.length;
    }

    public void put(int key, String value) {
        var index = hash(key);
        if (items[index] == null) {
            items[index] = new Entry(key, value);
            count++;
            return;
        }
        else {
            index++;
            while (count < items.length)
                if (items[hash(index)] == null) {
                    items[index++] = new Entry(key, value);
                    count++;
                    return;
                }
        }

        throw new IllegalStateException();
    }
}
