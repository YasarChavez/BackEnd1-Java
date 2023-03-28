package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.Ejercicios;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades.Puntos;

public class Ejerc02 {
    public static void main(String[] args) {
        Puntos punto1 = new Puntos().crearPuntos();
        System.out.println(Puntos.Distancia(punto1));
    }
}
