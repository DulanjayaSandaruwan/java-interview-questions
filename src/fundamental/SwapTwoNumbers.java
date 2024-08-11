package fundamental;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        b = b + a; // b = 30
        a = b - a; // a = 20
        b = b - a; // b = 10

        System.out.println("a " + a + " " + "b " + b);
    }
}
