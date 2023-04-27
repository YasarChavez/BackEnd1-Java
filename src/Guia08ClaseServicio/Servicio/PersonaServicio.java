package Guia08ClaseServicio.Servicio;

import Guia08ClaseServicio.Entidades.Persona;

import java.util.Scanner;

/*a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.

b) Método crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje

3

c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.*/
public class PersonaServicio {
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre:");
        String nombre = leer.next();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo: (H,M,O)");
        String sexo;
        do {
            sexo = leer.next();
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        System.out.println("Ingrese el peso:");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura:");
        double altura = leer.nextDouble();
        System.out.println();
        System.out.println();
        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
//        imc= p/(t*t)
        int estado = 2;
        double imc = (persona.getPeso() / (persona.getAltura() * persona.getAltura()));
        if (imc < 20) {
            estado = -1;
        } else if (imc >= 20 && imc <= 25) {
            estado = 0;
        } else if (imc > 25) {
            estado = 1;
        }
        return estado;
    }
}
