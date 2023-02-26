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

        int calificacion;

        System.out.println("Ingresá la calificación que le das a la ultima pelicula que viste: (del 1 al 5)");
        calificacion = leer.nextInt();

        switch (calificacion) {
            case 1:
                System.out.println("Fue tan mala?");
                break;
            case 2:
                System.out.println("Pudo ser peor no?");
                break;
            case 3:
                System.out.println("Bueno, digamos que fue meeh xD");
                break;
            case 4:
                System.out.println("Entonces estaba para pasar el rato almenos");
                break;
            case 5:
                System.out.println("Que bueno que la disfrutaras tanto!");
                break;
            default:
                System.out.println("Calificacion incorrecta, hasta pronto.");
        }
        /* OTRO TIPO DE SWITCH
        switch (calificacion) {
            case 1 -> System.out.println("Fue tan mala?");
            case 2 -> System.out.println("Pudo ser peor no?");
            case 3 -> System.out.println("Bueno, digamos que fue meeh xD");
            case 4 -> System.out.println("Entonces estaba para pasar el rato almenos");
            case 5 -> System.out.println("Que bueno que la disfrutaras tanto!");
            default -> System.out.println("Calificacion incorrecta, hasta pronto.");
        }*/

    }
}
