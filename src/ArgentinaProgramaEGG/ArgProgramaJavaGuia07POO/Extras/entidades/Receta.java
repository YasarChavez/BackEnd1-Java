package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades;
/*Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar
nuevas recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que se
pueden preparar con los ingredientes disponibles en la cocina.*/
public class Receta {
    String nombreReceta;
    public Receta() {
    }

    public Receta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    public Receta agregarReceta(String nombreReceta){
        Receta nuevaReceta = new Receta(nombreReceta);
        return nuevaReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "nombreReceta='" + nombreReceta + '\'' +
                '}';
    }
}
