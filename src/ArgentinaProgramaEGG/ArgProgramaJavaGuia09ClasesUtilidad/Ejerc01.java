package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Cadena;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.CadenaServicio;

import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio servicio = new CadenaServicio();
        Cadena cadena = new Cadena("La casa de la abuela");
        int menu;
        do {
            System.out.println("1. Mostrar vocales");
            System.out.println("2. Comparar Longitudes");
            System.out.println("3. Invertir Frase");
            System.out.println("4. Veces Repetido");
            System.out.println("5. Unir Frases");
            System.out.println("6. Reemplazar letra");
            System.out.println("7. Ver si contiene X letra");
            System.out.println("8. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicio.mostrarVocales(cadena);
                    break;
                case 2:
                    servicio.compararLongitud(cadena);
                    break;
                case 3:
                    servicio.invertirFrase(cadena);
                    break;
                case 4:
                    servicio.vecesRepetido(cadena);
                    break;
                case 5:
                    servicio.unirFrases(cadena);
                    break;
                case 6:
                    servicio.reemplazar(cadena);
                    break;
                case 7:
                    servicio.contiene(cadena);
                    break;
                case 8:
                    System.out.println("Saliendo....");
                    break;
                default:
                    break;
            }
        } while (menu != 8);


    }
}
