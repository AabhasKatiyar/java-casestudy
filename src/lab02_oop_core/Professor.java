package lab02_oop_core;

// Lab 2: Child class Professor inheriting from Person
public class Professor extends Person {
    private String department;
    private String subject;

    public Professor(String id, String name, int age, String department, String subject) {
        super(id, name, age);
        this.department = department;
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department + ", Subject: " + subject);
    }
}
