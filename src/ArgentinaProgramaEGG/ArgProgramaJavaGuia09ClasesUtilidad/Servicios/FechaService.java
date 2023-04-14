package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento(){
        System.out.println("Ingrese fecha de nacimiento:");
        System.out.println("Ingrese dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes:");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese año:");
        int anio = leer.nextInt()-1900;

        return new Date(anio,mes,dia);
    }

    public Date fechaActual(){
        /*que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();*/
        Date fechaActual = new Date();
        return fechaActual;
    }
    public void diferencia(Date fecha1, Date fecha2){
        /*que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).*/
        System.out.println("Diferencia:");
        System.out.print(fecha1.getDate()-fecha2.getDate()+" Dias ");
        System.out.print(fecha1.getMonth()-fecha2.getMonth()+" Mes/es ");
        System.out.println((fecha1.getYear()-fecha2.getYear())*-1+" Años");

    }
}
