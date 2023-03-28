package EjerciciosVarios.EstructurasDeControl.Arreglos;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo:" + " ");
        int n = leer.nextInt(); //Leemos tamaño
        int[] arreglo = new int[n];//Asignamos tamaño al arreglo

        //Llenamos el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print("Valor para I " + (i + 1) + ": ");
            int x = leer.nextInt();
            arreglo[i] = x;
        }
        //Mostramos el arreglo
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
