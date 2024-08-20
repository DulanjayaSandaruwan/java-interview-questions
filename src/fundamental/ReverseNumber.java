package fundamental;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Add the digit to the reverse number
            number /= 10; // Remove the last digit from the number
        }

        System.out.println("Reversed number: " + reverse);
    }
}
