package lab02_oop_core;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 02 - Runner: Demonstrating the 4 Pillars of OOP
 * 1. Encapsulation: Private fields accessed via validated getters/setters.
 * 2. Inheritance: Student and Professor reuse attributes and methods from Person.
 * 3. Polymorphism: Processing different derived objects uniformly via base class references.
 * 4. Abstraction: Clean separation of object interface vs implementation.
 */
public class OOPDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     SEMESTER LAB 02: 4 PILLARS OF OOP   ");
        System.out.println("=========================================");

        // Instantiating concrete objects
        Student s1 = new Student("STU-101", "Aarav Sharma", 20, "Computer Science", 3.85, 3);
        Student s2 = new Student("STU-102", "Diya Patel", 19, "Information Technology"); // Uses overloaded constructor
        Professor p1 = new Professor("FAC-201", "Dr. Rajesh Verma", 48, "Computer Science", "Distributed Systems", 24);

        // Polymorphic Collection: List of Base Type 'Person'
        List<Person> universityDirectory = new ArrayList<>();
        universityDirectory.add(s1);
        universityDirectory.add(s2);
        universityDirectory.add(p1);

        System.out.println("\n--- Polymorphic Iteration & Dynamic Method Dispatch ---");
        for (Person person : universityDirectory) {
            System.out.println("\n[Record] " + person);
            // Dynamic binding at runtime: calls the overridden method in Student or Professor
            person.displayRole();
        }

        System.out.println("\n--- Encapsulation & Validation Test ---");
        try {
            System.out.println("Setting invalid GPA for student...");
            s1.setGpa(5.5); // Should throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Caught Successfully: " + e.getMessage());
        }

        System.out.println("\nLab 02 OOP Demonstration completed successfully.");
    }
}
