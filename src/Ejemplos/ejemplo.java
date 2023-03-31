package Ejemplos;

import java.util.Scanner;


public class ejemplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = leer.nextLine();
        System.out.println("Hola " + nombre+" "+apellido);
        //TODO borrar este comentario.
    }
}