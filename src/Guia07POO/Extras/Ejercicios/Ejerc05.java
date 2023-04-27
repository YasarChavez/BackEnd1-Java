package Guia07POO.Extras.Ejercicios;

import Guia07POO.Extras.entidades.Cuenta;

import java.util.Scanner;

/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la
cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
public class Ejerc05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Crearemos una nueva cuenta:");
        Cuenta cuenta = new Cuenta().crearCuenta();
        System.out.println("Desea retirar dinero?  si/no");
        String rta = leer.next();
        if (rta.equalsIgnoreCase("si")) {
            cuenta.retirarDinero(cuenta);
            System.out.println(cuenta.toString());
        } else {
            System.out.println("Hasta pronto.");
        }

    }

}
