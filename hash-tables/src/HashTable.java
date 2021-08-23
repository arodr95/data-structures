import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTable {
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

    public HashTable(int capacity) {
        entries = new LinkedList[capacity];
    }

    public void put(int key, String value) {
        var index = hash(key);
        if(entriesIsEmptyAt(index))
            entries[index] = new LinkedList<>();

        var entry = new Entry(key, value);
        for (Entry e : entries[index])
           if (e.key == key) {
               e.value = value;
               return;
           }
        entries[index].addLast(entry);
    }

    private int hash(int key) {
        return key % entries.length;
    }

    private boolean entriesIsEmptyAt(int index) {
        return entries[index] == null;
    }

    private boolean isUniqueKey(int key) {
        var index = hash(key);
        if (entriesIsEmptyAt(index))
            return true;

        for (Entry e : entries[index])
            if(e.key == key)
                return false;
        return true;
    }

    public String get(int key) {
        var index = hash(key);
        if (entriesIsEmptyAt(index))
            throw new IllegalArgumentException();

        for(Entry e : entries[index])
            if (e.key == key)
                return e.value;

        throw new NoSuchElementException();
    }

    public void remove(int key) {
        var index = hash(key);
        if (entriesIsEmptyAt(index))
            return;

        entries[index].removeIf(e -> e.key == key);
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}
