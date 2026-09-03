package case_studies;

import java.util.Scanner;

/**
 * Case Study 2: Bank Account Management
 * Problem:
 * A bank wants to create a simple account management program.
 * Create a class BankAccount containing:
 * - Account number
 * - Account holder name
 * - Balance
 * Implement methods:
 * - deposit()
 * - withdraw()
 * - displayBalance()
 * The withdrawal should not be allowed if the requested amount is greater than the available balance.
 */
public class CaseStudy02_BankAccount {

    public static class BankAccount {
        private final String accountNumber;
        private final String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = Math.max(initialBalance, 0.0);
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("[Error] Deposit amount must be positive.");
                return;
            }
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. New Balance: $%.2f%n", amount, balance);
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("[Error] Withdrawal amount must be positive.");
                return false;
            }
            if (amount > balance) {
                System.out.printf("[Declined] Insufficient funds! Requested: $%.2f, Available: $%.2f%n", amount, balance);
                return false;
            }
            balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. Remaining Balance: $%.2f%n", amount, balance);
            return true;
        }

        public void displayBalance() {
            System.out.println("----------------------------------------------");
            System.out.printf("Account Number: %s%n", accountNumber);
            System.out.printf("Holder Name:    %s%n", accountHolderName);
            System.out.printf("Current Balance: $%.2f%n", balance);
            System.out.println("----------------------------------------------");
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("     CASE STUDY 2: BANK ACCOUNT MANAGEMENT        ");
        System.out.println("==================================================");

        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine().trim();
        System.out.print("Enter Account Holder Name: ");
        String holder = scanner.nextLine().trim();
        System.out.print("Enter Initial Deposit: $");
        double initBal = scanner.hasNextDouble() ? scanner.nextDouble() : 1000.0;

        BankAccount account = new BankAccount(accNum, holder, initBal);
        account.displayBalance();

        // Demonstration of operations
        System.out.println("\n[Action 1] Depositing $500.00:");
        account.deposit(500.0);

        System.out.println("\n[Action 2] Attempting valid withdrawal of $300.00:");
        account.withdraw(300.0);

        System.out.println("\n[Action 3] Attempting invalid withdrawal of $5000.00 (Exceeds balance):");
        account.withdraw(5000.0);

        System.out.println("\n[Final State]");
        account.displayBalance();

        scanner.close();
    }
}
