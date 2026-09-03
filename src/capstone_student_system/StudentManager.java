package capstone_student_system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Capstone Project: StudentManager Service
 * Implements CRUD operations, searching, filtering, and summary statistics using Java Collections.
 */
public class StudentManager {
    private final Map<String, StudentRecord> studentsByRollNumber;

    public StudentManager() {
        this.studentsByRollNumber = new HashMap<>();
    }

    public boolean addStudent(StudentRecord student) {
        if (student == null || student.getRollNumber() == null) {
            return false;
        }
        String key = student.getRollNumber().trim().toUpperCase();
        if (studentsByRollNumber.containsKey(key)) {
            return false; // Duplicate
        }
        studentsByRollNumber.put(key, student);
        return true;
    }

    public StudentRecord findStudent(String rollNumber) {
        if (rollNumber == null) return null;
        return studentsByRollNumber.get(rollNumber.trim().toUpperCase());
    }

    public boolean removeStudent(String rollNumber) {
        if (rollNumber == null) return false;
        return studentsByRollNumber.remove(rollNumber.trim().toUpperCase()) != null;
    }

    public List<StudentRecord> getAllStudents() {
        List<StudentRecord> list = new ArrayList<>(studentsByRollNumber.values());
        list.sort(Comparator.comparing(StudentRecord::getRollNumber));
        return list;
    }

    public List<StudentRecord> searchByName(String query) {
        List<StudentRecord> results = new ArrayList<>();
        if (query == null || query.isBlank()) return results;
        String lower = query.trim().toLowerCase();
        for (StudentRecord student : studentsByRollNumber.values()) {
            if (student.getName().toLowerCase().contains(lower)) {
                results.add(student);
            }
        }
        return results;
    }

    public int getTotalCount() {
        return studentsByRollNumber.size();
    }

    public double calculateClassAverageGPA() {
        if (studentsByRollNumber.isEmpty()) return 0.0;
        double totalGPA = 0;
        for (StudentRecord student : studentsByRollNumber.values()) {
            totalGPA += student.calculateGPA();
        }
        return totalGPA / studentsByRollNumber.size();
    }

    public void seedInitialDemoData() {
        StudentRecord s1 = new StudentRecord("CS-2024-001", "Aarav Sharma", "aarav@univ.edu", "Computer Science");
        s1.addCourseScore("Data Structures", 92.5);
        s1.addCourseScore("Operating Systems", 88.0);
        s1.addCourseScore("Discrete Math", 95.0);
        addStudent(s1);

        StudentRecord s2 = new StudentRecord("CS-2024-002", "Priya Nair", "priya@univ.edu", "Computer Science");
        s2.addCourseScore("Data Structures", 84.0);
        s2.addCourseScore("Operating Systems", 79.5);
        s2.addCourseScore("Discrete Math", 82.0);
        addStudent(s2);

        StudentRecord s3 = new StudentRecord("IT-2024-003", "Rohan Mehta", "rohan@univ.edu", "Information Tech");
        s3.addCourseScore("Web Tech", 72.0);
        s3.addCourseScore("DBMS", 78.0);
        s3.addCourseScore("Networking", 68.5);
        addStudent(s3);
    }
}
