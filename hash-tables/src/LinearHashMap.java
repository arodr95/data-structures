import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
    private Map<Integer, Integer> keys = new HashMap();

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
        if (keys.containsKey(key))
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

    public void get(int key) {

    }

    private void insertAt(Entry entry, int index) {
        items[index] = entry;
        keys.put(entry.key, index);
        count++;
    }

    private boolean itemsIsNullAt(int index) {
        return items[hash(index)] == null;
    }
}
