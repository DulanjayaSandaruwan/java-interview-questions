package fundamental;

public class SecondLargeNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second Maximum: " + secondMax);
    }
}
