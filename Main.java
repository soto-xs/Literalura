import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Preload some data
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "English"));
        library.addBook(new Book("Don Quijote", "Miguel de Cervantes", "Spanish"));
        library.addBook(new Book("Les Misérables", "Victor Hugo", "French"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "English"));
        library.addBook(new Book("Cien años de soledad", "Gabriel García Márquez", "Spanish"));

        int option;
        do {
            System.out.println("\nMENU:");
            System.out.println("1.- Buscar libro por título");
            System.out.println("2.- Listar libros registrados");
            System.out.println("3.- Listar autores registrados");
            System.out.println("5.- Listar libros por idioma");
            System.out.println("6.- Listar top 15 de libros registrados");
            System.out.println("7.- Buscar libro registrado por título");
            System.out.println("8.- Buscar autor por nombre");
            System.out.println("10.- Mostrar estadísticas de libros registrados");
            System.out.println("0.- Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1: // Buscar libro por título
                case 7: // Buscar libro registrado por título
                    System.out.print("Introduce el título del libro: ");
                    String title = scanner.nextLine();
                    List<Book> booksByTitle = library.searchBookByTitle(title);
                    if (booksByTitle.isEmpty()) {
                        System.out.println("No se encontraron libros con ese título.");
                    } else {
                        System.out.println("Libros encontrados:");
                        for (Book book : booksByTitle) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 2: // Listar libros registrados
                    List<Book> allBooks = library.getAllBooks();
                    if (allBooks.isEmpty()) {
                        System.out.println("No hay libros registrados.");
                    } else {
                        System.out.println("Libros registrados:");
                        for (Book book : allBooks) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 3: // Listar autores registrados
                    List<String> authors = library.listAuthors();
                    if (authors.isEmpty()) {
                        System.out.println("No hay autores registrados.");
                    } else {
                        System.out.println("Autores registrados:");
                        for (String author : authors) {
                            System.out.println(author);
                        }
                    }
                    break;

                case 5: // Listar libros por idioma
                    System.out.print("Introduce el idioma: ");
                    String language = scanner.nextLine();
                    List<Book> booksByLanguage = library.listBooksByLanguage(language);
                    if (booksByLanguage.isEmpty()) {
                        System.out.println("No se encontraron libros en ese idioma.");
                    } else {
                        System.out.println("Libros en " + language + ":");
                        for (Book book : booksByLanguage) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 6: // Listar top 15 de libros registrados
                    System.out.println("Top 15 libros registrados:");
                    List<Book> topBooks = library.getTopBooks(15);
                    for (Book book : topBooks) {
                        System.out.println(book);
                    }
                    break;

                case 8: // Buscar autor por nombre
                    System.out.print("Introduce el nombre del autor: ");
                    String authorName = scanner.nextLine();
                    boolean found = false;
                    for (Book book : library.getAllBooks()) {
                        if (book.getAuthor().equalsIgnoreCase(authorName)) {
                            System.out.println(book);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No se encontraron libros de ese autor.");
                    }
                    break;

                case 10: // Mostrar estadísticas
                    System.out.println("Estadísticas de la biblioteca:");
                    System.out.println(library.getStatistics());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);

        scanner.close();
    }
}
