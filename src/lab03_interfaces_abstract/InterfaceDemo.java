package lab03_interfaces_abstract;

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("=== Interface & Abstract Class Demo ===");

        TeachingAssistant ta = new TeachingAssistant("TA101", "Rohan Gupta", 40, 500);
        ta.showDetails();
        System.out.println("Calculated Salary: Rs." + ta.calculateSalary());
    }
}
