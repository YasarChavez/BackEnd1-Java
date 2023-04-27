package Guia02IntroAJava;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
            /*Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números por teclado:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("La suma de ambos números es: " + (num1 + num2));

    }
}
