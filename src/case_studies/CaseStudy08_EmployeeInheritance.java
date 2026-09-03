package case_studies;

/**
 * Case Study 8: Employee Inheritance
 * Problem:
 * A company has two types of employees:
 * - Employee
 * - Manager
 * Every employee has a name and salary. A manager additionally receives a bonus.
 * Use inheritance to implement the system.
 */
public class CaseStudy08_EmployeeInheritance {

    // Base Superclass
    public static class Employee {
        protected String name;
        protected double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = Math.max(salary, 0.0);
        }

        public double calculateTotalPay() {
            return salary;
        }

        public void displayDetails() {
            System.out.println("----------------------------------------------");
            System.out.printf("Employee Type: Regular Employee%n");
            System.out.printf("Name:          %s%n", name);
            System.out.printf("Base Salary:   ₹%,.2f%n", salary);
            System.out.printf("Total Pay:     ₹%,.2f%n", calculateTotalPay());
            System.out.println("----------------------------------------------");
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    // Derived Subclass using Inheritance
    public static class Manager extends Employee {
        private final double bonus;

        public Manager(String name, double salary, double bonus) {
            super(name, salary); // Call base class constructor
            this.bonus = Math.max(bonus, 0.0);
        }

        @Override
        public double calculateTotalPay() {
            return salary + bonus; // Base salary + Managerial bonus
        }

        @Override
        public void displayDetails() {
            System.out.println("----------------------------------------------");
            System.out.printf("Employee Type: Department Manager%n");
            System.out.printf("Name:          %s%n", name);
            System.out.printf("Base Salary:   ₹%,.2f%n", salary);
            System.out.printf("Annual Bonus:  ₹%,.2f%n", bonus);
            System.out.printf("Total Pay:     ₹%,.2f%n", calculateTotalPay());
            System.out.println("----------------------------------------------");
        }

        public double getBonus() {
            return bonus;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     CASE STUDY 8: EMPLOYEE INHERITANCE           ");
        System.out.println("==================================================");

        Employee emp = new Employee("Vikram Singh", 45000.0);
        Manager mgr = new Manager("Ananya Roy", 85000.0, 25000.0);

        System.out.println("\n[Regular Employee Record]");
        emp.displayDetails();

        System.out.println("\n[Manager Record (Inherits Employee + Bonus)]");
        mgr.displayDetails();
    }
}
