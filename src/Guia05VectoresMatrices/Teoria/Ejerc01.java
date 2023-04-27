package Guia05VectoresMatrices.Teoria;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cant de compañeros:");
        int n = leer.nextInt();
        n = n + 1;

        String[] equipo = new String[n];
        System.out.println("Ingrese los nombres:");

        for (int i = 0; i < n; i++) {
            equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(equipo[i]);
        }
    }
}
