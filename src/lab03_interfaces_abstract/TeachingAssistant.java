package lab03_interfaces_abstract;

/**
 * Lab 03 - Concrete Class: TeachingAssistant
 * Demonstrates: Inheriting abstract class and implementing interface methods.
 */
public class TeachingAssistant extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private String assignedCourse;

    public TeachingAssistant(String employeeId, String name, String department,
                             double hourlyRate, double hoursWorked, String assignedCourse) {
        super(employeeId, name, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.assignedCourse = assignedCourse;
    }

    @Override
    public String getJobTitle() {
        return "Graduate Teaching Assistant (TA) for " + assignedCourse;
    }

    @Override
    public double calculateMonthlyPayment() {
        return hourlyRate * hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getAssignedCourse() {
        return assignedCourse;
    }
}
