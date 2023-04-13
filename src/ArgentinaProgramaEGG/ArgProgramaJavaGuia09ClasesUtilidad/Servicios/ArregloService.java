package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios;

import java.util.Arrays;

public class ArregloService {
    public void inicializarA(double[] arregloA) {
        /*recibe un arreglo por parámetro y lo inicializa con números aleatorios.*/
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (int) (Math.random() * (100 - 1 + 1)) + 1;
        }

    }

    public void mostrar(double[] arregloX) {
        /*recibe un arreglo por parámetro y lo muestra por pantalla.*/
        for (double i : arregloX) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public void ordenar(double[] arregloX) {
        /*recibe un arreglo por parámetro y lo ordena de mayor a menor.*/
        Arrays.sort(arregloX);
        int[] arregloInv = new int[arregloX.length];
        for (int i = 0; i < arregloX.length / 2; i++) {
            double temp = arregloX[i];
            arregloX[i] = arregloX[arregloX.length - 1 - i];
            arregloX[arregloX.length - 1 - i] = temp;
        }
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        /*copia los primeros 10 números del arreglo A en el
        arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
//        Arrays.fill(arregloB,10,19,0.5);
        Arrays.fill(arregloB, 10, 20, 0.5);

    }
}
