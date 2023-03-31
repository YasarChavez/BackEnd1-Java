package Ejemplos;

import java.util.ArrayList;
import java.util.List;

class ListasDeObjetos {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 35));

        Persona personaBuscada = buscarPersonaPorNombre(personas, "María");
        if (personaBuscada != null) {
            System.out.println("Se encontró a la persona buscada: " + personaBuscada);
        } else {
            System.out.println("No se encontró a la persona buscada.");
        }
        //xD

    }

    public static Persona buscarPersonaPorNombre(List<Persona> personas, String nombreBuscado) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombreBuscado)) {
                return persona;
            }
        }
        return null;
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}