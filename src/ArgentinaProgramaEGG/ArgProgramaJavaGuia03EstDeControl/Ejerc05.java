package ArgentinaProgramaEGG.ArgProgramaJavaGuia03EstDeControl;

import java.util.Scanner;

public class Ejerc05 {
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a
        continuación solicite números al usuario hasta que la suma de los
        números introducidos supere el límite inicial.*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Defina el limite:");
        int limite = leer.nextInt();
        int suma = 0;

        System.out.println("Ingrese numeros para sumar hasta llegar al limite:");

        do {
            suma = suma + leer.nextInt();
        } while (suma <= limite);

        System.out.println("Se pasó del limite!");
        System.out.println("Total de la suma: " + suma);
        System.out.println("Se pasó por : " + (suma - limite));

    }
}
