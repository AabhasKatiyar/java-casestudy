package lab02_oop_core;

// Lab 2: OOP Concepts Demo (Inheritance & Polymorphism)
public class OOPDemo {
    public static void main(String[] args) {
        System.out.println("=== OOP Demonstration ===");

        Student s = new Student("S101", "Aman Verma", 20, "Computer Science", 8.9);
        Professor p = new Professor("P201", "Dr. Sharma", 45, "CSE", "Operating Systems");

        System.out.println("\n--- Student Details ---");
        s.displayInfo();

        System.out.println("\n--- Professor Details ---");
        p.displayInfo();

        // Polymorphism demonstration using Parent reference
        System.out.println("\n--- Polymorphism Demo ---");
        Person ref;
        ref = s;
        ref.displayInfo();

        ref = p;
        ref.displayInfo();
    }
}
