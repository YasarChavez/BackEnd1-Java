package ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Servicio;

import ArgentinaProgramaEGG.ArgProgramaJavaGuia08ClaseServicio.Entidades.NIF;

import java.util.Scanner;

public class NIFService {
    public NIF crearNif() {
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el DNI:");
        long DNI = leer.nextLong();
        double resto = DNI%23;
        char letra = letras[(int) resto];
        return new NIF(DNI,letra);
    }
    public void mostrar(NIF nif){

        System.out.println(nif.getDNI()+"-"+ nif.getLetra());
    }
}
