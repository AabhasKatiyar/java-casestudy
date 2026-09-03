package case_studies;

import java.util.Scanner;

/**
 * Master Runner for all 10 College Semester Case Studies
 */
public class CaseStudiesRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===============================================================");
            System.out.println("          🎓 UNIVERSITY SEMESTER: 10 CASE STUDY SUITE          ");
            System.out.println("===============================================================");
            System.out.println(" 1. Case Study 1: Student Result Management System");
            System.out.println(" 2. Case Study 2: Bank Account Management");
            System.out.println(" 3. Case Study 3: Employee Salary Management (HRA/DA/Gross)");
            System.out.println(" 4. Case Study 4: Online Shopping Cart (Discount calculation)");
            System.out.println(" 5. Case Study 5: Library Management System (Issue/Return)");
            System.out.println(" 6. Case Study 6: Hospital Patient Management (Fever check)");
            System.out.println(" 7. Case Study 7: ATM Simulation (PIN Security & 3 Attempts)");
            System.out.println(" 8. Case Study 8: Employee & Manager Inheritance");
            System.out.println(" 9. Case Study 9: University Course Registration (Max 5 Limit)");
            System.out.println(" 10. Case Study 10: E-Commerce Payment System (Polymorphism)");
            System.out.println(" 11. Exit");
            System.out.println("===============================================================");
            System.out.print("Select a case study to run (1-11): ");

            String choice = scanner.nextLine().trim();
            System.out.println();

            switch (choice) {
                case "1":
                    CaseStudy01_StudentResult.main(new String[]{});
                    break;
                case "2":
                    CaseStudy02_BankAccount.main(new String[]{});
                    break;
                case "3":
                    CaseStudy03_EmployeeSalary.main(new String[]{});
                    break;
                case "4":
                    CaseStudy04_ShoppingCart.main(new String[]{});
                    break;
                case "5":
                    CaseStudy05_LibraryManagement.main(new String[]{});
                    break;
                case "6":
                    CaseStudy06_PatientManagement.main(new String[]{});
                    break;
                case "7":
                    CaseStudy07_ATMSimulation.main(new String[]{});
                    break;
                case "8":
                    CaseStudy08_EmployeeInheritance.main(new String[]{});
                    break;
                case "9":
                    CaseStudy09_CourseRegistration.main(new String[]{});
                    break;
                case "10":
                    CaseStudy10_PaymentSystem.main(new String[]{});
                    break;
                case "11":
                    System.out.println("Exiting Case Studies Suite. Good luck with your semester!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 11.");
            }
        }

        scanner.close();
    }
}
