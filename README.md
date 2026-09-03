# 🎓 College Semester Java Programming Curriculum & Case Study Suite

A comprehensive, modular repository containing standard university / college semester Java coursework, lab exercises, Object-Oriented Programming (OOP) demonstrations, and the complete **10 University Case Study Solutions** plus an interactive **Student Management System** capstone project.

---

## 📑 10 University Case Studies Solutions

| # | Case Study Title | Topics / Concepts | Source File |
| :---: | :--- | :--- | :--- |
| **1** | **Student Result Management** | Scanner input, 5 subject marks aggregation, grade bands ($A+$ to $F$), pass/fail verification | [`CaseStudy01_StudentResult.java`](src/case_studies/CaseStudy01_StudentResult.java) |
| **2** | **Bank Account Management** | Encapsulation, balance inquiry, deposit, withdrawal with insufficient fund guards | [`CaseStudy02_BankAccount.java`](src/case_studies/CaseStudy02_BankAccount.java) |
| **3** | **Employee Salary Management** | Basic salary, HRA (20%), DA (10%), Gross salary computation, formatted pay slips | [`CaseStudy03_EmployeeSalary.java`](src/case_studies/CaseStudy03_EmployeeSalary.java) |
| **4** | **Online Shopping Cart** | `Product` class, price $\times$ quantity subtotal, 10% discount on orders exceeding ₹5,000 | [`CaseStudy04_ShoppingCart.java`](src/case_studies/CaseStudy04_ShoppingCart.java) |
| **5** | **Library Management System** | Book inventory, `issueBook()`, `returnBook()`, duplicate issuance prevention | [`CaseStudy05_LibraryManagement.java`](src/case_studies/CaseStudy05_LibraryManagement.java) |
| **6** | **Hospital Patient Management** | Patient demographics, body temperature diagnostic ($>100.4^\circ\text{F} \to \text{Fever}$) | [`CaseStudy06_PatientManagement.java`](src/case_studies/CaseStudy06_PatientManagement.java) |
| **7** | **ATM Simulation** | PIN authentication, maximum 3 failed attempts lockout, balance check, deposit, withdraw | [`CaseStudy07_ATMSimulation.java`](src/case_studies/CaseStudy07_ATMSimulation.java) |
| **8** | **Employee & Manager Inheritance**| Inheritance (`extends`, `super`), base salary + managerial bonus override | [`CaseStudy08_EmployeeInheritance.java`](src/case_studies/CaseStudy08_EmployeeInheritance.java) |
| **9** | **University Course Registration**| Course list management, maximum 5 courses registration limit enforcement | [`CaseStudy09_CourseRegistration.java`](src/case_studies/CaseStudy09_CourseRegistration.java) |
| **10**| **E-Commerce Payment System** | Polymorphic `Payment` interface, `CreditCard`, `UPI`, `NetBanking` implementations | [`CaseStudy10_PaymentSystem.java`](src/case_studies/CaseStudy10_PaymentSystem.java) |

---

## 📚 Curriculum Lab Modules

