package lab01_fundamentals;

import java.util.Scanner;

/**
 * Lab 01 - Problem 3: Grade Calculator & Array Processing
 * Demonstrates: 1D Arrays, looping, calculating sum/averages, and nested if-else condition grading.
 */
public class GradeCalculator {

    public static String determineLetterGrade(double percentage) {
        if (percentage >= 90.0) return "A+ (Outstanding)";
        if (percentage >= 80.0) return "A  (Excellent)";
        if (percentage >= 70.0) return "B  (Very Good)";
        if (percentage >= 60.0) return "C  (Good)";
        if (percentage >= 50.0) return "D  (Pass)";
        return "F  (Fail)";
    }

    public static double calculateGPA(double percentage) {
        if (percentage >= 90.0) return 4.0;
        if (percentage >= 80.0) return 3.5;
        if (percentage >= 70.0) return 3.0;
        if (percentage >= 60.0) return 2.5;
        if (percentage >= 50.0) return 2.0;
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("    SEMESTER LAB 01: GRADE EVALUATOR     ");
        System.out.println("=========================================");

        System.out.print("Enter number of subjects: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid count.");
            scanner.close();
            return;
        }
        int count = scanner.nextInt();
        if (count <= 0) {
            System.out.println("Number of subjects must be positive.");
            scanner.close();
            return;
        }

        double[] marks = new double[count];
        double total = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks! Please re-enter between 0 and 100: ");
                marks[i] = scanner.nextDouble();
            }
            total += marks[i];
        }

        double average = total / count;
        System.out.println("\n------------- SEMESTER REPORT CARD -------------");
        System.out.printf("Total Marks:   %.2f / %.2f%n", total, count * 100.0);
        System.out.printf("Percentage:    %.2f%%%n", average);
        System.out.printf("Letter Grade:  %s%n", determineLetterGrade(average));
        System.out.printf("Calculated GPA: %.2f / 4.00%n", calculateGPA(average));
        System.out.println("------------------------------------------------");

        scanner.close();
    }
}
