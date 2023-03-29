package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.Ejercicios;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades.Ingredientes;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades.Receta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/*Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar
nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que se
pueden preparar con los ingredientes disponibles en la cocina.*/
public class Ejerc04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        List<Receta> recetas = new ArrayList<>();
        recetas.add(new Receta().agregarReceta());
        recetas.add(new Receta().agregarReceta());

        Ingredientes ingredientes = new Ingredientes("agua","sal","papas");


        System.out.println("Ingrese una Receta a buscar.");
        String BuscarReceta = leer.nextLine();

       Receta RecetaBuscada = buscarRecetaPorNombre(recetas, BuscarReceta);
        if (RecetaBuscada != null) {
            System.out.println("Se encontró la receta buscada: " + RecetaBuscada);
        } else {
            System.out.println("No se encontró la receta buscada.");
        }


    }
    public static Receta buscarRecetaPorNombre(List<Receta> recetas, String nombreBuscado) {
        for (Receta receta : recetas) {
            if (receta.getNombreReceta().equals(nombreBuscado)) {
                return receta;
            }
        }
        return null;
    }

    public static Ingredientes ingredientesDisponibles (Ingredientes ingredientes){

    }
}
