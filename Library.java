import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages books.
 */
public class Library {
    private List<Book> books;   // List to store books in the library

    /**
     * Constructs a new Library object.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     * @param b The book to be added.
     * @throws IllegalArgumentException If the book is null.
     */
    public void addBook(Book b) throws IllegalArgumentException {
        if (b == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        books.add(b);
    }

    /**
     * Searches for books by title or author.
     * @param query The title or author to search for.
     * @return A list of books matching the query.
     */
    public List<Book> searchBooks(String query) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                results.add(book);
            }
        }
        return results;
    }

    /**
     * Checks out a book to a borrower.
     * @param book The book to be checked out.
     * @param borrower The borrower who is checking out the book.
     * @throws IllegalArgumentException If the book is null.
     */
    public void checkOutBook(Book book, String borrower) throws IllegalArgumentException {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        if (!book.isAvailable()) {
            System.out.println("Sorry, the book is not available.");
            return;
        }
        book.setAvailable(false);
        System.out.println("Book \"" + book.getTitle() + "\" has been checked out to " + borrower + ".");
    }

    /**
     * Returns a book to the library.
     * @param book The book to be returned.
     * @throws IllegalArgumentException If the book is null.
     */
    public void returnBook(Book book) throws IllegalArgumentException {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        if (book.isAvailable()) {
            System.out.println("The book is already in the library.");
            return;
        }
        book.setAvailable(true);
        System.out.println("Book \"" + book.getTitle() + "\" has been returned to the library.");
    }
}
