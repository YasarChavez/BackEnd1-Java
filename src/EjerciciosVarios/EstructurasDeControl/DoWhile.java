package EjerciciosVarios.EstructurasDeControl;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*Crear un programa que pida x cantidad de numeros al usuario, esa cantidad se pide al usuario, esos numeros
         * se suman en una variable y luego se muestra el total*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros se sumaran:");
        int numeros = leer.nextInt();
        int suma = 0;
        int contador = 1;


        System.out.println("Ingrese los " + numeros + " a sumar:");
        do {
            suma = suma + leer.nextInt();
            contador++;

        } while (contador <= numeros);


        System.out.println("Suma: " + suma);
    }
}
