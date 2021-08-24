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

    public LinearHashMap(int capacity) {
        items = new Entry[capacity];
    }

    // put(int, String)
    // get(int) -> string
    // remove(int)
    // size()
}
