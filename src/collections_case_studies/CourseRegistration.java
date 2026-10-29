package collections_case_studies;

import java.util.HashSet;
import java.util.Set;

public class CourseRegistration {

    public static void registerCourse(Set<String> courses, String course) {
        courses.add(course);
    }

    public static boolean isRegistered(Set<String> courses, String course) {
        return courses.contains(course);
    }

    public static void dropCourse(Set<String> courses, String course) {
        courses.remove(course);
    }

    public static void displayCourses(Set<String> courses) {
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();

        registerCourse(courses, "Java");
        registerCourse(courses, "Python");
        registerCourse(courses, "DBMS");
        registerCourse(courses, "Java");

        System.out.println("Courses:");
        displayCourses(courses);

        System.out.println("Python registered: " + isRegistered(courses, "Python"));

        dropCourse(courses, "DBMS");

        System.out.println("After dropping DBMS:");
        displayCourses(courses);
    }
}
