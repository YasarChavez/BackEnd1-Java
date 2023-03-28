package ArgentinaProgramaEGG.ArgProgramaJavaGuia04SubProgramas;


import java.util.Scanner;

public class Ejerc01 {
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero:");
        double n1 = leer.nextDouble();
        double n2 = leer.nextDouble();
        System.out.println("Que operacion desea realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int rta = leer.nextInt();
        switch (rta) {
            case 1:
                System.out.println(suma(n1, n2));
                break;
            case 2:
                System.out.println(resta(n1, n2));
                break;
            case 3:
                System.out.println(multi(n1, n2));
                break;
            case 4:
                System.out.println(divi(n1, n2));
                break;
            default:
                break;
        }
    }

    public static double suma(double a, double b) {
        return (a + b);
    }

    public static double resta(double a, double b) {
        return (a - b);
    }

    public static double multi(double a, double b) {
        return (a * b);
    }

    public static double divi(double a, double b) {
        return (a / b);
    }
}




