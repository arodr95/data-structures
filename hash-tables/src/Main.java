import java.util.*;

public class Main {
    public static void main(String args[]) {
        HashTableExercises exercises = new HashTableExercises();
        int[] items = new int[] {1, 2};
        var target = 3;
        System.out.println(Arrays.toString(exercises.twoSum(items, target)));
    }
}
