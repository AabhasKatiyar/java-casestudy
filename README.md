# Java Semester Lab Programs and Case Studies

This repository contains basic Java lab programs and solutions to the 10 semester case studies.

## Case Studies List

1. **Case Study 1: Student Result Management System** (`CaseStudy01_StudentResult.java`)
   - Accepts student name and 5 subject marks.
   - Calculates total and percentage.
   - Assigns grades (A+, A, B, C, D, F) and checks Pass/Fail status.

2. **Case Study 2: Bank Account** (`CaseStudy02_BankAccount.java`)
   - `BankAccount` class with `accountNumber`, `accountHolderName`, and `balance`.
   - Methods: `deposit()`, `withdraw()`, `displayBalance()`.
   - Prevents withdrawal if requested amount is greater than balance.

3. **Case Study 3: Employee Salary Management** (`CaseStudy03_EmployeeSalary.java`)
   - `Employee` class with `employeeId`, `name`, `basicSalary`.
   - Calculates `HRA` (20%), `DA` (10%), and `Gross Salary` (Basic + HRA + DA).

4. **Case Study 4: Online Shopping Cart** (`CaseStudy04_ShoppingCart.java`)
   - `Product` class with `productId`, `productName`, `price`, `quantity`.
   - Computes total cost and gives a 10% discount if total exceeds Rs.5000.

5. **Case Study 5: Library Management System** (`CaseStudy05_LibraryManagement.java`)
   - `Book` class with `bookId`, `bookTitle`, `author`, `isAvailable`.
   - Methods: `issueBook()`, `returnBook()`, `displayBook()`.
   - Prevents issuing already issued books.

6. **Case Study 6: Hospital Patient Management** (`CaseStudy06_PatientManagement.java`)
   - `Patient` class with `patientId`, `name`, `age`, `temperature`.
   - Checks if temperature > 100.4°F to indicate Fever vs Normal.

7. **Case Study 7: ATM Simulation** (`CaseStudy07_ATMSimulation.java`)
   - PIN verification with max 3 attempts.
   - Allows balance check, deposit, and withdraw.

8. **Case Study 8: Employee Inheritance** (`CaseStudy08_EmployeeInheritance.java`)
   - `Staff` base class and `Manager` derived class.
   - Manager receives bonus in addition to salary.

9. **Case Study 9: University Course Registration** (`CaseStudy09_CourseRegistration.java`)
   - Allows a student to register for a maximum of 5 courses.

10. **Case Study 10: E-Commerce Payment System** (`CaseStudy10_PaymentSystem.java`)
    - `Payment` interface with `pay()` method.
    - Implemented by `CreditCardPayment`, `UPIPayment`, and `NetBankingPayment`.

---

## How to Compile and Run

### Compile All Programs:
```bash
javac -d bin src/case_studies/*.java src/lab01_fundamentals/*.java src/lab02_oop_core/*.java src/lab03_interfaces_abstract/*.java src/lab04_exception_handling/*.java src/capstone_student_system/*.java
```

### Run Master Case Study Menu:
```bash
java -cp bin case_studies.CaseStudiesRunner
```

### Run Any Case Study Directly:
```bash
java -cp bin case_studies.CaseStudy01_StudentResult
java -cp bin case_studies.CaseStudy02_BankAccount
java -cp bin case_studies.CaseStudy03_EmployeeSalary
java -cp bin case_studies.CaseStudy04_ShoppingCart
java -cp bin case_studies.CaseStudy05_LibraryManagement
java -cp bin case_studies.CaseStudy06_PatientManagement
java -cp bin case_studies.CaseStudy07_ATMSimulation
java -cp bin case_studies.CaseStudy08_EmployeeInheritance
java -cp bin case_studies.CaseStudy09_CourseRegistration
java -cp bin case_studies.CaseStudy10_PaymentSystem
```
