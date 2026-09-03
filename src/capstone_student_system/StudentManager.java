package capstone_student_system;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<StudentRecord> list = new ArrayList<>();

    public void addStudent(StudentRecord s) {
        list.add(s);
        System.out.println("Student added successfully!");
    }

    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (StudentRecord s : list) {
            s.display();
        }
    }

    public void searchStudent(int rollNo) {
        for (StudentRecord s : list) {
            if (s.getRollNo() == rollNo) {
                System.out.println("\n--- Student Found ---");
                s.display();
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }

    public void deleteStudent(int rollNo) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRollNo() == rollNo) {
                list.remove(i);
                System.out.println("Student with Roll No " + rollNo + " removed successfully.");
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }
}
