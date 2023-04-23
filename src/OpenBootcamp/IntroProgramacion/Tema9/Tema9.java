package OpenBootcamp.IntroProgramacion.Tema9;

public class Tema9 {
    public static void main(String[] args) {
        //Cliente
        Cliente cliente1 = new Cliente(20, "Juan", "123456789", 1000);
        System.out.println(cliente1.toString());
        //Trabajador
        Trabajador trabajador1 = new Trabajador(30, "Pedro", "987654321", 2000);
        System.out.println(trabajador1.toString());


    }


}

class clasePersona {
    int edad;
    String nombre;
    String telefono;

    public clasePersona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "clasePersona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

class Cliente extends clasePersona {
    int credito;

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

class Trabajador extends clasePersona {
    double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

