package EjerciciosVarios.VariosEjercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por
        //pantalla
        Scanner leer = new Scanner(System.in);


        System.out.println("Ingresa tu nombre:");
        String nombre = leer.next(); //Definimos nombre y decimos que va a ser el valor leido con "scanner leer".
        System.out.println("Ingresa tu edad:");
        int edad = Integer.parseInt(leer.next());//Lo mismo para la edad "Integer.parseInt" guarda el valor como entero en lugar de texto.
        System.out.println("Bienvenido " + nombre + ", veo que tienes " + edad + " años.");

    }
}
