package EjerciciosVarios.Varios;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //Escribir "Fizz" cuando I sea multiplo de 3.
        //"Buzz" cuando sea multiplo de 5 y "FizzBuzz" cuando es multiplo de ambos.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el maximo de numeros a generar:");
        int num = leer.nextInt();
        //Mejoramos FizzBuzz
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else System.out.println(i);
        }
    }
}
