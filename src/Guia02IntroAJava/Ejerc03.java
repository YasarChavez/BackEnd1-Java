package Guia02IntroAJava;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase mezclando minúsculas y mayúsculas:");
        String frase;
        frase = leer.nextLine();
        String mayusculas = frase.toUpperCase();
        System.out.println(mayusculas);
        String minusculas = frase.toLowerCase();
        System.out.println(minusculas);

    }

}
