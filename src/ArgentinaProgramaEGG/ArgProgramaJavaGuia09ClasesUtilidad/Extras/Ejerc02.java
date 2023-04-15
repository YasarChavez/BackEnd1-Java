package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Extras;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Ahorcado;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.AhorcadoService;

import java.util.Arrays;

public class Ejerc02 {
    public static void main(String[] args) {
        AhorcadoService service = new AhorcadoService();
        Ahorcado juego1 = service.crearJuego();
        System.out.println(juego1);
        AhorcadoService.longitud(juego1);


        System.out.println(Arrays.toString(juego1.getPalabra()));
        service.buscar(juego1,"a");

    }
}
