package Guia08ClaseServicio.Extras;

import Guia08ClaseServicio.Entidades.NIF;
import Guia08ClaseServicio.Servicio.NIFService;

public class Ejerc02 {
    public static void main(String[] args) {
        NIFService service = new NIFService();
        NIF nif1 = service.crearNif();
        service.mostrar(nif1);
    }
}
