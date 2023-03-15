package ArgentinaProgramaEGG.ArgProgramaJavaGuia03.extras;

import javax.swing.*;

public class Ejerc10 {
    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación
        entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar
        al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta
        se debe permitir al usuario ingresar su respuesta nuevamente.
        Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.*/

        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        int rto = n1 * n2;
        System.out.println("Numero 1: " + n1);
        System.out.println("Numero 2: " + n2);
        System.out.println("Resultado: " + rto);
        JOptionPane.showMessageDialog(null, "Vamos a jugar un juego!");
        JOptionPane.showMessageDialog(null, "Adivinar el resultado de la multiplicacion de dos numeros entre 0 y 10.");

        do {
            int rta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el resultado de la multiplicacion:"));
            if (rta == rto) {
                JOptionPane.showMessageDialog(null, "Adivinaste!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Ese no es el resultado, vamos nuevamente...");
            }
        } while (true);


    }
}
