package lab01_fundamentals;

import java.util.Scanner;

/**
 * Lab 01 - Problem 2: Number Operations
 * Demonstrates: Loop constructs (for, while), conditional logic, recursion vs iteration.
 * Classic college lab problems: Prime Number Check, Fibonacci Sequence, Factorial calculation.
 */
public class NumberOperations {

    // Prime number verification - O(sqrt(n))
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Factorial via Iteration
    public static long factorialIterative(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Factorial via Recursion
    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    // Fibonacci Series up to count
    public static void printFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Terms must be > 0");
            return;
        }
        long a = 0, b = 1;
        System.out.print("Fibonacci (" + terms + " terms): ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + (i == terms ? "" : ", "));
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("    SEMESTER LAB 01: NUMBER OPERATIONS   ");
        System.out.println("=========================================");

        System.out.print("Enter an integer to inspect: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            // Prime check
            System.out.println("• " + num + " is " + (isPrime(num) ? "a PRIME number." : "NOT a prime number."));

            // Factorial check (for small numbers to avoid overflow)
            if (num >= 0 && num <= 20) {
                System.out.println("• Factorial (Iterative): " + factorialIterative(num));
                System.out.println("• Factorial (Recursive): " + factorialRecursive(num));
            } else if (num > 20) {
                System.out.println("• Factorial: (Value exceeds 64-bit long range)");
            }

            // Fibonacci sequence
            printFibonacci(Math.min(Math.max(num, 5), 15));
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }
}
