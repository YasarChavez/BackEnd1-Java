package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.Persona;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio.PersonaServicio;


/*Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.*/

public class Ejerc03 {
    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();

        Persona persona1 = servicio.crearPersona();
        System.out.println(servicio.calcularIMC(persona1));
        System.out.println(servicio.esMayorDeEdad(persona1));

        Persona persona2 = servicio.crearPersona();
        System.out.println(servicio.calcularIMC(persona2));
        System.out.println(servicio.esMayorDeEdad(persona2));

        Persona persona3 = servicio.crearPersona();
        System.out.println(servicio.calcularIMC(persona3));
        System.out.println(servicio.esMayorDeEdad(persona3));

        Persona persona4 = servicio.crearPersona();
        System.out.println(servicio.calcularIMC(persona4));
        System.out.println(servicio.esMayorDeEdad(persona4));




    }

}
