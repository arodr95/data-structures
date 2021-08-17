import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        var list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
        var value = list.getKthFromTheEnd(1);
        System.out.println(value);
    }
}
