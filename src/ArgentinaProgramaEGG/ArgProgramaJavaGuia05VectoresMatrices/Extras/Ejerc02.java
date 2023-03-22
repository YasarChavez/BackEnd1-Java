package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices.Extras;

import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales
        (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores:");
        int n = leer.nextInt();
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        System.out.println("Ingrese los valores del vector 1:");
        for (int i = 0; i < n; i++) {
            v1[i] = leer.nextInt();
        }
        System.out.println("Ingrese los valores del vector 2:");
        for (int i = 0; i < n; i++) {
            v2[i] = leer.nextInt();
        }
        //Comparar Vectores
        boolean sonIguales = true;
        for (int i = 0; i < n; i++) {
            if (v1[i]!=v2[i]) {
                System.out.println("Los vectores NO son iguales!X!");
                sonIguales = false;
                break;
            }
        }
        if (sonIguales){
            System.out.println("Los vectores son iguales!Y!");
        }
    }
}
