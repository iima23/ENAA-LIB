import java.util.ArrayList;
import java.util.List;
public class Student {
    // Attributes
    String name;
    String address;
    int ID;
    List<Book> borrowedBooks;

    // Constructor
    public Student(String name, String address, int ID) {
        this.name = name;
        this.address = address;
        this.ID = ID;
        this.borrowedBooks = new ArrayList<>();
    }
}