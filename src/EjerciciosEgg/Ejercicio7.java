package EjerciciosEgg;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
        //que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
        //permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:

        //Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
        //o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
        //gasolina”.
        //o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
        //hormigón”.
        //o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
        //alimenticia”.
        //o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
        //válido para tipo de bomba”

        System.out.println("Ingrese el numero del tipo de motor para recibir informacion detallada: (1 a 4)");
        int motor = leer.nextInt();
        switch (motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
        int calificacion;
        System.out.println("");
        System.out.println("Ingresá la calificación que le das a la ultima pelicula que viste: (del 1 al 5)");
        calificacion = leer.nextInt();

        switch (calificacion) {
            case 1:
                System.out.println("Fue tan mala?");
                break;
            case 2:
                System.out.println("Pudo ser peor no?");
                break;
            case 3:
                System.out.println("Bueno, digamos que fue meeh xD");
                break;
            case 4:
                System.out.println("Entonces estaba para pasar el rato almenos");
                break;
            case 5:
                System.out.println("Que bueno que la disfrutaras tanto!");
                break;
            default:
                System.out.println("Calificacion incorrecta, hasta pronto.");
        }
        /* OTRO TIPO DE SWITCH
        switch (calificacion) {
            case 1 -> System.out.println("Fue tan mala?");
            case 2 -> System.out.println("Pudo ser peor no?");
            case 3 -> System.out.println("Bueno, digamos que fue meeh xD");
            case 4 -> System.out.println("Entonces estaba para pasar el rato almenos");
            case 5 -> System.out.println("Que bueno que la disfrutaras tanto!");
            default -> System.out.println("Calificacion incorrecta, hasta pronto.");
        }*/
    }
}
