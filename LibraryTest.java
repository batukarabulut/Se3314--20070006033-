import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        // Create a library
        Library library = new Library();
        System.out.println("Test change");


        // Add some books to the library
        library.addBook(new Book("Harry Potter", "J.K. Rowling", "9780439554930"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));

        // Search for books
        List<Book> searchResults = library.searchBooks("Harry Potter");
        for (Book book : searchResults) {
            System.out.println("Found: " + book.getTitle() + " by " + book.getAuthor());
        }

        // Check out a book
        Book bookToCheckout = searchResults.get(0);
        library.checkOutBook(bookToCheckout, "John Doe");

        // Attempt to check out the same book again
        library.checkOutBook(bookToCheckout, "Jane Doe");

        // Return the book
        library.returnBook(bookToCheckout);
    }
}
