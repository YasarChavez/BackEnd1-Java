package ArgentinaProgramaEGG.ArgProgramaJavaGuia02;

import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre;
        nombre = leer.next();
        System.out.println("Hola "+nombre+"!");
    }
}
