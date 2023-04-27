package Guia08ClaseServicio;

import Guia08ClaseServicio.Entidades.CuentaBancaria;
import Guia08ClaseServicio.Servicio.CuentaBancariaServicio;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Realizar una clase llamada CuentaBancaria en el paquete ArgProgramaJavaGuia09ClasesUtilidad.Entidades con
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
        Scanner leer = new Scanner(System.in);
        //Definimos Servicio para acceder a los metodos de la clase servicio
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        //Creamos cuenta
        CuentaBancaria cuenta = servicio.crearCuenta();

        int menu = -1;
        do {
            System.out.println();
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida (Max 20% del saldo)");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("0. SALIR");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicio.ingresar(cuenta);
                    break;
                case 2:
                    servicio.retirar(cuenta);
                    break;
                case 3:
                    servicio.extraccionRapida(cuenta);
                    break;
                case 4:
                    servicio.consultarSaldo(cuenta);
                    break;
                case 5:
                    servicio.consultarDatos(cuenta);
                    break;
                default:
            }
        } while (menu != 0);


    }
}
