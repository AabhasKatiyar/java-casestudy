package case_studies;

import java.util.Scanner;

public class CaseStudy07_ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 10000.0;
        int attempts = 0;
        boolean loggedIn = false;

        System.out.println("=== Welcome to ATM ===");

        while (attempts < 3) {
            System.out.print("Enter your 4-digit PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                loggedIn = true;
                System.out.println("PIN verified successfully!\n");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN! Attempts left: " + (3 - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println("Card blocked due to 3 incorrect attempts. Please contact your bank.");
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
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    if (dep > 0) {
                        balance += dep;
                        System.out.println("Amount deposited. Updated Balance: " + balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double with = sc.nextDouble();
                    if (with <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (with > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= with;
                        System.out.println("Please collect your cash. Remaining Balance: " + balance);
                    }
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
