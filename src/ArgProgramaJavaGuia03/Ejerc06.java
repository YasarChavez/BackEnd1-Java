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

        System.out.println("Ingrese dos numeros enteros positivos:");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();



        int menu = 0;

        do{
            System.out.println("MENU:");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Elija opción:");
            menu = leer.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Suma");
                    System.out.println((n1+n2));
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println((n1-n2));
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    System.out.println((n1*n2));
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println((n1/n2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }
        }while (menu!=5);
    }
}
