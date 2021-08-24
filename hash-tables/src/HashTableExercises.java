import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {

    // O(n)
    public int mostFrequent(int[] items) {
        // Create a map containing each item and its frequency.
        Map<Integer, Integer> map = new HashMap<>();
        for(var item : items) {
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }

        // Iterate over map to find item with the highest frequency.
        int mostFrequent = Integer.MIN_VALUE;
        int count = 0;
        for(var entry : map.entrySet()) {
            if(entry.getValue() > count) {
                count = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }

    // O(n)
    public int countPairsWithDiff(int[] items, int difference) {
        if (!containsAtLeastTwoItems(items))
            throw new IllegalArgumentException();

        // Extract all numbers to a set for quick lookup.
        Set<Integer> set = new HashSet<>();
        for (var num : items)
            set.add(num);

        // b = a + difference or b = a - difference
        // Iterate over numbers again, and check if (num +||- difference) is in set.
        // If so increment count and remove num to avoid re-counting the pair.
        var count = 0;
        for (var num : items) {
            if (set.contains(num + difference))
                count++;
            if (set.contains(num - difference))
                count++;
            set.remove(num);
        }

        return count;
    }

    // O(n)
    public int[] twoSum(int[] items, int target) {
        if (!containsAtLeastTwoItems(items))
            throw new IllegalArgumentException();

        // Create a map that will hold each value and its index.
        Map<Integer, Integer> map = new HashMap<>();

        // a + b = target ---> target - a = b.
        // On each iteration, if both numbers adding up to target are present
        // return their indexes.
        for(var index = 0; index < items.length; index++) {
            int complement = target - items[index];
            if (map.containsKey(complement))
                return new int[] {map.get(complement), index};
            map.put(items[index], index);
        }

        return null;
    }

    private boolean containsAtLeastTwoItems(int[] items) {
        return items.length >= 2;
    }
}
