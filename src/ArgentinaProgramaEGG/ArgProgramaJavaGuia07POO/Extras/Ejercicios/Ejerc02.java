package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.Ejercicios;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades.Puntos;

public class Ejerc02 {
    public static void main(String[] args) {
        Puntos punto1 = new Puntos().crearPuntos();
        Puntos punto2 = new Puntos().crearPuntos();

        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
    }
}
