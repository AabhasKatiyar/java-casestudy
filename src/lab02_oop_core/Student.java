package lab02_oop_core;

/**
 * Lab 02 - Subclass: Student (Inherits from Person)
 * Demonstrates: Inheritance (extends), super constructor, method overriding, constructor overloading.
 */
public class Student extends Person {
    private String major;
    private double gpa;
    private int semester;

    // Overloaded Constructor 1 (Full)
    public Student(String id, String name, int age, String major, double gpa, int semester) {
        super(id, name, age);
        this.major = major;
        setGpa(gpa);
        this.semester = semester;
    }

    // Overloaded Constructor 2 (Freshman default)
    public Student(String id, String name, int age, String major) {
        this(id, name, age, major, 0.0, 1);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = gpa;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Undergraduate Student enrolled in " + major + " (Semester " + semester + ")");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Major: %s | GPA: %.2f | Semester: %d", major, gpa, semester);
    }
}
