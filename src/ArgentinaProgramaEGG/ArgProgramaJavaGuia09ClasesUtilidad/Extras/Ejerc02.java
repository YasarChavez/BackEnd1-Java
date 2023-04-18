package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Extras;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Ahorcado;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.AhorcadoService;

import java.util.Arrays;

public class Ejerc02 {
    public static void main(String[] args) {
        AhorcadoService service = new AhorcadoService();
        Ahorcado juego1 = service.crearJuego();

        do {
            service.juego(juego1);
        }while (juego1.getJugadasMax()!=0 && juego1.getLetrasEncontradas()!=juego1.getLongitud());

    }
}
