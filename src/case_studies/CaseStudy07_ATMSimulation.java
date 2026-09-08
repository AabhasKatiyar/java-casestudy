package case_studies;

import java.util.Scanner;

public class CaseStudy07_ATMSimulation {

    public static class ATM {

        private String correctPin;
        private double balance;
        private int failedAttempts;
        private boolean cardBlocked;

        public ATM(String pin, double balance) {
            correctPin = pin;
            this.balance = balance;
            failedAttempts = 0;
            cardBlocked = false;
        }

        public boolean authenticate(String pin) {

            if (cardBlocked) {
                System.out.println("Card is blocked.");
                return false;
            }

            if (correctPin.equals(pin)) {
                failedAttempts = 0;
                return true;
            }

            failedAttempts++;
            System.out.println("Incorrect PIN.");

            if (failedAttempts == 3) {
                cardBlocked = true;
                System.out.println("Maximum attempts reached. Card is blocked.");
            } else {
                System.out.println("Attempts remaining: " + (3 - failedAttempts));
            }

            return false;
        }

        public void deposit(double amount) {

            if (amount <= 0) {
                System.out.println("Invalid deposit amount.");
                return;
            }

            balance = balance + amount;
            System.out.println("Amount deposited: ₹" + amount);
        }

        public void withdraw(double amount) {

            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
                return;
            }

            if (amount > balance) {
                System.out.println("Insufficient balance.");
                return;
            }

            balance = balance - amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        }

        public void displayBalance() {
            System.out.println("Current Balance: ₹" + balance);
        }

        public boolean isCardBlocked() {
            return cardBlocked;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM("1234", 15000);

        System.out.println("ATM Simulation");

        boolean login = false;

        while (!login && !atm.isCardBlocked()) {

            System.out.print("Enter PIN: ");
            String pin = sc.nextLine();

            login = atm.authenticate(pin);
        }

        if (!login) {
            System.out.println("Session ended.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    atm.displayBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    atm.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    atm.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
