package case_studies;

import java.util.Scanner;

// Case Study 2: Bank Account
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal not allowed.");
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class CaseStudy02_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(accNum, name, bal);

        // Display balance
        acc.displayBalance();

        // Testing deposit
        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);
        acc.displayBalance();

        // Testing withdrawal
        System.out.print("\nEnter amount to withdraw: ");
        double with = sc.nextDouble();
        acc.withdraw(with);
        acc.displayBalance();

        sc.close();
    }
}
