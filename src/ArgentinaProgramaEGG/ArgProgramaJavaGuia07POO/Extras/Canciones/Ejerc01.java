package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.Canciones;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades.Cancion;

public class Ejerc01 {
    public static void main(String[] args) {

        Cancion cancion01 = new Cancion("Tu Piel","Pure Negga");
        System.out.println(cancion01.getTitulo() +" - "+ cancion01.getAutor());

        Cancion cancion02 = new Cancion();
        System.out.println(cancion02.getTitulo()+" - "+ cancion02.getTitulo());
    }
}
