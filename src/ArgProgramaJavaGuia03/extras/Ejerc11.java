package ArgProgramaJavaGuia03.extras;

import javax.swing.*;

public class Ejerc11 {
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos
        que componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
        Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
        Nota: recordar que las variables de tipo entero truncan los números o resultados.*/
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero:"));
        int cantidadDigitos = 0; // contador para la cantidad de dígitos

        while (numero != 0) {
            numero = numero / 10; // división sucesiva por 10
            cantidadDigitos++; // se incrementa el contador de dígitos
        }

        System.out.println("El número tiene " + cantidadDigitos + " dígitos.");
    }
}
