package EjerciciosVarios.OpenBootcamp.IntroProgramacion;

public class ClaseCoche {
    public static void main(String[] args) {
        /*Primera parte: Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.

        Segunda parte: Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.*/

        int suma;
        suma = sumarNums(1, 3, 2);
        System.out.println("Resultado suma: " + suma);


        coche miCoche = new coche();
        miCoche.agregarPuertas();
        System.out.println("Numero de puertas: " + miCoche.numeroPuertas);
    }

    private static int sumarNums(int a, int b, int c) {
        return a + b + c;
    }
}

class coche {
    public int numeroPuertas = 0;

    public void agregarPuertas() {
        this.numeroPuertas++;
    }
}
