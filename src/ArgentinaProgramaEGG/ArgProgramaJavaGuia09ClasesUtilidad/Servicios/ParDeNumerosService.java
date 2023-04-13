package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.ParDeNumeros;

public class ParDeNumerosService {
    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println("Numero 1: " + numeros.getNumero1());
        System.out.println("Numero 2: " + numeros.getNumero2());
    }

    public void devolverMayor(ParDeNumeros numeros) {
        if (numeros.getNumero1() > numeros.getNumero2()) {
            System.out.println("El mayor es: " + numeros.getNumero1());
        } else {
            System.out.println("El mayor es: " + numeros.getNumero2());
        }
    }

    public void calcularPotencia(ParDeNumeros numeros) {
        if (numeros.getNumero1() > numeros.getNumero2()) {
            System.out.println(numeros.getNumero1() + " elevado a " + numeros.getNumero2());
            System.out.println(Math.pow(numeros.getNumero1(), numeros.getNumero2()));
        } else {
            System.out.println(numeros.getNumero2() + " elevado a " + numeros.getNumero1());
            System.out.println(Math.pow(numeros.getNumero2(), numeros.getNumero1()));
        }
    }

    public void calculaRaiz(ParDeNumeros numeros) {
        if (numeros.getNumero1() > numeros.getNumero2()) {
            double raizCuadrada = Math.sqrt(numeros.getNumero1());
            System.out.println("Raiz de : " + numeros.getNumero1() + " " + raizCuadrada);
        } else {
            double raizCuadrada = Math.sqrt(numeros.getNumero2());
            System.out.println("Raiz de : " + numeros.getNumero2() + " " + raizCuadrada);
        }
    }
}
