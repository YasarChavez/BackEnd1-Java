package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO;

public class Ejerc02 {
    public static void main(String[] args) {
        /*Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.-/-
b) Métodos get y set para el atributo radio de la clase Circunferencia.-/-
c) Método para crearCircunferencia(): que le pide el radio y lo guarda-/-
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
        * */
        Circunferencia circunferencia = new Circunferencia(15);

        System.out.println(circunferencia.perimetro(circunferencia));
        System.out.println(circunferencia.area(circunferencia));
    }
}

class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Circunferencia crearCircunferencia(double radio) {
        Circunferencia circunferencia = new Circunferencia(radio);
        return circunferencia;
    }

    public double area(Circunferencia circunferencia) {
        return Math.pow(radio,2) * Math.PI ;
    }

    public double perimetro(Circunferencia circunferencia) {
        return circunferencia.getRadio() * 2 * Math.PI;
    }
}
