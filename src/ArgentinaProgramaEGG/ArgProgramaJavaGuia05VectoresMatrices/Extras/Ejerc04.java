package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices.Extras;

import java.util.Scanner;

public class Ejerc04 {
    public static void main(String[] args) {
//Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
//adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
//Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
//Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores
//necesitan obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
//con promedio mayor o igual al 7 de sus notas del curso.

        Scanner leer = new Scanner(System.in);
        int n = 2; //Tamaño
        double[] alumnos = new double[n];

        pedirnotas(alumnos, n);

        mostrarpromedios(alumnos, n);

        aproNoApro(alumnos, n);


    }

    public static void pedirnotas(double[] alumnos, int n) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Alumno: " + (i + 1));
            System.out.println("Nota Primer trabajo:");
            double n1 = leer.nextInt();
            n1 = n1 * 0.1;
            System.out.println("Nota Segundo trabajo:");
            double n2 = leer.nextInt();
            n2 = n2 * 0.15;
            System.out.println("Nota Primer integrador:");
            double n3 = leer.nextInt();
            n3 = n3 * 0.25;
            System.out.println("Nota Segundo integrador:");
            double n4 = leer.nextInt();
            n4 = n4 * 0.5;
            double promedio = n1 + n2 + n3 + n4;
            alumnos[i] = promedio;
        }
    }
    public static void mostrarpromedios(double[] alumnos, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Promedio alum " + (i + 1) + ": " + alumnos[i]);
        }
    }
    public static void aproNoApro(double[] alumnos, int n) {
        int apro = 0;
        int noapro = 0;
        for (int i = 0; i < n; i++) {
            if (alumnos[i] >= 7) {
                apro++;
            } else {
                noapro++;
            }
        }
        System.out.println("Aprobados: " + apro);
        System.out.println("No Aprobados:" + noapro);
    }
}
