package EjerciciosVarios.CodigosVarios;

import java.util.Random;
import java.util.Scanner;

public class GeneradorContrasenias {
    public static void main(String[] args) {
        //Generador de contraseñas con números, letras y símbolos
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("*********************************************************");
        System.out.println("*Generador de contraseñas con números, letras y símbolos*");
        System.out.println("******************Por Chavez Yasar***********************");
        int menu = 0;
        do {
            System.out.println("*********************************************************");
            System.out.println("1. Generar contraseña");
            System.out.println("2. Leer contraseña");
            System.out.println("0. Salir");
            System.out.println("*********************************************************");
            System.out.println("Introduce una opción:");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Introduce la longitud de la contraseña:");
                    int longitud = sc.nextInt();
                    String contrasenia = "";
                    for (int i = 0; i < longitud; i++) {
                        //Numero aleatorio del 1 al 4
                        int numeroAleatorio = random.nextInt(4) + 1;
                        int numero = (int) (Math.random() * 10);
                        char letra = (char) ((int) (Math.random() * 26) + 'a');
                        char letraMayuscula = (char) ((int) (Math.random() * 26) + 'A');
                        char simbolo = (char) ((int) (Math.random() * 15) + '!');
                        if (numeroAleatorio == 1) {
                            contrasenia += numero;
                        }
                        if (numeroAleatorio == 2) {
                            contrasenia += letra;
                        }
                        if (numeroAleatorio == 3) {
                            contrasenia += letraMayuscula;
                        }
                        if (numeroAleatorio == 4) {
                            contrasenia += simbolo;
                        }
                    }
                    System.out.println(contrasenia);
                    System.out.println("Desea guardar la contraseña? (s/n)");
                    String guardar = sc.next();
                    if (guardar.equals("s")) {
                        System.out.println("Introduce el nombre del fichero:");
                        String nombreFichero = sc.next();
                        Ficheros.escribirFichero(nombreFichero, contrasenia);
                    }
                    System.out.println("Fin de la tarea");
                    break;
                case 2:
                    System.out.println("Introduce el nombre del fichero:");
                    String nombreFichero = sc.next();
                    String contenido = Ficheros.leerFichero(nombreFichero);
                    System.out.println(contenido);
                    break;
                case 0:
                    System.out.println("Fin de la tarea");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;


            }
        } while (menu != 0);

    }


    class Ficheros {
        public static void escribirFichero(String nombreFichero, String contenido) {
            try {
                java.io.FileWriter fw = new java.io.FileWriter(nombreFichero);
                fw.write(contenido);
                fw.close();
            } catch (Exception e) {
                System.out.println("Error al escribir en el fichero");
            }
        }

        public static String leerFichero(String nombreFichero) {
            String contenido = "";
            try {
                java.io.FileReader fr = new java.io.FileReader(nombreFichero);
                int c = fr.read();
                while (c != -1) {
                    contenido += (char) c;
                    c = fr.read();
                }
                fr.close();
            } catch (Exception e) {
                System.out.println("Error al leer el fichero");
            }
            return contenido;

        }
    }
}
