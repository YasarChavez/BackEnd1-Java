package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas;

import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
 /*Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.*/

        mayor();
    }

    public static void mayor() {
        Scanner leer = new Scanner(System.in);
        int n, edad;
        String nombre, opcion;
        boolean mayor;
        do {

            System.out.println("Ingrese el nombre de la persona: ");
            nombre = leer.next();

            System.out.println("Ingrese la edad de " + nombre + ": ");
            edad = leer.nextInt();

            mayor = (edad >= 18);
            System.out.println(nombre + " tiene " + edad + " años y es " + (mayor ? "mayor" : "menor") + " de edad.");

            System.out.println("¿Desea ingresar más personas? (Sí/No)");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("No"));
    }

}
