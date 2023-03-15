package ArgentinaProgramaEGG.ArgProgramaJavaGuia03EstDeControl;

import java.util.Scanner;

public class Ejerc06ver2 {
    public static void main(String[] args) {
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
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String salir = leer.next();
                    if (salir.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa");
                        bucle = false;
                    }
            }
        } while (bucle);
    }
}
