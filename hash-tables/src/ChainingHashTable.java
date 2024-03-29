import java.util.Arrays;
import java.util.LinkedList;

public class ChainingHashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{key=" + key + ", value=" + value + "}";
        }
    }

    private LinkedList<Entry>[] entries;

    public ChainingHashTable(int capacity) {
        entries = new LinkedList[capacity];
    }

    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).addLast(new Entry(key, value));
    }

    public String get(int key) {
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();
        getBucket(key).remove(entry);
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        return entries[index];
    }

    private Entry getEntry(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null)
            for (var entry : bucket)
                if (entry.key == key)
                    return entry;
        return null;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    private boolean bucketIsEmptyAt(int index){
        return entries[index] == null;
    }
}
