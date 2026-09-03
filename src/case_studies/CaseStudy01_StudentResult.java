package case_studies;

import java.util.Scanner;

public class CaseStudy01_StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in subject 1: ");
        int mark1 = sc.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int mark2 = sc.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int mark3 = sc.nextInt();
        System.out.print("Enter marks in subject 4: ");
        int mark4 = sc.nextInt();
        System.out.print("Enter marks in subject 5: ");
        int mark5 = sc.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = total / 5.0;
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total + "/500");
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + (percentage >= 50 ? "Passed" : "Failed"));

        sc.close();
    }
}
