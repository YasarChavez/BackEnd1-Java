package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades;

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
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        Cuenta nuevaCuenta = new Cuenta();
        nuevaCuenta.setTitular(leer.nextLine());
        nuevaCuenta.setSaldo(leer.nextDouble());
        return nuevaCuenta;
    }
}