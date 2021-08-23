import java.util.HashMap;
import java.util.Map;

public class HashTableExercises {

    // O(n)
    public int mostFrequent(int[] items) {
        Map<Integer, Integer> map = new HashMap<>();
        for(var item : items) {
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }

        int mostFrquent = Integer.MIN_VALUE;
        int count = Integer.MIN_VALUE;
        for(var entry : map.entrySet()) {
            if(entry.getValue() > count) {
                count = entry.getValue();
                mostFrquent = entry.getKey();
            }
        }
        return mostFrquent;
    }
}
