# Java Semester Case Studies

This repository contains complete solutions to all 10 university semester Java case studies, implemented using Object-Oriented Programming (OOP) concepts.

---

## Case Study 1: Student Result Management System

### Problem
A college wants to develop a Java program to calculate the result of a student. The student has marks in five subjects.
The program should:
1. Accept student name and marks.
2. Calculate total and percentage.
3. Display grade according to:
   - Percentage >= 90 -> A+
   - Percentage >= 80 -> A
   - Percentage >= 70 -> B
   - Percentage >= 60 -> C
   - Percentage >= 50 -> D
   - Below 50 -> F
4. Display whether the student has passed or failed.

### Code (`CaseStudy01_StudentResult.java`)
```java
package case_studies;

import java.util.Scanner;

class StudentResult {
    String name;
    int[] marks = new int[5];

    public StudentResult(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isPassed() {
        return calculatePercentage() >= 50;
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Result: " + (isPassed() ? "Passed" : "Failed"));
    }
}

public class CaseStudy01_StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        StudentResult student = new StudentResult(name, marks);
        student.displayResult();

        sc.close();
    }
}
```

---

## Case Study 2: Bank Account

### Problem
A bank wants to create a simple account management program.
Create a class BankAccount containing:
- Account number
- Account holder name
- Balance
Implement methods:
- `deposit()`
- `withdraw()`
- `displayBalance()`
The withdrawal should not be allowed if the requested amount is greater than the available balance.

### Code (`CaseStudy02_BankAccount.java`)
```java
package case_studies;

import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

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
        acc.displayBalance();

        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);
        acc.displayBalance();

        System.out.print("\nEnter amount to withdraw: ");
        double with = sc.nextDouble();
        acc.withdraw(with);
        acc.displayBalance();

        sc.close();
    }
}
```

---

## Case Study 3: Employee Salary Management

### Problem
An organization maintains employee information.
Create an Employee class with:
- Employee ID
- Name
- Basic salary
Calculate:
- HRA = 20% of basic salary
- DA = 10% of basic salary
- Gross salary = Basic + HRA + DA
Display the complete salary details.

### Code (`CaseStudy03_EmployeeSalary.java`)
```java
package case_studies;

import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double basicSalary;

    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateHRA() {
        return 0.20 * basicSalary;
    }

    public double calculateDA() {
        return 0.10 * basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    public void displaySalaryDetails() {
        System.out.println("\n--- Employee Salary Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + calculateHRA());
        System.out.println("DA (10%): " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class CaseStudy03_EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Employee emp = new Employee(id, name, basic);
        emp.displaySalaryDetails();

        sc.close();
    }
}
```

---

## Case Study 4: Online Shopping Cart

### Problem
An online shopping application stores products in a shopping cart.
Create a Product class containing:
- Product ID
- Product name
- Price
- Quantity
Calculate the total cost of each product and the total bill.
If the total bill exceeds Rs. 5,000, provide a 10% discount.

### Code (`CaseStudy04_ShoppingCart.java`)
```java
package case_studies;

import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    Product[] products;

    public ShoppingCart(Product[] products) {
        this.products = products;
    }

    public double calculateTotalBill() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalCost();
        }
        return total;
    }

    public double calculateDiscount(double totalBill) {
        if (totalBill > 5000) {
            return totalBill * 0.10;
        }
        return 0;
    }

    public void displayBill() {
        double totalBill = calculateTotalBill();
        double discount = calculateDiscount(totalBill);
        double finalAmount = totalBill - discount;

        System.out.println("\n--- Shopping Bill ---");
        for (Product p : products) {
            System.out.println(p.productName + " (" + p.quantity + " x " + p.price + ") = " + p.getTotalCost());
        }
        System.out.println("\nSubtotal: " + totalBill);
        if (discount > 0) {
            System.out.println("10% Discount applied: -" + discount);
        }
        System.out.println("Final Bill Amount: " + finalAmount);
    }
}

public class CaseStudy04_ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            products[i] = new Product(id, name, price, qty);
        }

        ShoppingCart cart = new ShoppingCart(products);
        cart.displayBill();

        sc.close();
    }
}
```

---

## Case Study 5: Library Management System

### Problem
A college library wants to maintain books.
Create a Book class containing:
- Book ID
- Book title
- Author
- Availability status
Implement methods:
- `issueBook()`
- `returnBook()`
- `displayBook()`
A book cannot be issued if it is already issued.

### Code (`CaseStudy05_LibraryManagement.java`)
```java
package case_studies;

class Book {
    int bookId;
    String bookTitle;
    String author;
    boolean isAvailable;

    public Book(int bookId, String bookTitle, String author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.isAvailable = true;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book \"" + bookTitle + "\" issued successfully.");
        } else {
            System.out.println("Sorry, \"" + bookTitle + "\" is already issued.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book \"" + bookTitle + "\" returned successfully.");
        } else {
            System.out.println("Book \"" + bookTitle + "\" was not issued.");
        }
    }

    public void displayBook() {
        System.out.println("ID: " + bookId + ", Title: " + bookTitle + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class CaseStudy05_LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "Herbert Schildt");
        Book b2 = new Book(102, "Data Structures", "Seymour Lipschutz");

        System.out.println("--- Library Books ---");
        b1.displayBook();
        b2.displayBook();

        System.out.println("\n--- Testing Issue and Return ---");
        b1.issueBook();
        b1.displayBook();

        b1.issueBook();

        b1.returnBook();
        b1.displayBook();
    }
}
```

