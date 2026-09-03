package lab02_oop_core;

/**
 * Lab 02 - Subclass: Professor (Inherits from Person)
 * Demonstrates: Inheritance, specialized behaviors, overridden methods.
 */
public class Professor extends Person {
    private String department;
    private String researchArea;
    private int publicationsCount;

    public Professor(String id, String name, int age, String department, String researchArea, int publicationsCount) {
        super(id, name, age);
        this.department = department;
        this.researchArea = researchArea;
        this.publicationsCount = publicationsCount;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public int getPublicationsCount() {
        return publicationsCount;
    }

    public void setPublicationsCount(int publicationsCount) {
        this.publicationsCount = publicationsCount;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Professor in " + department + " (Specialization: " + researchArea + ")");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Dept: %s | Research: %s | Papers: %d",
                department, researchArea, publicationsCount);
    }
}
