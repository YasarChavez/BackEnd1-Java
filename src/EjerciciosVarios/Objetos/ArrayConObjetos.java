package EjerciciosVarios.Objetos;

public class ArrayConObjetos {
    public static void main(String[] args) {
        //  Creamos un array de objetos de la clase Person
        Person[] people = new Person[3];
        // Creamos tres objetos de la clase Person
        Person person1 = new Person("Juan", 30);
        Person person2 = new Person("Maria", 25);
        Person person3 = new Person("Carlos", 40);
        // Agregamos los objetos al array
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        mostrarPersonas(people);

    }
    public static void mostrarPersonas(Person[]people){
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].nombre+" "+people[i].edad);
        }
    }
}

class Person {
    String nombre;
    int edad;
    public Person(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}


