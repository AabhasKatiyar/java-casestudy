package lab01_fundamentals;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (op) {
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
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + num1 + " " + op + " " + num2 + " = " + result);
        }

        sc.close();
    }
}
