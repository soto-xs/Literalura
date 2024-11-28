public class Book {
    private String title;
    private String author;
    private String language;

    public Book(String title, String author, String language) {
        this.title = title;
        this.author = author;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Language: " + language;
    }
}
