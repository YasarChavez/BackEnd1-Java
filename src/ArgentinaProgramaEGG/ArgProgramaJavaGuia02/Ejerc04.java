package ArgentinaProgramaEGG.ArgProgramaJavaGuia02;

import java.util.Scanner;

public class Ejerc04 {
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5) .*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temperatura en grados centígrados:");
        float cent = leer.nextFloat();
        float fahren = 32 + (9 * cent / 5);
        System.out.println(cent+" son: "+fahren+" grados Fahrenheit");

    }
}