| Module | Package | Concepts Covered | Key Classes |
| :--- | :--- | :--- | :--- |
| **Lab 01: Core Fundamentals** | `lab01_fundamentals` | Standard I/O (`Scanner`), conditionals, switch-case, loops, recursion, 1D arrays | [`BasicCalculator.java`](src/lab01_fundamentals/BasicCalculator.java)<br>[`NumberOperations.java`](src/lab01_fundamentals/NumberOperations.java)<br>[`GradeCalculator.java`](src/lab01_fundamentals/GradeCalculator.java) |
| **Lab 02: 4 Pillars of OOP** | `lab02_oop_core` | Encapsulation, Getters/Setters, Inheritance (`extends`, `super`), Polymorphism, Method Overriding | [`Person.java`](src/lab02_oop_core/Person.java)<br>[`Student.java`](src/lab02_oop_core/Student.java)<br>[`Professor.java`](src/lab02_oop_core/Professor.java)<br>[`OOPDemo.java`](src/lab02_oop_core/OOPDemo.java) |
| **Lab 03: Interfaces & Abstraction** | `lab03_interfaces_abstract` | Abstract classes, interface contracts, default methods, dynamic dispatch | [`Payable.java`](src/lab03_interfaces_abstract/Payable.java)<br>[`Employee.java`](src/lab03_interfaces_abstract/Employee.java)<br>[`TeachingAssistant.java`](src/lab03_interfaces_abstract/TeachingAssistant.java)<br>[`InterfaceDemo.java`](src/lab03_interfaces_abstract/InterfaceDemo.java) |
| **Lab 04: Exception Handling** | `lab04_exception_handling` | `try-catch-finally`, checked vs unchecked exceptions, `throw`, `throws`, custom exceptions | [`InvalidScoreException.java`](src/lab04_exception_handling/InvalidScoreException.java)<br>[`ExceptionLab.java`](src/lab04_exception_handling/ExceptionLab.java) |
| **Capstone: Student System** | `capstone_student_system` | Full interactive CLI application, Java Collections (`HashMap`, `ArrayList`, `Comparator`) | [`StudentRecord.java`](src/capstone_student_system/StudentRecord.java)<br>[`StudentManager.java`](src/capstone_student_system/StudentManager.java)<br>[`Main.java`](src/capstone_student_system/Main.java) |

---

## 🛠️ Prerequisites

- **Java Development Kit (JDK)**: JDK 17, 21, or 24+ installed.
- Verify installation:
  ```bash
  javac -version
  java -version
  ```

---

## 🚀 How to Compile & Run

### 1. Compile Everything into `bin/`
From the project root:
```bash
javac -d bin src/case_studies/*.java src/lab01_fundamentals/*.java src/lab02_oop_core/*.java src/lab03_interfaces_abstract/*.java src/lab04_exception_handling/*.java src/capstone_student_system/*.java
```

### 2. Run the Master Case Studies Menu
```bash
java -cp bin case_studies.CaseStudiesRunner
```

### 3. Run Individual Case Studies Directly
```bash
# Case Study 1: Student Result System
java -cp bin case_studies.CaseStudy01_StudentResult

# Case Study 2: Bank Account Management
java -cp bin case_studies.CaseStudy02_BankAccount

# Case Study 3: Employee Salary Management
java -cp bin case_studies.CaseStudy03_EmployeeSalary

# Case Study 4: Online Shopping Cart
java -cp bin case_studies.CaseStudy04_ShoppingCart

# Case Study 5: Library Management System
java -cp bin case_studies.CaseStudy05_LibraryManagement

# Case Study 6: Hospital Patient Management
java -cp bin case_studies.CaseStudy06_PatientManagement

# Case Study 7: ATM Simulator
java -cp bin case_studies.CaseStudy07_ATMSimulation

# Case Study 8: Employee & Manager Inheritance
java -cp bin case_studies.CaseStudy08_EmployeeInheritance

# Case Study 9: University Course Registration
java -cp bin case_studies.CaseStudy09_CourseRegistration

# Case Study 10: E-Commerce Payment (Polymorphism)
java -cp bin case_studies.CaseStudy10_PaymentSystem
```

---

## 📂 Repository Directory Tree

```
college-java-semester/
├── .gitignore
├── README.md
└── src/
    ├── case_studies/
    │   ├── CaseStudiesRunner.java
    │   ├── CaseStudy01_StudentResult.java
    │   ├── CaseStudy02_BankAccount.java
    │   ├── CaseStudy03_EmployeeSalary.java
    │   ├── CaseStudy04_ShoppingCart.java
    │   ├── CaseStudy05_LibraryManagement.java
    │   ├── CaseStudy06_PatientManagement.java
    │   ├── CaseStudy07_ATMSimulation.java
    │   ├── CaseStudy08_EmployeeInheritance.java
    │   ├── CaseStudy09_CourseRegistration.java
    │   └── CaseStudy10_PaymentSystem.java
    ├── capstone_student_system/
    │   ├── Main.java
    │   ├── StudentManager.java
    │   └── StudentRecord.java
    ├── lab01_fundamentals/
    ├── lab02_oop_core/
    ├── lab03_interfaces_abstract/
    └── lab04_exception_handling/
```

---

## 📄 License
Academic and learning repository. Open for study, modification, and semester lab submissions.
