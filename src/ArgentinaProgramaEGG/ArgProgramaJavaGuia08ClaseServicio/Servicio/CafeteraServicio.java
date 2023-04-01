package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.Cafetera;

import java.util.Scanner;

public class CafeteraServicio {
                /*Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
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
    public int llenarCafetera(Cafetera cafetera){
        return cafetera.getCapacidadMaxima();
    }

    public void servirTaza(Cafetera cafetera){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza en ml:");
        int taza = leer.nextInt();
        if (taza>cafetera.getCantidadActual()){
            System.out.print("No había suficiente cafe en la cafetera para llenar la taza, se pudo llenar : "+ cafetera.getCantidadActual());
            System.out.println(" ml.");
            cafetera.setCantidadActual(0);
        }else {
            System.out.println("Se llenó la taza.");
            cafetera.setCantidadActual(cafetera.getCantidadActual()-taza);
        }
    }

    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de café a agregar:  (en ml)");
        int cafe = leer.nextInt();
        int restante = cafetera.getCapacidadMaxima()-cafetera.getCantidadActual();
        if (cafe<=restante){
            cafetera.setCantidadActual(cafetera.getCantidadActual()+cafe);
        }else {
            System.out.println("La cantidad que quiso agregar excede la capacidad de la cafetera.");
        }

    }

}
