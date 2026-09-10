import java.util.InputMismatchException;
import java.util.Scanner;

public class CaseStudyExceptionHandling {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\nException Handling Case Studies");
            System.out.println("1. Bus Ticket Booking");
            System.out.println("2. Bank Account Withdrawal");
            System.out.println("3. Student Examination Result");
            System.out.println("4. Online Shopping and Payment");
            System.out.println("5. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    runBusTicketBooking();
                    break;
                case 2:
                    runBankWithdrawal();
                    break;
                case 3:
                    runStudentResult();
                    break;
                case 4:
                    runShoppingPayment();
                    break;
                case 5:
                    running = false;
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid choice. Select a number from 1 to 5.");
            }
        }

        SCANNER.close();
    }

    private static void runBusTicketBooking() {
        try {
            int age = readInt("Enter passenger age: ");
            int seats = readInt("Enter number of seats: ");
            int availableSeats = 40;

            if (age <= 0) {
                throw new InvalidAgeException("Age must be greater than 0.");
            }
            if (seats <= 0) {
                throw new InvalidSeatException("Number of seats must be greater than 0.");
            }
            if (seats > availableSeats) {
                throw new InsufficientSeatsException("Only " + availableSeats + " seats are available.");
            }

            System.out.println("Bus ticket booked successfully for " + seats + " seat(s).");
        } catch (InvalidAgeException | InvalidSeatException | InsufficientSeatsException exception) {
            System.out.println("Booking failed: " + exception.getMessage());
        }
    }

    private static void runBankWithdrawal() {
        try {
            double balance = readDouble("Enter account balance: ");
            double amount = readDouble("Enter withdrawal amount: ");

            if (amount <= 0) {
                throw new InvalidWithdrawalAmountException("Withdrawal amount must be greater than 0.");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance for this withdrawal.");
            }

            System.out.printf("Withdrawal successful. Remaining balance: %.2f%n", balance - amount);
        } catch (InvalidWithdrawalAmountException | InsufficientBalanceException exception) {
            System.out.println("Withdrawal failed: " + exception.getMessage());
        }
    }

    private static void runStudentResult() {
        try {
            int subjects = readInt("Enter number of subjects: ");
            if (subjects <= 0) {
                throw new NoSubjectsException("At least one subject is required.");
            }

            double total = 0;
            for (int subject = 1; subject <= subjects; subject++) {
                double marks = readDouble("Enter marks for subject " + subject + ": ");
                if (marks < 0 || marks > 100) {
                    throw new InvalidMarksException("Marks must be between 0 and 100.");
                }
                total += marks;
            }

            double average = total / subjects;
            System.out.printf("Average marks: %.2f%n", average);
            System.out.println("Result: " + (average >= 40 ? "Passed" : "Failed"));
        } catch (NoSubjectsException | InvalidMarksException exception) {
            System.out.println("Result calculation failed: " + exception.getMessage());
        }
    }

    private static void runShoppingPayment() {
        try {
            double price = readDouble("Enter product price: ");
            int quantity = readInt("Enter quantity: ");
            double discount = readDouble("Enter discount percentage: ");
            double payment = readDouble("Enter payment amount: ");

            if (price <= 0) {
                throw new InvalidPriceException("Product price must be greater than 0.");
            }
            if (quantity <= 0) {
                throw new InvalidQuantityException("Quantity must be greater than 0.");
            }
            if (discount < 0 || discount > 100) {
                throw new InvalidDiscountException("Discount must be between 0 and 100 percent.");
            }

            double bill = price * quantity * (1 - discount / 100);
            if (payment < bill) {
                throw new InsufficientPaymentException("Payment is less than the final bill.");
            }

            System.out.printf("Final bill: %.2f%n", bill);
            System.out.printf("Payment accepted. Change: %.2f%n", payment - bill);
        } catch (InvalidPriceException | InvalidQuantityException | InvalidDiscountException
                | InsufficientPaymentException exception) {
            System.out.println("Shopping transaction failed: " + exception.getMessage());
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return SCANNER.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please enter a whole number.");
                SCANNER.next();
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return SCANNER.nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid input. Please enter a number.");
                SCANNER.next();
            }
        }
    }

    private static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }

    private static class InvalidSeatException extends Exception {
        InvalidSeatException(String message) {
            super(message);
        }
    }

    private static class InsufficientSeatsException extends Exception {
        InsufficientSeatsException(String message) {
            super(message);
        }
    }

    private static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    private static class InvalidWithdrawalAmountException extends Exception {
        InvalidWithdrawalAmountException(String message) {
            super(message);
        }
    }

    private static class InvalidMarksException extends Exception {
        InvalidMarksException(String message) {
            super(message);
        }
    }

    private static class NoSubjectsException extends Exception {
        NoSubjectsException(String message) {
            super(message);
        }
    }

    private static class InvalidPriceException extends Exception {
        InvalidPriceException(String message) {
            super(message);
        }
    }

    private static class InvalidQuantityException extends Exception {
        InvalidQuantityException(String message) {
            super(message);
        }
    }

    private static class InvalidDiscountException extends Exception {
        InvalidDiscountException(String message) {
            super(message);
        }
    }

    private static class InsufficientPaymentException extends Exception {
        InsufficientPaymentException(String message) {
            super(message);
        }
    }
}