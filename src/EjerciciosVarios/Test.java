package EjerciciosVarios;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[3][3];
//        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + "" + j);
                String palabra = leer.next();
                matriz[i][j] = palabra.substring(0, 1);
//                matriz[i][j]= String.valueOf(palabra.charAt(0));
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matriz[i][j] = leer.nextInt();
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(matriz[i][j]);
//            }
//            System.out.println("");
//        }

    }
}
