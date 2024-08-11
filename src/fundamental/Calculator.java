package fundamental;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input operation and numbers
        System.out.print("Enter first number: ");
        double num1 = getValidDouble(scanner);

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = getValidOperator(scanner);

        System.out.print("Enter second number: ");
        double num2 = getValidDouble(scanner);

        double result = 0;

        // Switch-case to handle different operations
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return;
        }

        // Output the result
        System.out.println("The result is: " + result);
    }

    // Method to validate the operator input
    private static char getValidOperator(Scanner scanner) {
        char operator = scanner.next().charAt(0);
        while (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            System.out.print("Invalid operator. Please enter (+, -, *, /): ");
            operator = scanner.next().charAt(0);
        }
        return operator;
    }

    // Method to validate number input
    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid number. Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
