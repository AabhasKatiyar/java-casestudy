package case_studies;

import java.util.Scanner;

/**
 * Case Study 1: Student Result Management System
 * Problem:
 * A college wants to develop a Java program to calculate the result of a student.
 * The student has marks in five subjects.
 * Requirements:
 * 1. Accept student name and marks.
 * 2. Calculate total and percentage.
 * 3. Display grade according to:
 *    - Percentage >= 90 -> A+
 *    - Percentage >= 80 -> A
 *    - Percentage >= 70 -> B
 *    - Percentage >= 60 -> C
 *    - Percentage >= 50 -> D
 *    - Below 50 -> F
 * 4. Display whether the student has passed or failed (Pass if percentage >= 50).
 */
public class CaseStudy01_StudentResult {

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "F";
    }

    public static boolean isPassed(double percentage) {
        return percentage >= 50.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("  CASE STUDY 1: STUDENT RESULT MANAGEMENT SYSTEM  ");
        System.out.println("==================================================");

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine().trim();

        int numSubjects = 5;
        double[] marks = new double[numSubjects];
        double total = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input! Please enter numeric marks for Subject " + (i + 1) + ": ");
                scanner.next();
            }
            marks[i] = scanner.nextDouble();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Marks must be between 0 and 100. Re-enter Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }
            total += marks[i];
        }

        double percentage = total / numSubjects;
        String grade = calculateGrade(percentage);
        boolean passed = isPassed(percentage);

        System.out.println("\n----------------- STUDENT RESULT -----------------");
        System.out.printf("Student Name: %s%n", name);
        System.out.printf("Total Marks:  %.2f / %.2f%n", total, numSubjects * 100.0);
        System.out.printf("Percentage:   %.2f%%%n", percentage);
        System.out.printf("Grade:        %s%n", grade);
        System.out.printf("Final Result: %s%n", (passed ? "PASSED" : "FAILED"));
        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}
