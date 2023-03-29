package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Libros;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Libros.entidades.Libro;

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
        libro1.mostrarLibro(libro1);
    }
}
