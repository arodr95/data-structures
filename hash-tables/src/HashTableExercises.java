import java.util.HashMap;
import java.util.Map;

public class HashTableExercises {

    // O(n)
    public int mostFrequent(int[] items) {
        Map<Integer, Integer> map = new HashMap<>();
        countOccurences(items, map);

        return findMostFrequentOccurence(map);
    }

    private int findMostFrequentOccurence(Map<Integer, Integer> map) {
        int mostFrequent = -1;
        int count = 0;
        for(var entry : map.entrySet()) {
            if(entry.getValue() > count) {
                count = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }

    private void countOccurences(int[] items, Map<Integer, Integer> map) {
        for(var item : items) {
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }
    }
}
