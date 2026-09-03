package case_studies;

import java.util.Scanner;

// Runner program for all 10 case studies
public class CaseStudiesRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==========================================");
            System.out.println("       JAVA CASE STUDIES - SEMESTER       ");
            System.out.println("==========================================");
            System.out.println("1.  Student Result Management");
            System.out.println("2.  Bank Account Management");
            System.out.println("3.  Employee Salary Management");
            System.out.println("4.  Online Shopping Cart");
            System.out.println("5.  Library Management System");
            System.out.println("6.  Hospital Patient Management");
            System.out.println("7.  ATM Simulation");
            System.out.println("8.  Employee Inheritance");
            System.out.println("9.  University Course Registration");
            System.out.println("10. E-Commerce Payment System");
            System.out.println("0.  Exit");
            System.out.println("==========================================");
            System.out.print("Enter choice (0-10): ");

            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    CaseStudy01_StudentResult.main(new String[]{});
                    break;
                case 2:
                    CaseStudy02_BankAccount.main(new String[]{});
                    break;
                case 3:
                    CaseStudy03_EmployeeSalary.main(new String[]{});
                    break;
                case 4:
                    CaseStudy04_ShoppingCart.main(new String[]{});
                    break;
                case 5:
                    CaseStudy05_LibraryManagement.main(new String[]{});
                    break;
                case 6:
                    CaseStudy06_PatientManagement.main(new String[]{});
                    break;
                case 7:
                    CaseStudy07_ATMSimulation.main(new String[]{});
                    break;
                case 8:
                    CaseStudy08_EmployeeInheritance.main(new String[]{});
                    break;
                case 9:
                    CaseStudy09_CourseRegistration.main(new String[]{});
                    break;
                case 10:
                    CaseStudy10_PaymentSystem.main(new String[]{});
                    break;
                case 0:
                    System.out.println("Exiting. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose from 0 to 10.");
            }
        } while (choice != 0);

        sc.close();
    }
}
