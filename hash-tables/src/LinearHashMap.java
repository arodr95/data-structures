import java.util.HashMap;
import java.util.Map;

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
    private Map<Integer, Integer> indexes = new HashMap();

    public LinearHashMap(int capacity) {
        items = new Entry[capacity];
    }

    public int size() {
        return count;
    }

    // O(n)
    public void put(int key, String value) {
        if (indexes.containsKey(key))
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

    // O(1)
    public Entry get(int key) {
        if (!indexes.containsKey(key))
            throw new IllegalArgumentException("Key does not exist.");

        var index = indexes.get(key);
        return items[index];
    }

    // O(1)
    public Entry remove(int key) {
        if (!indexes.containsKey(key))
            throw new IllegalArgumentException("Key does not exist.");

        var index = indexes.get(key);
        var item = items[index];
        items[index] = null;
        count--;
        return item;
    }

    private int hash(int key) {
        return key % items.length;
    }

    private void insertAt(Entry entry, int index) {
        items[index] = entry;
        indexes.put(entry.key, index);
        count++;
    }

    private boolean itemsIsNullAt(int index) {
        return items[hash(index)] == null;
    }
}
