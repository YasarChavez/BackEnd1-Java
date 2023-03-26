package EjerciciosVarios.OpenBootcamp.IntroProgramacion;

public class Ejerciciostema8 {
    public static void main(String[] args) {
        /*Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
por último muéstralas por consola.*/
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setNombre("Yasar");
        persona1.setEdad(29);
        persona1.setTelefono(4550055);

        persona2.setNombre("Victoria");
        persona2.setEdad(31);
        persona2.setTelefono(4555500);

        System.out.println(persona1.getNombre()+" "+persona1.getEdad()+" "+persona1.getTelefono());
        System.out.println(persona2.getNombre()+" "+persona2.getEdad()+" "+persona2.getTelefono());




    }
}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }

}
