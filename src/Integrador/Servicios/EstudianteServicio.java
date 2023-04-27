package Integrador.Servicios;

import Integrador.Entidades.Estudiante;

import java.util.Random;
import java.util.Scanner;

public class EstudianteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante cargarEstudiantes(Estudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
            estudianteObj[i] = new Estudiante();
            Random r = new Random();
            System.out.println("Ingrese el nombre del estudiante numero " + (i + 1) + ":");
            estudianteObj[i].setNombre(leer.next());
//            leer.nextLine();
            System.out.println("Nota del estudiante:");
//            estudianteObj[i].setNota(leer.nextFloat());
            estudianteObj[i].setNota(r.nextFloat(4, 10));
            System.out.println(estudianteObj[i].getNota());
            System.out.println();
        }
        return new Estudiante();
    }

    public void mostrarEstudiantes(Estudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
//            System.out.println(estudianteObj[i].toString());
            System.out.println("Nombre :" + estudianteObj[i].getNombre() + "  |  Nota: " + estudianteObj[i].getNota());
        }
    }

    public double calcularPromedio(Estudiante[] estudianteObj) {
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < estudianteObj.length; i++) {
            suma += estudianteObj[i].getNota();
        }
        promedio = suma / estudianteObj.length;

        return promedio;
    }

    //Retornar otro arreglo con los nombres de los alumnos que recibieron una nota mayor al promedio del curso
    public String[] obtenerAlumnosNotaMayorPromedio(Estudiante[] estudianteObj) {
        int cont = 0;
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > calcularPromedio(estudianteObj)) {
                cont++;
            }
        }
        String[] alumnos = new String[cont];
        int j = 0;
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > calcularPromedio(estudianteObj)) {
                alumnos[j] = estudianteObj[i].getNombre();
                j++;
            }
        }
        return alumnos;
    }

    //Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
    public void mostrarAlumnosNotaMayorPromedio(Estudiante[] estudianteObj) {
        for (int i = 0; i < estudianteObj.length; i++) {
            if (estudianteObj[i].getNota() > calcularPromedio(estudianteObj)) {
                System.out.println(estudianteObj[i].getNombre() + ", " + estudianteObj[i].getNota());
            }
        }
    }

}
