package MID_TERM_SPRINT_JAVA;



public abstract class LibraryItem {
    protected String id;
    protected String title; 
    protected Author author;
    protected String ISBN;
    protected String publisher;
    protected int numberOfCopies;

    public LibraryItem(String id, String title, Author author, String ISBN, String publisher, int numberOfCopies ) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
    }

    public abstract String getDetails();

    // Getters For LIbraryItems... 

  
    public String getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }
 
    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    

    // LibraryItem Setters... 

    public void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty.");
        }
        this.id = id;
    }
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty.");
        }
        this.title = title;
    }
    public void setAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null.");
        }
        this.author = author;
    }
    public void setIsbn(String ISBN) {
        if (ISBN == null || ISBN.isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty.");
        }
        // Additional validation: ISBN should be a 10 or 13 character string
        if (ISBN.length() != 10 && ISBN.length() != 13) {
            throw new IllegalArgumentException("ISBN must be 10 or 13 characters long.");
        }
        this.ISBN = ISBN;
    }
    public void setPublisher(String publisher) {
        if (publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("Publisher cannot be null or empty.");
        }
        this.publisher = publisher;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        if (numberOfCopies < 0) {
            throw new IllegalArgumentException("Number of copies cannot be negative.");
        }
        this.numberOfCopies = numberOfCopies;
    }
}
