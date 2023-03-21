package EjerciciosVarios;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                String palabra = leer.nextLine();
                matriz[i][j]= palabra.substring(i,j);
            }
            System.out.println("");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
