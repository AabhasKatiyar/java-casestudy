package case_studies;

class EmployeeStaff {
    String name;
    double salary;

    public EmployeeStaff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getTotalSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Total Salary: " + getTotalSalary());
    }
}

class ManagerStaff extends EmployeeStaff {
    double bonus;

    public ManagerStaff(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getTotalSalary() {
        return salary + bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary (Salary + Bonus): " + getTotalSalary());
    }
}

public class CaseStudy08_EmployeeInheritance {
    public static void main(String[] args) {
        System.out.println("--- Employee Details ---");
        EmployeeStaff e = new EmployeeStaff("Rahul Sharma", 40000);
        e.displayDetails();

        System.out.println("\n--- Manager Details ---");
        ManagerStaff m = new ManagerStaff("Priya Singh", 75000, 20000);
        m.displayDetails();
    }
}
