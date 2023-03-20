package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas.Teorica;

import java.util.Scanner;

public class Ejerc01ver03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");

        String frase = leer.nextLine();

        int largo = frase.length();
        String letra = "";
        String letra2 = "";

        for (int i = 0; i < largo; i++) {
            letra = frase.substring(i, (i + 1));
            letra2 = letra.toUpperCase();

            letra = vocales(letra2, letra);

            System.out.print(letra);
        }
        System.out.println(" ");

    }

    public static String vocales(String letra2, String letra) {

        switch (letra2) {
            case "A":
                letra = "@";
                break;
            case "E":
                letra = "#";
                break;
            case "I":
                letra = "$";
                break;
            case "O":
                letra = "%";
                break;
            case "U":
                letra = "*";
                break;
            default:

        }
        return letra;

    }
}

