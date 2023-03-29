package ArgentinaProgramaEGG.ArgProgramaJavaGuia07POO.Extras.entidades;

import java.util.Scanner;

/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo jugador
intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista de
"más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina
el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y
el número de veces que cada jugador ha ganado.
 */
public class Juego {
    private int numeroX;
    private int intentosMax = 0;
    private int cont = 0;


    public Juego(int numeroX, int intentosMax) {
        this.numeroX = numeroX;
        this.intentosMax = intentosMax;
    }

    public void setNumeroX(int numeroX) {
        this.numeroX = numeroX;

    }

    public int getNumeroX() {
        return numeroX;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void iniciar_juego(Juego juego) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 2 adivina el numero secreto!");
        do {
            int num = leer.nextInt();
            if (num != juego.getNumeroX()) {
                juego.setCont(cont += 1);
            } else {
                System.out.println("Adivinaste");
            }
        } while (juego.getCont() < juego.getIntentosMax());
        System.out.println("Se acabo el juego.");
    }
}
