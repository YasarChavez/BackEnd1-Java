package Guia07POO.Extras.entidades;

import java.util.Scanner;

/*Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar
nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que se
pueden preparar con los ingredientes disponibles en la cocina.*/
public class Receta {
    private String nombreReceta;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;

    public Receta() {
    }

    public Receta(String nombreReceta, String ingrediente1, String ingrediente2, String ingrediente3) {
        this.nombreReceta = nombreReceta;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "nombreReceta='" + nombreReceta + '\'' +
                ", ingrediente1='" + ingrediente1 + '\'' +
                ", ingrediente2='" + ingrediente2 + '\'' +
                ", ingrediente3='" + ingrediente3 + '\'' +
                '}';
    }

    public Receta agregarReceta() {
        Scanner leer = new Scanner(System.in);
        Receta receta = new Receta();
        System.out.println("Nombre Receta:");
        receta.setNombreReceta(leer.nextLine());
        System.out.println("Ingrediente 1:");
        receta.setIngrediente1(leer.nextLine());
        System.out.println("Ingrediente 2:");
        receta.setIngrediente2(leer.nextLine());
        System.out.println("Ingrediente 3:");
        receta.setIngrediente3(leer.nextLine());
        return receta;
    }

}


