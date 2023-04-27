package Guia08ClaseServicio;

import Guia08ClaseServicio.Entidades.Cafetera;
import Guia08ClaseServicio.Servicio.CafeteraServicio;

import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
        /*Programa Nespresso. Desarrolle una clase Cafetera en el paquete
ArgProgramaJavaGuia09ClasesUtilidad.Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
*/
        Scanner leer = new Scanner(System.in);
        CafeteraServicio servicio = new CafeteraServicio();
        Cafetera cafetera = new Cafetera(6000, 2500);


        int menu = -1;
        do {
            System.out.println();
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar Café");
            System.out.println("5. Estado actual de la cafetera");
            System.out.println("6. SALIR");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    cafetera.setCantidadActual(servicio.llenarCafetera(cafetera));
                    break;
                case 2:
                    servicio.servirTaza(cafetera);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafetera);
                    break;
                case 4:
                    servicio.agregarCafe(cafetera);
                    break;
                case 5:
                    System.out.println("Capacidad maxima: " + cafetera.getCapacidadMaxima());
                    System.out.println("Cantidad actual: " + cafetera.getCantidadActual());
                    break;
                case 6:
                    break;
            }
        } while (menu != 6);
    }
}
