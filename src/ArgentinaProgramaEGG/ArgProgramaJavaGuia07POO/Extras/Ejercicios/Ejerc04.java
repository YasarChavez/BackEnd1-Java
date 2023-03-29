package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.Ejercicios;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades.Ingrediente;
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
        //Creamos Lista de Objetos.
        List<Receta> recetas = new ArrayList<>();
        System.out.println("Agregue dos Recetas:");
        recetas.add(new Receta().agregarReceta());
        recetas.add(new Receta().agregarReceta());

        System.out.println("Ingrese los ingredientes disponibles en la cocina:");
        Ingrediente ingredientes = new Ingrediente("agua","sal","papas");
//        Ingredientes ingredientes = new Ingredientes(leer.nextLine(),leer.nextLine(),leer.nextLine());


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

    public static Ingrediente ingredientesDisponibles (Ingrediente ingredientes,List<Receta> recetaList){
        System.out.println(recetaList);
        return null;
    }
}
