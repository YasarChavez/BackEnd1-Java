package Guia05VectoresMatrices;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int nv = leer.nextInt();
        int[] vector = new int[nv];
        int[] vdigitos = new int[nv];
        int un = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;

        System.out.println("Ingrese los valores:");
        //Leemos numeros del vector
        for (int i = 0; i < nv; i++) {
            vector[i] = leer.nextInt();
        }
        //Guardamos Digitos en otro vector
        for (int i = 0; i < nv; i++) {
            vdigitos[i] = digitos(vector[i]);
        }
        //Mostramos vector Digitos
        for (int i = 0; i < nv; i++) {
            if (vdigitos[i] == 1) {
                un++;
            } else if (vdigitos[i] == 2) {
                dos++;
            } else if (vdigitos[i] == 3) {
                tres++;
            } else if (vdigitos[i] == 4) {
                cuatro++;
            } else if (vdigitos[i] == 5) {
                cinco++;
            }
        }
        System.out.println("Un digito: " + un);
        System.out.println("Dos digitos: " + dos);
        System.out.println("Tres digitos: " + tres);
        System.out.println("Cuatro digitos: " + cuatro);
        System.out.println("Cinco digitos: " + cinco);
    }

    public static int digitos(int a) {
        ///Contar cantidad de digitos
        int digitos = 0;
        while (a != 0) {
            a = a / 10;
            digitos++;
        }
        return digitos;
    }
}
