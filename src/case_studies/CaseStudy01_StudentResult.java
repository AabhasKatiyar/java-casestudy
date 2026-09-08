package case_studies;

import java.util.Scanner;

public class CaseStudy01_StudentResult {

    public static String calculateGrade(double percentage) {
        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    public static boolean isPassed(double percentage) {
        return percentage >= 50;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Student Result Management System");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        double total = 0;
        double[] marks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");

            while (!sc.hasNextDouble()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }

            marks[i] = sc.nextDouble();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Marks should be between 0 and 100. Enter again: ");
                marks[i] = sc.nextDouble();
            }

            total += marks[i];
        }

        double percentage = total / 5;
        String grade = calculateGrade(percentage);

        System.out.println("\nStudent Result");
        System.out.println("-------------------------");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + " / 500");
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);

        if (isPassed(percentage))
            System.out.println("Result: PASSED");
        else
            System.out.println("Result: FAILED");

        sc.close();
    }
}
