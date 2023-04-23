package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Curso;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.CursoService;

public class Ejerc06 {
    public static void main(String[] args) {
        CursoService service = new CursoService();
        Curso grupo1 = service.crearCurso();
        service.resumenCurso(grupo1);
    }
}
