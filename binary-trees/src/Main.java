public class Main {
    public static void main(String args[]) {
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(4);
        tree.insert(7);
        tree.insert(8);
        System.out.println(tree.find(5));
        System.out.println(tree.find(3));
        System.out.println(tree.find(8));
        System.out.println(tree.find(4));
        System.out.println(tree.find(7));
        System.out.println(tree.find(2));
        System.out.println(tree.find(9));
        System.out.println("Done");
    }
}
