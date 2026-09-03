package capstone_student_system;

// Student Record Model
public class StudentRecord {
    private int rollNo;
    private String name;
    private String branch;
    private double marks;

    public StudentRecord(int rollNo, String name, String branch, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name + " | Branch: " + branch + " | Marks: " + marks);
    }
}
