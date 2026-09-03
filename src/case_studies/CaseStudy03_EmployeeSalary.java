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

    public void displaySalaryDetails() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double grossSalary = basicSalary + hra + da;

        System.out.println("\n--- Employee Salary Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (10%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
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
