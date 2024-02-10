import java.util.Scanner;

public class Menu {
   public  Library library;

    public Menu(Library library) {
        this.library = library;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Display all books");
            System.out.println("2. Display all students");
            System.out.println("3. Add a book");
            System.out.println("4. Remove a book");
            System.out.println("5. Search for a book");
            System.out.println("6.get borrower of the book");
            System.out.println("6. Modify book details");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    library.displayStudents();
                    break;
                case 3:
                    library.addBook();
                    break;
                case 4:
                    library.removeBook();
                    break;
                case 5:
                    library.searchBook();
                    break;
                case 6:
                    System.out.println("Enter the title of the book to get it as borrower:");
                    String bookTitle = scanner.nextLine();
                    Library.getBorrower(bookTitle);
                    break;
                case 7:
                    System.out.println("Modify book details:");
                    System.out.println("Enter the title of the book to modify:");
                    String titleToModify = scanner.nextLine();
                    Book bookToModify = null;
                    for (Book book : Library.books) {
                        if (book.Title.equalsIgnoreCase(titleToModify)) {
                            bookToModify = book;
                            break;
                        }
                    }
                    if (bookToModify != null) {
                        bookToModify.displayMenu(scanner);
                    } else {
                        System.out.println("The book with the title '" + titleToModify + "' not exist");
                    }
                    break;
                case 8:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalid.");
            }
        } while (choice != 8);
        scanner.close();
    }
}