import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        System.out.println(list);
        // Other ArrayList Methods:
        //      indexOf - returns first occurrence's index
        //      lastIndexOf - returns last occurrence's index
        //      contains - returns boolean
        //      size - returns # of items
        //      toArray - converts to array object
    }
}
