package Guia07POO.Circunferencia.entidades;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circunferencia crearCircunferencia(double radio) {
        Circunferencia circunferencia = new Circunferencia(radio);
        return circunferencia;
    }

    public double area(Circunferencia circunferencia) {
        return Math.pow(radio, 2) * Math.PI;
    }

    public double perimetro(Circunferencia circunferencia) {
        return circunferencia.getRadio() * 2 * Math.PI;
    }
}
