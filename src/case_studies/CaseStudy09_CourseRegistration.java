package case_studies;

import java.util.ArrayList;
import java.util.List;

/**
 * Case Study 9: University Course Registration
 * Problem:
 * A university allows students to register for courses.
 * A student can register for a maximum of 5 courses.
 * Create a class Student with methods:
 * - registerCourse()
 * - displayCourses()
 * If the student tries to register for more than 5 courses, display an appropriate message.
 */
public class CaseStudy09_CourseRegistration {

    public static class Student {
        private final String studentId;
        private final String studentName;
        private final List<String> registeredCourses;
        private static final int MAX_COURSES = 5;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.registeredCourses = new ArrayList<>();
        }

        public boolean registerCourse(String courseName) {
            if (courseName == null || courseName.trim().isEmpty()) {
                System.out.println("[Error] Invalid course name.");
                return false;
            }
            if (registeredCourses.size() >= MAX_COURSES) {
                System.out.printf("[Registration Denied] Cannot register for '%s'. Student %s has reached maximum limit of %d courses.%n",
                        courseName, studentName, MAX_COURSES);
                return false;
            }
            if (registeredCourses.contains(courseName.trim())) {
                System.out.printf("[Notice] Student is already registered for '%s'.%n", courseName);
                return false;
            }
            registeredCourses.add(courseName.trim());
            System.out.printf("[Success] Enrolled in '%s' (%d/%d courses filled)%n",
                    courseName, registeredCourses.size(), MAX_COURSES);
            return true;
        }

        public void displayCourses() {
            System.out.println("----------------------------------------------");
            System.out.printf("Student ID:   %s%n", studentId);
            System.out.printf("Student Name: %s%n", studentName);
            System.out.printf("Enrolled Courses (%d/%d):%n", registeredCourses.size(), MAX_COURSES);
            if (registeredCourses.isEmpty()) {
                System.out.println("  (No courses registered)");
            } else {
                for (int i = 0; i < registeredCourses.size(); i++) {
                    System.out.printf("  %d. %s%n", (i + 1), registeredCourses.get(i));
                }
            }
            System.out.println("----------------------------------------------");
        }

        public String getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   CASE STUDY 9: UNIVERSITY COURSE REGISTRATION   ");
        System.out.println("==================================================");

        Student student = new Student("2024-CS-042", "Kavya Deshmukh");

        System.out.println("\n--- Attempting Course Registrations ---");
        student.registerCourse("CS101: Introduction to Programming");
        student.registerCourse("CS102: Data Structures & Algorithms");
        student.registerCourse("MATH201: Discrete Mathematics");
        student.registerCourse("CS203: Computer Organization & Architecture");
        student.registerCourse("CS204: Database Management Systems");

        // Attempting to register for 6th course (Exceeding max 5 limit)
        System.out.println("\n--- Attempting 6th Course Registration (Limit Test) ---");
        student.registerCourse("CS301: Artificial Intelligence");

        System.out.println("\n--- Final Course Schedule ---");
        student.displayCourses();
    }
}
