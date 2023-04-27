package Guia07POO.Rectangulo;

public class Ejerc04 {
    public static void main(String[] args) {
        /*Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
        * */

        Rectangulo rectangulo = new Rectangulo(10, 15);
        System.out.println(rectangulo.perimetro(rectangulo));
        System.out.println(rectangulo.superficie(rectangulo));
        System.out.println("- - - -");
        Rectangulo rectangulo1 = new Rectangulo(15, 20);
        System.out.println(rectangulo1.perimetro(rectangulo1));
        System.out.println(rectangulo1.superficie(rectangulo1));
    }
}
