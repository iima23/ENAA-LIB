import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    // list of books
    public static ArrayList<Book> books = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.name);
            System.out.println("Address: " + student.address);
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.Title);
            System.out.println("Author: " + book.Author);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Publication: " + book.Publication);
        }
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title:");
        String Title = scanner.nextLine();
        System.out.println("Enter Author:");
        String Author = scanner.nextLine();
        System.out.println("Enter ISBN:");
        int ISBN = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Publication:");
        String Publication = scanner.nextLine();
        Book book = new Book(Title, Author, ISBN, Publication, null);
        books.add(book);
        System.out.println("Book is added ");
    }

    public void removeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the title of the book to remove:");
        String titleToRemove = scanner.nextLine();
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.Title.equalsIgnoreCase(titleToRemove)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book '" + titleToRemove + "' is removed");
        }
        else {
            System.out.println("Book with the title '" + titleToRemove + "' does not exist.");
        }
    }

    public void searchBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the title of the book to search:");
        String titleToSearch = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.Title.equalsIgnoreCase(titleToSearch)) {
                found = true;
                // Display book details
                System.out.println("book exist:");
                System.out.println("Title: " + book.Title);
                System.out.println("Author: " + book.Author);
                System.out.println("ISBN: " + book.ISBN);
                System.out.println("Publication: " + book.Publication);
                break;
            }
        }
        if (!found) {
            System.out.println("The book with the title '" + titleToSearch + "' not exist.");
        }
    }


    public static void getBorrower(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.Title.equalsIgnoreCase(title)) {
                if (book.Borrower != null) {
                    System.out.println("The book '" + title + "' is borrowed by: " + book.Borrower.name);
                } else {
                    System.out.println("The book '" + title + "' is not borrowed.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The book with this title '" + title + "' doesn't exist.");
        }
    }
}
