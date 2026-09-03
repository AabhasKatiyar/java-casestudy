package lab02_oop_core;

// Lab 2: Child class Student inheriting from Person
public class Student extends Person {
    private String branch;
    private double cgpa;

    public Student(String id, String name, int age, String branch, double cgpa) {
        super(id, name, age);
        this.branch = branch;
        this.cgpa = cgpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Branch: " + branch + ", CGPA: " + cgpa);
    }
}
