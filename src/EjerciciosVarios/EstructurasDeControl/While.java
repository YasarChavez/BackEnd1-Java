package EjerciciosVarios.EstructurasDeControl;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*Crear un programa que mientras el numero ingresado sea menor a 10 nos los muestre por pantalla*/

        Scanner leer = new Scanner(System.in);
        int num = 0;

        while (num < 10) {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            if (num < 10){
            System.out.println(num);}
        }
    }
}