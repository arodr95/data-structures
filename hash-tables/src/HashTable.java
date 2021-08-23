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

    public int hash(int key) {
        return key % entries.length;
    }

    public void put(int key, String value) {
        if (!isUniqueKey(key))
            throw new IllegalArgumentException();

        var hashVal = hash(key);
        if(listIsEmptyAt(hashVal))
            entries[hashVal] = new LinkedList<>();

        entries[hashVal].addLast(new Entry(key, value));
    }

    private boolean listIsEmptyAt(int hashVal) {
        return entries[hashVal] == null;
    }

    private boolean isUniqueKey(int key) {
        var hashVal = hash(key);
        if (listIsEmptyAt(hashVal))
            return true;

        for (Entry e : entries[hashVal])
            if(e.key == key)
                return false;
        return true;
    }

    public String get(int key) {
        var hashVal = hash(key);
        if (listIsEmptyAt(hashVal))
            throw new IllegalArgumentException();

        for(Entry e : entries[hashVal])
            if (e.key == key)
                return e.value;

        throw new NoSuchElementException();
    }

    public void remove(int key) {
        var hashVal = hash(key);
        if (listIsEmptyAt(hashVal))
            return;

        entries[hashVal].removeIf(e -> e.key == key);
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}
