package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Libros.entidades;

import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

    public Libro(String ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public Libro() {

    }

    public Libro crearLibro() {
        Scanner leer = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingresa el ISBN:");
        libro.setISBN(leer.next());
        System.out.println("Ingresa el título:");
        libro.setTitulo(leer.nextLine());
        System.out.println("Ingresa el autor:");
        libro.setAutor(leer.nextLine());
        System.out.println("Ingresa la cantidad de páginas:");
        libro.setNumPaginas(leer.nextInt());
        return libro;
    }

    public void mostrarLibro(Libro libro) {
        System.out.println(libro.getISBN());
        System.out.println(libro.getTitulo());
        System.out.println(libro.getAutor());
        System.out.println(libro.getNumPaginas());
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }
}

