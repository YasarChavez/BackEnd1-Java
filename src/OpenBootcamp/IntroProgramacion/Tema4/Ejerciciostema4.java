package OpenBootcamp.IntroProgramacion.Tema4;

public class Ejerciciostema4 {
    public static void main(String[] args) {
/*Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.

Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
por pantalla.

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de
la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una
estación.*/
        System.out.println("-   -   -   -   -");
        //EJERC IF
        int numeroIf = 25;
        System.out.println("Ejercicio If.");
        if (numeroIf < 0) {
            System.out.println(numeroIf + " es negativo");
        } else {
            System.out.println(numeroIf + " es positivo");
        }
        System.out.println("-   -   -   -   -");
        //EJERC WHILE
        System.out.println("Ejercicio While.");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("-   -   -   -   -");
        //EJERC DO-WHILE
        System.out.println("Ejercicio Do-While.");
        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
        System.out.println("-   -   -   -   -");
        //EJERC FOR
        System.out.println("Ejercicio For.");
        int numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println("-   -   -   -   -");
        //EJERC SWITCH
        System.out.println("Ejercicio Switch.");
        String estacion = "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("La estacion es : " + estacion);
                break;
            case "otoño":
                System.out.println("La estacion es : " + estacion);
                break;
            case "invierno":
                System.out.println("La estacion es : " + estacion);
                break;
            case "verano":
                System.out.println("La estacion es : " + estacion);
                break;
            default:
                System.out.println("La variable no es una estación!");
        }
    }
}
