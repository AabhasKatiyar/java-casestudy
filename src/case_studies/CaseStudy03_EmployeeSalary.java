package case_studies;

import java.util.Scanner;

/**
 * Case Study 3: Employee Salary Management
 * Problem:
 * An organization maintains employee information.
 * Create an Employee class with:
 * - Employee ID
 * - Name
 * - Basic salary
 * Calculate:
 * - HRA = 20% of basic salary
 * - DA = 10% of basic salary
 * - Gross salary = Basic + HRA + DA
 * Display the complete salary details.
 */
public class CaseStudy03_EmployeeSalary {

    public static class Employee {
        private final String employeeId;
        private final String name;
        private final double basicSalary;

        public Employee(String employeeId, String name, double basicSalary) {
            this.employeeId = employeeId;
            this.name = name;
            this.basicSalary = Math.max(basicSalary, 0.0);
        }

        public double calculateHRA() {
            return 0.20 * basicSalary; // 20%
        }

        public double calculateDA() {
            return 0.10 * basicSalary; // 10%
        }

        public double calculateGrossSalary() {
            return basicSalary + calculateHRA() + calculateDA();
        }

        public void displaySalarySlip() {
            System.out.println("==============================================");
            System.out.println("             EMPLOYEE SALARY SLIP             ");
            System.out.println("==============================================");
            System.out.printf("Employee ID:     %s%n", employeeId);
            System.out.printf("Employee Name:   %s%n", name);
            System.out.println("----------------------------------------------");
            System.out.printf("Basic Salary:    ₹%,10.2f%n", basicSalary);
            System.out.printf("HRA (20%%):       ₹%,10.2f%n", calculateHRA());
            System.out.printf("DA (10%%):        ₹%,10.2f%n", calculateDA());
            System.out.println("----------------------------------------------");
            System.out.printf("GROSS SALARY:    ₹%,10.2f%n", calculateGrossSalary());
            System.out.println("==============================================");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("   CASE STUDY 3: EMPLOYEE SALARY MANAGEMENT       ");
        System.out.println("==================================================");

        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Basic Salary (₹): ");
        double basic = scanner.hasNextDouble() ? scanner.nextDouble() : 50000.0;

        Employee emp = new Employee(id, name, basic);
        System.out.println();
        emp.displaySalarySlip();

        scanner.close();
    }
}
