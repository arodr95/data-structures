public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;
    private int size;

    public void insert(int value) {
        if (isEmpty()) {
            root = new Node(value);
            size++;
            return;
        }

        var current = root;
        while (current != null) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    size++;
                    return;
                }
                else
                    current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    size++;
                    return;
                }
                else
                    current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value == current.value)
                return true;
            if (value < current.value)
                current = current.leftChild;
            else
                current = current.rightChild;
        }

        return false;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
