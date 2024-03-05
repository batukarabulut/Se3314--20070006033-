public class Book {

    public String title;

    public String author;

    public String ISBN;

    public boolean isAvailable;



    /**
     * @param title  - title of the book
     * @param author - author of the book
     * @param ISBN   - ISBN of the book
     */
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    /**
     * Retrieves the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Retrieves the author of the book.
     * @return The author of the book.
     */

    public String getAuthor() {
        return author;
    }
    /**
     * Retrieves the ISBN of the book.
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Checks if the book is available in the library.
     * @return true if the book is available, false otherwise.
     */
    public boolean isAvailable(){
        return isAvailable;
    }

    /**
     * Sets the availability status of the book.
     * @param available true if the book is available, false otherwise.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
