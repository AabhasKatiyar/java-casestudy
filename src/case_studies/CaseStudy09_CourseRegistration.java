package case_studies;

import java.util.ArrayList;

public class CaseStudy09_CourseRegistration {

    public static class Student {

        private String studentId;
        private String studentName;
        private ArrayList<String> courses;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            courses = new ArrayList<>();
        }

        public void registerCourse(String courseName) {

            if (courses.size() >= 5) {
                System.out.println("Cannot register for more than 5 courses.");
            } else {
                courses.add(courseName);
                System.out.println("Course registered: " + courseName);
            }
        }

        public void displayCourses() {

            System.out.println("\nStudent Details");
            System.out.println("-------------------------");
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + studentName);

            System.out.println("\nRegistered Courses:");

            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i));
            }
        }
    }

    public static void main(String[] args) {

        Student student = new Student("2024-CS-042", "Kavya Deshmukh");

        student.registerCourse("Programming");
        student.registerCourse("Data Structures");
        student.registerCourse("Mathematics");
        student.registerCourse("Computer Architecture");
        student.registerCourse("Database Management");

        student.registerCourse("Artificial Intelligence");

        student.displayCourses();
    }
}
