package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.*/
        int[] vector = new int[100];
        //Llenamos vector
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        //Imprimimos vector
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
