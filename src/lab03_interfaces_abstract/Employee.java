package lab03_interfaces_abstract;

/**
 * Lab 03 - Abstract Class: Employee
 * Demonstrates: Abstract classes, abstract vs concrete methods, and interface implementation.
 */
public abstract class Employee implements Payable {
    private String employeeId;
    private String name;
    private String department;

    public Employee(String employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Concrete method common to all employees
    public void displayBasicInfo() {
        System.out.printf("[%s] %s - Dept: %s%n", employeeId, name, department);
    }

    // Abstract method that concrete subclasses MUST implement
    public abstract String getJobTitle();
}
