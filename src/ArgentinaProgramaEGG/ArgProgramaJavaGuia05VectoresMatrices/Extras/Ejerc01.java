package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices.Extras;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
        con los valores ingresados por el usuario. */
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.print("Ingrese el tamaño del vector:");
        int n = leer.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese los valores del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("Suma del vector: " + suma);
    }
}
