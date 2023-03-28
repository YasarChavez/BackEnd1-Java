package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices;

import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido*/
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = (int) (Math.random() * (10 - 1)) + 1;
        }
        System.out.println("Vector generado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + vector[i]);
        }
        System.out.println(" ");
        System.out.println("Ingrese un numero a buscar:");
        int num = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            if (vector[i] == num) {
                System.out.println("Pos: " + (i + 1));
                cont++;
            }

        }
        if (cont > 1) {
            System.out.println("Se encuentra repetido " + cont + " veces.");
        } else if (cont == 0) {
            System.out.println("Numero no encontrado.");
        }
    }
}
