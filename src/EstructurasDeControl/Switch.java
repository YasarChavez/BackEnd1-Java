package EstructurasDeControl;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*Crear un programa que muestre diferentes opciones para realizar
         operaciones matematicas basicas*/
        Scanner leer = new Scanner(System.in);

        //Creamos el 'Menu'
        System.out.println("Elija una operacion para realizar:");
        System.out.println("1. Para suma");
        System.out.println("2. Para resta");
        System.out.println("3. Para multiplicar");
        System.out.println("4. Para dividir");

        //Leemos la opcion
        int menu = leer.nextInt();
        int num1;
        int num2;

        switch (menu) {
            case 1:
                System.out.println("Ingrese dos numeros:");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                System.out.println("Suma: " + (num1+num2));
                break;
            case 2:
                System.out.println("Ingrese dos numeros:");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                System.out.println("Resta: " + (num1-num2));
                break;
            case 3:
                System.out.println("Ingrese dos numeros:");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                System.out.println("Multiplicacion: " + (num1*num2));
                break;
            case 4:
                System.out.println("Ingrese dos numeros:");
                num1 = leer.nextInt();
                num2 = leer.nextInt();
                System.out.println("Division: " + (num1/num2));
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
