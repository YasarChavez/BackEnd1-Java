package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.ArregloService;

import java.util.Arrays;
import java.util.Random;

public class Ejerc03 {
    public static void main(String[] args) {
        ArregloService service = new ArregloService();
/*Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
*/
        double[] arregloA = new double[10];
        double[] arregloB = new double[20];

        service.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        service.mostrar(arregloA);
        System.out.println();
        System.out.println("Arreglo A de mayor a menor:");
        service.ordenar(arregloA);
        service.mostrar(arregloA);
        System.out.println();
        System.out.println("Arreglo B:");
        service.inicializarB(arregloA, arregloB);
        service.mostrar(arregloB);


    }
}
