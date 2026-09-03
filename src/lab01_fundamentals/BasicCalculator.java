package lab01_fundamentals;

import java.util.Scanner;

/**
 * Lab 01 - Problem 1: Basic Calculator
 * Demonstrates: Standard I/O (Scanner), variables, data types, arithmetic operators, and switch-case control structures.
 */
public class BasicCalculator {

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return num1 / num2;
            case '%':
                if (num2 == 0) {
                    throw new ArithmeticException("Modulo by zero is not allowed.");
                }
                return num1 % num2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("       SEMESTER LAB 01: CALCULATOR       ");
        System.out.println("=========================================");

        try {
            System.out.print("Enter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Error: Invalid numeric input.");
                return;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Error: Invalid numeric input.");
                return;
            }
            double num2 = scanner.nextDouble();

            double result = calculate(num1, num2, operator);
            System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Calculation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
