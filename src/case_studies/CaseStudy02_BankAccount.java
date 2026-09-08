package case_studies;

import java.util.Scanner;

public class CaseStudy02_BankAccount {

    public static class BankAccount {

        private String accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;

            if (balance < 0)
                this.balance = 0;
            else
                this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Deposit amount must be positive.");
                return;
            }

            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        }

        public boolean withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
                return false;
            }

            if (amount > balance) {
                System.out.println("Insufficient balance.");
                return false;
            }

            balance = balance - amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Remaining Balance: $" + balance);

            return true;
        }

        public void displayBalance() {
            System.out.println("\nAccount Details");
            System.out.println("------------------------");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.printf("Balance: $%.2f%n", balance);
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bank Account Management");

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, name, balance);

        account.displayBalance();

        System.out.println("\nDepositing $500");
        account.deposit(500);

        System.out.println("\nWithdrawing $300");
        account.withdraw(300);

        System.out.println("\nTrying to withdraw $5000");
        account.withdraw(5000);

        System.out.println("\nFinal Account Details");
        account.displayBalance();

        sc.close();
    }
}
