package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices;

import java.util.Scanner;

public class Ejerc06 {
    public static void main(String[] args) {
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/
//Diagonal inversa si i+j=m-1 Entonces
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumadiag1 = 0;

        //Llenar matriz
        System.out.println("Ingrese 9 numeros del 1 al 9:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese posición : " + i + "," + j);
                int n = leer.nextInt();
                if (n>0 && n<10) {
                    matriz[i][j] = n;
                } else {
                    System.out.println("Numero incorrecto, ingrese nuevamente...");
                    j--;
                }
            }
        }

        //Imprimir matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        //Recorrer Matriz

        System.out.println("Suma diagonal 1: "+ sumadiag1);
    }
    public static int sumarDiagonal1(int a){
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if ()
            }
        }

    }
}
