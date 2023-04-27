package Guia07POO.Extras.entidades;

import java.util.Scanner;

/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la
cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta:{" +
                "Titular='" + titular + '\'' +
                ", Saldo=" + saldo +
                '}';
    }

    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);
        Cuenta nuevaCuenta = new Cuenta();
        System.out.println("Titular:");
        nuevaCuenta.setTitular(leer.nextLine());
        System.out.println("Saldo:");
        nuevaCuenta.setSaldo(leer.nextDouble());
        return nuevaCuenta;
    }

    public void retirarDinero(Cuenta cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto desea retirar?");
        double retiro = leer.nextDouble();
        if (cuenta.getSaldo() < retiro) {
            System.out.println("No es posible retirar esa cantidad!");
        } else {
            cuenta.setSaldo(saldo - retiro);
        }
    }
}
