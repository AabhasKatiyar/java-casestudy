package lab02_oop_core;

/**
 * Lab 02 - Base Superclass
 * Demonstrates: Encapsulation (private fields), Constructors, Getters/Setters, Method Overriding (toString).
 */
public class Person {
    private String id;
    private String name;
    private int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        setAge(age); // Using setter for validation
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Age must be between 0 and 130.");
        }
        this.age = age;
    }

    // Method to be overridden by subclasses (Polymorphism)
    public void displayRole() {
        System.out.println("Role: General Person in University System");
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Age: %d", id, name, age);
    }
}
