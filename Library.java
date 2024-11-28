import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchBookByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    public List<String> listAuthors() {
        List<String> authors = new ArrayList<>();
        for (Book book : books) {
            if (!authors.contains(book.getAuthor())) {
                authors.add(book.getAuthor());
            }
        }
        return authors;
    }

    public List<Book> listBooksByLanguage(String language) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getLanguage().equalsIgnoreCase(language)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> getTopBooks(int limit) {
        return books.subList(0, Math.min(limit, books.size()));
    }

    public String getStatistics() {
        int totalBooks = books.size();
        int totalAuthors = listAuthors().size();
        return "Total Books: " + totalBooks + ", Total Authors: " + totalAuthors;
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
