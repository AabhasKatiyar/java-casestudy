package lab04_exception_handling;

// Lab 4: Custom Exception
public class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}
