package ArgProgramaJavaGuia03.extras;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
        ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
        equivalente: 1 día, 2 horas.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en minutos: ");

        int minutos = leer.nextInt();

        int dias = minutos / (24 * 60); // 1 día tiene 24 horas y cada hora tiene 60 minutos
        int horas = (minutos % (24 * 60)) / 60; // El resto de minutos que no forman días se divide entre 60 para obtener las horas restantes

        System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
    }
}
