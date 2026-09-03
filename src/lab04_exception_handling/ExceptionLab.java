package lab04_exception_handling;

// Lab 4: Exception Handling Demo
public class ExceptionLab {

    // Method using throws keyword
    public static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Invalid score: " + score + ". Score must be between 0 and 100.");
        } else {
            System.out.println("Valid score: " + score);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===");

        // 1. Handling custom exception with try-catch
        try {
            validateScore(85);
            validateScore(120); // will throw exception
        } catch (InvalidScoreException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        // 2. Built-in exception and finally block
        System.out.println("\n--- Array Index & Finally Demo ---");
        int[] arr = {10, 20, 30};
        try {
            System.out.println("Accessing element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index is out of bounds!");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
