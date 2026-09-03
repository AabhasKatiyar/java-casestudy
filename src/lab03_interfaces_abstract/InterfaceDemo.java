package lab03_interfaces_abstract;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 03 - Runner: Interfaces and Abstract Classes in action
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("  SEMESTER LAB 03: INTERFACES & ABSTRACT ");
        System.out.println("=========================================");

        TeachingAssistant ta1 = new TeachingAssistant("TA-501", "Rohan Gupta", "Computer Science", 25.0, 40.0, "CS101 Intro to Java");
        TeachingAssistant ta2 = new TeachingAssistant("TA-502", "Sneha Rao", "Computer Science", 30.0, 35.0, "CS201 Data Structures");

        List<Payable> payroll = new ArrayList<>();
        payroll.add(ta1);
        payroll.add(ta2);

        double totalDisbursement = 0;

        System.out.println("\n--- Monthly Payroll Processing ---");
        for (Payable item : payroll) {
            if (item instanceof Employee) {
                Employee emp = (Employee) item;
                emp.displayBasicInfo();
                System.out.println("Role: " + emp.getJobTitle());
            }
            item.printPayslip();
            double pay = item.calculateMonthlyPayment();
            totalDisbursement += pay;
            System.out.println("-----------------------------------------");
        }

        System.out.printf("Total Department Payroll: $%.2f%n", totalDisbursement);
        System.out.println("\nLab 03 Interface & Abstraction demo completed.");
    }
}
