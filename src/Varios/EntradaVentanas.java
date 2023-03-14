package Varios;

import javax.swing.*;

public class EntradaVentanas {
    public static void main(String[] args) {
        ///String
        String nombre;
        nombre = JOptionPane.showInputDialog(null,"Ingresa tu nombre:");
        JOptionPane.showMessageDialog(null, "Hola, "+nombre);

        ///INT
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero:"));
        JOptionPane.showMessageDialog(null,numero);

        ///Char
        char letra;
        letra=JOptionPane.showInputDialog(null,"Ingrese una letra:").charAt(0);

    }
}
