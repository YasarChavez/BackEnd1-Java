package Ejemplos;

import java.util.Scanner;

public class IfMejorado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        boolean par; //DEFINIMOS UNA VARIABLE BOOLEAN PARA EVALUAR LA CONDICION

        par = (num % 2 == 0);///La comparamos y devuelve True o False
        System.out.println(par ? "Par" : "Impar");
        // Al llamar a Par? con el signo de pregunta se fija si es true o false
        // Si es true nos muestra el primer valor, si es false el segundo valor.
    }
}
