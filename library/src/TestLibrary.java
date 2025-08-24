import java.util.List;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Java Core", "John"));
        library.addBook(new Book("Java Advanced", "Smith"));


        List<Book> libraryBooks = library.getBooks();
        System.out.println(libraryBooks);

        Book book = library.getBook(1);
        System.out.println(book);

        boolean removedBook = library.removeBook(1);
        System.out.println(removedBook);

        System.out.println(library.getBooks());

    }
}
