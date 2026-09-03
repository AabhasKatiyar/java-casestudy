package case_studies;

import java.util.Scanner;

class StudentRegistration {
    String studentName;
    String[] courses = new String[5];
    int courseCount = 0;

    public StudentRegistration(String studentName) {
        this.studentName = studentName;
    }

    public boolean registerCourse(String courseName) {
        if (courseCount < 5) {
            courses[courseCount] = courseName;
            courseCount++;
            System.out.println("Course \"" + courseName + "\" registered successfully (" + courseCount + "/5).");
            return true;
        } else {
            System.out.println("Cannot register for \"" + courseName + "\". Maximum limit of 5 courses reached!");
            return false;
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

        StudentRegistration s = new StudentRegistration(name);

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
