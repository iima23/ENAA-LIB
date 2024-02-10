import java.util.Scanner;

public class Book {
     String Title;
    String Author;
    int ISBN;
    String Publication;
    Student Borrower;

    public Book(String Title, String Author, int ISBN, String Publication, Student Borrower) {
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.Publication = Publication;
        this.Borrower = Borrower;
    }

    void modifyTitle(Scanner scanner) {
        System.out.print("Enter new Title: ");
        String newTitle;
        newTitle = scanner.nextLine();
        this.Title = newTitle;
    }

    void modifyAuthor(Scanner scanner) {
        System.out.print("Enter new Author: ");
        String newAuthor;
        newAuthor = scanner.nextLine();
        this.Author = newAuthor;
    }

    void modifyISBN(Scanner scanner) {
        System.out.print("Enter new ISBN: ");
        int newISBN = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        this.ISBN = newISBN;
    }

    void modifyPublication(Scanner scanner) {
        System.out.print("Enter new Publication: ");
        String newPublication;
        newPublication = scanner.nextLine();
        this.Publication = newPublication;
    }

    void displayMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("Modify Book Details:");
            System.out.println("1. Modify Title");
            System.out.println("2. Modify Author");
            System.out.println("3. Modify ISBN");
            System.out.println("4. Modify Publication");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    modifyTitle(scanner);
                    break;
                case 2:
                    modifyAuthor(scanner);
                    break;
                case 3:
                    modifyISBN(scanner);
                    break;
                case 4:
                    modifyPublication(scanner);
                    break;
                case 5:
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }
}