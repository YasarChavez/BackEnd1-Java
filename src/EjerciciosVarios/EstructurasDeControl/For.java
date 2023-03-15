package EjerciciosVarios.EstructurasDeControl;

public class For {
    public static void main(String[] args) {
        //Escribir "Fizz" cuando I sea multiplo de 3.
        //"Buzz" cuando sea multiplo de 5 y "FizzBuzz" cuando es multiplo de ambos.
        //Contar multiplos de 3, multiplos de 5 y multiplos de ambos.

        System.out.println("A buscar multiplos!");
        int mul35 = 0;
        int mul5 = 0;
        int mul3 = 0;


        for (int i = 1; i <=100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                mul35++;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                mul5++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                mul3++;
            } else System.out.println(i);
        }
        System.out.println("");
        System.out.println("Multiplos de 3: " + mul3);
        System.out.println("Multiplos de 5: " + mul5);
        System.out.println("Multiplos de ambos: " + mul35);
        System.out.println("");
        System.out.println("Programa terminado...");
    }
}
