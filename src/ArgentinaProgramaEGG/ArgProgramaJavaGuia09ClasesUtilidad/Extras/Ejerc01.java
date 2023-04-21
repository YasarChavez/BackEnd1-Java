package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Extras;

import java.util.Random;
import java.util.Scanner;

public class Ejerc01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int numMesSecreto = elegirMesSecreto();
        String mesSecreto = meses[numMesSecreto];

//        System.out.println(mesSecreto);

        System.out.println("Ingrese el mes que cree que es el mes Secreto:");
        boolean adivinado = false;
        do {
            String mesUsuario = leer.nextLine();
            if (mesUsuario.equalsIgnoreCase(meses[numMesSecreto])) {
                System.out.println("¡Ha acertado!");
                adivinado = true;
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }


        } while (adivinado == false);
        //Comentario

    }
    public static int elegirMesSecreto() {
        Random random = new Random();
        int mes = random.nextInt(11) + 1;
        return mes;
    }
}
