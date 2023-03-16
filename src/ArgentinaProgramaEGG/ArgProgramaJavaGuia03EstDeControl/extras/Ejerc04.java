package ArgentinaProgramaEGG.ArgProgramaJavaGuia03EstDeControl.extras;

import java.util.Scanner;

public class Ejerc04 {
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
muestre su equivalente en romano.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 10: ");
        int numero = leer.nextInt();

        if (numero >= 1 && numero <= 10) {
            if (numero==1){
                System.out.println("I");
            } else if (numero==2) {
                System.out.println("II");
            } else if (numero==3) {
                System.out.println("III");
            } else if (numero==4) {
                System.out.println("IV");
            } else if (numero==5) {
                System.out.println("V");
            } else if (numero==6) {
                System.out.println("VI");
            } else if (numero==7) {
                System.out.println("VII");
            } else if (numero==8) {
                System.out.println("VIII");
            } else if (numero==9) {
                System.out.println("IX");
            } else if (numero==10) {
                System.out.println("X");
            }
        }

    }
}
