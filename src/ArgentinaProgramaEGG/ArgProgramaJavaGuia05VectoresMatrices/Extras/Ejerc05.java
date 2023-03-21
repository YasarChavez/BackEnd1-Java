package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices.Extras;

import java.util.Random;
import java.util.Scanner;

public class Ejerc05 {
    public static void main(String[] args) {
        /*Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cant de filas:");
        int n = leer.nextInt();
        System.out.println("Ingrese cant de columnas:");
        int m = leer.nextInt();
        int[][] matriz = new int[n][m];
        int sumaMatriz = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int) (Math.random()*(10-1)+1);
                sumaMatriz=sumaMatriz+matriz[i][j];

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            }
            System.out.println("");
        }
        System.out.println("Suma de los elementos: "+ sumaMatriz);
    }
}
