package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO;

public class Ejerc03 {
    public static void main(String[] args) {
        /*Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes        -/-
métodos:
a) Método constructor con todos los atributos pasados por parámetro.    -/-
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.                                                   -/-
d) Método para crearOperacion(): que le pide al usuario los dos         -/-
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
        * */
        Operacion operacion = new Operacion();
        operacion = operacion.crearOperacion(15, 10);
        System.out.println(operacion.sumar(operacion));

        Operacion operacion1 = operacion.crearOperacion(10, 10);
        System.out.println(operacion1.restar(operacion1));

        Operacion operacion2 = operacion.crearOperacion(0,10);
        System.out.println(operacion2.multiplicar(operacion2));

        Operacion operacion3 = operacion.crearOperacion(10,5);
        System.out.println(operacion3.division(operacion3));


    }

}

class Operacion {
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
        }else {
            return numero1 * numero2;
        }

    }
    public double division(Operacion operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("Error");
            return 0;
        }else {
            return numero1 / numero2;
        }

    }
}