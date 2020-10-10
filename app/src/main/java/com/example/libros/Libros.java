package com.example.libros;

import java.io.Serializable;

public class Libros implements Serializable {

    private String isbn;
    private String titulo;
    private String autor;

    public Libros(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "ISBN = " + isbn + ", Título = " + titulo + ", Autor = " + autor;
    }
}
