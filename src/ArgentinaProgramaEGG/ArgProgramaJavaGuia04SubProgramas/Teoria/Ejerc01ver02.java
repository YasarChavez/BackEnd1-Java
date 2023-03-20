package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas.Teoria;

import java.util.Scanner;

public class Ejerc01ver02 {
    public static void main(String[] args) {
        String retorno=codigo();
        System.out.println(retorno);

    }
    public static String codigo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra:");
        String palabra= leer.nextLine();
        palabra=palabra.replace("a","@");
        palabra=palabra.replace("e","#");
        palabra=palabra.replace("i","$");
        palabra=palabra.replace("o","%");
        palabra=palabra.replace("u","*");

        return palabra;
    }

}
