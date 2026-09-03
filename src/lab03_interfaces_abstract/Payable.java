package lab03_interfaces_abstract;

/**
 * Lab 03 - Interface: Payable
 * Demonstrates: Interface contracts, abstract methods, and default methods (Java 8+).
 */
public interface Payable {
    // Abstract method that implementing classes must define
    double calculateMonthlyPayment();

    // Default method providing general formatting
    default void printPayslip() {
        System.out.printf("Monthly Payment Amount: $%.2f%n", calculateMonthlyPayment());
    }
}
