import java.util.HashSet;
import java.util.Set;

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
    private Set<Integer> keys = new HashSet<>();

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
        if (keys.contains(key))
            throw new IllegalArgumentException("Key already exists.");

        var index = hash(key);
        while (count < items.length) {
            if (itemsIsNullAt(index)) {
                insertAt(new Entry(key, value), index);
                return;
            }
            index++;
        }

        throw new IllegalStateException("Map is at capacity.");
    }

    private void insertAt(Entry entry, int index) {
        items[index] = entry;
        keys.add(entry.key);
        count++;
    }

    private boolean itemsIsNullAt(int index) {
        return items[hash(index)] == null;
    }
}
