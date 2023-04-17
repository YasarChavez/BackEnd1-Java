package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.FechaService;

import java.util.Date;

public class Ejerc04 {
    public static void main(String[] args) {
        FechaService service = new FechaService();

        Date fecha = service.fechaNacimiento();
        System.out.println(fecha);

        Date fechaActual = service.fechaActual();
        System.out.println(fechaActual);
        service.diferencia(fecha,fechaActual);
        System.out.println(service.diferencia2(fecha,fechaActual));
    }
}
