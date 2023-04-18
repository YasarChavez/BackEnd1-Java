package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Persona;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.PersonaService;

public class Ejerc05 {
    public static void main(String[] args) {
        PersonaService service = new PersonaService();
        Persona persona = service.crearPersona();
        service.mostrarPersona(persona);


    }
}
