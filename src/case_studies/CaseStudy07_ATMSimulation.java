package case_studies;

import java.util.Scanner;

/**
 * Case Study 7: ATM Simulation
 * Problem:
 * Design an ATM program that:
 * 1. Checks PIN.
 * 2. Allows withdrawal.
 * 3. Allows deposit.
 * 4. Displays balance.
 * 5. Allows maximum 3 incorrect PIN attempts before card is blocked.
 */
public class CaseStudy07_ATMSimulation {

    public static class ATM {
        private final String correctPin;
        private double balance;
        private int failedAttempts;
        private boolean isCardBlocked;
        private static final int MAX_ATTEMPTS = 3;

        public ATM(String pin, double initialBalance) {
            this.correctPin = pin;
            this.balance = Math.max(initialBalance, 0.0);
            this.failedAttempts = 0;
            this.isCardBlocked = false;
        }

        public boolean authenticate(String enteredPin) {
            if (isCardBlocked) {
                System.out.println("[ACCESS DENIED] Your ATM card has been BLOCKED due to 3 incorrect attempts. Please visit your branch.");
                return false;
            }

            if (correctPin.equals(enteredPin)) {
                failedAttempts = 0; // Reset on success
                return true;
            } else {
                failedAttempts++;
                int remaining = MAX_ATTEMPTS - failedAttempts;
                System.out.printf("[ERROR] Incorrect PIN entered! (%d/%d attempts used)%n", failedAttempts, MAX_ATTEMPTS);
                if (remaining > 0) {
                    System.out.printf("You have %d attempt(s) remaining.%n", remaining);
                } else {
                    isCardBlocked = true;
                    System.out.println("[ALERT] Maximum PIN attempts exceeded. Card is now BLOCKED for security.");
                }
                return false;
            }
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("[Error] Deposit amount must be greater than zero.");
                return;
            }
            balance += amount;
            System.out.printf("Deposited: ₹%,.2f | New Balance: ₹%,.2f%n", amount, balance);
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("[Error] Invalid withdrawal amount.");
                return false;
            }
            if (amount > balance) {
                System.out.printf("[Transaction Failed] Insufficient balance! Available: ₹%,.2f%n", balance);
                return false;
            }
            balance -= amount;
            System.out.printf("Dispensed: ₹%,.2f | Remaining Balance: ₹%,.2f%n", amount, balance);
            return true;
        }

        public void displayBalance() {
            System.out.println("----------------------------------------------");
            System.out.printf("Available Account Balance: ₹%,.2f%n", balance);
            System.out.println("----------------------------------------------");
        }

        public boolean isCardBlocked() {
            return isCardBlocked;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("          CASE STUDY 7: ATM SIMULATOR             ");
        System.out.println("==================================================");

        ATM atm = new ATM("1234", 15000.00); // Default PIN: 1234

        boolean authenticated = false;
        while (!authenticated && !atm.isCardBlocked()) {
            System.out.print("Please enter your 4-digit PIN: ");
            String pinInput = scanner.nextLine().trim();
            authenticated = atm.authenticate(pinInput);
            System.out.println();
        }

        if (!authenticated) {
            System.out.println("ATM session terminated.");
            scanner.close();
            return;
        }

        System.out.println("PIN verification successful. Welcome to Antigravity Bank ATM!");

        boolean inSession = true;
        while (inSession) {
            System.out.println("\n----------------- ATM MENU -----------------");
            System.out.println(" 1. Check Account Balance");
            System.out.println(" 2. Deposit Cash");
            System.out.println(" 3. Withdraw Cash");
            System.out.println(" 4. Exit / Eject Card");
            System.out.println("--------------------------------------------");
            System.out.print("Select an option (1-4): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    atm.displayBalance();
                    break;
                case "2":
                    System.out.print("Enter amount to deposit (₹): ");
                    double dep = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                    scanner.nextLine();
                    atm.deposit(dep);
                    break;
                case "3":
                    System.out.print("Enter amount to withdraw (₹): ");
                    double with = scanner.hasNextDouble() ? scanner.nextDouble() : 0;
                    scanner.nextLine();
                    atm.withdraw(with);
                    break;
                case "4":
                    System.out.println("Thank you for banking with us. Please collect your card!");
                    inSession = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }

        scanner.close();
    }
}
