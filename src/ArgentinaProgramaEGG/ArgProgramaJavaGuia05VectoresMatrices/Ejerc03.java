package ArgentinaProgramaEGG.ArgProgramaJavaGuia05VectoresMatrices;

import java.util.Scanner;

public class Ejerc03 {
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int nv = leer.nextInt();
        int[] vector = new int[nv];
        int[] vdigitos = new int[nv];

        System.out.println("Ingrese los valores:");
        //Leemos numeros del vector
        for (int i = 0; i < nv; i++) {
            vector[i] = leer.nextInt();
        }
        //Guardamos Digitos en otro vector
        for (int i = 0; i < nv; i++) {
           vdigitos[i]=digitos(vector[i]);
        }
        //Mostramos vector Digitos
        for (int i = 0; i < nv; i++) {
            System.out.println(vector[i]+" tiene "+vdigitos[i]+" digito/s");
        }
    }
    public static int digitos(int a){
        ///Contar cantidad de digitos
        int digitos=0;
        while(a !=0)
        {
            a = a/10;
            digitos++;
        }
        return digitos;
    }
}
