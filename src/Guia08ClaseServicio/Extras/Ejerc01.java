package Guia08ClaseServicio.Extras;

import Guia08ClaseServicio.Entidades.Raices;
import Guia08ClaseServicio.Servicio.RaicesServicio;

/*
double discriminante = Math.pow(b, 2) - 4 * a * c;
if (discriminante < 0) {
    // La ecuación no tiene raíces reales
} else if (discriminante == 0) {
    // La ecuación tiene una única raíz real
    double raiz = -b / (2 * a);
} else {
    // La ecuación tiene dos raíces reales
    double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
    double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
}
*/
public class Ejerc01 {
    public static void main(String[] args) {
        RaicesServicio servicio = new RaicesServicio();
//        Raices raices = new Raices(2, 5, -3);
//        Raices raices = new Raices(6, 10, -1);
        Raices raices = new Raices(3, 2, 1);
        servicio.calcular(raices);

    }
}
