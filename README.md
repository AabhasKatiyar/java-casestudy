# 🎓 College Semester Java Programming Curriculum & Capstone Project

A comprehensive, modular repository containing standard university / college semester Java coursework, lab exercises, Object-Oriented Programming (OOP) demonstrations, and an interactive **Student Management System** capstone project.

---

## 📚 Curriculum Structure & Lab Breakdown

| Module | Package | Concepts Covered | Key Classes |
| :--- | :--- | :--- | :--- |
| **Lab 01: Core Fundamentals** | `lab01_fundamentals` | Standard I/O (`Scanner`), conditionals, switch-case, loops, recursion, 1D arrays, math logic. | [`BasicCalculator.java`](src/lab01_fundamentals/BasicCalculator.java)<br>[`NumberOperations.java`](src/lab01_fundamentals/NumberOperations.java)<br>[`GradeCalculator.java`](src/lab01_fundamentals/GradeCalculator.java) |
| **Lab 02: 4 Pillars of OOP** | `lab02_oop_core` | Encapsulation, Getters/Setters, Inheritance (`extends`, `super`), Polymorphism, Method Overriding, Constructor Overloading. | [`Person.java`](src/lab02_oop_core/Person.java)<br>[`Student.java`](src/lab02_oop_core/Student.java)<br>[`Professor.java`](src/lab02_oop_core/Professor.java)<br>[`OOPDemo.java`](src/lab02_oop_core/OOPDemo.java) |
| **Lab 03: Interfaces & Abstraction** | `lab03_interfaces_abstract` | Abstract classes, abstract methods, interface contracts, default methods, dynamic dispatch. | [`Payable.java`](src/lab03_interfaces_abstract/Payable.java)<br>[`Employee.java`](src/lab03_interfaces_abstract/Employee.java)<br>[`TeachingAssistant.java`](src/lab03_interfaces_abstract/TeachingAssistant.java)<br>[`InterfaceDemo.java`](src/lab03_interfaces_abstract/InterfaceDemo.java) |
| **Lab 04: Exception Handling** | `lab04_exception_handling` | `try-catch-finally`, checked vs unchecked exceptions, `throw`, `throws`, custom domain exceptions. | [`InvalidScoreException.java`](src/lab04_exception_handling/InvalidScoreException.java)<br>[`ExceptionLab.java`](src/lab04_exception_handling/ExceptionLab.java) |
| **Capstone Project: Student System** | `capstone_student_system` | Full interactive CLI application, Java Collections (`HashMap`, `ArrayList`, `Comparator`), CRUD operations, report formatting. | [`StudentRecord.java`](src/capstone_student_system/StudentRecord.java)<br>[`StudentManager.java`](src/capstone_student_system/StudentManager.java)<br>[`Main.java`](src/capstone_student_system/Main.java) |

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

### 1. Compile All Modules into `bin/` Directory
From the root of this project directory:
```bash
# Windows PowerShell / CMD / Bash
javac -d bin src/lab01_fundamentals/*.java src/lab02_oop_core/*.java src/lab03_interfaces_abstract/*.java src/lab04_exception_handling/*.java src/capstone_student_system/*.java
```

### 2. Run Individual Labs

#### Lab 01 - Core Fundamentals
```bash
# Basic Calculator
java -cp bin lab01_fundamentals.BasicCalculator

# Number Operations (Prime, Fibonacci, Factorial)
java -cp bin lab01_fundamentals.NumberOperations

# Grade Evaluator
java -cp bin lab01_fundamentals.GradeCalculator
```

#### Lab 02 - Object Oriented Programming Demo
```bash
java -cp bin lab02_oop_core.OOPDemo
```

#### Lab 03 - Interfaces & Abstraction
```bash
java -cp bin lab03_interfaces_abstract.InterfaceDemo
```

#### Lab 04 - Exception Handling
```bash
java -cp bin lab04_exception_handling.ExceptionLab
```

#### Capstone Project - Interactive Student Management System
```bash
java -cp bin capstone_student_system.Main
```

---

## 🖥️ Capstone Project Features

The console application provides a full menu-driven interface:
```text
==========================================================
   UNIVERSITY SEMESTER PROJECT: STUDENT MANAGEMENT SYSTEM 
==========================================================
----------------------------------------------------------
 1. View All Student Records
 2. Add New Student Record
 3. Add / Update Course Marks for Student
 4. Search Student by Name or Roll Number
 5. Remove Student Record
 6. View Department Class Summary & Average GPA
 7. Exit Application
----------------------------------------------------------
```

---

## 📂 Repository Tree

```
college-java-semester/
├── .gitignore
├── README.md
└── src/
    ├── capstone_student_system/
    │   ├── Main.java
    │   ├── StudentManager.java
    │   └── StudentRecord.java
    ├── lab01_fundamentals/
    │   ├── BasicCalculator.java
    │   ├── GradeCalculator.java
    │   └── NumberOperations.java
    ├── lab02_oop_core/
    │   ├── OOPDemo.java
    │   ├── Person.java
    │   ├── Professor.java
    │   └── Student.java
    ├── lab03_interfaces_abstract/
    │   ├── Employee.java
    │   ├── InterfaceDemo.java
    │   ├── Payable.java
    │   └── TeachingAssistant.java
    └── lab04_exception_handling/
        ├── ExceptionLab.java
        └── InvalidScoreException.java
```

---

## 📄 License
This repository is prepared for academic and learning purposes. Open for study, modification, and semester project submissions.
