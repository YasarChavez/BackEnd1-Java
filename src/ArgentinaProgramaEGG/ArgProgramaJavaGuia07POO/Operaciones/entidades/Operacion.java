package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Operaciones.entidades;

public class Operacion {
    double numero1;
    double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        //Constructor(paras)
    }

    public Operacion() {
        //Constructor
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero2() {
        return numero2;
    }

    public Operacion crearOperacion(double numero1, double numero2) {
        Operacion nuevaOperacion = new Operacion(numero1, numero2);
        return nuevaOperacion;
    }

    public double sumar(Operacion operacion) {
        return numero1 + numero2;
    }

    public double restar(Operacion operacion) {
        return numero1 - numero2;
    }

    public double multiplicar(Operacion operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return numero1 * numero2;
        }

    }

    public double division(Operacion operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return numero1 / numero2;
        }

    }
}