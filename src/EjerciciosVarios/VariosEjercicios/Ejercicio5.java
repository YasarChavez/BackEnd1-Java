package EjerciciosVarios.VariosEjercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    //Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
        Scanner leer = new Scanner(System.in);
        boolean bandera;
        double numero;
        String letra;
        System.out.println("Ingrese un valor tipo boolean:");
        bandera = Boolean.parseBoolean(leer.next());
        System.out.println("Ingrese un valor tipo double:");
        numero = Double.parseDouble(leer.next());
        System.out.println("Ingrese un valor tipo char:");
        letra = leer.next();
        System.out.println(bandera);
        System.out.println(numero);
        System.out.println(letra);



    }
}
