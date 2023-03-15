package ArgentinaProgramaEGG.ArgProgramaJavaGuia03.extras;

import java.util.Scanner;

public class Ejerc05 {
    public static void main(String[] args) {
        /*Una obra social tiene tres clases de socios:
        ○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
        descuento en todos los tipos de tratamientos.
        ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
        descuento para los mismos tratamientos que los socios del tipo A.
        ○ Los socios que menos aportan, los de tipo ‘C’, no reciben
        descuentos sobre dichos tratamientos.
        ○ Solicite una letra (carácter) que representa la clase de un socio, y
        luego un valor real que represente el costo del tratamiento (previo
        al descuento) y determine el importe en efectivo a pagar por dicho socio.*/

        Scanner leer = new Scanner(System.in);


        System.out.print("Ingrese la Clase del Socio (A,B,C.): ");
        String letra = leer.nextLine();
        System.out.print("Ingrese el costo del tratamiento:");
        int costo = leer.nextInt();
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Total a abonar:");
            System.out.println((costo * 0.5));
        } else if (letra.equalsIgnoreCase("b")) {
            System.out.println("Total a abonar:");
            System.out.println((costo * 0.65));
        } else if (letra.equalsIgnoreCase("c")) {
            System.out.println("Total a abonar:");
            System.out.println(costo);
        }
    }
}
