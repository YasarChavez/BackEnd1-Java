package ArgentinaProgramaEGG.ArgProgramaJavaGuia03EstDeControl;

import java.util.Scanner;

public class Ejerc04 {
    public static void main(String[] args) {
        /*Escriba un programa que pida una frase o palabra y valide si la primera
        letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
        imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
        contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
        Substring y equals() de Java.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String frase = leer.nextLine();


        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }

    }
}
