package fundamental;

import java.util.Arrays;
import java.util.List;

public class FindSumOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5);
        int sumOfEvenNumbers = findSumOfEvenNumbers(list);
        System.out.println(sumOfEvenNumbers);
    }

    public static int findSumOfEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
    }
}
