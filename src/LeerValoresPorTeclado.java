import java.util.Scanner;

public class LeerValoresPorTeclado {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu primer ingreso de datos por teclado!");
        Scanner leer = new Scanner(System.in); //Creamos variable Scanner para leer datos.
        String nombre; //Definimos variable "nombre"
        System.out.println("Ingresa tu nombre:");
        nombre = leer.next(); //Leemos "nombre"
        System.out.println("Bienvenido " + nombre + "!"); //Escribimos "Texto" + nombre + "Texto"
        System.out.println("Espero que aprendas mucho el dia de hoy.");
    }
}
