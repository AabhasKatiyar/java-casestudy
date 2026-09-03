package case_studies;

import java.util.Scanner;

// Case Study 6: Hospital Patient Management
class Patient {
    int patientId;
    String name;
    int age;
    double temperature;

    // Constructor
    public Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    // Method to check if patient has fever
    public void checkFever() {
        System.out.println("\n--- Patient Details ---");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + "°F");

        if (temperature > 100.4) {
            System.out.println("Condition: Fever");
        } else {
            System.out.println("Condition: Normal");
        }
    }
}

public class CaseStudy06_PatientManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Body Temperature in °F: ");
        double temp = sc.nextDouble();

        Patient p = new Patient(id, name, age, temp);
        p.checkFever();

        sc.close();
    }
}
