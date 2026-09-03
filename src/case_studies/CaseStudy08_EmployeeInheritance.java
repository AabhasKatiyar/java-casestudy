package case_studies;

// Case Study 8: Employee Inheritance

// Base class
class Staff {
    String name;
    double salary;

    // Constructor
    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class using inheritance
class Manager extends Staff {
    double bonus;

    // Constructor using super
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // Overriding display method to include bonus and total salary
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary (Salary + Bonus): " + (salary + bonus));
    }
}

public class CaseStudy08_EmployeeInheritance {
    public static void main(String[] args) {
        System.out.println("--- Employee Details ---");
        Staff e = new Staff("Rahul Sharma", 40000);
        e.display();

        System.out.println("\n--- Manager Details ---");
        Manager m = new Manager("Priya Singh", 75000, 20000);
        m.display();
    }
}
