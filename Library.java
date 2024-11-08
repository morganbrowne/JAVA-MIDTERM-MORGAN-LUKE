package MID_TERM_SPRINT_JAVA;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;
    private List<Patron> patrons;
    private List<Author> authors;

    // Constructor Function for Library
    public Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.authors = new ArrayList<>();
    }

    // Getter for items
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Getter for patrons
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Getter for authors
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Getter for items
    public LibraryItem searchItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public Patron searchPatronByName(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equalsIgnoreCase(name)) {
                return patron;
            }
        }
        return null; 
    }
}
