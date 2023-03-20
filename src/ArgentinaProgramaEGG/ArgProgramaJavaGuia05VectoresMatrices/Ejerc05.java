package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices;

import java.util.Scanner;

public class Ejerc05 {
    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz: ");
        int n = leer.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        //Mostrar matriz
        System.out.println("Matriz 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
        }
        //Mostrar traspuesta
        System.out.println("Matriz 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" "+matriz[j][i]);
            }
            System.out.println("");
        }

        boolean esAntisimetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }

        if (esAntisimetrica) {
            System.out.println("La matriz ES antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }
    }
}
