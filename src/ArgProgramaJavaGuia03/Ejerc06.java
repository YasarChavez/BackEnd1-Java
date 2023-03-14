package ArgProgramaJavaGuia03;

import java.util.Scanner;

public class Ejerc06 {
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por
        teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
        una opción y el programa deberá mostrar el resultado por pantalla y
        luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
        vez de salir del programa directamente, se debe mostrar el siguiente
        mensaje de confirmación: ¿Está seguro que desea salir del programa
        (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
        contrario se vuelve a mostrar el menú.*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos números enteros positivos:");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();


        int menu;
        boolean bucle = true;

        do {
            System.out.println("MENU:");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Elija opción:");
            menu = leer.nextInt();


            switch (menu) {
                case 1 -> {
                    int suma = n1 + n2;
                    System.out.println(suma);
                }
                case 2 -> {
                    int resta = n1 - n2;
                    System.out.println(resta);
                }
                case 3 -> {
                    int multiplicacion = n1 * n2;
                    System.out.println(multiplicacion);
                }
                case 4 -> {
                    int division = n1 / n2;
                    System.out.println(division);
                }
                case 5 -> {
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salir = leer.next();
                    if (salir.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa");
                        bucle = false;
                    }
                }
            }
        } while (bucle);
    }
}
