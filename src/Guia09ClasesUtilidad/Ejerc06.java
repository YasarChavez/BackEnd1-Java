package Guia09ClasesUtilidad;

import Guia09ClasesUtilidad.Entidades.Curso;
import Guia09ClasesUtilidad.Servicios.CursoService;

public class Ejerc06 {
    public static void main(String[] args) {
        CursoService service = new CursoService();
        Curso grupo1 = service.crearCurso();
        service.resumenCurso(grupo1);
    }
}
