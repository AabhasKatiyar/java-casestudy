package case_studies;

import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double basicSalary;

    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateHRA() {
        return 0.20 * basicSalary;
    }

    public double calculateDA() {
        return 0.10 * basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    public void displaySalaryDetails() {
        System.out.println("\n--- Employee Salary Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + calculateHRA());
        System.out.println("DA (10%): " + calculateDA());
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class CaseStudy03_EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Employee emp = new Employee(id, name, basic);
        emp.displaySalaryDetails();

        sc.close();
    }
}
