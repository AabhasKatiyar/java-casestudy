package case_studies;

import java.util.Scanner;

// Case Study 9: University Course Registration
class StudentCourse {
    String studentName;
    String[] courses = new String[5];
    int courseCount = 0;

    // Constructor
    public StudentCourse(String studentName) {
        this.studentName = studentName;
    }

    // Method to register course (maximum 5)
    public void registerCourse(String courseName) {
        if (courseCount < 5) {
            courses[courseCount] = courseName;
            courseCount++;
            System.out.println("Course \"" + courseName + "\" registered successfully (" + courseCount + "/5).");
        } else {
            System.out.println("Cannot register for \"" + courseName + "\". Maximum limit of 5 courses reached!");
        }
    }

    // Method to display registered courses
    public void displayCourses() {
        System.out.println("\n--- Registered Courses for " + studentName + " ---");
        if (courseCount == 0) {
            System.out.println("No courses registered yet.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println((i + 1) + ". " + courses[i]);
            }
        }
    }
}

public class CaseStudy09_CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        StudentCourse s = new StudentCourse(name);

        // Registering courses
        s.registerCourse("Java Programming");
        s.registerCourse("Data Structures");
        s.registerCourse("Database Management Systems");
        s.registerCourse("Computer Networks");
        s.registerCourse("Operating Systems");

        // Attempting to register 6th course
        s.registerCourse("Software Engineering");

        // Display all registered courses
        s.displayCourses();

        sc.close();
    }
}
