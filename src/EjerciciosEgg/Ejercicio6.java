package EjerciciosEgg;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
        //alguno de ellos es mayor a 25.

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros:");

        int n1 = leer.nextInt();
        int n2 = leer.nextInt();

        if (n1 > 26 && n2 > 26) {
            System.out.println("Ambos son mayores a 26!");
        } else if (n1 > 26) {
            System.out.println(n1 + " es mayor a 26.");
        } else if (n2 > 26) {
            System.out.println(n2 + " es mayor a 26.");
        } else if (n1 < 26 && n2 < 26) {
            System.out.println("Ambos numeros son menores que 26!!!");
        }

    }
}
