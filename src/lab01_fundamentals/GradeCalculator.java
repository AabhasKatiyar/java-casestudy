package lab01_fundamentals;

import java.util.Scanner;

// Lab 1: Grade Calculator using Arrays
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double[] marks = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            total += marks[i];
        }

        double average = total / n;
        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Result Summary ---");
        System.out.println("Total Marks: " + total + " / " + (n * 100));
        System.out.println("Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
