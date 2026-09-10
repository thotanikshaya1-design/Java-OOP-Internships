import java.util.ArrayList;

// Abstraction
abstract class Item {
    abstract void display();
}

// Book inherits Item
class Book extends Item {
    private String title;
    private boolean available = true;

    Book(String title) {
        this.title = title;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(title + " returned successfully.");
    }

    @Override
    void display() {
        System.out.println(title + " - " +
                (available ? "Available" : "Borrowed"));
    }
}

// User class
class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    void displayUser() {
        System.out.println("User: " + name);
    }
}

// Library class
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    void displayBooks() {
        for (Book book : books) {
            book.display();
        }
    }
}

public class LibraryManagement{
    public static void main(String[] args) {

        Library library = new Library();

        User user = new User("Amithra");
        Book book = new Book("Java Programming");

        user.displayUser();

        library.addBook(book);

        System.out.println("\nBooks:");
        library.displayBooks();

        book.borrowBook();

        book.returnBook();
    }
}
   
