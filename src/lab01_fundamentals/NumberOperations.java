package lab01_fundamentals;

import java.util.Scanner;

// Lab 1: Prime, Factorial and Fibonacci Operations
public class NumberOperations {

    // Method to check prime
    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method for factorial using recursion
    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Method to print fibonacci series
    public static void printFibonacci(int count) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // 1. Prime check
        if (checkPrime(num)) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }

        // 2. Factorial
        if (num >= 0 && num <= 20) {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }

        // 3. Fibonacci
        printFibonacci(8);

        sc.close();
    }
}
