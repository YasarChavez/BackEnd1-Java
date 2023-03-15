package EjerciciosVarios.Varios;

public class FizzBuzz {
    public static void main(String[] args) {
        //Escribir "Fizz" cuando I sea multiplo de 3.
        //"Buzz" cuando sea multiplo de 5 y "FizzBuzz" cuando es multiplo de ambos.
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else System.out.println(i);
        }
    }
}
