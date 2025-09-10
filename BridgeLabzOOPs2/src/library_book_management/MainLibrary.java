package library_book_management;

import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book1 = new Fictional("Author1", "Title 1");
        Book book2 = new NonFictional("Author2", "Title 2");
        Book book3 = new Magazine("Author3", "Title 3");

        System.out.println("Select Choice: ");
        System.out.println("1. Issue Book");
        System.out.println("2. Return book");
        int selection = sc.nextInt();
        if (selection == 1) {
            System.out.println("Which book you want?");
            System.out.println("book1 ");
            System.out.println("book2 ");
            System.out.println("book3 ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    book1.isseuBook();
                    break;

                case 2:
                    book2.isseuBook();
                    break;

                case 3:
                    book3.isseuBook();
                    break;
            }
            return;

        } else if (selection == 2) {

            System.out.println("Which book you want to return? ");
            System.out.println("Available books: ");
            System.out.println("book1 ");
            System.out.println("book2 ");
            System.out.println("book3 ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    book1.returnBook();
                    break;

                case 2:
                    book2.returnBook();
                    break;

                case 3:
                    book3.returnBook();
                    break;
            }

            return;
        }

        System.out.println("You mad wronng choice. Try  again....");

    }
}
