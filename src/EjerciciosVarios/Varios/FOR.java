package EjerciciosVarios.Varios;

import java.util.Scanner;

public class FOR {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                (matriz[x][y]) = (int) ((Math.random() * 9) + 1);
            }
        }
        for (int x = 0; x < matriz.length; x++) {
            System.out.println("");
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y]);
            }
        }
    }
}
