package lab04_exception_handling;

/**
 * Lab 04 - Custom Checked Exception
 * Demonstrates: Extending java.lang.Exception to define domain-specific business exceptions.
 */
public class InvalidScoreException extends Exception {
    private final double invalidScore;

    public InvalidScoreException(String message, double invalidScore) {
        super(message + " (Provided score: " + invalidScore + ")");
        this.invalidScore = invalidScore;
    }

    public double getInvalidScore() {
        return invalidScore;
    }
}
