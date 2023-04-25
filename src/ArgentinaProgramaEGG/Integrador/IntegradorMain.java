package ArgentinaProgramaEGG.Integrador;

import ArgentinaProgramaEGG.Integrador.Entidades.Estudiante;
import ArgentinaProgramaEGG.Integrador.Servicios.EstudianteServicio;

import java.util.Arrays;

public class IntegradorMain {
    public static void main(String[] args) {

        EstudianteServicio servicio = new EstudianteServicio();
        Estudiante[] estudianteObj = new Estudiante[8];

        //Cargar alumnos
        servicio.cargarEstudiantes(estudianteObj);
        //Mostrar alumnos
        System.out.println("Alumnos: ");
        servicio.mostrarEstudiantes(estudianteObj);
        System.out.println();
        //Calcular promedio
        System.out.println("Promedio: " + servicio.calcularPromedio(estudianteObj));
        //Obtener alumnos con mayor promedio
        servicio.obtenerAlumnosNotaMayorPromedio(estudianteObj);
        String[] alumnos = servicio.obtenerAlumnosNotaMayorPromedio(estudianteObj);
        //Mostrar alumnos
        System.out.println();
        System.out.println("Alumnos con nota mayor al promedio: ");
        System.out.println(Arrays.toString(alumnos));
        //Mostrar alumnos con nota mayor al promedio
        System.out.println();
        System.out.println("Nombre y Nota:");
        servicio.mostrarAlumnosNotaMayorPromedio(estudianteObj);
    }
}
