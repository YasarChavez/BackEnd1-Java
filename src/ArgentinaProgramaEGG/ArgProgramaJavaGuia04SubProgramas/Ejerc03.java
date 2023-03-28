package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros:");
        int euros = leer.nextInt();

        System.out.println("Ingrese la moneda a convertir:");
        System.out.println("L. Libra");
        System.out.println("S. Dolares");
        System.out.println("Y. Yenes");

        String moneda = leer.next();
        conversor(euros, moneda);
    }

    public static void conversor(int n, String m) {
        m = m.toUpperCase();
        switch (m) {
            case "L":
                System.out.println(0.86 * n);
                break;
            case "S":
                System.out.println(1.28611 * n);
                break;
            case "Y":
                System.out.println(129.852 * n);
                break;
        }
    }
}
