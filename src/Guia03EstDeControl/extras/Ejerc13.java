package Guia03EstDeControl.extras;

import javax.swing.*;

public class Ejerc13 {
    public static void main(String[] args) {
/*Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la escalera"));

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
