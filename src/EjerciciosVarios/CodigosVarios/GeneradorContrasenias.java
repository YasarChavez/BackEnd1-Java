package EjerciciosVarios.CodigosVarios;

import java.util.Random;
import java.util.Scanner;

public class GeneradorContrasenias {
    public static void main(String[] args) {
        //Generador de contraseñas con numeros y letras y simbolos visibles
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce la longitud de la contraseña:");
        int longitud = sc.nextInt();
        String contrasenia = "";
        for (int i = 0; i < longitud; i++) {
            //Numero aleatorio del 1 al 4
            int  numeroAleatorio = random.nextInt(4)+1;
            int numero = (int) (Math.random() * 10);
            char letra = (char) ((int) (Math.random() * 26) + 'a');
            char letraMayuscula = (char) ((int) (Math.random() * 26) + 'A');
            char simbolo = (char) ((int) (Math.random() * 15) + '!');
            if (numeroAleatorio==1){
                contrasenia += numero;
            } else if (numeroAleatorio==2){
                contrasenia += letra;
            } else if (numeroAleatorio==3){
                contrasenia += letraMayuscula;
            } else if (numeroAleatorio==4){
                contrasenia += simbolo;
            }
        }
        System.out.println(contrasenia);
    }
}
