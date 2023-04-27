package Guia09ClasesUtilidad.Servicios;

import Guia09ClasesUtilidad.Entidades.Cadena;

import java.util.Scanner;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena cadena) {
        /*deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.*/
        int contadorVocales = 0;
        char letra;
        String frase = cadena.getFrase();
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println();
    }

    public void invertirFrase(Cadena cadena) {
        String fraseOri = cadena.getFrase();
        String fraseNueva = "";
        char letra;
        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {
            letra = fraseOri.charAt(i);
            fraseNueva = fraseNueva.concat(String.valueOf(letra));
        }
        System.out.println("Frase invertida: " + fraseNueva);
        System.out.println();
    }

    public void vecesRepetido(Cadena cadena) {
        System.out.println("Letra a buscar para contar veces que se repite:");
        String letraBuscada = String.valueOf(leer.next().charAt(0));
        String frase = cadena.getFrase();
        int cont = 0;
        char letra;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letraBuscada.equalsIgnoreCase(String.valueOf(letra))) {
                cont++;
            }
        }
        System.out.println("Letra " + "'" + letraBuscada + "'" + " cantidad de veces repetida: " + cont);
        System.out.println();
    }

    public void compararLongitud(Cadena cadena) {
        System.out.println("Ingrese una nueva frase para comparar las longitudes: ");
        String fraseNueva = leer.nextLine();
        if (fraseNueva.length() == cadena.getFrase().length()) {
            System.out.println("Las longitudes son iguales");
        } else {
            System.out.println("Las longitudes son diferentes");
        }
    }

    public void unirFrases(Cadena cadena) {
       /* deberá unir la frase contenida en la
        clase Cadena con una nueva frase ingresada por el usuario y mostrar
        la frase resultante.*/
        System.out.println("Ingrese una nueva frase para concatenarlas: ");
        String fraseUsuario = leer.nextLine();
        String fraseNueva = cadena.getFrase().concat(fraseUsuario);
        System.out.println("Frase resultante: " + fraseNueva);
        System.out.println();
    }

    public void reemplazar(Cadena cadena) {
        /*deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.*/
        System.out.println("Ingrese el valor por el cual desea reemplazar las letras 'a':");
        String letra = leer.next();
        String frase = cadena.getFrase();
        frase = frase.replace("a", letra);
        System.out.println("Resultado: ");
        System.out.println(frase);
        System.out.println();
    }

    public void contiene(Cadena cadena) {
        /*deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.*/

        String frase = cadena.getFrase();
        System.out.println("Letra a buscar dentro de la frase: ");
        char letraBuscada = leer.next().charAt(0);
        char letra;
        boolean contiene = false;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            letra = frase.charAt(i);
            if (letra == letraBuscada) {
                contiene = true;
                break;
            }
        }
        if (contiene) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

    }
}
