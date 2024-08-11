package fundamental;

public class CheckPrimeNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        if (n % 2 == 0) {
//            System.out.println("Not a prime number");
//        } else {
//            System.out.println("Prime number");
//        }
//    }
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
