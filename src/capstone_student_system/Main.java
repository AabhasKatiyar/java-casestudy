package capstone_student_system;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Capstone Project: Main Console Entry Point
 * Provides an interactive terminal menu for managing university student records.
 */
public class Main {
    private static final StudentManager manager = new StudentManager();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Seed default records for immediate demonstration
        manager.seedInitialDemoData();

        System.out.println("==========================================================");
        System.out.println("   UNIVERSITY SEMESTER PROJECT: STUDENT MANAGEMENT SYSTEM ");
        System.out.println("==========================================================");

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Select an option (1-7): ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handleListStudents();
                    break;
                case "2":
                    handleAddStudent();
                    break;
                case "3":
                    handleAddCourseScores();
                    break;
                case "4":
                    handleSearch();
                    break;
                case "5":
                    handleRemoveStudent();
                    break;
                case "6":
                    handleClassStatistics();
                    break;
                case "7":
                    System.out.println("\nThank you for using the Student Management System. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("----------------------------------------------------------");
        System.out.println(" 1. View All Student Records");
        System.out.println(" 2. Add New Student Record");
        System.out.println(" 3. Add / Update Course Marks for Student");
        System.out.println(" 4. Search Student by Name or Roll Number");
        System.out.println(" 5. Remove Student Record");
        System.out.println(" 6. View Department Class Summary & Average GPA");
        System.out.println(" 7. Exit Application");
        System.out.println("----------------------------------------------------------");
    }

    private static void handleListStudents() {
        List<StudentRecord> students = manager.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No student records available in the database.");
            return;
        }
        System.out.println("\n--- All Student Records (" + students.size() + " total) ---");
        for (StudentRecord student : students) {
            System.out.println(student);
        }
    }

    private static void handleAddStudent() {
        System.out.println("\n--- Add New Student ---");
        System.out.print("Enter Roll Number / ID (e.g. CS-2024-004): ");
        String roll = scanner.nextLine().trim();
        if (roll.isEmpty()) {
            System.out.println("Roll number cannot be empty.");
            return;
        }
        if (manager.findStudent(roll) != null) {
            System.out.println("Error: A student with Roll Number " + roll + " already exists.");
            return;
        }

        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Email Address: ");
        String email = scanner.nextLine().trim();
        System.out.print("Enter Department / Major: ");
        String dept = scanner.nextLine().trim();

        StudentRecord student = new StudentRecord(roll, name, email, dept);
        if (manager.addStudent(student)) {
            System.out.println("Student record added successfully!");
        } else {
            System.out.println("Failed to add student.");
        }
    }

    private static void handleAddCourseScores() {
        System.out.println("\n--- Add Course Marks ---");
        System.out.print("Enter Student Roll Number: ");
        String roll = scanner.nextLine().trim();
        StudentRecord student = manager.findStudent(roll);

        if (student == null) {
            System.out.println("Student with Roll Number " + roll + " was not found.");
            return;
        }

        System.out.print("Enter Course Name (e.g. Java Programming): ");
        String course = scanner.nextLine().trim();
        System.out.print("Enter Score (0 - 100): ");
        try {
            double score = Double.parseDouble(scanner.nextLine().trim());
            student.addCourseScore(course, score);
            System.out.printf("Marks added: %s -> %.2f%n", course, score);
            System.out.printf("Updated Average: %.2f%% | Updated GPA: %.2f%n",
                    student.calculateAverageScore(), student.calculateGPA());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for score.");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }

    private static void handleSearch() {
        System.out.println("\n--- Search Student ---");
        System.out.print("Search by: (1) Roll Number or (2) Name? ");
        String sub = scanner.nextLine().trim();

        if ("1".equals(sub)) {
            System.out.print("Enter exact Roll Number: ");
            String roll = scanner.nextLine().trim();
            StudentRecord student = manager.findStudent(roll);
            if (student != null) {
                displayDetailedStudentCard(student);
            } else {
                System.out.println("No matching student found.");
            }
        } else if ("2".equals(sub)) {
            System.out.print("Enter name query: ");
            String q = scanner.nextLine().trim();
            List<StudentRecord> results = manager.searchByName(q);
            if (results.isEmpty()) {
                System.out.println("No students found matching: " + q);
            } else {
                System.out.println("Found " + results.size() + " match(es):");
                for (StudentRecord s : results) {
                    displayDetailedStudentCard(s);
                }
            }
        } else {
            System.out.println("Invalid search option.");
        }
    }

    private static void displayDetailedStudentCard(StudentRecord s) {
        System.out.println("\n┌──────────────────────────────────────────────┐");
        System.out.printf("│ Roll: %-38s │%n", s.getRollNumber());
        System.out.printf("│ Name: %-38s │%n", s.getName());
        System.out.printf("│ Email: %-37s │%n", s.getEmail());
        System.out.printf("│ Dept: %-38s │%n", s.getDepartment());
        System.out.println("├──────────────────────────────────────────────┤");
        System.out.println("│ Course Scores:                               │");
        if (s.getCourseScores().isEmpty()) {
            System.out.println("│   (No course scores entered yet)             │");
        } else {
            for (Map.Entry<String, Double> entry : s.getCourseScores().entrySet()) {
                System.out.printf("│   • %-28s: %6.2f │%n", entry.getKey(), entry.getValue());
            }
        }
        System.out.println("├──────────────────────────────────────────────┤");
        System.out.printf("│ Overall Average: %-27.2f%% │%n", s.calculateAverageScore());
        System.out.printf("│ Grade Point Avg: %-27.2f  │%n", s.calculateGPA());
        System.out.printf("│ Academic Status: %-27s │%n", s.getPerformanceStatus());
        System.out.println("└──────────────────────────────────────────────┘");
    }

    private static void handleRemoveStudent() {
        System.out.println("\n--- Remove Student Record ---");
        System.out.print("Enter Roll Number to delete: ");
        String roll = scanner.nextLine().trim();
        if (manager.removeStudent(roll)) {
            System.out.println("Student record [" + roll + "] successfully deleted.");
        } else {
            System.out.println("Error: Student record not found.");
        }
    }

    private static void handleClassStatistics() {
        System.out.println("\n--- Class Performance Statistics ---");
        System.out.println("Total Enrolled Students: " + manager.getTotalCount());
        System.out.printf("Average Cohort GPA:     %.2f / 4.00%n", manager.calculateClassAverageGPA());
    }
}
