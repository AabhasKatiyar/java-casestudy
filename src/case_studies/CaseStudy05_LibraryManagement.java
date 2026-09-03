package case_studies;

/**
 * Case Study 5: Library Management System
 * Problem:
 * A college library wants to maintain books.
 * Create a Book class containing:
 * - Book ID
 * - Book title
 * - Author
 * - Availability status
 * Implement methods:
 * - issueBook()
 * - returnBook()
 * - displayBook()
 * A book cannot be issued if it is already issued.
 */
public class CaseStudy05_LibraryManagement {

    public static class Book {
        private final String bookId;
        private final String bookTitle;
        private final String author;
        private boolean isAvailable;

        public Book(String bookId, String bookTitle, String author) {
            this.bookId = bookId;
            this.bookTitle = bookTitle;
            this.author = author;
            this.isAvailable = true; // Initially available
        }

        public boolean issueBook() {
            if (!isAvailable) {
                System.out.printf("[Failed] '%s' (ID: %s) is currently ALREADY ISSUED to another student.%n", bookTitle, bookId);
                return false;
            }
            isAvailable = false;
            System.out.printf("[Success] '%s' (ID: %s) has been issued successfully.%n", bookTitle, bookId);
            return true;
        }

        public boolean returnBook() {
            if (isAvailable) {
                System.out.printf("[Info] '%s' (ID: %s) is already in library inventory.%n", bookTitle, bookId);
                return false;
            }
            isAvailable = true;
            System.out.printf("[Success] '%s' (ID: %s) has been returned and is now available.%n", bookTitle, bookId);
            return true;
        }

        public void displayBook() {
            System.out.printf("[%s] \"%-32s\" by %-20s | Status: %s%n",
                    bookId, bookTitle, author, (isAvailable ? "AVAILABLE" : "ISSUED (Unavailable)"));
        }

        public String getBookId() {
            return bookId;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return isAvailable;
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     CASE STUDY 5: LIBRARY MANAGEMENT SYSTEM      ");
        System.out.println("==================================================");

        Book b1 = new Book("B-101", "Introduction to Algorithms", "CLRS");
        Book b2 = new Book("B-102", "Effective Java", "Joshua Bloch");
        Book b3 = new Book("B-103", "Operating System Concepts", "Silberschatz");

        System.out.println("\n--- Current Library Inventory ---");
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        System.out.println("\n--- Testing Issue Operations ---");
        System.out.println("1. Student A requests B-101 (First time):");
        b1.issueBook();

        System.out.println("\n2. Student B requests B-101 (Attempting double-issue):");
        b1.issueBook(); // Should be rejected

        System.out.println("\n--- Inventory After Issue Attempt ---");
        b1.displayBook();

        System.out.println("\n--- Testing Return Operations ---");
        System.out.println("1. Student A returns B-101:");
        b1.returnBook();

        System.out.println("\n2. Student B requests B-101 now:");
        b1.issueBook(); // Should succeed now

        System.out.println("\n--- Final Book Status ---");
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
