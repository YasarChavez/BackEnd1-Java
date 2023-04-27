package Guia07POO.Extras.Ejercicios;

import Guia07POO.Extras.entidades.Empleado;

/*Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en
función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de
30 años o del 5% si tiene menos de 30 años.*/
public class Ejerc06 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 35, 10000.0);
        empleado1.calcularAumento(empleado1);
        System.out.println(empleado1.toString());
        Empleado empleado2 = new Empleado("Pedro", 25, 5000.0);
        empleado2.calcularAumento(empleado2);
        System.out.println(empleado2.toString());
    }

}
