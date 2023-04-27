package Guia05VectoresMatrices.Extras;

import java.util.Scanner;

public class Ejerc06 {
    public static void main(String[] args) {
        /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().*/
//        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        int[] usados = new int[5];

        inicializar(sopa);
        iniUsados(usados);
        verificarUsados(usados);
        leerpalabras(sopa, usados);
//        llenardenumeros(sopa);
        llenardeletras(sopa);
        mostrar(sopa);

    }

    public static void inicializar(String[][] sopa) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = "*";
            }
//            System.out.println("");
        }
    }

    public static void iniUsados(int[] usados) {
        for (int i = 0; i < 5; i++) {
//            usados[i] = 0;
            usados[i] = (int) (Math.random() * (20));
        }
    }

    public static void verificarUsados(int[] usados) {
        int indice = 0;
        while (indice < usados.length) {
            int numero = (int) (Math.random() * 20); // generar un nuevo número aleatorio
            boolean repetido = false;
            // Comprobar si el número aleatorio ya está presente en el arreglo
            for (int i = 0; i < indice; i++) {
                if (usados[i] == numero) {
                    repetido = true;
                    break;
                }
            }
            // Si el número no está en el arreglo, agregarlo y avanzar al siguiente índice
            if (!repetido) {
                usados[indice] = numero;
                indice++;
            }
        }
    }

    public static void mostrar(String[][] sopa) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void leerpalabras(String[][] sopa, int[] usados) {
        int ind = 0;
        int fila;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres:");
            String palabra = leer.next();
            palabra = palabra.toUpperCase();
            int largo;
            largo = palabra.length();
            if (largo > 2 && largo < 6) {
                fila = usados[ind];
                int k = (int) (Math.random() * 15);
                for (int i = 0; i < palabra.length(); i++) {
                    sopa[fila][i + k] = String.valueOf(palabra.charAt(i));
                }
                ind++;
            } else {
                System.out.println("Largo incorrecto.");
            }

        } while (ind < 5);
    }

    public static void llenardenumeros(String[][] sopa) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == "*") {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 9));
                }
            }
        }
    }

    public static void llenardeletras(String[][] sopa) {
        String abcdario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int k = (int) (Math.random() * abcdario.length());
                if (sopa[i][j] == "*") {
                    sopa[i][j] = String.valueOf(abcdario.charAt(k));
                }
            }
        }
    }
}
