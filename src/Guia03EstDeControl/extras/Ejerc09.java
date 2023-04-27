package Guia03EstDeControl.extras;

import javax.swing.*;


public class Ejerc09 {
    public static void main(String[] args) {
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
        realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
        Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
        este resultado es el residuo, y el número de restas realizadas es el cociente.
        Por ejemplo: 50 / 13:
        50 – 13 = 37     una resta realizada
        37 – 13 = 24     dos restas realizadas
        24 – 13 = 11     tres restas realizadas
        dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
        ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas
        */

        int cociente = 0;
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Dividendo:"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el divisor:"));
        while (dividendo >= divisor) {
            cociente++;
            dividendo = dividendo - divisor;
        }
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + (dividendo % divisor));
    }
}