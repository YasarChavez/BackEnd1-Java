package ArgentinaProgramaEGG.ArgProgramaJavaGuia03EstDeControl.extras;


import java.util.Scanner;

public class Ejerc07 {
    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor
        mínimo y el promedio de n números (n>0). El valor de n se solicitará al
        principio del programa y los números serán introducidos por el usuario.
        Realice dos versiones del programa, una usando el bucle “while” y otra
        con el bucle “do - while”.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros:");
        int numeros = leer.nextInt();
        int min = 99999999;
        int max = 0;
        double prom = 0;
        int con = 0;

        System.out.println("Ahora ingrese los numeros:");

        while (con < numeros) {
            int nums = leer.nextInt();
            if (nums > max) {
                max = nums;
            }
            if (nums < min) {
                min = nums;
            }
            con++;
            prom = (prom + nums);
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Promedio: " + (prom / numeros));
    }
}
