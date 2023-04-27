package Guia09ClasesUtilidad.Extras2;

import Guia09ClasesUtilidad.Entidades.Tiempo;
import Guia09ClasesUtilidad.Servicios.TiempoService;

public class Ejerc02 {
    /*Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????*/
    public static void main(String[] args) {
        TiempoService service = new TiempoService();
        Tiempo t1 = TiempoService.crearTiempo();
        TiempoService.imprimirHoraCompleta(t1);

    }
}
