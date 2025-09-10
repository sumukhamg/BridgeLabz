package library_book_management;

public class NonFictional implements Book {

    private String author;
    private String title;
    private boolean availableStatus = true;

    public String getAuthor() {
        return author;
    }

    public NonFictional(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void isseuBook() {
        if (availableStatus) {
            System.out.println("book Issued");
            System.out.println("Book details: ");
            availableStatus = false;
            this.displayDetails();
        } else {
            System.out.println("Book is currently not available");
        }

    }

    @Override
    public void returnBook() {
        if (availableStatus == false) {
            System.out.println("Book returned");
            displayDetails();
            availableStatus = true;
        }

        else {
            System.out.println("Invalid");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Book title: " + getTitle());
        System.out.println("Book author: " + getAuthor());
        System.out.println("Book Genre " + getClass().getName());
    }

}
