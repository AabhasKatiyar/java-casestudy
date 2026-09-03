package case_studies;

import java.util.Scanner;

/**
 * Case Study 6: Hospital Patient Management
 * Problem:
 * A hospital maintains patient information.
 * Create a Patient class with:
 * - Patient ID
 * - Name
 * - Age
 * - Temperature
 * The program should determine whether the patient has fever.
 * If temperature is greater than 100.4°F, display "Fever"; otherwise display "Normal".
 */
public class CaseStudy06_PatientManagement {

    public static class Patient {
        private final String patientId;
        private final String name;
        private final int age;
        private final double temperature; // in Fahrenheit

        public Patient(String patientId, String name, int age, double temperature) {
            this.patientId = patientId;
            this.name = name;
            this.age = age;
            this.temperature = temperature;
        }

        public boolean hasFever() {
            return temperature > 100.4;
        }

        public String getHealthStatus() {
            return hasFever() ? "Fever" : "Normal";
        }

        public void displayPatientRecord() {
            System.out.println("----------------------------------------------");
            System.out.printf("Patient ID:     %s%n", patientId);
            System.out.printf("Name:           %s%n", name);
            System.out.printf("Age:            %d years%n", age);
            System.out.printf("Body Temp:      %.1f°F%n", temperature);
            System.out.printf("Diagnosis:      %s%n", getHealthStatus());
            System.out.println("----------------------------------------------");
        }

        public String getPatientId() {
            return patientId;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getTemperature() {
            return temperature;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("   CASE STUDY 6: HOSPITAL PATIENT MANAGEMENT      ");
        System.out.println("==================================================");

        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine().trim();
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Body Temperature (°F): ");
        double temp = scanner.nextDouble();

        Patient patient = new Patient(id, name, age, temp);
        System.out.println("\n[Diagnostic Result]");
        patient.displayPatientRecord();

        scanner.close();
    }
}
