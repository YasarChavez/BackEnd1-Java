package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        /*que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.*/
        System.out.println("Ingrese el nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese fecha de nacimiento aaaa/mm/dd");
        int anio = leer.nextInt() - 1900;
        int mes = leer.nextInt() - 1;
        int dia = leer.nextInt();
        Date fechaNacimiendo = new Date(anio, mes, dia);
        return new Persona(nombre, fechaNacimiendo);
    }

    public int calcularEdad(Persona persona) {
        /*que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.*/
        Date fechaNacimiento = persona.getFechaNacimiento();
        Date fechaActual = new Date();
//        System.out.println(Math.abs(fechaActual.getYear()-persona.getFechaNacimiento().getYear())+" Años");
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() ||
                (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }

    public boolean menorQue(Persona persona, int edad) {
        /*Recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.*/
        return calcularEdad(persona) < edad;
    }

    public void mostrarPersona(Persona persona) {
        /*que muestra la información de la persona
deseada.*/
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad:");
        System.out.println(calcularEdad(persona));
        System.out.println("Ingrese una edad para ver si es menor de dicha edad:");
        int edadX = leer.nextInt();
        System.out.println(menorQue(persona, edadX));


    }
}
