import java.util.Scanner;

public class LeerValoresPorTeclado {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu primer ingreso de datos por teclado!");
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre = leer.next();
        System.out.println("Bienvenido " + nombre + "!");
        System.out.println("Espero que aprendas mucho el dia de hoy.");
    }
}
