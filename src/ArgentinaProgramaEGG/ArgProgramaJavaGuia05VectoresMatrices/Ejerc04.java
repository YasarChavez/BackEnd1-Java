package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices;

public class Ejerc04 {
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).*/
        int[][] matriz1 = new int[4][4];
        //Llenamos matriz1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = (int) (Math.random() * (10 - 1)) + 1;
            }
        }
        //Mostramos matriz1
        System.out.println("Matriz 1");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz1[i][j]);
            }
            System.out.println("");
        }
        //Mostramos matriz2
        System.out.println("Matriz 2");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz1[j][i]);
            }
            System.out.println("");
        }


    }
}
