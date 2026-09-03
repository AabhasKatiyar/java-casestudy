package case_studies;

import java.util.Scanner;

class ATM {
    private int pin;
    private double balance;
    private int attempts;
    private boolean cardBlocked;

    public ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
        this.attempts = 0;
        this.cardBlocked = false;
    }

    public boolean validatePin(int enteredPin) {
        if (cardBlocked) {
            System.out.println("Card is blocked due to 3 incorrect attempts.");
            return false;
        }
        if (enteredPin == pin) {
            System.out.println("PIN verified successfully!");
            return true;
        } else {
            attempts++;
            System.out.println("Incorrect PIN! Attempts left: " + (3 - attempts));
            if (attempts >= 3) {
                cardBlocked = true;
                System.out.println("Card blocked due to 3 incorrect attempts. Please contact your bank.");
            }
            return false;
        }
    }

    public boolean isCardBlocked() {
        return cardBlocked;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited. Updated Balance: " + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash. Remaining Balance: " + balance);
        }
    }
}

public class CaseStudy07_ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1234, 10000.0);

        System.out.println("=== Welcome to ATM ===");

        boolean authenticated = false;
        while (!authenticated && !atm.isCardBlocked()) {
            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();
            authenticated = atm.validatePin(enteredPin);
        }

        if (!authenticated) {
            sc.close();
            return;
        }

        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + atm.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    atm.deposit(dep);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double with = sc.nextDouble();
                    atm.withdraw(with);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
