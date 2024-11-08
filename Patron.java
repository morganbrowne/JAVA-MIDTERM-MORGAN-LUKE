package MID_TERM_SPRINT_JAVA;

import java.util.ArrayList;
import java.util.List;

// Constructor Function 
public abstract class Patron {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected List <LibraryItem> borrowedItems;

    public Patron(String name, String address, String phoneNumber ) {
        this.name = name; 
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    // Patron Getters 
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    // Patron Settter. 
    public void setAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Must Fill Address.");
        }
        this.address = address;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Must Fill Name.");
        }
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Must Fill Phone Number ");

        }
        // // This is for a phone number with 10 digit number, optinal (9999999999)
        // if (!phoneNumber.matches("\\d{10}")) {
        //     throw new IllegalArgumentException("Phone number must be 10 digits long. ");
        // }
        this.phoneNumber = phoneNumber;

    }
    public void setBorrowedItems(LibraryItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Must Fill Borrowed Items. ");
        }
        this.borrowedItems.add(item);
    }




}
