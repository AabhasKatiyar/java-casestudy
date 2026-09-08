package case_studies;

import java.util.Scanner;

public class CaseStudy03_EmployeeSalary {

    public static class Employee {

        private String employeeId;
        private String name;
        private double basicSalary;

        public Employee(String employeeId, String name, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.basicSalary = basicSalary;
        }

        public double calculateHRA() {
            return basicSalary * 0.20;
        }

        public double calculateDA() {
            return basicSalary * 0.10;
        }

        public double calculateGrossSalary() {
            return basicSalary + calculateHRA() + calculateDA();
        }

        public void displaySalarySlip() {
            System.out.println("\nEmployee Salary Details");
            System.out.println("---------------------------");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + name);
            System.out.printf("Basic Salary: ₹%.2f%n", basicSalary);
            System.out.printf("HRA: ₹%.2f%n", calculateHRA());
            System.out.printf("DA: ₹%.2f%n", calculateDA());
            System.out.printf("Gross Salary: ₹%.2f%n", calculateGrossSalary());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee Salary Management");

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Employee emp = new Employee(id, name, basic);

        emp.displaySalarySlip();

        sc.close();
    }
}
