package fundamental;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 5, 2, 6, 4}; // Example array
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        System.out.println(n);
        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        System.out.println(expectedSum);
        // Calculate the actual sum of numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        System.out.println(actualSum);
        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }
}