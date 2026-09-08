package case_studies;

import java.util.Scanner;

public class CaseStudy06_PatientManagement {

    public static class Patient {

        private String patientId;
        private String name;
        private int age;
        private double temperature;

        public Patient(String patientId, String name, int age, double temperature) {
            this.patientId = patientId;
            this.name = name;
            this.age = age;
            this.temperature = temperature;
        }

        public boolean hasFever() {
            return temperature > 100.4;
        }

        public void displayPatient() {
            System.out.println("\nPatient Details");
            System.out.println("------------------------");
            System.out.println("Patient ID: " + patientId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Temperature: " + temperature + " F");

            if (hasFever())
                System.out.println("Status: Fever");
            else
                System.out.println("Status: Normal");

            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hospital Patient Management");

        System.out.print("Enter Patient ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Body Temperature: ");
        double temp = sc.nextDouble();

        Patient patient = new Patient(id, name, age, temp);

        patient.displayPatient();

        sc.close();
    }
}
