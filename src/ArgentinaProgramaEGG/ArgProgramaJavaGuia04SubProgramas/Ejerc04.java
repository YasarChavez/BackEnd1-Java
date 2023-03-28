package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas;

import java.util.Scanner;

public class Ejerc04 {
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver si es primo:");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
    }

    public static boolean esPrimo(int numero) {
        // Comprobamos si el número es 2 o 3, que son primos
        if (numero == 2 || numero == 3) {
            return true;
        }
        // Si el número es 1 o un número par mayor que 2, no es primo
        if (numero == 1 || numero % 2 == 0) {
            return false;
        }
        // Iteramos sobre los números impares desde 3 hasta la mitad del número
        for (int i = 3; i <= numero / 2; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        // Si no hemos encontrado ningún divisor, el número es primo
        return true;
    }

}
