package lab04_exception_handling;

/**
 * Lab 04 - Exception Handling Demonstration
 * Demonstrates: try, catch, multi-catch, finally, throw, and throws keywords.
 */
public class ExceptionLab {

    // Method declaring a checked exception via throws
    public static void validateExamScore(double score) throws InvalidScoreException {
        if (score < 0.0 || score > 100.0) {
            throw new InvalidScoreException("Exam score must be in the range [0.0, 100.0]", score);
        }
        System.out.printf("Score %.2f is valid.%n", score);
    }

    public static void safeArrayLookup(int[] array, int index) {
        try {
            System.out.println("Accessing index " + index + ": Value = " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: Index " + index + " is outside array bounds (0 to " + (array.length - 1) + ").");
        } finally {
            System.out.println("[Finally Block Executed: Cleanup actions completed]");
        }
    }

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   SEMESTER LAB 04: EXCEPTION HANDLING   ");
        System.out.println("=========================================");

        // 1. Custom Exception Handling Test
        System.out.println("\n--- Testing Custom Checked Exception ---");
        double[] testScores = { 88.5, 104.0, -12.0, 95.0 };

        for (double score : testScores) {
            try {
                System.out.print("Testing score: " + score + " -> ");
                validateExamScore(score);
            } catch (InvalidScoreException e) {
                System.out.println("Caught Custom Exception: " + e.getMessage());
            }
        }

        // 2. Built-in Runtime Exception & Finally Block Test
        System.out.println("\n--- Testing Built-in Exception & Finally ---");
        int[] numbers = { 10, 20, 30, 40, 50 };
        safeArrayLookup(numbers, 2);  // Valid
        safeArrayLookup(numbers, 10); // Out of bounds

        System.out.println("\nLab 04 Exception Handling demo completed.");
    }
}
