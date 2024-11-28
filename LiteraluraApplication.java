package com.example.literalura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LiteraluraApplication implements CommandLineRunner {

    // Lista para almacenar los libros en memoria
    private List<Libro> libros = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Agregar 500 libros simulados a la lista
        for (long i = 1; i <= 500; i++) {
            libros.add(new Libro(i, "Libro " + i, "Autor " + i, "Idioma " + (i % 2 == 0 ? "Español" : "Inglés")));
        }

        // Mostrar los primeros 10 libros
        System.out.println("Primeros 10 libros registrados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(libros.get(i));
        }

        // Buscar un libro por título
        String tituloBusqueda = "Libro 250";
        System.out.println("\nBuscando libro con título: " + tituloBusqueda);
        buscarLibroPorTitulo(tituloBusqueda);
    }

    // Método para buscar un libro por título
    public void buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro encontrado: " + libro);
                return;
            }
        }
        System.out.println("Libro no encontrado con el título: " + titulo);
    }
}
