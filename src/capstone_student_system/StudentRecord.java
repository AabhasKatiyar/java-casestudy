package capstone_student_system;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Capstone Project: StudentRecord Model
 * Stores student credentials, subject scores, GPA calculation, and grade determination.
 */
public class StudentRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private String rollNumber;
    private String name;
    private String email;
    private String department;
    private Map<String, Double> courseScores; // Course Name -> Score (0-100)

    public StudentRecord(String rollNumber, String name, String email, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
        this.department = department;
        this.courseScores = new HashMap<>();
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, Double> getCourseScores() {
        return courseScores;
    }

    public void addCourseScore(String course, double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100.");
        }
        courseScores.put(course, score);
    }

    public double calculateAverageScore() {
        if (courseScores.isEmpty()) return 0.0;
        double sum = 0;
        for (double score : courseScores.values()) {
            sum += score;
        }
        return sum / courseScores.size();
    }

    public double calculateGPA() {
        double avg = calculateAverageScore();
        if (avg >= 90.0) return 4.0;
        if (avg >= 80.0) return 3.5;
        if (avg >= 70.0) return 3.0;
        if (avg >= 60.0) return 2.5;
        if (avg >= 50.0) return 2.0;
        return 0.0;
    }

    public String getPerformanceStatus() {
        double gpa = calculateGPA();
        if (gpa >= 3.5) return "Dean's List / High Distinction";
        if (gpa >= 3.0) return "First Class Honors";
        if (gpa >= 2.0) return "Good Standing";
        return "Academic Probation";
    }

    @Override
    public String toString() {
        return String.format("[%s] %-18s | %-16s | Avg: %5.2f%% | GPA: %4.2f | Status: %s",
                rollNumber, name, department, calculateAverageScore(), calculateGPA(), getPerformanceStatus());
    }
}
