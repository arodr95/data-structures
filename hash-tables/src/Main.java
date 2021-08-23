import java.util.*;

public class Main {
    public static void main(String args[]) {
        HashTable table = new HashTable(5);

        table.put(0, "Andrew");
        table.put(1, "Mosh");
        table.put(5, "Colton");
        table.put(1, "Jenn");
        System.out.println(table);
        System.out.println(table.get(0));
        System.out.println(table.get(1));
        System.out.println(table.get(5));

        table.remove(0);
        System.out.println(table);
        table.remove(1);
        System.out.println(table);
        table.remove(5);
        System.out.println(table);
    }
}
