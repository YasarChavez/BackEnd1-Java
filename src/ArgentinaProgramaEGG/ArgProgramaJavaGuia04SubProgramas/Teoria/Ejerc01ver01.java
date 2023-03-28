package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas.Teoria;

import java.util.Scanner;

public class Ejerc01ver01 {
    public static void main(String[] args) {
/*Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *

Utilice la estructura “según” para la
transformación.
*/

        String retorno = codificar();
        System.out.println(retorno);

    }

    ///FUNCION
    public static String codificar() {
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        String letra = "";
        while (!letra.equals(".")) {
            System.out.println("Ingrese una letra:(Para finalizar '.')");
            letra = leer.next();
            switch (letra) {
                case "a":
                    letra = "@";
                    palabra = palabra.concat(Character.toString(letra.charAt(0)));
                    break;
                case "e":
                    letra = "#";
                    palabra = palabra.concat(Character.toString(letra.charAt(0)));
                    break;
                case "i":
                    letra = "$";
                    palabra = palabra.concat(Character.toString(letra.charAt(0)));
                    break;
                case "o":
                    letra = "%";
                    palabra = palabra.concat(Character.toString(letra.charAt(0)));
                    break;
                case "u":
                    letra = "*";
                    palabra = palabra.concat(Character.toString(letra.charAt(0)));
                    break;
                default:
                    palabra = palabra.concat(Character.toString(letra.charAt(0)));
                    break;
            }
        }
        return palabra;
    }
}
