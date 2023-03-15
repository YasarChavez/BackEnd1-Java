package ArgentinaProgramaEGG.ArgProgramaJavaGuia03.extras;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
        trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
        la función equals() de la clase String.*/

        Scanner leer = new Scanner(System.in);
        String letra;
        do {
            System.out.println("Ingrese una letra (' . ' para salir):");
            letra = leer.nextLine();
            if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
                System.out.println("Es una vocal!");
            }else {
                System.out.println("No es una vocal!");
            }
        }while (!letra.equals("."));


    }
}
