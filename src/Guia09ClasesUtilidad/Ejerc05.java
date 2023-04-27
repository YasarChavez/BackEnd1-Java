package Guia09ClasesUtilidad;

import Guia09ClasesUtilidad.Entidades.Persona;
import Guia09ClasesUtilidad.Servicios.PersonaService;

public class Ejerc05 {
    public static void main(String[] args) {
        PersonaService service = new PersonaService();
        Persona persona = service.crearPersona();
        service.mostrarPersona(persona);


    }
}
