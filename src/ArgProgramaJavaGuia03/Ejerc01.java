package ArgProgramaJavaGuia03;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Crear un programa que dado un número determine si es par o impar.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }
}
