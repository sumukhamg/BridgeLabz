package library_simulation_system;

public class Book {

    String title;
    String author;
    boolean status = true;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void issue() {
        if (!status) {
            System.out.println("Book is currently not available");
            return;
        }
        System.out.println("Book " + title + " has been issued");
        status = false;
    }

    public void returnBook() {
        if (!status) {
            System.out.println("Book " + title + " returned");
            return;
        }
        System.out.println("Book is already returned");

    }
}
