package ArgProgramaJavaGuia03.extras;

import javax.swing.*;

public class Ejerc14 {
    public static void main(String[] args) {
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
        Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar
        la media de edad de los hijos de todas las familias.
        */
        int cantidadFamilias = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cant de familias:"));
        int cantidadHijos;
        int edadHijo;
        float promedioEdadHijos;
        for (int i = 0; i < cantidadFamilias; i++) {
            cantidadHijos = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuántos hijos tiene la familia " + (i+1)+"?"));
            promedioEdadHijos = 0;
            for (int j = 0; j < cantidadHijos; j++) {
                edadHijo = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es la edad del hijo N°"+ (j + 1)));
                promedioEdadHijos += edadHijo;
            }
            promedioEdadHijos /= cantidadHijos;
            System.out.println("El promedio de la edad de los hijos de la familia " + (i + 1) + " es de " + promedioEdadHijos);
        }
    }
}
