package fundamental;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        int[] uniqueArray = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArray[i++] = num;
        }
        System.out.println(Arrays.toString(uniqueArray));
    }
}
