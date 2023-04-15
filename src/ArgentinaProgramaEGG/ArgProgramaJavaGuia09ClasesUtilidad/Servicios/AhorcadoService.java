package ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Servicios;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia09ClasesUtilidad.Entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {
    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego(){
        /*Le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.*/
        Ahorcado juego1 = new Ahorcado();
        System.out.println("Ingrese la palabra:");
        String cadena = leer.next();
        int longitud = cadena.length();
        //Setear longitud del arreglo
        juego1.setLongitud(longitud);
        //Pasar el String cadena dentro del arreglo letra por letra
        juego1.setPalabra(cadena.toCharArray());

        System.out.println("Cantidad de jugadas maximas:");
        int jugadasMax = leer.nextInt();
        juego1.setJugadasMax(jugadasMax);

        return juego1;
    }
    public static void longitud(Ahorcado juego){
        /*Muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
        System.out.println("Longitud de la palabra: "+juego.getLongitud());
    }
    public boolean buscar(Ahorcado juego, String letra){
        /*Este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.*/
        int cont = 0;
        for (int i = 0; i < juego.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(juego.getPalabra()[i]))){
               cont++;
            }
        }
        juego.setLetrasEncontradas(juego.getLetrasEncontradas()+cont);
        if (cont>0){
            return true;
        }else{
            return false;
        }

    }
    public void encontradas(Ahorcado juego,String letra){
        /*Que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.*/
        boolean esta = buscar(juego,letra);


        if (esta==true){
            System.out.println("Existe la letra en la palabra");
        }else{
            System.out.println("No existe la letra en la palabra");
            juego.setJugadasMax(juego.getJugadasMax()-1);
        }
    }
    public void intentos(Ahorcado juego){
        int encontradas=juego.getLetrasEncontradas();
        int restantes = juego.getLongitud()- juego.getLetrasEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): "+encontradas+","+restantes);
        System.out.println("Intentos restantes: "+juego.getJugadasMax());
    }

    public void juego(Ahorcado juego){
        /*el método juego se encargará de llamar todos los
    métodos previamente mencionados e informará cuando el usuario
    descubra toda la palabra o se quede sin intentos. Este método se
    llamará en el main.*/
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        encontradas(juego,letra);
        intentos(juego);
    }
}
