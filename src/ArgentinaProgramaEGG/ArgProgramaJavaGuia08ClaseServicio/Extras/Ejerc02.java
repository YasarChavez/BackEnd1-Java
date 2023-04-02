package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Extras;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.NIF;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio.NIFService;

public class Ejerc02 {
    public static void main(String[] args) {
        NIFService service = new NIFService();
        NIF nif1 = service.crearNif();
        service.mostrar(nif1);

    }
}
