import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {

    // O(n)
    public int mostFrequent(int[] items) {
        Map<Integer, Integer> map = new HashMap<>();
        countOccurrences(items, map);

        return findMostFrequentOccurrence(map);
    }

    private int findMostFrequentOccurrence(Map<Integer, Integer> map) {
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

    private void countOccurrences(int[] items, Map<Integer, Integer> map) {
        for(var item : items) {
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }
    }

    public int countPairsWithDiff(int[] items, int k){
        Set<Integer> set = new HashSet<>();
        for(var item : items)
            set.add(item);

        var count = 0;
        for(var num : set)
            if(set.contains(num + k))
                count++;

        return count;
    }
}
