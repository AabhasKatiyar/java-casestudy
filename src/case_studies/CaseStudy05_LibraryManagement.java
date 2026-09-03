package case_studies;

class Book {
    int bookId;
    String bookTitle;
    String author;
    boolean isAvailable;

    public Book(int bookId, String bookTitle, String author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.isAvailable = true;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book \"" + bookTitle + "\" issued successfully.");
        } else {
            System.out.println("Sorry, \"" + bookTitle + "\" is already issued.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book \"" + bookTitle + "\" returned successfully.");
        } else {
            System.out.println("Book \"" + bookTitle + "\" was not issued.");
        }
    }

    public void displayBook() {
        System.out.println("ID: " + bookId + ", Title: " + bookTitle + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No"));
    }
}

public class CaseStudy05_LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Programming", "Herbert Schildt");
        Book b2 = new Book(102, "Data Structures", "Seymour Lipschutz");

        System.out.println("--- Library Books ---");
        b1.displayBook();
        b2.displayBook();

        System.out.println("\n--- Testing Issue and Return ---");
        b1.issueBook();
        b1.displayBook();

        b1.issueBook();

        b1.returnBook();
        b1.displayBook();
    }
}
