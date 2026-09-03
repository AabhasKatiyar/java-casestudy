package case_studies;

import java.util.Scanner;

class StudentCourse {
    String studentName;
    String[] courses = new String[5];
    int courseCount = 0;

    public StudentCourse(String studentName) {
        this.studentName = studentName;
    }

    public void registerCourse(String courseName) {
        if (courseCount < 5) {
            courses[courseCount] = courseName;
            courseCount++;
            System.out.println("Course \"" + courseName + "\" registered successfully (" + courseCount + "/5).");
        } else {
            System.out.println("Cannot register for \"" + courseName + "\". Maximum limit of 5 courses reached!");
        }
    }

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

        s.registerCourse("Java Programming");
        s.registerCourse("Data Structures");
        s.registerCourse("Database Management Systems");
        s.registerCourse("Computer Networks");
        s.registerCourse("Operating Systems");

        s.registerCourse("Software Engineering");

        s.displayCourses();

        sc.close();
    }
}
