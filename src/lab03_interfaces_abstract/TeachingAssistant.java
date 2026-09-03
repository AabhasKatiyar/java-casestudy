package lab03_interfaces_abstract;

// Lab 3: Concrete class TeachingAssistant extending Employee
public class TeachingAssistant extends Employee {
    int hoursWorked;
    double hourlyRate;

    public TeachingAssistant(String empId, String name, int hoursWorked, double hourlyRate) {
        super(empId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
