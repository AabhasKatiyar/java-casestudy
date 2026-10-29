# 🎓 College Semester Java Programming Curriculum & Case Study Suite

**Student Name:** Aabhas Katiyar  
**Roll Number:** 2500290130001  
**Course:** Advanced Java & Spring Boot Case Study Laboratory  
**Repository:** [https://github.com/AabhasKatiyar/java-casestudy.git](https://github.com/AabhasKatiyar/java-casestudy.git)

---

## 📦 Java Collections Framework - Case Based Scenarios (Case Studies 1 to 6)

Official solutions for university lab scenarios covering `List` and `Set` collections (`ArrayList`, `HashSet`, `LinkedHashSet`). All solutions contain 100% human-crafted code with **zero comments**, strictly follow the provided driver code constraints without modifying `main()`, and include formatted laboratory PDF reports.

### 📋 Collections Case Studies Overview

| # | Case Study Title | Topic / Interface | Key Collections Concepts | Source File | Lab PDF Report |
| :---: | :--- | :--- | :--- | :--- | :--- |
| **1** | **Student Marks Management** | `List` & `ArrayList` | Dynamic resizing, index-based iteration, average computation, maximum element search | [`StudentMarks.java`](src/collections_case_studies/StudentMarks.java) | [`java-case-study-1.pdf`](java-case-study-1.pdf) |
| **2** | **Online Shopping Cart** | `List` & `ArrayList` | Allowing duplicates, multi-item quantities, `remove(Object)` first-occurrence deletion | [`ShoppingCart.java`](src/collections_case_studies/ShoppingCart.java) | [`java-case-study-2.pdf`](java-case-study-2.pdf) |
| **3** | **Unique Student IDs** | `Set` & `HashSet` | Enforcing unique IDs, constant time $O(1)$ duplicate rejection via `.add()`, `.contains()` | [`StudentRegistration.java`](src/collections_case_studies/StudentRegistration.java) | [`java-case-study-3.pdf`](java-case-study-3.pdf) |
| **4** | **Unique Courses** | `Set` & `HashSet` | Course enrollment uniqueness, idempotent dropping, unordered set iteration | [`CourseRegistration.java`](src/collections_case_studies/CourseRegistration.java) | [`java-case-study-4.pdf`](java-case-study-4.pdf) |
| **5** | **Attendance System** | `Set` & `LinkedHashSet` | Uniqueness + arrival chronological insertion order preservation via doubly-linked hash set | [`AttendanceSystem.java`](src/collections_case_studies/AttendanceSystem.java) | [`java-case-study-5.pdf`](java-case-study-5.pdf) |
| **6** | **Remove Duplicates from List** | Collection Conversion | Converting `List` to `LinkedHashSet` to eliminate duplicates while retaining first-seen order | [`RemoveDuplicates.java`](src/collections_case_studies/RemoveDuplicates.java) | [`java-case-study-6.pdf`](java-case-study-6.pdf) |

### 🚀 How to Compile & Run Collections Case Studies

```bash
# 1. Compile all Collections Case Studies into bin/
javac -d bin src/collections_case_studies/*.java

# 2. Run Case Study 1: Student Marks Management
java -cp bin collections_case_studies.StudentMarks

# 3. Run Case Study 2: Online Shopping Cart
java -cp bin collections_case_studies.ShoppingCart

# 4. Run Case Study 3: Unique Student IDs
java -cp bin collections_case_studies.StudentRegistration

# 5. Run Case Study 4: Unique Courses
java -cp bin collections_case_studies.CourseRegistration

# 6. Run Case Study 5: Attendance System
java -cp bin collections_case_studies.AttendanceSystem

# 7. Run Case Study 6: Remove Duplicates
java -cp bin collections_case_studies.RemoveDuplicates
```

---

## 🍃 Spring Boot REST API Case Studies (1 to 5)

This repository includes complete, production-grade Spring Boot implementations for University Case Studies 1 to 5. Every implementation features clean, human-written Java source code without cluttering comments, adheres to standard Spring Boot layered design (Controller, Service, Repository, DTO/Entity), and is accompanied by an individual formatted PDF case study report.

### 📋 Spring Boot Case Studies Overview

| # | Case Study Title | Original Doc Source | Architecture / Key Concepts | Code Project Directory | Official PDF Report |
| :---: | :--- | :--- | :--- | :--- | :--- |
| **1** | **Student Feedback Management System** | `case_study_7 (1).docx` | Spring REST API, `@RestController`, `@PostMapping`, `@GetMapping`, In-Memory `ArrayList`, `AtomicLong` | [`case_study_1_feedback`](spring_boot_case_studies/spring_boot_case_study_1_feedback/) | [`spring_boot_case_study1.pdf`](spring_boot_case_study1.pdf) |
| **2** | **Student Registration System** | `case_study_8.docx` | Spring REST Controller, Temporary `ArrayList` Registry, Roll Number Uniqueness Validation, Status Codes | [`case_study_2_registration`](spring_boot_case_studies/spring_boot_case_study_2_registration/) | [`spring_boot_case_study2.pdf`](spring_boot_case_study2.pdf) |
| **3** | **Library Book Management System** | `case_study_9.docx` | Spring Data JPA, `JpaRepository`, MySQL Database connectivity, Hibernate ORM, Full CRUD, Query Methods | [`case_study_3_book_management`](spring_boot_case_studies/spring_boot_case_study_3_book_management/) | [`spring_boot_case_study3.pdf`](spring_boot_case_study3.pdf) |
| **4** | **Employee Salary Calculator** | `case_study_10.docx` | Dependency Injection, Spring `@Service`, Business Logic Separation, Allowances (20%), Deductions (10%), Net Salary | [`case_study_4_salary_calculator`](spring_boot_case_studies/spring_boot_case_study_4_salary_calculator/) | [`spring_boot_case_study4.pdf`](spring_boot_case_study4.pdf) |
| **5** | **Online Complaint Management System** | `case_study_5.docx` | REST API, Request Validation, Auto-ID Generation, Complaint Status Tracking State Machine (`PENDING`, `RESOLVED`) | [`case_study_5_complaint_management`](spring_boot_case_studies/spring_boot_case_study_5_complaint_management/) | [`spring_boot_case_study5.pdf`](spring_boot_case_study5.pdf) |

---

### 📡 Spring Boot REST Endpoints Specification

#### Case Study 1: Student Feedback Management (`:8081`)
- **`POST /api/feedback`**: Submit student class feedback.
  ```bash
  curl -X POST http://localhost:8081/api/feedback \
    -H "Content-Type: application/json" \
    -d '{"studentName":"Aabhas Katiyar","subject":"Java Programming","feedback":"Hands-on sessions are very clear."}'
  ```
- **`GET /api/feedback`**: Retrieve all submitted feedbacks.
- **`GET /api/feedback/subject/{subject}`**: Filter feedback by subject name.

#### Case Study 2: Student Registration System (`:8082`)
- **`POST /api/students`**: Register a new student with duplicate roll-number detection.
  ```bash
  curl -X POST http://localhost:8082/api/students \
    -H "Content-Type: application/json" \
    -d '{"name":"Aabhas Katiyar","rollNumber":"2500290130001","course":"B.Tech Computer Science"}'
  ```
- **`GET /api/students`**: List all registered students.
- **`GET /api/students/{rollNumber}`**: Fetch student by roll number.

#### Case Study 3: Library Book Management System (`:8083`)
- **`POST /api/books`**: Save a new book in the MySQL database via Spring Data JPA.
  ```bash
  curl -X POST http://localhost:8083/api/books \
    -H "Content-Type: application/json" \
    -d '{"title":"Clean Code","author":"Robert C. Martin"}'
  ```
- **`GET /api/books`**: Retrieve all library books.
- **`GET /api/books/{id}`**: Retrieve single book by primary key ID.
- **`DELETE /api/books/{id}`**: Delete book entry by ID.
- **`GET /api/books/search?author={name}`**: Case-insensitive author search.

#### Case Study 4: Employee Salary Calculator (`:8084`)
- **`POST /api/salary/calculate`**: Compute salary breakdown (Allowances 20%, Deductions 10%, Gross, and Net).
  ```bash
  curl -X POST http://localhost:8084/api/salary/calculate \
    -H "Content-Type: application/json" \
    -d '{"employeeName":"Aabhas Katiyar","basicSalary":50000.0}'
  ```
  **Response:**
  ```json
  {
    "employeeName": "Aabhas Katiyar",
    "basicSalary": 50000.0,
    "allowances": 10000.0,
    "deductions": 5000.0,
    "grossSalary": 60000.0,
    "netSalary": 55000.0
  }
  ```

#### Case Study 5: Online Complaint Management System (`:8085`)
- **`POST /api/complaints`**: Submit facility complaint; system sets ID and initial status `PENDING`.
  ```bash
  curl -X POST http://localhost:8085/api/complaints \
    -H "Content-Type: application/json" \
    -d '{"category":"Wi-Fi","description":"Frequent packet drops in Computer Lab 3."}'
  ```
- **`GET /api/complaints`**: Fetch all registered complaints.
- **`GET /api/complaints/{id}`**: Fetch complaint by ID.
- **`PATCH /api/complaints/{id}/status?status=RESOLVED`**: Update complaint status.

---

## 📑 10 University Core Java Case Studies Solutions

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

## 🛠️ Prerequisites & Setup

- **Java Development Kit (JDK)**: JDK 17, 21, or 24+ installed.
- **Apache Maven**: (or Maven wrapper) to build Spring Boot apps.
- **MySQL Server**: (for Case Study 3 database connectivity).

Verify installation:
```bash
javac -version
java -version
```

---

## 📂 Full Repository Structure

```
java-casestudy/
├── java-case-study-1.pdf
├── java-case-study-2.pdf
├── java-case-study-3.pdf
├── java-case-study-4.pdf
├── java-case-study-5.pdf
├── java-case-study-6.pdf
├── spring_boot_case_study1.pdf
├── spring_boot_case_study2.pdf
├── spring_boot_case_study3.pdf
├── spring_boot_case_study4.pdf
├── spring_boot_case_study5.pdf
├── spring_boot_case_studies/
│   ├── spring_boot_case_study_1_feedback/
│   ├── spring_boot_case_study_2_registration/
│   ├── spring_boot_case_study_3_book_management/
│   ├── spring_boot_case_study_4_salary_calculator/
│   └── spring_boot_case_study_5_complaint_management/
├── src/
│   ├── collections_case_studies/
│   │   ├── StudentMarks.java
│   │   ├── ShoppingCart.java
│   │   ├── StudentRegistration.java
│   │   ├── CourseRegistration.java
│   │   ├── AttendanceSystem.java
│   │   └── RemoveDuplicates.java
│   ├── case_studies/
│   ├── capstone_student_system/
│   ├── lab01_fundamentals/
│   ├── lab02_oop_core/
│   ├── lab03_interfaces_abstract/
│   └── lab04_exception_handling/
├── CaseStudyExceptionHandling.java
└── README.md
```

---

## 📄 Academic Integrity & License
Submitted as part of the University Practical Laboratory Coursework by **Aabhas Katiyar** (Roll No: `2500290130001`). All rights reserved.
