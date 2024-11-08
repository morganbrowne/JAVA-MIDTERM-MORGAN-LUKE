package MID_TERM_SPRINT_JAVA;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String dateOfBirth;
    private List <LibraryItem> writtenItems; // If the author has written multiple items belonging to libary... 
 
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }

    //method to add libary item to authors list of writtem items... 
    public void addItem(LibraryItem item) {
        writtenItems.add(item);

    }

    // Getter For Author File... 
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List <LibraryItem> getWrittenItems() {
        return writtenItems;
    }

    // Setter fot Author File... 
    public void setName(String name) {
        this.name = name;
    }

    //optinal setter method with a validation for name.
    // public void setName(String name) {
    //     if (name == null || mane.trim().isEmpty()) {
    //         throw new IllegalArgumentException("Name cannot be empty");
    //     }
    //     this.name = name;
    // }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setWitemItems(List <LibraryItem> writtItems) {
        this.writtenItems = writtItems;

    }
 }



