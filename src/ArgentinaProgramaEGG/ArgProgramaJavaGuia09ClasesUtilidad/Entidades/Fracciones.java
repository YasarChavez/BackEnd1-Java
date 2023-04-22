package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades;

public class Fracciones {
    int Numerador1;
    int Numerador2;
    int Denominador1;
    int Denominador2;

    public Fracciones(int numerador1, int numerador2, int denominador1, int denominador2) {
        Numerador1 = numerador1;
        Numerador2 = numerador2;
        Denominador1 = denominador1;
        Denominador2 = denominador2;
    }

    public int getNumerador1() {
        return Numerador1;
    }

    public void setNumerador1(int numerador1) {
        Numerador1 = numerador1;
    }

    public int getNumerador2() {
        return Numerador2;
    }

    public void setNumerador2(int numerador2) {
        Numerador2 = numerador2;
    }

    public int getDenominador1() {
        return Denominador1;
    }

    public void setDenominador1(int denominador1) {
        Denominador1 = denominador1;
    }

    public int getDenominador2() {
        return Denominador2;
    }

    public void setDenominador2(int denominador2) {
        Denominador2 = denominador2;
    }

    @Override
    public String toString() {
        return "Fracciones{" +
                "Numerador1=" + Numerador1 +
                ", Numerador2=" + Numerador2 +
                ", Denominador1=" + Denominador1 +
                ", Denominador2=" + Denominador2 +
                '}';
    }
}
