package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas. */
        Libro libro1 = new Libro().crearLibro();
        System.out.println("ISBN: " + libro1.getISBN());
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Numero de paginas: " + libro1.getNumPaginas());

    }


}

class Libro {
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
