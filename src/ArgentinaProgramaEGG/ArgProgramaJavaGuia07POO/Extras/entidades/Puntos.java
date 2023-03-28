package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Libros.entidades.Libro;

import java.util.Scanner;

/*Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
* */
public class Puntos {
    private int pos1;
    private int pos2;

    public Puntos() {
    }

    public Puntos(int pos1, int pos2) {
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public void setPos1(int pos1) {
        this.pos1 = pos1;
    }

    public void setPos2(int pos2) {
        this.pos2 = pos2;
    }

    public int getPos1() {
        return pos1;
    }

    public int getPos2() {
        return pos2;
    }

    public Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in);
        Puntos punto = new Puntos();
        System.out.println("Ingrece Pos 1");
        punto.setPos1(leer.nextInt());
        System.out.println("Ingrece Pos 2");
        punto.setPos1(leer.nextInt());
        return punto;
    }

    public double Distancia(int pos1, int pos2){
        double distancia = Math.sqrt(Math.pow(getPos1() - getPos2(), 2) + Math.pow(y2 - y1, 2));
    }


}
