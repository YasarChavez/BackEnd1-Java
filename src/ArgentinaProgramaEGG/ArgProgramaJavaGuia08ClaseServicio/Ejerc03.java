package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.Persona;
import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio.PersonaServicio;


/*Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
//TODO esto.
Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
*/

public class Ejerc03 {
    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();
        int[] IMC = new int[4];
        boolean[] EDADES = new boolean[4];
        Persona persona1 = new Persona("Yasar",29,"h",114,1.79);
        Persona persona2 = new Persona("Victoria",31,"m",80,1.69);
        Persona persona3 = new Persona("Enzo",17,"h",75,1.83);
        Persona persona4 = new Persona("Eric",25,"h",50,1.75);


//        Persona persona1 = servicio.crearPersona();
        servicio.calcularIMC(persona1);
        servicio.esMayorDeEdad(persona1);
        IMC[0] = servicio.calcularIMC(persona1);
        EDADES[0] = servicio.esMayorDeEdad(persona1);

//        Persona persona2 = servicio.crearPersona();
        servicio.calcularIMC(persona2);
        servicio.esMayorDeEdad(persona2);
        IMC[1] = servicio.calcularIMC(persona2);
        EDADES[1] = servicio.esMayorDeEdad(persona2);

//        Persona persona3 = servicio.crearPersona();
        servicio.calcularIMC(persona3);
        servicio.esMayorDeEdad(persona3);
        IMC[2] = servicio.calcularIMC(persona3);
        EDADES[2] = servicio.esMayorDeEdad(persona3);

//        Persona persona4 = servicio.crearPersona();
        servicio.calcularIMC(persona4);
        servicio.esMayorDeEdad(persona4);
        IMC[3] = servicio.calcularIMC(persona4);
        EDADES[3] = servicio.esMayorDeEdad(persona4);

        calcularPromEdades(EDADES);
        calcularPromImc(IMC);

    }

    public static void calcularPromEdades(boolean[] Edades) {
        int mayores = 0;
        int menores = 0;
        int porcMayores = 0;
        int porcMenores = 0;
        for (int i = 0; i < Edades.length; i++) {
            if (Edades[i]) {
                mayores++;
            } else {
                menores++;
            }
        }
        porcMayores = ((mayores * 100) / Edades.length);
        System.out.println("Porcentaje Mayores: " + porcMayores + "%");
        porcMenores = ((menores * 100) / Edades.length);
        System.out.println("Porcentaje Menores: " + porcMenores + "%");

    }

    public static void calcularPromImc(int[] IMC) {
        //bajo peso -1
        //ideal 0
        //sobrepeso 1
        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        int porBajo = 0;
        int porIdeal = 0;
        int porSobre = 0;
        for (int i = 0; i < IMC.length; i++) {
            if (IMC[i] == -1) {
                bajoPeso++;
            }
            if (IMC[i] == 0) {
                pesoIdeal++;
            }
            if (IMC[i] == 1) {
                sobrePeso++;
            }
        }
        porBajo = ((bajoPeso * 100) / IMC.length);
        System.out.println("Porcentaje bajo peso: " + porBajo + "%");
        porIdeal = ((pesoIdeal * 100) / IMC.length);
        System.out.println("Porcentaje peso ideal: " + porIdeal + "%");
        porSobre = ((sobrePeso * 100) / IMC.length);
        System.out.println("Porcentaje sobrepeso: " + porSobre + "%");
    }

}
