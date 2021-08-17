import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        var list = LinkedList.createWithLoop();
        System.out.println(list.hasLoop());
        var list2 = new LinkedList();
        list2.addLast(10);
        list2.addLast(20);
        list2.addLast(30);
        list2.addLast(40);
        list2.addLast(50);
        list2.addLast(60);

        System.out.println(list2.hasLoop());

    }
}
