package case_studies;

public class CaseStudy08_EmployeeInheritance {

    public static class Employee {

        protected String name;
        protected double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        public double calculateTotalPay() {
            return salary;
        }

        public void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Salary: ₹" + salary);
            System.out.println("Total Pay: ₹" + calculateTotalPay());
        }
    }

    public static class Manager extends Employee {

        private double bonus;

        public Manager(String name, double salary, double bonus) {
            super(name, salary);
            this.bonus = bonus;
        }

        @Override
        public double calculateTotalPay() {
            return salary + bonus;
        }

        @Override
        public void displayDetails() {
            System.out.println("Manager Name: " + name);
            System.out.println("Salary: ₹" + salary);
            System.out.println("Bonus: ₹" + bonus);
            System.out.println("Total Pay: ₹" + calculateTotalPay());
        }
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Vikram Singh", 45000);
        Manager manager = new Manager("Ananya Roy", 85000, 25000);

        System.out.println("Employee Details");
        emp.displayDetails();

        System.out.println("\nManager Details");
        manager.displayDetails();
    }
}
