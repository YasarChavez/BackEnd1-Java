package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.ParDeNumeros;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios.ParDeNumerosService;

public class Ejerc02 {
    public static void main(String[] args) {
        ParDeNumerosService service = new ParDeNumerosService();
        ParDeNumeros numeros = new ParDeNumeros();
//        Random aleatorio = new Random();
//        double numeroAleatorio = aleatorio.nextDouble(-100,100);
//        System.out.println(numeroAleatorio);
//        System.out.println(numeros.toString());
        service.mostrarValores(numeros);
        service.devolverMayor(numeros);
        service.calcularPotencia(numeros);
        service.calculaRaiz(numeros);
    }
}
