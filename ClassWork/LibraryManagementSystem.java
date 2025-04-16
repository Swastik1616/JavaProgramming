package learning;
import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }
}

class Library {
    private Map<String, Book> bookMap; // Stores books using ISBN as the key
    private TreeSet<Book> sortedBooks; // Maintains sorted books by title
    private Map<String, List<Book>> authorBooks; // Maps authors to their books

    public Library() {
        bookMap = new HashMap<>();
        sortedBooks = new TreeSet<>();
        authorBooks = new HashMap<>();
    }

    public void addBook(String title, String author, String isbn) {
        if (bookMap.containsKey(isbn)) {
            System.out.println("Book with ISBN " + isbn + " already exists.");
            return;
        }

        Book newBook = new Book(title, author, isbn);
        bookMap.put(isbn, newBook);
        sortedBooks.add(newBook);

        authorBooks.putIfAbsent(author, new ArrayList<>());
        authorBooks.get(author).add(newBook);

        System.out.println("Book added successfully.");
    }

    public void searchByISBN(String isbn) {
        Book book = bookMap.get(isbn);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void listAllBooks() {
        if (sortedBooks.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("Books in Library (Sorted by Title):");
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }

    public void removeBook(String isbn) {
        Book book = bookMap.remove(isbn);
        if (book == null) {
            System.out.println("Book with ISBN " + isbn + " not found.");
            return;
        }

        sortedBooks.remove(book);
        authorBooks.get(book.getAuthor()).remove(book);
        if (authorBooks.get(book.getAuthor()).isEmpty()) {
            authorBooks.remove(book.getAuthor());
        }

        System.out.println("Book removed successfully.");
    }

    public void searchBooksByAuthor(String author) {
        List<Book> books = authorBooks.get(author);
        if (books == null || books.isEmpty()) {
            System.out.println("No books found for author: " + author);
            return;
        }

        System.out.println("Books by " + author + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Search a Book by ISBN");
            System.out.println("3. List All Books");
            System.out.println("4. Remove a Book by ISBN");
            System.out.println("5. Search Books by Author");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(title, author, isbn);
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLine();
                    library.searchByISBN(isbn);
                    break;

                case 3:
                    library.listAllBooks();
                    break;

                case 4:
                    System.out.print("Enter ISBN to remove: ");
                    isbn = scanner.nextLine();
                    library.removeBook(isbn);
                    break;

                case 5:
                    System.out.print("Enter Author: ");
                    author = scanner.nextLine();
                    library.searchBooksByAuthor(author);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
