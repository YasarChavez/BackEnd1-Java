package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
        bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
        resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        Nota: recordar el uso de la sentencia break.*/
        Scanner leer = new Scanner(System.in);

        int num = -1;
        int sum = 0;
        int cont = 0;
        System.out.println("Ingrese 20 numeros:");
        do {
            num = leer.nextInt();
            cont = cont + 1;
            if (num == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }
            if (num > 0) {
                sum = sum + num;
            }
        } while (cont < 20);//num != 0 &&
        System.out.println("Suma: " + sum);
    }
}
