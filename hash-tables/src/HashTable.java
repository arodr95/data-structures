import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        private Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{key=" + key + ", value=" + value + "}";
        }
    }

    private LinkedList<Entry>[] table;

    public HashTable(int capacity) {
        table = new LinkedList[capacity];
    }

    public int hash(int key) {
        return key % table.length;
    }

    public void put(int key, String value) {
        if (!isUniqueKey(key))
            throw new IllegalArgumentException();

        var hashVal = hash(key);
        if(listIsEmptyAt(hashVal))
            table[hashVal] = new LinkedList<>();

        table[hashVal].addLast(new Entry(key, value));
    }

    private boolean listIsEmptyAt(int hashVal) {
        return table[hashVal] == null;
    }

    private boolean isUniqueKey(int key) {
        var hashVal = hash(key);
        if (listIsEmptyAt(hashVal))
            return true;

        for (Entry e : table[hashVal])
            if(e.key == key)
                return false;
        return true;
    }

    public String get(int key) {
        var hashVal = hash(key);
        if (listIsEmptyAt(hashVal))
            throw new IllegalArgumentException();

        for(Entry e : table[hashVal])
            if (e.key == key)
                return e.value;

        throw new NoSuchElementException();
    }

    public void remove(int key) {
        var hashVal = hash(key);
        if (listIsEmptyAt(hashVal))
            return;

        table[hashVal].removeIf(e -> e.key == key);
    }

    @Override
    public String toString() {
        return Arrays.toString(table);
    }
}
