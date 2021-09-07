import java.util.*;

public class Main {
    public static void main(String args[]) {
        LinearHashMap map = new LinearHashMap(3);
        map.put(0, "Andrew");
        map.put(2, "Mosh");
        map.put(3, "Jenn");

        var item = map.get(4);

        System.out.println("Done");
    }
}