---

## Case Study 6: Hospital Patient Management

### Problem
A hospital maintains patient information.
Create a Patient class with:
- Patient ID
- Name
- Age
- Temperature
The program should determine whether the patient has fever.
If temperature is greater than 100.4°F, display "Fever"; otherwise display "Normal".

### Code (`CaseStudy06_PatientManagement.java`)
```java
package case_studies;

import java.util.Scanner;

class Patient {
    int patientId;
    String name;
    int age;
    double temperature;

    public Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    public boolean hasFever() {
        return temperature > 100.4;
    }

    public String getStatus() {
        if (hasFever()) {
            return "Fever";
        }
        return "Normal";
    }

    public void displayPatientDetails() {
        System.out.println("\n--- Patient Details ---");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Condition: " + getStatus());
    }
}

public class CaseStudy06_PatientManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Body Temperature in °F: ");
        double temp = sc.nextDouble();

        Patient p = new Patient(id, name, age, temp);
        p.displayPatientDetails();

        sc.close();
    }
}
```

---

## Case Study 7: ATM Simulation

### Problem
Design an ATM program that:
1. Checks PIN.
2. Allows withdrawal.
3. Allows deposit.
4. Displays balance.
5. Allows maximum 3 incorrect PIN attempts.

### Code (`CaseStudy07_ATMSimulation.java`)
```java
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
```

---

## Case Study 8: Employee Inheritance

### Problem
A company has two types of employees:
- `Employee`
- `Manager`
Every employee has a name and salary. A manager additionally receives a bonus.
Use inheritance to implement the system.

### Code (`CaseStudy08_EmployeeInheritance.java`)
```java
package case_studies;

class EmployeeStaff {
    String name;
    double salary;

    public EmployeeStaff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getTotalSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Total Salary: " + getTotalSalary());
    }
}

class ManagerStaff extends EmployeeStaff {
    double bonus;

    public ManagerStaff(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getTotalSalary() {
        return salary + bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary (Salary + Bonus): " + getTotalSalary());
    }
}

public class CaseStudy08_EmployeeInheritance {
    public static void main(String[] args) {
        System.out.println("--- Employee Details ---");
        EmployeeStaff e = new EmployeeStaff("Rahul Sharma", 40000);
        e.displayDetails();

        System.out.println("\n--- Manager Details ---");
        ManagerStaff m = new ManagerStaff("Priya Singh", 75000, 20000);
        m.displayDetails();
    }
}
```

---

## Case Study 9: University Course Registration

### Problem
A university allows students to register for courses.
A student can register for a maximum of 5 courses.
Create a class Student with methods:
- `registerCourse()`
- `displayCourses()`
If the student tries to register for more than 5 courses, display an appropriate message.

### Code (`CaseStudy09_CourseRegistration.java`)
```java
package case_studies;

import java.util.Scanner;

class StudentRegistration {
    String studentName;
    String[] courses = new String[5];
    int courseCount = 0;

    public StudentRegistration(String studentName) {
        this.studentName = studentName;
    }

    public boolean registerCourse(String courseName) {
        if (courseCount < 5) {
            courses[courseCount] = courseName;
            courseCount++;
            System.out.println("Course \"" + courseName + "\" registered successfully (" + courseCount + "/5).");
            return true;
        } else {
            System.out.println("Cannot register for \"" + courseName + "\". Maximum limit of 5 courses reached!");
            return false;
        }
    }

    public void displayCourses() {
        System.out.println("\n--- Registered Courses for " + studentName + " ---");
        if (courseCount == 0) {
            System.out.println("No courses registered yet.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println((i + 1) + ". " + courses[i]);
            }
        }
    }
}

public class CaseStudy09_CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        StudentRegistration s = new StudentRegistration(name);

        s.registerCourse("Java Programming");
        s.registerCourse("Data Structures");
        s.registerCourse("Database Management Systems");
        s.registerCourse("Computer Networks");
        s.registerCourse("Operating Systems");

        s.registerCourse("Software Engineering");

        s.displayCourses();

        sc.close();
    }
}
```

---

## Case Study 10: E-Commerce Payment System — Polymorphism

### Problem
An e-commerce website supports different payment methods:
- Credit Card
- UPI
- Net Banking
Create a common Payment interface with a `pay()` method.
Implement the interface using different classes.

### Code (`CaseStudy10_PaymentSystem.java`)
```java
package case_studies;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card (Card No: " + cardNumber + ")");
    }
}

class UPIPayment implements Payment {
    String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI (UPI ID: " + upiId + ")");
    }
}

class NetBankingPayment implements Payment {
    String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Net Banking (" + bankName + ")");
    }
}

public class CaseStudy10_PaymentSystem {

    public static void processPayment(Payment paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }

    public static void main(String[] args) {
        System.out.println("--- Payment Methods Demo ---");

        Payment p1 = new CreditCardPayment("1234-5678-9876-5432");
        Payment p2 = new UPIPayment("user@oksbi");
        Payment p3 = new NetBankingPayment("HDFC Bank");

        processPayment(p1, 2499.00);
        processPayment(p2, 550.00);
        processPayment(p3, 12000.00);
    }
}
```

---

## How to Compile & Run

### Compile all files:
```bash
javac -d bin src/case_studies/*.java
```

### Run Master Menu:
```bash
java -cp bin case_studies.CaseStudiesRunner
```
