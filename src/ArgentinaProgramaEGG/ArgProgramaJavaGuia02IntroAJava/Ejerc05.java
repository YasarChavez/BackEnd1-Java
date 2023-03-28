package ArgentinaProgramaEGG.ArgProgramaJavaGuia02IntroAJava;

import java.util.Scanner;

public class Ejerc05 {
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt(). */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " es: " + (num * 2));
        System.out.println("El triple de " + num + " es: " + (num * 3));
        System.out.println("La raíz cuadrada de " + num + " es: " + Math.sqrt(num));
        //hola chicos
    }
}
