package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {
    /*Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
*/
    public CuentaBancaria crearCuenta() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("**CREANCION DE CUENTAS**");
        System.out.println();
        System.out.println("Ingrese Numero de la Cuenta:");
        int numeroCuenta=leer.nextInt();
        System.out.println("Ingrese DNI del cliente:");
        long dniCliente=leer.nextLong();
        System.out.println("Saldo actual de la cuenta:");
        double saldoActual = leer.nextDouble();
        return  new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dinero a ingresar:");
        double dinero = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual()+dinero);
    }

    public void retirar(CuentaBancaria cuenta){
        Scanner leer = new Scanner(System.in);
        /*recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
        System.out.println("Cuanto desea retirar?:");
        double dinero = leer.nextDouble();
        if (dinero > cuenta.getSaldoActual()){
            System.out.println("La cantidad ingresada excede el saldo actual");
            System.out.println("Se retiraron:");
            System.out.println(cuenta.getSaldoActual());;
            cuenta.setSaldoActual(0);
        }else {
            System.out.println("Se retiraron $"+dinero+" de su cuenta");
            cuenta.setSaldoActual(cuenta.getSaldoActual()-dinero);
        }
//
    }
    public void extraccionRapida(CuentaBancaria cuenta){
        Scanner leer = new Scanner(System.in);
        /*le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.*/
        double maximoRetirar= cuenta.getSaldoActual()*0.2;
        System.out.println("Cuanto dinero quiere retirar de manera RAPIDA?:");
        double dinero = leer.nextDouble();
        if (dinero>maximoRetirar){
            System.out.println("Su retiro excede el maximo disponible para la operacion.");
        }else {
            cuenta.setSaldoActual(cuenta.getSaldoActual()-dinero);
        }

    }
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Saldo actual: "+cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Numero de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("DNI Cliente: "+cuenta.getDniCliente());
        System.out.println("Saldo disponible: "+cuenta.getSaldoActual());
    }
}
