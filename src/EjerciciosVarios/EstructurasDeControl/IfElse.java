package EjerciciosVarios.EstructurasDeControl;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*Crear un algoritmo que lea un numero y diga si es par o impar y tambien si es o no multiplo de 5*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();

        ///Vemos si es Par o Impar
        if (num % 2 == 0) {
            System.out.println("Es par!");
        } else if (num % 2 != 0) {
            System.out.println("Es impar!");
        }

        ///Vemos si es o no multiplo de 5
        if (num % 5 == 0) {
            System.out.println("Es multiplo de 5");
        } else if (num % 5 != 0) {
            System.out.println("No es multiplo de 5");
        }

    }
}
