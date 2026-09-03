package lab03_interfaces_abstract;

public abstract class Employee implements Payable {
    String empId;
    String name;

    public Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}
