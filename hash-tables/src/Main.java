import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinearHashMap map = new LinearHashMap(3);
        map.put(0, "Andrew");
        System.out.println("size is " + map.size());
        map.put(2, "Mosh");
        System.out.println("size is " + map.size());
        map.put(3, "Mosh");
        System.out.println("size is " + map.size());
        var item = map.remove(3);
        System.out.println("size is " + map.size() + " after removing item");
        System.out.println("Done");
    }
}
