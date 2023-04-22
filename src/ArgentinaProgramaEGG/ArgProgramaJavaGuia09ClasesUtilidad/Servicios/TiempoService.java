package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Tiempo;

import java.util.Scanner;

/*Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????*/
public class TiempoService {

    public static Tiempo crearTiempo(){
        Scanner leer = new Scanner(System.in);
        int hora=0;
        int minutos=0;
        int segundos=0;
        boolean valido=false;
        do {
            System.out.println("ingrese hora");
            int dato = leer.nextInt();
            if (dato < 0 || dato > 23){
                System.out.println("ingrese hora valida");
            }else {
                hora=dato;
                valido=true;
            }
        }while (valido==false);
        valido=false;
        do {
            System.out.println("ingrese minutos");
            int dato = leer.nextInt();
            if (dato < 0 || dato > 59){
                System.out.println("ingrese minutos valida");
            }else {
                minutos=dato;
                valido=true;
            }
        }while (valido==false);
        valido=false;
        do {
            System.out.println("ingrese segundos");
            int dato = leer.nextInt();
            if (dato < 0 || dato > 59){
                System.out.println("ingrese segundos valida");
            }else {
                segundos=dato;
                valido=true;
            }
        }while (valido==false);
        return new Tiempo(hora,minutos,segundos);
    }
    public static void imprimirHoraCompleta(Tiempo tiempo) {
        System.out.println("La hora es: "+tiempo.getHora()+":"+tiempo.getMinutos()+":"+tiempo.getSegundos());

    }
}

