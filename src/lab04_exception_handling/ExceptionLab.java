package lab04_exception_handling;

public class ExceptionLab {

    public static void validateScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Invalid score: " + score + ". Score must be between 0 and 100.");
        } else {
            System.out.println("Valid score: " + score);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===");

        try {
            validateScore(85);
            validateScore(120);
        } catch (InvalidScoreException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

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
