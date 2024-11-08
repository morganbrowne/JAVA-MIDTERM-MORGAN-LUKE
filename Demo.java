package MID_TERM_SPRINT_JAVA;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        try (Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.println("1. Add Item");
                System.out.println("2. Add Patron");
                System.out.println("3. Add Author");
                System.out.println("4. Borrow Item");
                System.out.println("5. Return Item");
                System.out.println("6. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch(choice) {
                    case 1:
                        System.out.println("Enter the title of the item: ");
                        String title = scanner.nextLine();
                        System.out.println("Enter the author of the item: ");
                        String author = scanner.nextLine();
                        System.out.println("Enter the ISBN of the item: ");
                        String isbn = scanner.nextLine();
                        System.out.println("Enter the publisher of the item: ");
                        String publisher = scanner.nextLine();
                        System.out.println("Enter the number of copies of the item: ");
                        int numberOfCopies = scanner.nextInt();
                        scanner.nextLine();

                        Author authorObj = new Author(author, "01/01/2000");
                        Book book = new Book("1", title, authorObj, isbn, publisher, numberOfCopies, title);
                        library.addItem(book);
                        break;
                    case 2:
                        System.out.println("Enter the name of the patron: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter the address of the patron: ");
                        String address = scanner.nextLine();
                        System.out.println("Enter the phone number of the patron: ");
                        String phoneNumber = scanner.nextLine();
                        Patron patron = new Patron(name, address, phoneNumber);
                        library.addPatron(patron);
                        break;
                    case 3:
                        System.out.println("Enter the name of the author: ");
                        String authorName = scanner.nextLine();
                        Author newAuthorObj = new Author(authorName, "01/01/2000");
                        library.addAuthor(newAuthorObj);
                        break;
                    case 4:
                        System.out.println("Enter the title of the item to borrow: ");
                        String borrowTitle = scanner.nextLine();
                        LibraryItem item = library.searchItemByTitle(borrowTitle);
                        if (item != null) {
                            System.out.println("Enter the name of the patron: ");
                            String patronName = scanner.nextLine();
                            Patron foundPatron = library.searchPatronByName(patronName);
                            if (foundPatron != null) {
                                foundPatron.borrowItem(item);
                            } else {
                                System.out.println("Patron not found.");
                            }
                        } else {
                            System.out.println("Item not found.");
                        }
                        break;
                    case 5:
                        System.out.println("Enter the title of the item to return: ");
                        String returnTitle = scanner.nextLine();
                        LibraryItem returnItem = library.searchItemByTitle(returnTitle);
                        if (returnItem != null) {
                            System.out.println("Enter the name of the patron: ");
                            String patronName = scanner.nextLine();
                            Patron foundPatron = library.searchPatronByName(patronName);
                            if (foundPatron != null) {
                                foundPatron.returnItem(returnItem);
                            } else {
                                System.out.println("Patron not found.");
                            }
                        } else {
                            System.out.println("Item not found.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}

