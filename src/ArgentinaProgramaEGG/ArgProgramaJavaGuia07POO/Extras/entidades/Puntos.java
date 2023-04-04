package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades;

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
    private double pos1;
    private double pos2;

    private double pos3;
    private double pos4;

    public Puntos() {
    }

    public Puntos(double pos1, double pos2, double pos3, double pos4) {
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.pos3 = pos3;
        this.pos4 = pos4;
    }

    /**
     * @param punto1
     * @return Distancia
     */
    public static double Distancia(Puntos punto1) {
        double distancia;
        //distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return Math.sqrt(Math.pow(punto1.getPos2() - punto1.getPos1(), 2) + Math.pow(punto1.getPos4() - punto1.getPos3(), 2));
    }

    public double getPos1() {
        return pos1;
    }

    public void setPos1(double pos1) {
        this.pos1 = pos1;
    }

    public double getPos2() {
        return pos2;
    }

    public void setPos2(double pos2) {
        this.pos2 = pos2;
    }

    public double getPos3() {
        return pos3;
    }

    public void setPos3(double pos3) {
        this.pos3 = pos3;
    }

    public double getPos4() {
        return pos4;
    }

    public void setPos4(double pos4) {
        this.pos4 = pos4;
    }

    public Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in);
        Puntos punto = new Puntos();
        System.out.println("Ingrece Pos 1");
        punto.setPos1(leer.nextDouble());
        System.out.println("Ingrece Pos 2");
        punto.setPos1(leer.nextDouble());
        System.out.println("Ingrece Pos 3");
        punto.setPos1(leer.nextDouble());
        System.out.println("Ingrece Pos 4");
        punto.setPos4(leer.nextDouble());
        return punto;
    }


}
