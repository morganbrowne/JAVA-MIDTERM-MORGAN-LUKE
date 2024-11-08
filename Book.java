package MID_TERM_SPRINT_JAVA;
// The Book class extends the abstract LibraryItem class to represent a specific type of library item—books.
public class Book extends LibraryItem {
    private String format; // Printed, Electronic, or Audio

    public Book(String id, String title, Author author, String isbn, String publisher, int numberOfCopies, String format) {
        super(id, title, author, isbn, publisher, numberOfCopies);
        this.format = format;
    }

    @Override
    public String getDetails() {
        return "Book: " + getTitle() + " by " + getAuthor().getName() + " (Format: " + format + ")";
    }

    // Getter for format
    public String getFormat() {
        return format;
    }

    // Setter for format
    public void setFormat(String format) {
        if (format == null || format.isEmpty()) {
            throw new IllegalArgumentException("Format cannot be null or empty.");
        }
        this.format = format;
    }
}
