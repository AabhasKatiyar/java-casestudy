package case_studies;

import java.util.Scanner;

class StudentResult {
    String name;
    int[] marks = new int[5];

    public StudentResult(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean isPassed() {
        return calculatePercentage() >= 50;
    }

    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal() + "/500");
        System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Result: " + (isPassed() ? "Passed" : "Failed"));
    }
}

public class CaseStudy01_StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        StudentResult student = new StudentResult(name, marks);
        student.displayResult();

        sc.close();
    }
}
