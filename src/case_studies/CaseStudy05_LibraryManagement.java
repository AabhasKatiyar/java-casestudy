package case_studies;

public class CaseStudy05_LibraryManagement {

    public static class Book {

        private String bookId;
        private String bookTitle;
        private String author;
        private boolean isAvailable;

        public Book(String bookId, String bookTitle, String author) {
            this.bookId = bookId;
            this.bookTitle = bookTitle;
            this.author = author;
            this.isAvailable = true;
        }

        public void issueBook() {
            if (!isAvailable) {
                System.out.println("Book is already issued.");
            } else {
                isAvailable = false;
                System.out.println("Book issued successfully.");
            }
        }

        public void returnBook() {
            if (isAvailable) {
                System.out.println("Book is already available.");
            } else {
                isAvailable = true;
                System.out.println("Book returned successfully.");
            }
        }

        public void displayBook() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Title: " + bookTitle);
            System.out.println("Author: " + author);
            System.out.println("Status: " + (isAvailable ? "Available" : "Issued"));
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book("B101", "Introduction to Algorithms", "CLRS");
        Book b2 = new Book("B102", "Effective Java", "Joshua Bloch");
        Book b3 = new Book("B103", "Operating System Concepts", "Silberschatz");

        System.out.println("Library Management System\n");

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();

        System.out.println("Issuing B101:");
        b1.issueBook();

        System.out.println("\nTrying to issue B101 again:");
        b1.issueBook();

        System.out.println("\nReturning B101:");
        b1.returnBook();

        System.out.println("\nIssuing B101 again:");
        b1.issueBook();

        System.out.println("\nFinal Book Details:");
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
