package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas.Teoria;

import java.util.Scanner;

public class Ejerc02 {
    public static void main(String[] args) {
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para ver si son multiplos:");
        int a = leer.nextInt();
        int b = leer.nextInt();

        boolean multiplos=EsMultiplo(a,b);
        if (multiplos){
            System.out.println("Son multiplos");
        }else {
            System.out.println("No son multiplos");
        }
    }

     public static boolean EsMultiplo(int a, int b){
        boolean multiplo=false;
        if (a % b == 0){
            multiplo=true;
        }
        return multiplo;
     }


}
