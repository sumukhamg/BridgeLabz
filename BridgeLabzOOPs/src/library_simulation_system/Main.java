package library_simulation_system;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "author1");
        Book book2 = new Book("Book2", "author2");
        Book book3 = new Book("Book3", "author3");
        Book book4 = new Book("Book4", "author4");
        Book book5 = new Book("Book5", "author5");

        Book[] books = new Book[5];

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;

        book1.issue();
        book1.returnBook();

        book2.returnBook();
    }
}
