package Guia09ClasesUtilidad.Extras2;

import Guia09ClasesUtilidad.Entidades.Fracciones;
import Guia09ClasesUtilidad.Servicios.FraccionesService;

public class Ejerc01 {
    public static void main(String[] args) {
        FraccionesService service = new FraccionesService();
        //1/4 - 2/3
        Fracciones fraccionesObj = new Fracciones(1, 4, 2, 3);
        service.sumarFracciones(fraccionesObj);
        service.restaFracciones(fraccionesObj);
        service.multFracciones(fraccionesObj);
        service.divFracciones(fraccionesObj);
    }
}
